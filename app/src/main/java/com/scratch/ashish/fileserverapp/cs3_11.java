package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 5/9/16.
 */
public interface cs3_11 {
    @GET("/rufly/Json/cs/CSB_3/3_11.txt")
    Call<JSONResponse> getJSON();
}
