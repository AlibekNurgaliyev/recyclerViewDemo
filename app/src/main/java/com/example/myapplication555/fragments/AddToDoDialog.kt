package com.example.myapplication555.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.DialogFragment
import com.example.myapplication555.R
import kotlinx.android.synthetic.main.fragment_add_to_do_dialog.*


class AddToDoDialog : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_to_do_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initSpinner()
    }

    private fun initSpinner(){
        activity?.let {
            val arraySpinner = arrayOf(
                it.getString(R.string.low),
                it.getString(R.string.medium),
                it.getString(R.string.high),
            )

            val adapter = ArrayAdapter(it.applicationContext, android.R.layout.simple_spinner_item, arraySpinner)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
            sr_priority.adapter = adapter
        }

    }
}