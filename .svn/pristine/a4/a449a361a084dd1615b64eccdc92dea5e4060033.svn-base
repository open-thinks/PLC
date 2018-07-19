package com.tdo1szh.scanning.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {

//    public static final String BASE_URL = "http://192.168.5.4:8080/ ";
    public static final String BASE_URL = "http://tochat.cc:8080/plc/ ";

    private static final long DEFAULT_TIMEOUT = 10000l;

    private Retrofit mRetrofit;

    private OkHttpClient mClient;

    private static class SingletonHolder {
        private static final RetrofitManager INSTANCE = new RetrofitManager();
    }

    private RetrofitManager() {
        mClient = new OkHttpClient.Builder()
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(new LoggerInterceptor("tdo1szh", true))
                .build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(mClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static RetrofitManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public <T> T createService(Class<T> clazz) {
        return mRetrofit.create(clazz);
    }
}
