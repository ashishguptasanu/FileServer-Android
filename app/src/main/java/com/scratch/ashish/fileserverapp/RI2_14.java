package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 2/9/16.
 */
public interface RI2_14 {
    @GET("/rufly/Json/MBA2_files/m14.txt")
    Call<JSONResponse> getJSON();
}
