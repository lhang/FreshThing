package me.oyio.app.android.freshthing.data.dao

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import me.oyio.app.android.freshthing.data.dao.thing.Thing
import me.oyio.app.android.freshthing.data.dao.thing.ThingDao

/**
 * Created by lllde on 2017/10/18.
 */
@Database(entities = arrayOf(Thing::class), version = 1)
abstract class FreshThingsDatabase: RoomDatabase() {
    abstract fun thingDao(): ThingDao
}