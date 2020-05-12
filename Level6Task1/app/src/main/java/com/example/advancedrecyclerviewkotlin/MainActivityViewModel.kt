package com.example.advancedrecyclerviewkotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.advancedrecyclerviewkotlin.model.ColorItem

class MainActivityViewModel : ViewModel(){
    private val colorRepository = ColorRepository()

    val colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepository.getColorItems()
    }
}
