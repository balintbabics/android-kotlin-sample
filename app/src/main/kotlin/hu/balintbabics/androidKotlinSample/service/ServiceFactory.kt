package hu.balintbabics.androidKotlinSample.service

import retrofit.RestAdapter

/**
 * Created by balintbabics on 10/01/17.
 */

object ServiceFactory {
    fun <T> createRetrofitService(clazz: Class<T>, endPoint: String): T {

        val restAdapter = RestAdapter.Builder().setEndpoint(endPoint).build()
        val service = restAdapter.create(clazz)

        return service
    }
}
