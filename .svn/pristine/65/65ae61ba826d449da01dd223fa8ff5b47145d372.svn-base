package com.tdo1szh.scanning.activitys;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.BeepManager;
import com.journeyapps.barcodescanner.BarcodeCallback;
import com.journeyapps.barcodescanner.BarcodeResult;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.DefaultDecoderFactory;
import com.tdo1szh.scanning.R;
import com.tdo1szh.scanning.adapters.SpinnerAdapter;
import com.tdo1szh.scanning.beans.BaseEntity;
import com.tdo1szh.scanning.beans.CommonResult;
import com.tdo1szh.scanning.beans.OutbandBean;
import com.tdo1szh.scanning.beans.ShipListDataBean;
import com.tdo1szh.scanning.network.ApiService;
import com.tdo1szh.scanning.network.BaseSubscriber;
import com.tdo1szh.scanning.network.PushSubscriber;
import com.tdo1szh.scanning.network.RetrofitManager;
import com.tdo1szh.scanning.network.RxSchedulers;
import com.xyz.step.FlowViewHorizontal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.internal.observers.ForEachWhileObserver;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private DecoratedBarcodeView barcodeView;
    private BeepManager beepManager;
    private String lastText;
    private Toolbar mToolbar;
    private TextView mInnerTv;
    private TextView mOutTv;
    private Button mBtnOk;
    private Button mBtnCancel;
    private FlowViewHorizontal mFlowViewHorizontal;
    private Spinner mSpinner;
    private ArrayList<String> scanList;
    private int status = -1;
    private boolean isOutBand = false;

    private BarcodeCallback callback = new BarcodeCallback() {
        @Override
        public void barcodeResult(BarcodeResult result) {
            if(result.getText() == null || result.getText().equals(lastText)) {
                return;
            }

            lastText = result.getText();
            Log.d(TAG, "barcodeResult: lasttext = " + lastText);
            if (!scanList.contains(result.getText())) {
                scanList.add(result.getText());
                Gson gson = new Gson();
                String json = gson.toJson(result.getText());
//                RetrofitManager.getInstance()
//                        .createService(ApiService.class)
//                        .pushScanResult(json)
//                        .compose(RxSchedulers.<CommonResult>io_main(MainActivity.this))
//                        .subscribeWith(new PushSubscriber() {
//                            @Override
//                            protected void onHandleError(CommonResult commonResult) {
//
//                            }
//
//                            @Override
//                            protected void onHandleSuccess(CommonResult commonResult) {
//                                //TODO 上传成功
//                            }
//                        });
            }
            barcodeView.setStatusText(result.getText());

            beepManager.playBeepSoundAndVibrate();
        }

        @Override
        public void possibleResultPoints(List<ResultPoint> resultPoints) {
        }
    };
    private SpinnerAdapter mAdapter;

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

        initView();

        initEvent();


        Collection<BarcodeFormat> formats = Arrays.asList(BarcodeFormat.QR_CODE, BarcodeFormat.CODE_39);
        barcodeView.getBarcodeView().setDecoderFactory(new DefaultDecoderFactory(formats));
        barcodeView.decodeContinuous(callback);

        beepManager = new BeepManager(this);

    }

    private void initView() {
        barcodeView = (DecoratedBarcodeView) findViewById(R.id.barcode_scanner);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mInnerTv = (TextView) findViewById(R.id.inner_tv);
        mOutTv = (TextView) findViewById(R.id.out_tv);
        mBtnOk = (Button) findViewById(R.id.btn_ok);
        mBtnCancel = (Button) findViewById(R.id.btn_cancel);
        mFlowViewHorizontal = (FlowViewHorizontal) findViewById(R.id.h_step_view);
        mSpinner = (Spinner) findViewById(R.id.spinner);

        setSelectedInnerTV();
        setNormalOutTV();
        mFlowViewHorizontal.setProgress(2,3,getResources().getStringArray(R.array.step_view), null);

        scanList = new ArrayList<>();
    }


    private void initEvent() {
        mInnerTv.setOnClickListener(this);
        mOutTv.setOnClickListener(this);
        mBtnOk.setOnClickListener(this);
        mBtnCancel.setOnClickListener(this);

        getSpinnerData();
        mAdapter = new SpinnerAdapter(this);

        mSpinner.setOnItemSelectedListener(this);

        mInnerTv.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                startActivity(new Intent(MainActivity.this,GenerateBarActivity.class));
                return true;
            }
        });
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

    private void setNormalInnerTV() {
        mInnerTv.setTextColor(getResources().getColor(R.color.normal_tv_text_color));
        mInnerTv.setTextSize(getResources().getDimensionPixelSize(R.dimen.normal_tv_text_size));
    }

    private void setSelectedInnerTV() {
        mInnerTv.setTextSize(getResources().getDimensionPixelSize(R.dimen.selected_tv_text_size));
        mInnerTv.setTextColor(getResources().getColor(R.color.selected_tv_text_color));
    }

    private void setNormalOutTV() {
        mOutTv.setTextSize(getResources().getDimensionPixelSize(R.dimen.normal_tv_text_size));
        mOutTv.setTextColor(getResources().getColor(R.color.normal_tv_text_color));
    }

    private void setSelectedOutTV() {
        mOutTv.setTextColor(getResources().getColor(R.color.selected_tv_text_color));
        mOutTv.setTextSize(getResources().getDimensionPixelSize(R.dimen.selected_tv_text_size));
    }

    @Override
    protected void onResume() {
        super.onResume();
        barcodeView.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        barcodeView.pause();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return barcodeView.onKeyDown(keyCode, event) || super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.inner_tv) {
            setSelectedInnerTV();
            setNormalOutTV();
            isOutBand = false;
        } else if (view.getId() == R.id.out_tv){
            setSelectedOutTV();
            setNormalInnerTV();
            isOutBand = true;
        } else if (view.getId() == R.id.btn_ok) {
            if (isOutBand) {

            } else {
                Gson gson = new Gson();
                Map<String, OutbandBean> map = new HashMap<>();
                OutbandBean[] beans = new OutbandBean[scanList.size()];
                for (int i = 0; i < scanList.size(); i++) {
                    OutbandBean bean = new OutbandBean();
                    bean.setId(scanList.get(i));
                    beans[i] = bean;
                }
                String json = gson.toJson(beans);
                Log.d(TAG, "onClick: json to push = " + json);
                Toast.makeText(this, "json = " + json, Toast.LENGTH_SHORT).show();

                RequestBody body = RequestBody.create(MediaType.parse("application/json;charset=utf-8"), json);
                RetrofitManager.getInstance()
                        .createService(ApiService.class)
                        .pushScanResult("1", body)
                        .compose(RxSchedulers.<CommonResult>io_main(MainActivity.this))
                        .subscribeWith(new PushSubscriber() {
                            @Override
                            protected void onHandleError(CommonResult commonResult) {
                                Toast.makeText(MainActivity.this, "上传失败。", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            protected void onHandleSuccess(CommonResult commonResult) {
                                Toast.makeText(MainActivity.this, "上传成功.", Toast.LENGTH_SHORT).show();
                                //TODO 上传成功
                                try {
                                    MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.asd);
                                    player.setLooping(false);
//                player.prepare();
                                    player.start();
                                    scanList.clear();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        });
            }
        } else if (view.getId() == R.id.btn_cancel) {
            if (scanList != null) {
                scanList.clear();
            }
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Log.d(TAG, "onItemSelected: spinnerID = " + R.id.spinner + " , ParentID = " + parent.getId() + " , longID = " + id);
        ShipListDataBean item = mAdapter.getItem(position);
        if (item.getShipStatus() == 0) {
            mFlowViewHorizontal.setProgress(0,3,new String[]{item.getFromName(),"运输",item.getToName()}, null);
        } else if (item.getShipStatus() == 1){
            mFlowViewHorizontal.setProgress(1,3,new String[]{item.getFromName(),"运输",item.getToName()}, null);
        } else if (item.getShipStatus() == 2) {
            mFlowViewHorizontal.setProgress(3,3,new String[]{item.getFromName(),"运输",item.getToName()}, null);
        } else if (item.getShipStatus() == 3) {
            mFlowViewHorizontal.setProgress(0,3,new String[]{item.getFromName(),"运单已取消",item.getToName()}, null);
        }
        scanList.clear();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
