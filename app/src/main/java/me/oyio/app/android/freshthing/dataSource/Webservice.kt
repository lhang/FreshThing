package me.oyio.app.android.freshthing.dataSource

import me.oyio.app.android.freshthing.data.thing.Things
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by lllde on 2017/10/19.
 */
interface Webservice {
    @GET("/topic")
    fun getThings(@Path("thing") thingId: String): Call<Things>
}