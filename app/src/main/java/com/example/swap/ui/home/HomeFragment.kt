package com.example.swap.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.swap.R
import com.example.swap.Search
import com.example.swap.Swap

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(this, Observer {
            textView.text = it
        })


        val btnSearch = root.findViewById<Button>(R.id.searchbtn)
        val btnSwap= root.findViewById<Button>(R.id.swapbtn)
        val btnExit= root.findViewById<Button>(R.id.exitbtn)

        btnSearch.setOnClickListener(View.OnClickListener {
            val search = Intent(this.context,Search::class.java)
            startActivity(search)
        })

        btnSwap.setOnClickListener(View.OnClickListener {
            val swap = Intent(this.context, Swap::class.java)
            startActivity(swap)
        })

        btnExit.setOnClickListener(View.OnClickListener {
            requireActivity().finish()
        })

        return root
    }
}