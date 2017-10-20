package me.oyio.app.android.freshthing.data.thing

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
    fun insert(things: List<Thing>)

    @Query("SELECT * FROM thing WHERE id = :thingId")
    fun load(thinId: String): Thing

    @Query("SELECT * FROM thing")
    fun loadThings()
}