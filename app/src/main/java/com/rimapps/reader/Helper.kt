package com.rimapps.reader

import android.content.Context
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import java.io.BufferedReader

class Helper {

    private var context: Context = App.applicationContext()
    private val bufferReader = BufferedReader(context.assets.open("cities.csv").reader())

    private var csvParser: CSVParser = CSVParser.parse(
        bufferReader, CSVFormat.DEFAULT
    )

    fun parseCsv(): MutableList<CityDTO> {
        val list = mutableListOf<CityDTO>()
        csvParser.forEach {
            it?.let {
                val cities = CityDTO(
                it.get(0),
                it.get(3),
                it.get(5),
                it.get(6),
                it.get(7),
                )
                list.add(cities)
            }

        }

        return list
    }
}