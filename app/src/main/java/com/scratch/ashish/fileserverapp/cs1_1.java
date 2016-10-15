package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 5/9/16.
 */
public interface cs1_1 {
    @GET("/rufly/Json/cs/CSB_1/1_1.txt")
    Call<JSONResponse> getJSON();
}
