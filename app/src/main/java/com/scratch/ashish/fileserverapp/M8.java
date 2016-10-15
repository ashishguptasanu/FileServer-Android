package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 11/9/16.
 */
public interface M8 {
    @GET("/rufly/Json/Maths/M8_matrix.txt")
    Call<JSONResponse> getJSON();
}
