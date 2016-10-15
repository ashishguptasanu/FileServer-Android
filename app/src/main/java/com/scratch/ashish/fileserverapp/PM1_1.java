package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 25/9/16.
 */

public interface PM1_1 {
    @GET("/rufly/Json/Physics/pg/1st/grp_theory1.txt")
    Call<JSONResponse> getJSON();
}
