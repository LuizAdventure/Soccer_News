package com.luizadventure.soccernews.data.remote;

import java.util.List;

import com.luizadventure.soccernews.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SoccerNewsApi {

    @GET("news.json")
    Call<List<News>> getNews();
}
