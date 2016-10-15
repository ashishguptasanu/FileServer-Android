package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 14/10/16.
 */

public interface csm2_1 {
    @GET("/rufly/Json/cs/CSM_2/6_1.txt")
    Call<JSONResponse> getJSON();
}
