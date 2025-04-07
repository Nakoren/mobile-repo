package com.example.mobileapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class game_init_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_game_init)
    }

    public fun onStartButton(view: View){
        val int:Intent = Intent(this, Gameplay_place_activity().javaClass)

        val s1Count = findViewById<SeekBar>(R.id.boatSeekBar).progress
        val s2Count = findViewById<SeekBar>(R.id.destroyerSeekBar).progress
        val s3Count = findViewById<SeekBar>(R.id.cruiserSeekBar).progress
        val s4Count = findViewById<SeekBar>(R.id.battleshipSeekBar).progress

        int.putExtra("s1Count", s1Count)
        int.putExtra("s2Count", s2Count)
        int.putExtra("s3Count", s3Count)
        int.putExtra("s4Count", s4Count)

        startActivity(int)
    }

}