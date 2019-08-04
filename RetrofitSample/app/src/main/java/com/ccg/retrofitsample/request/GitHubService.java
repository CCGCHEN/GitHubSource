package com.ccg.retrofitsample.request;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Copyright (C) 2004 - 2019 UCWeb Inc. All Rights Reserved.
 * Description : GitHubService.java
 * Creation    : 2019/8/4
 * Author      : cangui.ccg
 */
public interface GitHubService {
    @GET("users/{user}/repos")
    Call<String> listRepos(@Path("user") String user);
}
