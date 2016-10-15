package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 1/9/16.
 */
public interface RI1_7 {
    @GET("/rufly/Json/MBA1_files/m7.txt")
    Call<JSONResponse> getJSON();
}
