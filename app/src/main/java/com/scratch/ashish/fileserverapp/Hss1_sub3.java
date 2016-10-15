package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 5/9/16.
 */
public interface Hss1_sub3 {
    @GET("/rufly/Json/HSS_1/Hss1_Life.txt")
    Call<JSONResponse> getJSON();
}
