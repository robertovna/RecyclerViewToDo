package com.example.recyclerview.EntityClass

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
class TaskEntity {
    @PrimaryKey(autoGenerate = true)
    private var key : Int = 0
    @ColumnInfo(name = "text")
    private var text: String = "some task text"

    fun getText(): String {
        return text
    }
    fun getKey(): Int {
        return key
    }
}