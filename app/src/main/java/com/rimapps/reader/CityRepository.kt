package com.rimapps.reader

interface CityRepository {
    fun getCities():MutableList<City>
}