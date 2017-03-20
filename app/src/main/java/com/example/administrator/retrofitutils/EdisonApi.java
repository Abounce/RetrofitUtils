package com.example.administrator.retrofitutils;


import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/**
 * @author yhy created at 2017/3/20 16:00
 */

public interface EdisonApi {

    @PUT("user/PasswordLogin")
    Observable<User> getDatabyRx(@Query("timestamp") String abc, @Body RequestBody body);

}
