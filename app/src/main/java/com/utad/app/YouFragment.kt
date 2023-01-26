package com.utad.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class YouFragment : Fragment() {

    var demoNameUser = listOf(
        "Usuario Generico"
    )

    var demoYouTransaction = listOf(
        "Purchases","Sales"
    )

    var demoYouAccount = listOf(
        "Settings"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_you, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = UploadMainAdapter(demoNameUser)
        val mAdapter2 = UploadMainAdapter(demoYouTransaction)
        val mAdapter3 = UploadMainAdapter(demoYouAccount)

        val mainRecyclerView = view.findViewById<RecyclerView>(R.id.youCardInfo)
        // mainRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        mainRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        mainRecyclerView.adapter = mAdapter

        val mainRecyclerView2 = view.findViewById<RecyclerView>(R.id.rvYouTransacction)
        // mainRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        mainRecyclerView2.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        mainRecyclerView2.adapter = mAdapter2

        val mainRecyclerView3 = view.findViewById<RecyclerView>(R.id.rvYouAccount)
        // mainRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        mainRecyclerView3.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        mainRecyclerView3.adapter = mAdapter3
    }
}