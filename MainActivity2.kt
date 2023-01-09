package com.example.ca2q1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bknme = findViewById<EditText>(R.id.nme)
        val s1 : Spinner= findViewById<Spinner>(R.id.mvnme)
        val s2 : Spinner= findViewById<Spinner>(R.id.time)
        val s3 : Spinner = findViewById<Spinner>(R.id.num)
        val s4 : Spinner = findViewById<Spinner>(R.id.seat)
        val snk : CheckBox = findViewById<CheckBox>(R.id.chkbx)
        val bt : Button = findViewById<Button>(R.id.button)
        var name = bknme.text.toString()


        ArrayAdapter.createFromResource(
            this,
            R.array.MOVIES,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            s1.adapter = adapter

        }

        ArrayAdapter.createFromResource(
            this,
            R.array.Seats,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            s4.adapter = adapter

        }

        ArrayAdapter.createFromResource(
            this,
            R.array.time,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            s2.adapter = adapter

        }

        ArrayAdapter.createFromResource(
            this,
            R.array.No,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            s3.adapter = adapter

        }
    bt.setOnClickListener {

        if ( s1.selectedItem=="select your movie..."||s2.selectedItem=="Select your show"||s3.selectedItem=="How many seats you want"||s4.selectedItem=="Select your show"){
            Toast.makeText(this, "Please fill all the details.", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "Thank you  for booking tickets with us", Toast.LENGTH_SHORT).show()
            if(snk.isChecked){
                val intent2 = Intent(this,MainActivity3::class.java)
                startActivity(intent2)
            }
            else{
                Toast.makeText(this, "Please pay at the link sent to the mail snd show the receipt at time of entry.", Toast.LENGTH_SHORT).show()
                val intent2 = Intent(this,MainActivity::class.java)
                startActivity(intent2)
            }
        }


    }
    }
}