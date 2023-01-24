package com.example.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit : Button = findViewById(R.id.btnSubmit)
        val car : EditText = findViewById(R.id.idCar)
        val color : EditText = findViewById(R.id.idColor)

        btnSubmit.setOnClickListener(){
            if(car.text.isBlank() && color.text.isBlank()){
                Toast.makeText(this@MainActivity, "Please fill in all the data fields", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this@MainActivity, "Submit!!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}