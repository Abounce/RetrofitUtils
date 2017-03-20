package com.example.administrator.retrofitutils;

import com.example.net.RetrofitManager;

/**
 * 介绍：

 */
public class RetrofitHelper {
    public static final String GANK_URL = "http://gank.io/";
    //新增了一个EDU的业务线
    public static final String EDU_URL = "http://edu.csdn.net/";

//    //一个URL- 一个Retrofit实例
//    private static final GankApi mGankApi = RetrofitManager
//            .getInstance()
//            .newRetrofit(GANK_URL)
//            .create(GankApi.class);
//
//    private static final EduApi mEduApi = RetrofitManager.getInstance()
//            .newRetrofit(EDU_URL)
//            .create(EduApi.class);
//
//    public static GankApi getGank() {
//        return mGankApi;
//    }
//
//
//
//    public static EduApi getEdu() {
//        return mEduApi;
//    }
   public static final String baseurl="http://192.168.199.157:8089/api/";

    private static final  EdisonApi mEdisonApi= RetrofitManager.getInstance().newRetrofit(baseurl).create(EdisonApi.class);

    public static EdisonApi getmEdisonApi(){
        return mEdisonApi;
    }
}
