package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 19/10/16.
 */

public interface Bio2_1 {
    @GET("/rufly/Json/Biotech/2ndyear/2_1.txt")
    Call<JSONResponse> getJSON();
}
