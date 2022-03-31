package com.example.helloworldkotlin.sqliteroomlayer
// android room kotlin config
// unable to resolve class val
// Groovy config https://developer.android.com/training/data-storage/room#groovy
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// data class User()
@Entity
data class User(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?
)
