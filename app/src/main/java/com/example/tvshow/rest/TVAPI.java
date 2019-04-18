package com.example.tvshow.rest;

import com.example.tvshow.model.TVResponse;
import com.example.tvshow.model.TVVideoResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TVAPI {

    @GET("tv/on_the_air")
    Call<TVResponse> getTVShows(@Query("api_key") String apiKey);

    @GET("tv/popular")
    Call<TVResponse> getPopuler(@Query("api_key") String apiKey);

    @GET("tv/{tv_id}/videos")
    Call<TVVideoResponse> getTVVideos(@Path("tv_id") int tv_id,
                                      @Query("api_key") String apiKey);

}
