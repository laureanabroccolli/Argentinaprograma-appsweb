package com.ticmas.laureanabroccolli.proyectofinal.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ticmas.romanrios.proyectofinal.model.DataModel

class MainViewModel : ViewModel() {

    private val _result = MutableLiveData<String>()
    val result: LiveData<String> get() = _result

    fun compareTexts(text1: String, text2: String) {
        if (text1.isEmpty() || text2.isEmpty()) {
            _result.value = "Campos incompletos"
        } else if (text1 == text2) {
            _result.value = "Los textos son IGUALES"
        } else {
            _result.value = "Los textos son DIFERENTES"
        }
    }
}
