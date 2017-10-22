package me.oyio.app.android.freshthing.data.thing

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by lllde on 2017/10/18.
 */

@Entity
data class Things(
        @PrimaryKey var id: String,
        var title: String,
        var content: String
)