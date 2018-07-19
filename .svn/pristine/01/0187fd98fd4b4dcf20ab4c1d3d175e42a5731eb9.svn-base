package com.tdo1szh.automap;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;
import com.amap.api.navi.AMapNavi;
import com.amap.api.navi.AMapNaviListener;
import com.amap.api.navi.model.AMapCalcRouteResult;
import com.amap.api.navi.model.AMapCarInfo;
import com.amap.api.navi.model.AMapLaneInfo;
import com.amap.api.navi.model.AMapModelCross;
import com.amap.api.navi.model.AMapNaviCameraInfo;
import com.amap.api.navi.model.AMapNaviCross;
import com.amap.api.navi.model.AMapNaviInfo;
import com.amap.api.navi.model.AMapNaviLocation;
import com.amap.api.navi.model.AMapNaviPath;
import com.amap.api.navi.model.AMapNaviRouteNotifyData;
import com.amap.api.navi.model.AMapNaviTrafficFacilityInfo;
import com.amap.api.navi.model.AMapServiceAreaInfo;
import com.amap.api.navi.model.AimLessModeCongestionInfo;
import com.amap.api.navi.model.AimLessModeStat;
import com.amap.api.navi.model.NaviInfo;
import com.amap.api.navi.model.NaviLatLng;
import com.amap.api.navi.view.RouteOverLay;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.RouteSearch;
import com.autonavi.tbt.TrafficFacilityInfo;
import com.tdo1szh.automap.adapters.SpinnerAdapter;
import com.tdo1szh.automap.beans.BaseEntity;
import com.tdo1szh.automap.beans.ShipListDataBean;
import com.tdo1szh.automap.network.ApiService;
import com.tdo1szh.automap.network.BaseSubscriber;
import com.tdo1szh.automap.network.RetrofitManager;
import com.tdo1szh.automap.network.RxSchedulers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AMapNaviListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private MapView mRouteMapView;
    private AMapNavi mAMapNavi;
    private AMap mAmap;
    private Spinner mSpinner;
    private Button mButton;
    private SpinnerAdapter mAdapter;
    private int status = -1;
    private boolean calculateSuccess = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.colorPrimary));
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        initView(savedInstanceState);
        initEvent();

    }

    private void initView(Bundle savedInstanceState) {
        mRouteMapView = (MapView) findViewById(R.id.map_view);
        mRouteMapView.onCreate(savedInstanceState);
        mAmap = mRouteMapView.getMap();
        mAmap.getUiSettings().setZoomControlsEnabled(false);
//        mAmap.setOnPolylineClickListener(this);
        mAmap.setMapType(AMap.MAP_TYPE_NAVI);
        mSpinner = (Spinner) findViewById(R.id.spinner);
        try {
            mAMapNavi = AMapNavi.getInstance(getApplicationContext());
            if (mAMapNavi != null) {
                mAMapNavi.addAMapNaviListener(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initEvent() {
        getSpinnerData();
        mAdapter = new SpinnerAdapter(this);
        mSpinner.setOnItemSelectedListener(this);
    }

    private void getSpinnerData() {
        RetrofitManager.getInstance()
                .createService(ApiService.class)
                .getShipList(status)
                .compose(RxSchedulers.<BaseEntity<List<ShipListDataBean>>>io_main(this))
                .subscribeWith(new BaseSubscriber<List<ShipListDataBean>>() {
                    @Override
                    protected void onHandleError(int result) {

                    }

                    @Override
                    protected void onHandleSuccess(List<ShipListDataBean> shipListDataBeans) {
                        mAdapter.add((ArrayList<ShipListDataBean>) shipListDataBeans);
                        mSpinner.setAdapter(mAdapter);
                    }
                });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mRouteMapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mRouteMapView.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mRouteMapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mRouteMapView.onSaveInstanceState(outState);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ShipListDataBean item = mAdapter.getItem(position);
        NaviLatLng startLatlng = new NaviLatLng(item.getFromLatitude(),item.getFromLongitude());
        NaviLatLng endLatlng = new NaviLatLng(item.getToLatitude(), item.getToLongitude());
        calculateRoute(item.getVehicleNo(),startLatlng,endLatlng);
    }

    private void calculateRoute(String vehicleNo, NaviLatLng startLatlng, NaviLatLng endLatlng) {
        int strategyFlag = 0;
        List<NaviLatLng> startList = new ArrayList<>();
        startList.add(startLatlng);
        List<NaviLatLng> endList = new ArrayList<>();
        endList.add(endLatlng);
        List<NaviLatLng> wayList = new ArrayList<>();
        try {
            strategyFlag = mAMapNavi.strategyConvert(true, true, true, false, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (strategyFlag >= 0) {
            AMapCarInfo carInfo = new AMapCarInfo();
            //设置车牌
            carInfo.setCarNumber(vehicleNo);
            //设置车牌是否参与限行算路
            carInfo.setRestriction(true);
            mAMapNavi.setCarInfo(carInfo);
            mAMapNavi.calculateDriveRoute(startList, endList, wayList, strategyFlag);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onInitNaviFailure() {

    }

    @Override
    public void onInitNaviSuccess() {

    }

    @Override
    public void onStartNavi(int i) {

    }

    @Override
    public void onTrafficStatusUpdate() {

    }

    @Override
    public void onLocationChange(AMapNaviLocation aMapNaviLocation) {

    }

    @Override
    public void onGetNavigationText(int i, String s) {

    }

    @Override
    public void onGetNavigationText(String s) {

    }

    @Override
    public void onEndEmulatorNavi() {

    }

    @Override
    public void onArriveDestination() {

    }

    @Override
    public void onCalculateRouteFailure(int i) {
        calculateSuccess = false;
        Toast.makeText(getApplicationContext(), "计算路线失败，errorcode＝" + i, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onReCalculateRouteForYaw() {

    }

    @Override
    public void onReCalculateRouteForTrafficJam() {

    }

    @Override
    public void onArrivedWayPoint(int i) {

    }

    @Override
    public void onGpsOpenStatus(boolean b) {

    }

    @Override
    public void onNaviInfoUpdate(NaviInfo naviInfo) {

    }

    @Override
    public void onNaviInfoUpdated(AMapNaviInfo aMapNaviInfo) {

    }

    @Override
    public void updateCameraInfo(AMapNaviCameraInfo[] aMapNaviCameraInfos) {

    }

    @Override
    public void updateIntervalCameraInfo(AMapNaviCameraInfo aMapNaviCameraInfo, AMapNaviCameraInfo aMapNaviCameraInfo1, int i) {

    }

    @Override
    public void onServiceAreaUpdate(AMapServiceAreaInfo[] aMapServiceAreaInfos) {

    }

    @Override
    public void showCross(AMapNaviCross aMapNaviCross) {

    }

    @Override
    public void hideCross() {

    }

    @Override
    public void showModeCross(AMapModelCross aMapModelCross) {

    }

    @Override
    public void hideModeCross() {

    }

    @Override
    public void showLaneInfo(AMapLaneInfo[] aMapLaneInfos, byte[] bytes, byte[] bytes1) {

    }

    @Override
    public void showLaneInfo(AMapLaneInfo aMapLaneInfo) {

    }

    @Override
    public void hideLaneInfo() {

    }

    @Override
    public void onCalculateRouteSuccess(int[] ints) {
        HashMap<Integer, AMapNaviPath> paths = mAMapNavi.getNaviPaths();

        AMapNaviPath path = paths.get(ints[0]);
        if (path != null) {
            drawRoutes(ints[0], path);
        }
    }

    private void drawRoutes(int anInt, AMapNaviPath path) {
        RouteOverLay routeOverLay = new RouteOverLay(mAmap, path, this);
        routeOverLay.setTrafficLine(true);
        routeOverLay.setTrafficLightsVisible(false);
        routeOverLay.setStartPointBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.icon_start));
        routeOverLay.setEndPointBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.icon_end));
        routeOverLay.addToMap();
        routeOverLay.zoomToSpan(120);
    }

    @Override
    public void notifyParallelRoad(int i) {

    }

    @Override
    public void OnUpdateTrafficFacility(AMapNaviTrafficFacilityInfo aMapNaviTrafficFacilityInfo) {

    }

    @Override
    public void OnUpdateTrafficFacility(AMapNaviTrafficFacilityInfo[] aMapNaviTrafficFacilityInfos) {

    }

    @Override
    public void OnUpdateTrafficFacility(TrafficFacilityInfo trafficFacilityInfo) {

    }

    @Override
    public void updateAimlessModeStatistics(AimLessModeStat aimLessModeStat) {

    }

    @Override
    public void updateAimlessModeCongestionInfo(AimLessModeCongestionInfo aimLessModeCongestionInfo) {

    }

    @Override
    public void onPlayRing(int i) {

    }

    @Override
    public void onCalculateRouteSuccess(AMapCalcRouteResult aMapCalcRouteResult) {

    }

    @Override
    public void onCalculateRouteFailure(AMapCalcRouteResult aMapCalcRouteResult) {

    }

    @Override
    public void onNaviRouteNotify(AMapNaviRouteNotifyData aMapNaviRouteNotifyData) {

    }
}
