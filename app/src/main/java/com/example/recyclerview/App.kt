package com.example.recyclerview

import android.app.Application
import androidx.room.Room

class App: Application() {
    companion object {
        lateinit private var database: DatabaseTodo
        lateinit private var instance: App

        fun getInstance(): App {
            return instance
        }
        fun getDatabase(): DatabaseTodo {
            return database
        }
    }
    override fun onCreate() {
        super.onCreate()
        instance = this
        database = Room.databaseBuilder(
            applicationContext,
            DatabaseTodo::class.java, "todo-list.db"
        ).build()
    }

}