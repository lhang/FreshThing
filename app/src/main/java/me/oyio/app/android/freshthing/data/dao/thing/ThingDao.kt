package me.oyio.app.android.freshthing.data.dao.thing

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query

/**
 * Created by lllde on 2017/10/18.
 */
@Dao
interface ThingDao {
    @Insert(onConflict = REPLACE)
    fun insertAll(things: List<Thing>)

    @Query("SELECT * FROM things WHERE id = :thingId")
    fun get(thingId: String): LiveData<Thing>

    @Query("SELECT * FROM thing")
    fun loadThings(): LiveData<List<Thing>>
}