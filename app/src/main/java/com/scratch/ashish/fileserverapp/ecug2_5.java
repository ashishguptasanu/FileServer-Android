package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 22/9/16.
 */

public interface ecug2_5 {
    @GET("/rufly/Json/ecug/ecug2/ecug2_DS.txt")
    Call<JSONResponse> getJSON();
}
