package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 1/10/16.
 */

public interface ecug4_4 {
    @GET("/rufly/Json/ecug/ecug4/ecug4_RF.txt")
    Call<JSONResponse> getJSON();
}
