package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 25/9/16.
 */

public interface PB1_2 {
    @GET("/rufly/Json/Physics/ug/1st/physics1.txt")
    Call<JSONResponse> getJSON();
}
