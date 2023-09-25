package com.example.crypto_currency_app.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.crypto_currency_app.data.repository.AppRepositoryImpl

class MainViewModel(application: Application) : AndroidViewModel(application){

    val repository = AppRepositoryImpl

}