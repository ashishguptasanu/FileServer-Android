package com.scratch.ashish.fileserverapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface2 {
    @GET("/SystemNetworks.txt")
    Call<JSONResponse> getJSON();
}
