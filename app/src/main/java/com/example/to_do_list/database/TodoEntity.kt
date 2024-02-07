package com.example.to_do_list.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.Date


@Entity("todos")
data class TodoEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int=0,
    @ColumnInfo("title")
    val title:String,
    @ColumnInfo("sub_title")
    val sub_title:String,
    @ColumnInfo("done")
    val done:Boolean=false,
    @ColumnInfo("added")
    val added:Long=System.currentTimeMillis()
)

val TodoEntity.addDate: String
    get() = SimpleDateFormat("yyyy/MM/dd hh:mm").format(Date(added))
