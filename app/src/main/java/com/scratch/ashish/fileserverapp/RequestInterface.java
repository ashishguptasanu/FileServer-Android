package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 23/8/16.
 */
public interface RequestInterface {
    @GET("/rufly/Json/mba1ESM.txt")
    Call<JSONResponse> getJSON();
}

