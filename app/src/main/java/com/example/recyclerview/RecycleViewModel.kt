package com.example.recyclerview

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

data class Task(var description: String, var completed: Boolean = false)

class RecycleViewModel(val navController: NavController){

    fun goToAddTask() {
        navController.navigate(R.id.action_mainFragment_to_addTaskFragment)
    }
}