package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 11/9/16.
 */
public interface M4 {
    @GET("/rufly/Json/Maths/M4_Discrete.txt")
    Call<JSONResponse> getJSON();
}
