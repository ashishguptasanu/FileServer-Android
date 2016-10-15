package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 22/9/16.
 */

public interface ecug1_2 {
    @GET("/rufly/Json/ecug/ecug1/ecug1_ESLab1.txt")
    Call<JSONResponse> getJSON();
}
