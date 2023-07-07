package edu.xfoleks.safepassword.presentation.viemodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private var _countOfCreatedPasswords = MutableLiveData(0)
    val countOfCreatedPasswords: LiveData<Int> get() = _countOfCreatedPasswords


}