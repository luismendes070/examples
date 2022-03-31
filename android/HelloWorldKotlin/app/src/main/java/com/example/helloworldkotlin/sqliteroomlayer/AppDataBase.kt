package com.example.helloworldkotlin.sqliteroomlayer

import androidx.room.Database
import androidx.room.RoomDatabase

// annotation class AppDataBase()
@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}
