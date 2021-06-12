package com.example.jogardados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        val jogador1 = findViewById<EditText>(R.id.txt_jogador)
        val btnCadastro = findViewById<Button>(R.id.button_cadastro)

        btnCadastro.setOnClickListener {
            var jogador = jogador1.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("jogador1", jogador)
            startActivities(arrayOf(intent))

        }
    }

}