package com.example.navigatorandroid.drawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigatorandroid.R

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val args : com.example.navigatorandroid.drawer.SecondFragmentArgs by navArgs();
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        view.findViewById<TextView>(R.id.txtsecond).setOnClickListener {


            val actiion =
                com.example.navigatorandroid.drawer.SecondFragmentDirections.navigatetofirstfragment();
            Navigation.findNavController(view).navigate(actiion)
        }
        view.findViewById<TextView>(R.id.txtsecond).text = args.number.toString()
        return  view;
    }

}