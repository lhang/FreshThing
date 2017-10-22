package me.oyio.app.android.freshthing.viewModel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import me.oyio.app.android.freshthing.data.thing.Things
import me.oyio.app.android.freshthing.repository.ThingsRepository
import javax.inject.Inject

/**
 * Created by lllde on 2017/10/18.
 */
class ThingsListViewModel : ViewModel() {
    private var thingId: String? = null
    private var things: LiveData<Things>? = null
    @Inject lateinit var thingRepo: ThingsRepository

    fun getThings(): LiveData<Things>? {
        return things
    }
}