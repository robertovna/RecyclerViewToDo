package com.example.recyclerview

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField

data class Task(var description: String, var completed: Boolean = false)

class RecycleViewModel: BaseObservable() {
}