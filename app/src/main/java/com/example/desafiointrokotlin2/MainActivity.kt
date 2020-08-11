package com.example.desafiointrokotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cantidadlibros: Int = 4

        var librosEscolares1 = LibrosEscolares ("abacada", 12414, 1950, "cccc", 500, 20.5, "nadie", 'D')


        Log.wtf("algo", librosEscolares1.precioFormateado())



    }


}