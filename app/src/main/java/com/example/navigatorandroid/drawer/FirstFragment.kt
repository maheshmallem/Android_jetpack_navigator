package com.example.navigatorandroid.drawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.navigatorandroid.R


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        view.findViewById<TextView>(R.id.txtfirst).setOnClickListener {
          val actiion = com.example.navigatorandroid.drawer.FirstFragmentDirections.navigatetosecondfragment()
              .setNumber(20)
          Navigation.findNavController(view).navigate(actiion)
        }

        return  view;
    }


}