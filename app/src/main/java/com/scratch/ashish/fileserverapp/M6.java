package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 11/9/16.
 */
public interface M6 {
    @GET("/rufly/Json/Maths/M6_maths1.txt")
    Call<JSONResponse> getJSON();
}
