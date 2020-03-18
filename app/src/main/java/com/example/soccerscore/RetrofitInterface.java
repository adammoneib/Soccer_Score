package com.example.soccerscore;

import com.example.soccerscore.Model.Score;
import com.example.soccerscore.Model.Video;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface RetrofitInterface {

    @GET("?key={key}&secret={secret}")
    Call<List<Score>> getScores(@Path("key") int apiKey, @Path("secret") int apiSecret);

    @GET
    Call<List<Video>> getVideos(@Url String url);

}
