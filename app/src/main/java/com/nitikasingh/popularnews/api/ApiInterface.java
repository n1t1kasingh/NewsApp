package com.nitikasingh.popularnews.api;

import com.nitikasingh.popularnews.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<News> getNews(

        @Query("country")String country,
        @Query("apiKey") String apiKey

    );
    @GET("everything")
    Call<News> getsNewsSearch(
            @Query("q") String keyword,
            @Query("sortBy") String sortBy,
            @Query("apiKey") String apiKey
    );
}
