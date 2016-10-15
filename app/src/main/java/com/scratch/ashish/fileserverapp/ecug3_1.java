package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 22/9/16.
 */

public interface ecug3_1 {
    @GET("/rufly/Json/ecug/ecug3/ecug3_DC.txt")
    Call<JSONResponse> getJSON();
}
