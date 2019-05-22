package com.weather.app.domain.model

/**
 * author:
 * created on: 2019/5/21 13:27
 * description:
 */

data class ForecastList(val city: String, val country: String, val dailyForecast: List<Forecast>)

data class Forecast(val data: String, val description: String, val high: Int, val low: Int)