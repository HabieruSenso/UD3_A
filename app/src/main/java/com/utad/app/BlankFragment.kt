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
import kotlin.math.log

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btLogin).setOnClickListener {
            var mail:String=view.findViewById<EditText>(R.id.etEnterMail).text.toString()

            var tuPassword:String=view.findViewById<EditText>(R.id.etTuContrasena).text.toString()





            if(mail.isNullOrEmpty() || tuPassword.isNullOrEmpty()){
                view.findViewById<TextView>(R.id.tvMensajeAlerta).text= "La contraseña o mail estan vacios"

            } else {
              //  var userPasar=User(mail,"","","","")

                var action = BlankFragmentDirections.actionBlankFragmentToSecondHomeFragment()//userpasariba dentro
                findNavController().navigate(action)
            }


        }

        view.findViewById<Button>(R.id.btRegister).setOnClickListener {
            val action = BlankFragmentDirections.actionBlankFragmentToRegisterFragment("Charles")
            findNavController().navigate(action)
        }


    }
}