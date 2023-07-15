package com.nyoman.uas.data.api

import com.nyoman.uas.data.model.ListResponse
import com.nyoman.uas.data.model.MovieResponse
import com.nyoman.uas.data.model.TvShowResponse
import com.nyoman.uas.utils.API_KEY
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("movie/now_playing?api_key=$API_KEY")
    fun getMovies(): Call<ListResponse<MovieResponse>>

    @GET("tv/airing_today?api_key=$API_KEY")
    fun getTvShow(): Call<ListResponse<TvShowResponse>>

}