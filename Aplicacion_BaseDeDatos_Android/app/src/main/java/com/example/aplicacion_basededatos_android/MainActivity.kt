package com.example.aplicacion_basededatos_android

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var guardar: EditText;
    private lateinit var guardarUsuario: GuardarUsuario;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        guardar = findViewById(R.id.guardarUsuario)
        guardar.setOnClickListener {
            val intent = Intent(this, guardarUsuario::class.java)
            startActivity(intent)

        }
    }



}