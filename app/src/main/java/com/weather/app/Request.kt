package com.weather.app

import android.util.Log
import java.net.URI
import java.net.URL

/**
 * author:
 * created on: 2019/5/17 19:18
 * description:   http://www.wuhaichao.com/api_doc/  一个免费的请求接口
 */
public class Request(private val url: String) {

    public fun run() {
        val forecastJsonStr = URL(url).readText();
        Log.d("Request", forecastJsonStr)
    }
}