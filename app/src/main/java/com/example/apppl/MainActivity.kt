package com.example.apppl

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Puedo poner un layout simple para MainActivity, o no poner ninguno si solo redirige.
        // Si no quiero que tenga un layout visible, puedo comentar la línea de setContentView,
        // pero asegúro de que el tema de la aplicación maneje bien una actividad sin layout.
        // Por ahora, dejo un layout dummy o el de main_activity si es que ya existe y es distinto al de login.
        setContentView(R.layout.activity_main)

        // Aquí es donde lanzo la LoginActivity
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)

        // finish() // Opcional: Cierra MainActivity para que el usuario no pueda volver a ella.
        // Descomenta esta línea si no quieres que MainActivity sea accesible una vez lanzada LoginActivity.
    }
}