package com.example.recyclerview

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import androidx.navigation.NavController

class EditTextViewModel(val navController:NavController): BaseObservable()  {
    var editText = ObservableField<String>("")

    fun goToMain() {
        navController.navigate(R.id.action_addTaskFragment_to_mainFragment)
    }
}