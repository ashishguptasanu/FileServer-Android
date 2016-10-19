package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 19/10/16.
 */

public interface Bio3_3 {
    @GET("/rufly/Json/Biotech/3rdyear/3_3.txt")
    Call<JSONResponse> getJSON();
}
