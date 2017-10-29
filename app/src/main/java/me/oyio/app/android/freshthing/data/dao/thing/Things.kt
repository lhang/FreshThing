package me.oyio.app.android.freshthing.data.dao.thing

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by lllde on 2017/10/18.
 */

@Entity
class Thing {
    @PrimaryKey
    lateinit var id: String

    @ColumnInfo(name = "source")
    lateinit var source: String

    @ColumnInfo(name = "title")
    lateinit var title: String

    @ColumnInfo(name = "content")
    lateinit var content: String
}