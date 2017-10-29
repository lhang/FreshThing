package me.oyio.app.android.freshthing.viewModel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import me.oyio.app.android.freshthing.data.dao.thing.Thing
import me.oyio.app.android.freshthing.data.repository.ThingsRepository
import javax.inject.Inject

/**
 * Created by lllde on 2017/10/18.
 */
class ThingsListViewModel : ViewModel() {
    private var things: LiveData<List<Thing>>? = null
    @Inject var thingRepo: ThingsRepository = ThingsRepository()

    fun getThings(): LiveData<List<Thing>>? {
        things = thingRepo.getThings()
        return things
    }

    fun refresh() {
        thingRepo.refresh()
    }
}