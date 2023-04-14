package com.example.labo04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var phoneEditText: EditText
    private lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main

        nameEditText = findViewById(R.id.nameEditText)
        emailEditText = findViewById(R.id.emailEditText)
        phoneEditText = findViewById(R.id.phoneEditText)
        sendButton = findViewById(R.id.sendButton)

        // Agregar validaciones
        sendButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val phone = phoneEditText.text.toString()

            if (name.isBlank()) {
                nameEditText.error = "Debe ingresar un nombre válido"
                return@setOnClickListener
            }

            if (email.isBlank() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                emailEditText.error = "Debe ingresar un correo electrónico válido"
                return@setOnClickListener
            }

            if (phone.isBlank() || !Patterns.PHONE.matcher(phone).matches()) {
                phoneEditText.error = "Debe ingresar un número de teléfono válido"
                return@setOnClickListener
            }

            // Si los campos son válidos, enviar datos a la siguiente actividad
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("phone", phone)
            startActivity(intent)
        }
    }
}