package com.guillermolyh.lyh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        setup()
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    fun setup() {
        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.contact_bar)
    }
}