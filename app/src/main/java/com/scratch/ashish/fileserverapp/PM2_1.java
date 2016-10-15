package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 25/9/16.
 */

public interface PM2_1 {
    @GET("/rufly/Json/Physics/pg/3rd/Ceramics.txt")
    Call<JSONResponse> getJSON();
}
