package com.example.sangsun_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnConsulting: Button = findViewById(R.id.btn_consulting)

        btnConsulting.setOnClickListener {
            val intent = Intent(this, ConsultingActivity::class.java)
            startActivity(intent)
        }
    }
}