package hu.balintbabics.androidKotlinSample.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import hu.balintbabics.androidKotlinSample.R
import hu.balintbabics.androidKotlinSample.model.Movie
import java.util.*

/**
 * Created by balintbabics on 10/01/17.
 */

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    internal var listItems: MutableList<Movie.Results>

    init {
        listItems = ArrayList<Movie.Results>()
    }

    fun addData(movie: MutableList<Movie.Results>) {
        listItems = movie
        notifyDataSetChanged()
    }

    fun clear() {
        listItems.clear()
        notifyDataSetChanged()
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView?) {
        super.onAttachedToRecyclerView(recyclerView)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.recycler_view, viewGroup, false)
        val viewHolder = ViewHolder(view)
        return viewHolder
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val movie = listItems[i]
        viewHolder.title.text = movie.original_title
        viewHolder.rating.text = "Rating: " + movie.vote_average
        viewHolder.date.text = "Date: " + movie.release_date
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        @BindView(R.id.movie_title)
        lateinit var title: TextView

        @BindView(R.id.movie_rating)
        lateinit var rating: TextView

        @BindView(R.id.movie_date)
        lateinit var date: TextView

        init {
            ButterKnife.bind(this, itemView)
        }
    }
}
