package com.example.ca2q1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var bt : Button = findViewById(R.id.button6)


        bt.setOnClickListener {
            Toast.makeText(this, "Thank You for placing your order.", Toast.LENGTH_SHORT).show()
            val intent2 = Intent(this,MainActivity::class.java)
            startActivity(intent2)
        }

    }
}