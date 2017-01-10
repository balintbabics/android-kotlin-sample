## This is a Kotlin example app for Android.

### Used dependencies:

    - ButterKnife 8.0.1
    - RxJava 1.1.6
    - Retrofit 1.9
    - Okhttp3 3.3.1
    - Kotlin 1.0.6

This app is using [TheMovieDB API](https://www.themoviedb.org/documentation/api) and listing the `upcoming` movies in a `RecyclerView` by default.

If you want to change the list type, you can do that to modify the `@GET("/3/movie/`**`upcoming`**`")` URL in `Service.kt`.

### Available URLs:

    - /upcoming
    - /top_rated
    - /popular
    - /now_playing

 You need to provide your `TheMovieDBAPIKey` in `gradle.properties` to compile/build the app.

### License

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
