package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 19/10/16.
 */

public interface Bio4_3 {
    @GET("/rufly/Json/Biotech/4rthyear/4_3.txt")
    Call<JSONResponse> getJSON();
}
