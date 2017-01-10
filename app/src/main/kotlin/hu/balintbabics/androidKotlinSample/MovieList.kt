package hu.balintbabics.androidKotlinSample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Button
import butterknife.BindView
import butterknife.ButterKnife
import hu.balintbabics.androidKotlinSample.adapter.Adapter
import hu.balintbabics.androidKotlinSample.model.Movie
import hu.balintbabics.androidKotlinSample.service.MovieService
import hu.balintbabics.androidKotlinSample.service.ServiceFactory
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by balintbabics on 10/01/17.
 */

class MovieList : AppCompatActivity() {

    @BindView(R.id.recycler_view)
    lateinit var recyclerView: RecyclerView

    @BindView(R.id.button_clear)
    lateinit var clear: Button

    @BindView(R.id.button_get)
    lateinit var get: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButterKnife.bind(this)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val cardAdapter = Adapter()
        recyclerView.adapter = cardAdapter


        clear.setOnClickListener {
            cardAdapter.clear()
        }

        get.setOnClickListener {
            val service = ServiceFactory.createRetrofitService<MovieService>(MovieService::class.java, MovieService.SERVICE_ENDPOINT)

            service.getMoviesUpcoming(BuildConfig.UPCOMING_MOVIES_API_KEY).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(object : Subscriber<Movie>() {

                override fun onCompleted() {
                    Log.i("Fetching data", "Success")
                }

                override fun onError(e: Throwable) {
                    Log.i("On fetching error", e.message)
                }

                override fun onNext(results: Movie) {
                    val result = results.results
                    cardAdapter.addData(result as MutableList<Movie.Results>)
                }
            })
        }
    }
}
