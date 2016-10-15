package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 5/9/16.
 */
public interface Hss2_sub4 {
    @GET("/rufly/Json/HSS2/Etics.txt")
    Call<JSONResponse> getJSON();
}
