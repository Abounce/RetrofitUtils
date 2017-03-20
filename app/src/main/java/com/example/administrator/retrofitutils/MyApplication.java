package com.example.administrator.retrofitutils;

import android.app.Application;

import com.example.net.net_util.NetUtils;
import com.example.net.RetrofitManager;

/**
 * @author yhy created at 2017/3/20 15:10
 */

public class MyApplication  extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        NetUtils.init(this);
        RetrofitManager.init(this);
    }
}
