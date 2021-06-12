package com.example.jogardados

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado1 = findViewById<ImageView>(R.id.imgDado1)
        val dado2 = findViewById<ImageView>(R.id.imgDado2)
        val bt6 = findViewById<Button>(R.id.btn_6)
        val zap = findViewById<FloatingActionButton>(R.id.floatWhats)
        val text = findViewById<TextView>(R.id.txtBoas)
        val jogador = intent.getStringExtra("jogador1")

        val msg = "${resources.getString(R.string.bemvindo)}$jogador"

        text.text = msg


        val imagens = listOf(
            R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3, R.drawable.dice_4,
            R.drawable.dice_5, R.drawable.dice_6
        )

        bt6.setOnClickListener {

            dado1.setImageResource(imagens.random())
            dado2.setImageResource(imagens.random())


        }
        zap.setOnClickListener {

            val intent =Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"Voce e sortudo ")
            intent.setPackage("com.whatsapp")
            intent.type="text/plain"
            if (intent.resolveActivity(this.packageManager)!=null)
                startActivities(arrayOf(intent))

        }

        /* ultilizei o log  para visualizar  em etapas o ciclo de vida da activity
        *  atravez do Logcat durante o debug  do programa
        * abaixo criei funçoes com  onCreate onStart onResume onPause e onDestroy
        * documentaçao nesse link : https://developer.android.com/guide/components/activities/activity-lifecycle?hl=pt-br  */

        Log.i("Ciclo de vida da activity  ", "on create")

    }



    override fun onStart() {
        super.onStart()
        Log.i("ciclo de vida ", "onStart")
    }


    override fun onResume() {
        super.onResume()
        Log.i("ciclo de vida ", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo de vida ", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo de vida ", "onstop ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo de vida ", "onDestroy")
    }
}