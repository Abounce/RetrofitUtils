package com.example.administrator.retrofitutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    private String body="{\"DeviceToken\":\",\",\"Mobile\":\"18398609020\",\"Password\":\"e10adc3949ba59abbe56e057f20f883e\",\"PhoneType\":\"Android\",\"RegSource\":\"app\"}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.tv);
        findViewById(R.id.rx_bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                RequestBody resp=RequestBody.create(MediaType.parse("application/json"),body);
                Observable<User> edisonApi = RetrofitHelper.getmEdisonApi().getDatabyRx("1489556647774",resp);
                edisonApi.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<User>() {
                            @Override
                            public void onSubscribe(Disposable d) {

                            }

                            @Override
                            public void onNext(User value) {
                                String regPhone = value.getNickName();
                                tv.setText(regPhone);
                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onComplete() {

                            }
                        });
//                RequestBody resp=RequestBody.create(MediaType.parse("application/json"),body);
//                Call<User> databyRx = RetrofitHelper.getmEdisonApi().getDatabyRx("1489556647774", resp);
//                databyRx.enqueue(new Callback<User>() {
//                    @Override
//                    public void onResponse(Call<User> call, Response<User> response) {
//                              tv.setText(response.body().getRegPhone());
//                    }
//
//                    @Override
//                    public void onFailure(Call<User> call, Throwable t) {
//
//                    }
//                });
            }

        });
    }
}
