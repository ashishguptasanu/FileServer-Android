package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 1/9/16.
 */
public interface RequestInterface1_1 {
    @GET("/rufly/Json/MBA1_files/m1.txt")
    Call<JSONResponse> getJSON();
}
