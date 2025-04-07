package com.example.mobileapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Gameplay_place_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gameplay_place)

        val s1ShipCount = intent.extras?.getInt("s1Count")
        val s2ShipCount = intent.extras?.getInt("s2Count")
        val s3ShipCount = intent.extras?.getInt("s3Count")
        val s4ShipCount = intent.extras?.getInt("s4Count")

        findViewById<TextView>(R.id.s1ShipCount).text = s1ShipCount.toString()
        findViewById<TextView>(R.id.s2ShipCount).text = s2ShipCount.toString()
        findViewById<TextView>(R.id.s3ShipCount).text = s3ShipCount.toString()
        findViewById<TextView>(R.id.s4ShipCount).text = s4ShipCount.toString()

    }

    public fun startBattle(view: View){

    }

    public fun onPauseButton(view: View){
        val int: Intent = Intent(this, pause().javaClass)
        startActivity(int)
    }
}