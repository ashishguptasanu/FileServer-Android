package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 5/9/16.
 */
public interface Hss4_sub2 {
    @GET("/rufly/Json/HSS4/Finance.txt")
    Call<JSONResponse> getJSON();
}
