package com.example.jogardados

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.jogardados.databinding.FragmentCadastroBinding
import com.example.jogardados.databinding.FragmentDadoBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton


class DadoFragment : Fragment() {
    var binding : FragmentDadoBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding= FragmentDadoBinding.inflate(inflater,container,false)
        val dado1 =binding?.imgDado1
        val dado2 = binding?.imgDado2
        val bt6 = binding?.btn6
        val zap = binding?.floatWhats
        val text = binding?.txtBoas
        //val jogador = "jogador1"

        val msg = "${resources.getString(R.string.bemvindo)}"

        text?.text = arguments?.getString("jogador1", msg )


        val imagens = listOf(
            R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3, R.drawable.dice_4,
            R.drawable.dice_5, R.drawable.dice_6
        )

        bt6?.setOnClickListener {

            dado1?.setImageResource(imagens.random())
            dado2?.setImageResource(imagens.random())


        }
        zap?.setOnClickListener {

            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"Voce e sortudo ")
            intent.setPackage("com.whatsapp")
            intent.type="text/plain"
            activity?.packageManager?.run {
                if (intent.resolveActivity(this) != null){
                    startActivity(intent)
                }else{
                    Toast.makeText(context,"Você não tem o whatsapp intalado", Toast.LENGTH_LONG).show()
                }
            }

        }


        // Inflate the layout for this fragment
        return binding?.root
    }


}