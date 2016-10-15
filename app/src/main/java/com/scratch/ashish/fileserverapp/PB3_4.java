package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 25/9/16.
 */

public interface PB3_4 {
    @GET("/rufly/Json/Physics/ug/3rd/nuclear.txt")
    Call<JSONResponse> getJSON();
}
