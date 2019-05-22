package com.weather.app.date

import com.weather.app.domain.model.ForecastList
import java.text.DateFormat
import java.util.*
import com.weather.app.domain.model.Forecast as ModelForecast

/**
 * author:
 * created on: 2019/5/21 11:26
 * description:
 */
public class ForecastDataMapper {

    fun convertFromDataModel(forecast: ForecastResult): ForecastList {
        return ForecastList(
            forecast.city.name,
            forecast.city.country,
            convertForecastToDomain(forecast.list)
        )

    }

    private fun convertForecastToDomain(list: List<Forecast>): List<ModelForecast> {
        return list.map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast {
        return ModelForecast(
            convertDate(forecast.dt),
            forecast.weather[0].description,
            forecast.main.temp_max.toInt(),
            forecast.main.temp_min.toInt()
        )
    }


    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }

}