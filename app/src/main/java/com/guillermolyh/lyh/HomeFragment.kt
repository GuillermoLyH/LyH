package com.guillermolyh.lyh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.guillermolyh.lyh.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater, R.layout.fragment_home,
            container, false
        )

        //Fragmento aduana
        binding.imageView7.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_aduanaFragment)

        }
        //Fragmento capacitaciones
        binding.imageView4.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_capacitacionesFragment)

        }

        //Fragmento compras
        binding.imageView8.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_comprasFragment)

        }


        //Fragmento consultorias
        binding.imageView9.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_consultoriaFragment)

        }

        //Fragmento asesorias
        binding.imageView11.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_asesoriaFragment)

        }
        //Fragmento judicial
        binding.imageView10.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_judicialFragment)

        }

        return binding.root

        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.home_bar)
    }

}
