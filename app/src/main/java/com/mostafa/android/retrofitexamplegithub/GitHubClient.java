package com.mostafa.android.retrofitexamplegithub;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by mostafa on 2/6/18.
 */

public interface GitHubClient {
    @GET ("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);
}
