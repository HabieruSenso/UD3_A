package com.utad.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the
class HomeFragment : Fragment() {
    var demoNames = listOf(
        "Cony"," Rilakuma", "Melvin", "Mirella","Brook",
        "Eva","Glennie",  "Alverta", "Floria", "Marianela"
    )
    var demoNamesLogo = listOf(
        "Aves","Lobos","Gatos","Perros"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = HomeMainAdapter(demoNames)
        val mAdapterLogo = HomeMainAdapterLogo(demoNamesLogo)

        val mainRecyclerView = view.findViewById<RecyclerView>(R.id.mainRecyclerView)
       // mainRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        mainRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        mainRecyclerView.adapter = mAdapter

        val mainRecyclerViewLogo = view.findViewById<RecyclerView>(R.id.mainRecyclerViewGenres)
        // mainRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        mainRecyclerViewLogo.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        mainRecyclerViewLogo.adapter = mAdapterLogo

    }

}