package com.tdo1szh.scanning.network;

import com.tdo1szh.scanning.beans.BaseEntity;
import com.tdo1szh.scanning.beans.CommonResult;
import com.tdo1szh.scanning.beans.ShipListDataBean;

import java.util.List;

import io.reactivex.Flowable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("api/ships/list/")
    Flowable<BaseEntity<List<ShipListDataBean>>> getShipList(@Query("status")int status);

    @POST("api/packings/outbound/{id}/")
    Flowable<CommonResult> pushScanResult(@Path("id") String id, @Body RequestBody body);

}
