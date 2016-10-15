package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 14/10/16.
 */

public interface csm1_12 {
    @GET("/rufly/Json/cs/CSM_1/5_12.txt")
    Call<JSONResponse> getJSON();
}
