package com.example.aplicacion_basededatos_android

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText




class GuardarUsuario : AppCompatActivity() {

    private lateinit var dni: EditText;
    private lateinit var nombre: EditText;
    private lateinit var edad: EditText;
    private lateinit var profesion: EditText;
    private lateinit var salario: EditText;




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.guardar_usuario)

        dni = findViewById(R.id.Dni)
        nombre = findViewById(R.id.Nombre)
        edad = findViewById(R.id.Edad)
        profesion = findViewById(R.id.Profesion)
        salario = findViewById(R.id.Salario)
        fun clearFieldOnFocusChange(v: View, hasFocus: Boolean) {
            if (hasFocus) {
                (v as EditText).apply {
                    text.clear()
                    setTypeface(null, Typeface.NORMAL)
                    setTextColor(Color.BLACK)
                }
            }
        }

        val fields = listOf(dni, nombre, edad, profesion, salario)
        fields.forEach { it.setOnFocusChangeListener(::clearFieldOnFocusChange) }

    }
}