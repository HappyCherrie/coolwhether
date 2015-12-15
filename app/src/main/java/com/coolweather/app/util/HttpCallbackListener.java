package com.coolweather.app.util;

/**
 * Created by ct on 2015/12/15.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
