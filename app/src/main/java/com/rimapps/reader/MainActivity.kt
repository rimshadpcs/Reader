package com.rimapps.reader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.rimapps.reader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private var adapter: MainAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        viewModel.loadList()

        viewModel.viewState.observe(this){
            adapter = MainAdapter(it)

            mainBinding.apply {
                rvCities.layoutManager = GridLayoutManager(this@MainActivity,2)
                rvCities.adapter =adapter

            }


//            it.forEach { it ->
//                mainBinding.tvCode.append(
//                    "${it.city} ${it.country}\n\n"
//                )
//            }


        }

    }
}