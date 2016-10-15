package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 5/9/16.
 */
public interface Hss3_sub2 {
    @GET("/rufly/Json/HSS3/Techngov.txt")
    Call<JSONResponse> getJSON();
}
