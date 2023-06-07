package com.rimapps.reader

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.rimapps.reader.databinding.CityItemLayoutBinding

class MainAdapter(
    private val cityList: List<CityItem>
): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val binding  = CityItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val cityItem:CityItem = cityList[position]
        holder.bind(cityItem)
    }

    override fun getItemCount(): Int {
        return cityList.size
    }

    class MainViewHolder(private val binding: CityItemLayoutBinding):ViewHolder(binding.root) {
        fun bind(cityItem: CityItem){
            binding.tvCountry.text = cityItem.country
            binding.tvCity.text = cityItem.city
            binding.tvCapital.text = cityItem.capital
            binding.tvAdminName.text = cityItem.admin_name
            binding.tvPopulation.text = cityItem.population
        }

    }

}