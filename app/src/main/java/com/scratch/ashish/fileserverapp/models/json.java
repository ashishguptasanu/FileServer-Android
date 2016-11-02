package com.scratch.ashish.fileserverapp.models;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashish on 3/11/16.
 */

public interface json {
    @GET("/rufly/new+json")
    Call<CollegeResponse> getJSON();
}
