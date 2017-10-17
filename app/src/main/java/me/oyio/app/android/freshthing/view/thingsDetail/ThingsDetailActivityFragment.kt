package me.oyio.app.android.freshthing.view.thingsDetail

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.oyio.app.android.freshthing.R

/**
 * A placeholder fragment containing a simple view.
 */
class ThingsDetailActivityFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_things_detail, container, false)
    }
}
