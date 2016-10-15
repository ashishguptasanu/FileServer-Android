package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 1/10/16.
 */

public interface ecug3_2 {
    @GET("/rufly/Json/ecug/ecug3/ecug3_DCL.txt")
    Call<JSONResponse> getJSON();
}
