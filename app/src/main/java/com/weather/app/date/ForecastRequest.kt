package com.weather.app.date

/**
 * author:
 * created on: 2019/5/19 16:22
 * description:
 */
data class ForecastResult(val city: City, val list: List<Forecast>)

data class City(val id: Long, val name: String, val coord: Coordinates, val country: String)

data class Coordinates(val lat: Float, val lon: Float)

data class Forecast(
    val dt: Long,
    val main: Temperature,
    val weather: List<Weather>,
    val clouds: Clouds,
    val wind: Wind,
    val snow: Snow,
    val sys: Sys,
    val dt_txt: String
)

data class Temperature(
    val temp: Float,
    val temp_min: Float,
    val temp_max: Float,
    val pressure: Float,
    val swa_level: Float,
    val grnd_level: Float,
    val humidity: Int,
    val temp_kf: Float
)

data class Weather(val id: Int, val main: String, val description: String, val icon: String)

data class Clouds(val all: Int)

data class Wind(val speed: Float, val deg: Float)

data class Snow(val h3: Float)

data class Sys(val pod: String)

