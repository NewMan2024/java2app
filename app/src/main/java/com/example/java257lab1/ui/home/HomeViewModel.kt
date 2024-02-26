package com.example.java257lab1.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is my new place. If there is no plan,,, then there is no progress. - Mo A."
    }
    val text: LiveData<String> = _text
}






