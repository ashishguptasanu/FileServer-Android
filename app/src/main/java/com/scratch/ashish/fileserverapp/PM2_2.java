package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 25/9/16.
 */

public interface PM2_2 {
    @GET("/rufly/Json/Physics/pg/3rd/photovoltic_tch.txt")
    Call<JSONResponse> getJSON();
}
