package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 20/10/16.
 */

public interface Bio5_4 {
    @GET("/rufly/Json/Biotech/5thyear/5_4.txt")
    Call<JSONResponse> getJSON();
}