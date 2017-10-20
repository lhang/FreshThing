package me.oyio.app.android.freshthing.repository

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import me.oyio.app.android.freshthing.data.thing.Thing
import me.oyio.app.android.freshthing.data.thing.ThingDao
import me.oyio.app.android.freshthing.dataSource.Webservice
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.Executor
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by lllde on 2017/10/18.
 */
@Singleton
class ThingRepository {
    var webservice: Webservice? = null
    var thingDao: ThingDao? = null
    var executor: Executor? = null

    @Inject
    fun ThingRepository(webservice: Webservice, thingDao: ThingDao, excutor: Executor) {
        this.webservice = webservice
        this.thingDao = thingDao
        this.executor = executor
    }

    fun getThings(): Unit? {
        refreshThings()
        return thingDao?.loadThings()
    }

    private fun refreshThings() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}