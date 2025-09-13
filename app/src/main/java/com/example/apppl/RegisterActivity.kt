package com.example.apppl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Aquí obtienes las referencias a los elementos de tu layout de registro
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val lastNameEditText = findViewById<EditText>(R.id.lastNameEditText)
        val emailRegisterEditText = findViewById<EditText>(R.id.emailRegisterEditText)
        val passwordRegisterEditText = findViewById<EditText>(R.id.passwordRegisterEditText)
        val confirmPasswordEditText = findViewById<EditText>(R.id.confirmPasswordEditText)
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val registerButton = findViewById<Button>(R.id.registerButton)
        val loginTextView = findViewById<TextView>(R.id.loginTextView)

        registerButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailRegisterEditText.text.toString()
            val password = passwordRegisterEditText.text.toString()
            val confirmPassword = confirmPasswordEditText.text.toString()

            if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()) {
                if (password == confirmPassword) {
                    Toast.makeText(this, "¡Registro exitoso!", Toast.LENGTH_SHORT).show()
                    // Aquí podrías guardar el usuario en una base de datos
                    // y regresar a la pantalla de login
                    // finish()
                } else {
                    Toast.makeText(this, "Las contraseñas no coinciden.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Por favor complete todos los campos.", Toast.LENGTH_SHORT).show()
            }
        }

        loginTextView.setOnClickListener {
            finish() // Esto regresa a la actividad anterior (LoginActivity)
        }
    }
}