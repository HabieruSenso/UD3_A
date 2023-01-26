package com.utad.app

import java.io.Serializable

data class User(val email: String, val name: String, val surname: String, val date: String, val password: String) : Serializable