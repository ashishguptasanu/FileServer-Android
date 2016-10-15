package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 25/9/16.
 */

public interface PB2_2 {
    @GET("/rufly/Json/Physics/ug/2nd/thermo_tute.txt")
    Call<JSONResponse> getJSON();
}
