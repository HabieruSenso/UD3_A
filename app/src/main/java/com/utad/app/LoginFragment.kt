package com.utad.app

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class LoginFragment : Fragment() {

    val args: LoginFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var email: String = args.user.email;
        var name: String = args.user.name;
        var surname: String = args.user.surname;
        var date: String = args.user.date;

        view.findViewById<TextView>(R.id.miEmail).text = email
        view.findViewById<TextView>(R.id.miNombre).text = name
        view.findViewById<TextView>(R.id.miApellido).text = surname

        view.findViewById<TextView>(R.id.miFechaNacimiento).text = date

        Log.i("pepa", args.user.toString())

        Log.i("pepa", email)

        view.findViewById<Button>(R.id.accessTo).setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToBlankFragment()
            findNavController().navigate(action)
        }


    }
}