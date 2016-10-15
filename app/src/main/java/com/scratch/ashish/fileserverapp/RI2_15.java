package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 2/9/16.
 */
public interface RI2_15 {
    @GET("/rufly/Json/MBA2_files/m15.txt")
    Call<JSONResponse> getJSON();
}
