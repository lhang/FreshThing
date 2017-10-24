package me.oyio.app.android.freshthing.dataSource

import me.oyio.app.android.freshthing.data.thing.Things
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by lllde on 2017/10/25.
 */
interface ReadHubService {
    @GET("/topic?lastCursor=22591&pageSize=10")
    fun topicList(@Path("topic") page: String): Call<Things>
}