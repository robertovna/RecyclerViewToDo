package com.example.recyclerview

import android.os.Bundle
import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import androidx.navigation.NavController
import androidx.navigation.Navigation

class EditTextViewModel(val navController:NavController): BaseObservable()  {
    var editText = ObservableField<String>("")

    fun goToMain() {
        var bundle = Bundle()
        bundle.putString("editparam", editText.get())
        editText.set("")
        navController.setGraph(R.navigation.nav_main, bundle)
        //navController.navigate(R.id.action_addTaskFragment_to_mainFragment)
    }
}