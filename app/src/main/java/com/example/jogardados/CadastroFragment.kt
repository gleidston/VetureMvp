package com.example.jogardados


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController

import com.example.jogardados.databinding.FragmentCadastroBinding


class CadastroFragment : Fragment() {

    var binding :FragmentCadastroBinding? = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding= FragmentCadastroBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        val jogador1 = binding?.txtJogador
        val btnCadastro = binding?.buttonCadastro

        btnCadastro?.setOnClickListener {
            val jogador1 =jogador1?.text.toString()
            findNavController().navigate(R.id.action_cadastroFragment_to_dadoFragment, bundleOf("nomeJogador" to jogador1))
        }
        return  binding?.root
    }


}