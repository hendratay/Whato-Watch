package com.example.hendratay.whatowatch.data.remote

import com.example.hendratay.whatowatch.data.entity.ActorPopularEntity
import com.example.hendratay.whatowatch.data.entity.MovieDetailEntity
import com.example.hendratay.whatowatch.data.entity.MoviePopularEntity
import com.example.hendratay.whatowatch.data.entity.TvPopularEntity
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    fun popularMovie(@Query("page") page: Int): Observable<MoviePopularEntity>

    @GET("movie/{movie_id}")
    fun movieDetail(@Path("movie_id") movieId: Int): Observable<MovieDetailEntity>

    @GET("tv/popular")
    fun popularTv(@Query("page") page: Int): Observable<TvPopularEntity>

    @GET("person/popular")
    fun popularActor(@Query("page") page: Int): Observable<ActorPopularEntity>

}