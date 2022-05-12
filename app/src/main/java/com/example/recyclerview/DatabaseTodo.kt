package com.example.recyclerview

import androidx.room.RoomDatabase
import androidx.room.Database
import com.example.recyclerview.DaoClass.DaoInterface
import com.example.recyclerview.EntityClass.TaskEntity

@Database(entities = [TaskEntity::class], version = 1)
abstract class DatabaseTodo:RoomDatabase() {

    abstract fun getDao(): DaoInterface

}