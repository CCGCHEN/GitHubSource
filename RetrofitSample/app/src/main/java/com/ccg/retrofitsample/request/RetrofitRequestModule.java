package com.ccg.retrofitsample.request;

import com.ccg.retrofitsample.log.RetrofitLog;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Copyright (C) 2004 - 2019 UCWeb Inc. All Rights Reserved.
 * Description : RetrofitRequestModule.java
 * Creation    : 2019/8/4
 * Author      : cangui.ccg
 */
public class RetrofitRequestModule {
    private static RetrofitRequestModule mInstance;

    private static final class Holder {
        public static final RetrofitRequestModule mInstance = new RetrofitRequestModule();
    }

    private RetrofitRequestModule() {
    }

    public static RetrofitRequestModule getInstance() {
        if (mInstance == null) {
            mInstance = Holder.mInstance;
        }
        return mInstance;
    }


    public void listRepos() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(new ToStringConvertFactory())
                .build();
        GitHubService service = retrofit.create(GitHubService.class);

        Call<String> httpCall =  service.listRepos("CCGCHEN");
        httpCall.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                RetrofitLog.logI(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                RetrofitLog.logI(t.toString());
            }
        });
    }
}
