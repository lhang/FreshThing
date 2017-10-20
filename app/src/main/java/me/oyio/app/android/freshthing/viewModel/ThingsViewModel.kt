package me.oyio.app.android.freshthing.viewModel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import me.oyio.app.android.freshthing.data.thing.Thing
import me.oyio.app.android.freshthing.repository.ThingRepository
import javax.inject.Inject

/**
 * Created by lllde on 2017/10/18.
 */
class ThingsViewModel: ViewModel() {
    private var thingId: String? = null
    private var things: LiveData<Thing>? = null
    var thingRepo: ThingRepository? = null;

    @Inject
    fun ThingsViewModel(thingRepo: ThingRepository) {
        this.thingRepo = thingRepo;
    }

    fun initThings() {
        things = thingRepo?.getThings()
    }
}