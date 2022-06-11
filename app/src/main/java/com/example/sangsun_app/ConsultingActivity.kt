package com.example.sangsun_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConsultingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consulting)

        val btnConsultingReservation_1: Button = findViewById(R.id.reservation_btn_1)

        btnConsultingReservation_1.setOnClickListener {
            val intent = Intent(this, ConsultingActivity_Reservation::class.java)
            startActivity(intent)
        }

        val btnConsultingReservation_2: Button = findViewById(R.id.reservation_btn_2)

        btnConsultingReservation_2.setOnClickListener {
            val intent = Intent(this, ConsultingActivity_Reservation::class.java)
            startActivity(intent)
        }

    }
}