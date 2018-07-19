package com.tdo1szh.scanning.network;

import android.util.Log;

import com.tdo1szh.scanning.beans.CommonResult;

import io.reactivex.subscribers.DisposableSubscriber;

public abstract class PushSubscriber extends DisposableSubscriber<CommonResult> {

    private static final String TAG = PushSubscriber.class.getSimpleName();

    @Override
    public void onNext(CommonResult commonResult) {
        if (commonResult.isSuccess()) {
            onHandleSuccess(commonResult);
        } else {
            onHandleError(commonResult);
        }
    }

    protected abstract void onHandleError(CommonResult commonResult);

    protected abstract void onHandleSuccess(CommonResult commonResult);

    @Override
    public void onError(Throwable t) {
        Log.e(TAG, "onError: " + t.getMessage(), t);
    }

    @Override
    public void onComplete() {
        Log.d(TAG, "onComplete: ...");
    }
}
