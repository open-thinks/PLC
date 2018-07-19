package com.tdo1szh.scanning.network;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.tdo1szh.scanning.utils.NetworkUtils;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class RxSchedulers {

    private static final String TAG = RxSchedulers.class.getSimpleName();

    public static <T> FlowableTransformer<T,T> io_main(final Context context) {
        return new FlowableTransformer<T, T>() {
            @Override
            public Publisher<T> apply(Flowable<T> upstream) {
                return upstream.subscribeOn(Schedulers.io())
                        .doOnSubscribe(new Consumer<Subscription>() {
                            @Override
                            public void accept(Subscription subscription) throws Exception {
                                if (!NetworkUtils.isNetworkAvailable(context)) {
                                    subscription.cancel();
                                    Log.d(TAG, "accept: 网络未连接。");
                                }
                            }
                        })
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }
}
