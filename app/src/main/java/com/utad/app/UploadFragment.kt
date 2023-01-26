package com.utad.app

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UploadFragment : Fragment() {

    var demoNamesLogoUpload = listOf(
        "Aves","Lobos","Gatos","Perros"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upload, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val mAdapter = UploadMainAdapter(demoNamesLogoUpload)

        val mAdapter = UploadMainAdapter(demoNamesLogoUpload)

        val mainRecyclerView = view.findViewById<RecyclerView>(R.id.mainRecyclerViewUpload)
        // mainRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        mainRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        mainRecyclerView.adapter = mAdapter


    }


}