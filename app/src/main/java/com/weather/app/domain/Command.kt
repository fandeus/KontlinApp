package com.weather.app.domain

/**
 * author:
 * created on: 2019/5/21 11:15
 * description:
 */
public interface Command<T> {

    fun execute(): T

}