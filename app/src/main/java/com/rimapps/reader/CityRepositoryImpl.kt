package com.rimapps.reader


class CityRepositoryImpl:CityRepository {

    private val parserHelper = Helper()

    override fun getCities(): MutableList<City> {
        return parserHelper.parseCsv().map {
            City(
                it.city,
                it.country,
                it.admin_name,
                it.capital,
                it.population

            )
        } as MutableList<City>
    }

}


