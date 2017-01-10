package hu.balintbabics.androidKotlinSample.model

import com.google.gson.annotations.SerializedName

/**
 * Created by balintbabics on 10/01/17.
 */

class Movie {

    @SerializedName("page")
    var page: Int = 0
        get() = field
        set(value) { field = value }
    @SerializedName("results")
    var results: List<Results>? = null
        get() = field
        set(value) { field = value }

    @SerializedName("total_results")
    var total_results: Int = 0
        get() = field
        set(value) { field = value }

    @SerializedName("total_pages")
    var total_pages: Int = 0
        get() = field
        set(value) { field = value }


    class Results {

        @SerializedName("poster_path")
        var poster_path: String = ""
            get() = field
            set(value) { field = value }
        @SerializedName("adult")
        var isAdult: Boolean = false
            get() = field
            set(value) { field = value }
        @SerializedName("overview")
        var overview: String = ""
            get() = field
            set(value) { field = value }
        @SerializedName("release_date")
        var release_date: String = ""
            get() = field
            set(value) { field = value }
        @SerializedName("id")
        var id: Int = 0
            get() = field
            set(value) { field = value }
        @SerializedName("original_title")
        var original_title: String = ""
            get() = field
            set(value) { field = value }
        @SerializedName("original_language")
        var original_language: String = ""
            get() = field
            set(value) { field = value }
        @SerializedName("title")
        var title: String = ""
            get() = field
            set(value) { field = value }
        @SerializedName("backdrop_path")
        var backdrop_path: String = ""
            get() = field
            set(value) { field = value }
        @SerializedName("popularity")
        var popularity: Double = 0.toDouble()
            get() = field
            set(value) { field = value }
        @SerializedName("vote_count")
        var vote_count: Int = 0
            get() = field
            set(value) { field = value }
        @SerializedName("video")
        var isVideo: Boolean = false
            get() = field
            set(value) { field = value }
        @SerializedName("vote_average")
        var vote_average: Double = 0.toDouble()
            get() = field
            set(value) { field = value }
    }
}
