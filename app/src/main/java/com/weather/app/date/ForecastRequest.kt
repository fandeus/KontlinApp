package com.weather.app.date

/**
 * author:
 * created on: 2019/5/19 16:22
 * description:
 */
data class ForecastResult(val city: City, val cod: String, val message: Float, val cnt: Int, val list: List<Forecast>)

data class City(
    val id: Long,
    val name: String,
    val coord: Coordinates,
    val country: String,
    val population: Int,
    val timezone: Int
)

data class Coordinates(val lon: Float, val lat: Float)

data class Forecast(
    val dt: Long,
    val temp: Temperature,
    val pressure: Float,
    val humidity: Int,
    val weather: List<Weather>,
    val speed: Float,
    val deg: Int,
    val clouds: Int

)

data class Temperature(
    val day: Float,
    val min: Float,
    val max: Float,
    val night: Float,
    val eve: Float,
    val morn: Float
)

data class Weather(val id: Int, val main: String, val description: String, val icon: String)


