package com.rimapps.reader

object CityRepositoryFactory {

   fun buildCityRepository(): CityRepository{
       return CityRepositoryImpl()
   }
}