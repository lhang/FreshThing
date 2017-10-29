package me.oyio.app.android.freshthing.view.things

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import me.oyio.app.android.freshthing.R
import me.oyio.app.android.freshthing.data.dao.thing.Thing

import me.oyio.app.android.freshthing.view.things.ThingsFragment.OnListFragmentInteractionListener
import me.oyio.app.android.freshthing.view.things.dummy.ThingsContent.DummyItem

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class MyThingsRecyclerViewAdapter(private val mValues: List<Thing>?,
                                  private val mListener: OnListFragmentInteractionListener?) : RecyclerView.Adapter<MyThingsRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_things, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mItem = mValues?.get(position)
        holder.mIdView.text = mValues?.get(position)?.title
        holder.mContentView.text = mValues?.get(position)?.content

        holder.mView.setOnClickListener {
            mListener?.onListFragmentInteraction(holder.mItem!!)
        }
    }

    override fun getItemCount(): Int {
        if (mValues != null) {
            return mValues.size
        }
        return 0
    }

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mIdView: TextView
        val mContentView: TextView
        var mItem:  Thing? = null

        init {
            mIdView = mView.findViewById(R.id.id)
            mContentView = mView.findViewById(R.id.content)
        }

        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }
    }
}
