package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 22/9/16.
 */

public interface ecug1_1 {
    @GET("/rufly/Json/ecug/ecug1/ecug1_ES1.txt")
    Call<JSONResponse> getJSON();
}
