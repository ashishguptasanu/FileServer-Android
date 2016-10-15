package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 25/9/16.
 */

public interface PM2_3 {
    @GET("/rufly/Json/MBA1_files/mba1BS.txt")
    Call<JSONResponse> getJSON();
}
