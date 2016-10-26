package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 26/10/16.
 */

public interface Ecpg3 {
    @GET("/rufly/Json/ecpg/1_3.txt")
    Call<JSONResponse> getJSON();
}
