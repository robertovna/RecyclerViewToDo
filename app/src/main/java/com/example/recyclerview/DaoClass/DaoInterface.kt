package com.example.recyclerview.DaoClass

import androidx.room.*
import com.example.recyclerview.EntityClass.TaskEntity

@Dao
interface DaoInterface {

    @Insert
    suspend fun insertAllData(task: TaskEntity)

    @Query("select * from task")
    suspend fun getAllData(): List<TaskEntity>

    @Insert
    suspend fun insertListTask(task: List<TaskEntity>)
    @Update
    suspend fun updateTask(task: TaskEntity)
    @Delete
    suspend fun deleteTask(task: TaskEntity)
}