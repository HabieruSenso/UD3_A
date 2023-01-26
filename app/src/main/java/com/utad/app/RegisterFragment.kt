package com.utad.app

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.view.get
import androidx.navigation.fragment.findNavController
import kotlin.time.Duration.Companion.days


class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<Button>(R.id.btLogin).setOnClickListener {
            var mail:String=view.findViewById<EditText>(R.id.etRegisterMail).text.toString()
            var name:String=view.findViewById<EditText>(R.id.etRegisterName).text.toString()
            var surname:String=view.findViewById<EditText>(R.id.etRegisterSurname).text.toString()

            var date:String=view.findViewById<DatePicker>(R.id.etRegisterDate).year.toString()

            if(mail.isNullOrEmpty() || name.isNullOrEmpty() || surname.isNullOrEmpty()){
                view.findViewById<TextView>(R.id.tvMensajeAlerta).text= "Faltan datos por rellenar"

            } else {

                var userPasar = User(mail, name, surname, date, "")

                var action =
                    RegisterFragmentDirections.actionRegisterFragmentToLoginFragment(userPasar)
                findNavController().navigate(action)
            }

        }
    }
}