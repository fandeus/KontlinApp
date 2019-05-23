package com.weather.app.domain

import com.weather.app.ForecastRequest
import com.weather.app.date.ForecastDataMapper
import com.weather.app.domain.model.ForecastList

/**
 * author:
 * created on: 2019/5/23 8:57
 * description:
 */
class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {

    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.excute())
    }

}