package me.oyio.app.android.freshthing.view.things

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import me.oyio.app.android.freshthing.R
import me.oyio.app.android.freshthing.view.things.dummy.ThingsContent
import me.oyio.app.android.freshthing.view.things.dummy.ThingsContent.DummyItem
import me.oyio.app.android.freshthing.viewModel.ThingsListViewModel

/**
 * A fragment representing a list of Items.
 *
 *
 * Activities containing this fragment MUST implement the [OnListFragmentInteractionListener]
 * interface.
 */
/**
 * Mandatory empty constructor for the fragment manager to instantiate the
 * fragment (e.g. upon screen orientation changes).
 */
class ThingsFragment : Fragment() {
    // TODO: Customize parameters
    private var mColumnCount = 1
    private var mListener: OnListFragmentInteractionListener? = null

    private final var UID_KEY = "uid"
    private var viewModel: ThingsListViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (arguments != null) {
            mColumnCount = arguments.getInt(ARG_COLUMN_COUNT)
        }
        viewModel = ViewModelProviders.of(this).get(ThingsListViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_things_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            val context = view.getContext()
            if (mColumnCount <= 1) {
                view.layoutManager = LinearLayoutManager(context)
            } else {
                view.layoutManager = GridLayoutManager(context, mColumnCount)
            }
            view.adapter = MyThingsRecyclerViewAdapter(ThingsContent.ITEMS, mListener)

            viewModel?.getThings()?.observe(this, Observer { thing ->
                ThingsContent.addItem(thing.toString())
            })
        }
        return view
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnListFragmentInteractionListener) {
            mListener = context
        } else {
            throw RuntimeException(context!!.toString() + " must implement OnListFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ThingsListViewModel::class.java)
        viewModel?.getThings()?.observe(this, Observer { thing ->

        })
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */
    interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onListFragmentInteraction(item: DummyItem)
    }

    companion object {

        // TODO: Customize parameter argument names
        private val ARG_COLUMN_COUNT = "column-count"

        // TODO: Customize parameter initialization
        fun newInstance(columnCount: Int): ThingsFragment {
            val fragment = ThingsFragment()
            val args = Bundle()
            args.putInt(ARG_COLUMN_COUNT, columnCount)
            fragment.arguments = args
            return fragment
        }
    }
}
