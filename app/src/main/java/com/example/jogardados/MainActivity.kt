package com.example.jogardados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado1 = findViewById<TextView>(R.id.dado1)
        val dado2 = findViewById<TextView>(R.id.dado2)
        val bt6 =findViewById(R.id.btn_6)as Button

        bt6.setOnClickListener {

            dado1.text=gerardados().toString()
            dado2.text=gerardados().toString()


        }
        dado1.text=gerardados().toString()
        dado2.text=gerardados().toString()
    }
    private fun gerardados (): Int {
       // val rand = (1..6).random()
        return (1..6).random()
    }


}