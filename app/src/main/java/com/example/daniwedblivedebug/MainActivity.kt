package com.example.daniwedblivedebug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val dbHelper = StudentContract.StudentDbHelper(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dbHelper.readableDatabase
    }

    override fun onDestroy() {
        dbHelper.close()
        super.onDestroy()
    }
}