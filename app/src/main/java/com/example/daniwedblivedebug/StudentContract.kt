package com.example.daniwedblivedebug

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns

object StudentContract {
    object Student : BaseColumns {
        const val TABLE = "student"
        const val COLUMN_NAME = "name"
        const val COLUMN_AGE = "age"
    }

    private const val SQL_CREATE_STUDENTS =
        "CREATE TABLE ${Student.TABLE} (" +
                "${BaseColumns._ID} INTEGER PRIMARY KEY," +
                "${Student.COLUMN_NAME} TEXT," +
                "${Student.COLUMN_AGE} INTEGER)"

    class StudentDbHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

        override fun onCreate(db: SQLiteDatabase) {
            db.execSQL(SQL_CREATE_STUDENTS)
        }

        override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
            TODO("Not yet implemented")
        }

        companion object {
            const val DATABASE_VERSION = 1
            const val DATABASE_NAME = "Student.db"
        }
    }
}