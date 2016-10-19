package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 19/10/16.
 */

public interface Bio2_4 {
    @GET("/rufly/Json/cs/CSB_1/1_1.txt")
    Call<JSONResponse> getJSON();
}
