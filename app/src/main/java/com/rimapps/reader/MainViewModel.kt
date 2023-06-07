package com.rimapps.reader

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(
    private val repository: CityRepository = CityRepositoryFactory.buildCityRepository()
): ViewModel() {

    private val _viewState = MutableLiveData<List<CityItem>>()

    val viewState: MutableLiveData<List<CityItem>>
        get() = _viewState

    fun loadList() {
        val result = repository.getCities()
        _viewState.postValue(result.map {
            CityItem(
                it.city,
                it.country,
                it.admin_name,
                it.capital,
                it.population
            )
        })
    }

}