package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 22/9/16.
 */

public interface ecug4_1 {
    @GET("/rufly/Json/ecug/ecug4/ecug4_FESD.txt")
    Call<JSONResponse> getJSON();
}
