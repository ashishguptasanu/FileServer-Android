package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 5/9/16.
 */
public interface cs2_4 {
    @GET("/rufly/Json/MBA1_files/mba1BS.txt")
    Call<JSONResponse> getJSON();
}
