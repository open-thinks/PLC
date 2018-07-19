package com.tdo1szh.scanning.network;

import android.util.Log;

import com.tdo1szh.scanning.beans.BaseEntity;

import io.reactivex.subscribers.DisposableSubscriber;

public abstract class BaseSubscriber<T> extends DisposableSubscriber<BaseEntity<T>> {

    private static final String TAG = BaseSubscriber.class.getSimpleName();

    @Override
    public void onNext(BaseEntity<T> tBaseEntity) {
        if (tBaseEntity.isSuccess()) {
            onHandleSuccess(tBaseEntity.getData());
        } else {
            onHandleError(tBaseEntity.getResult());
        }
    }

    @Override
    public void onError(Throwable t) {
        Log.e(TAG, "onError: " + t.getMessage(), t);

//        Toast.makeText(mContext, "网络异常，请稍后再试", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onComplete() {
        Log.d(TAG, "onComplete: ...");
    }

    protected abstract void onHandleError(int result);

    protected abstract void onHandleSuccess(T t);
}
