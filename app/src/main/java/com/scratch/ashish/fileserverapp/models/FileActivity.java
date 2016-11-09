package com.scratch.ashish.fileserverapp.models;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by ashish on 2/11/16.
 */

public interface FileActivity {
    @GET
    Call<JSONResponse> getJSON(@Url String url);
}
