package hu.balintbabics.androidKotlinSample.service

import hu.balintbabics.androidKotlinSample.model.Movie

import retrofit.http.GET
import retrofit.http.Query
import rx.Observable

/**
 * Created by balintbabics on 10/01/17.
 */

interface MovieService {

    @GET("/3/movie/upcoming")
    fun getMoviesUpcoming(@Query("api_key") apiKey: String): Observable<Movie>

    companion object {
        val SERVICE_ENDPOINT = "http://api.themoviedb.org"
    }
}
