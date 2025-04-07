package com.example.mobileapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pause : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pause)
    }

    fun onTitleButton(view: View){
        val int: Intent = Intent(this, MainActivity().javaClass)
        startActivity(int)
    }
    fun onContinueButton(view: View){
        this.finish()
    }
}