package com.coolweather.app.coolweather.util;

/**
 * Created by Administrator on 2016/11/12.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
