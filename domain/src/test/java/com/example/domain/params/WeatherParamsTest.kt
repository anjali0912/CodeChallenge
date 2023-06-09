package com.example.domain.params

import org.junit.Test

import org.junit.Assert.assertEquals

class WeatherParamsTest {

    val weatherParams = WeatherParams(
        cityName = CITY_NAME,
        appId = APP_KEY
    )

    @Test
    fun getCityName() {
        assertEquals(CITY_NAME, weatherParams.cityName)
    }

    @Test
    fun getAppId() {
        assertEquals(APP_KEY, weatherParams.appId)
    }

    companion object {
        const val CITY_NAME = "cityName"
        const val APP_KEY = "appKey"
    }
}