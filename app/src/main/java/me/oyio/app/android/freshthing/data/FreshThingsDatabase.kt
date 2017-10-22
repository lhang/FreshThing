package me.oyio.app.android.freshthing.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import me.oyio.app.android.freshthing.data.thing.Things
import me.oyio.app.android.freshthing.data.thing.ThingsDao

/**
 * Created by lllde on 2017/10/18.
 */
@Database(entities = arrayOf(Things::class), version = 1)
abstract class FreshThingsDatabase: RoomDatabase() {
    abstract fun thingDao(): ThingsDao
}