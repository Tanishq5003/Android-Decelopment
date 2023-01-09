package com.example.ca2q1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bktkt = findViewById<RadioButton>(R.id.tktbtn)
        val bkrfr = findViewById<RadioButton>(R.id.rfrbtn)
        val btn = findViewById<Button>(R.id.hmbtn)

        btn.setOnClickListener {
            if(bktkt.isChecked){
                val intent1 = Intent(this,MainActivity2::class.java)
                startActivity(intent1)
            }
            if(bkrfr.isChecked){
                val intent2 = Intent(this,MainActivity3::class.java)
                startActivity(intent2)
            }
        }


    }
}