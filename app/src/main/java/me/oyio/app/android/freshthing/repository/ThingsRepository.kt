package me.oyio.app.android.freshthing.repository

import me.oyio.app.android.freshthing.data.thing.ThingsDao
import me.oyio.app.android.freshthing.dataSource.Webservice
import java.util.concurrent.Executor
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by lllde on 2017/10/18.
 */
@Singleton
class ThingsRepository
        @Inject constructor(val webservice: Webservice, var thingsDao: ThingsDao, var excutor: Executor) {


    fun getThings(): Unit? {
        refreshThings()
        return thingsDao?.loadThings()
    }

    private fun refreshThings() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}