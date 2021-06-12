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