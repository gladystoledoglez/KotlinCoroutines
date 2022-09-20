package com.example.kotlincoroutines

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val TAG = "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            val networkCallAnswer1 = doNetworkCall1()
            val networkCallAnswer2 = doNetworkCall2()
            Log.d(TAG, networkCallAnswer1)
            Log.d(TAG, networkCallAnswer2)
        }
    }
    suspend fun doNetworkCall1(): String{
        delay(3000L)
        return "This is the answer"
    }

    suspend fun doNetworkCall2(): String{
        delay(3000L)
        return "This is the answer"
    }
}