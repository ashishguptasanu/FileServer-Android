package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 22/9/16.
 */

public interface ecug2_4 {
    @GET("/rufly/Json/ecug/ecug2/ecug2_EMILab.txt")
    Call<JSONResponse> getJSON();
}
