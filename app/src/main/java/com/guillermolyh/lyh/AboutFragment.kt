package com.guillermolyh.lyh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.guillermolyh.lyh.databinding.FragmentAboutBinding
import com.guillermolyh.lyh.databinding.FragmentHomeBinding

class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentAboutBinding>(
            inflater, R.layout.fragment_about,
            container, false
        )


        //Binding en sobre nosotros
        binding.imageView14.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_aboutFragment_to_historiaFragment)

        }
        binding.textView7.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_aboutFragment_to_historiaFragment)

        }

        //Binding en socios
        binding.imageView15.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_aboutFragment_to_usFragment)

        }
        binding.textView11.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_aboutFragment_to_usFragment)
        }

        //Binding en clientes
        binding.imageView13.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_aboutFragment_to_clientesFragment)

        }
        binding.textView15.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_aboutFragment_to_clientesFragment)

        }

        return binding.root


    }

}