package com.example.sangsun_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConsultingActivity_Reservation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consulting_reservation)

        val startChat: Button = findViewById(R.id.chatting_btn)

        startChat.setOnClickListener {
            val intent = Intent(this, CunsultingChatActivity::class.java)
            startActivity(intent)
        }

    }
}