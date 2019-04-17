package com.example.tvshow.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TVService {

    private static final String BASE_URL = "https://api.themoviedb.org/3/";

    public static TVAPI getAPI() {
        final Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();

        return retrofit.create(TVAPI.class);

    }
}
