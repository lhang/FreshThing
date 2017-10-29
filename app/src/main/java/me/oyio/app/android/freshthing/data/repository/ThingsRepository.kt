package me.oyio.app.android.freshthing.data.repository

import android.arch.lifecycle.LiveData
import me.oyio.app.android.freshthing.data.dao.thing.Thing
import me.oyio.app.android.freshthing.data.dao.thing.ThingDao
import me.oyio.app.android.freshthing.data.dataSource.ReadHubService
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
class ThingsRepository
@Inject constructor(val readHubService: ReadHubService, var thingDao: ThingDao, var excutor: Executor) {

    fun getThings(): LiveData<List<Thing>>? {
        return thingDao?.loadThings()
    }

    fun refresh() {
        readHubService.topicList("1").enqueue(object : Callback<List<Thing>> {
            override fun onFailure(call: Call<List<Thing>>, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<List<Thing>>, response: Response<List<Thing>>) {

            }
        })
    }
}
