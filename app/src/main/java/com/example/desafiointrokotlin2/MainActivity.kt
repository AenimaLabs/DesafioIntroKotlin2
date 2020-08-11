package com.example.desafiointrokotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var librosEscolares1 = LibrosEscolares ("abacada", 12414, 1950, "cccc", 500, 20.5, "nadie", 'D')
        var librosEscolares2 = LibrosEscolares ("ab", 12414, 1950, "cd", 50, 19.5, "nadie", 'D')
        var librosEscolares3 = LibrosEscolares ("iada", 12414, 1950, "cccc", 500, 20.5, "nadie", 'D')
        var librosEscolares4 = LibrosEscolares ("bieriuira", 12414, 1950, "cccc", 500, 20.5, "nadie", 'D')

        Log.wtf("algo", librosEscolares1.precioFormateado())

        Log.wtf("algo", librosEscolares1.imprimir())
        Log.wtf("algo", librosEscolares2.imprimir())
        Log.wtf("algo", librosEscolares3.imprimir())
        Log.wtf("algo", librosEscolares4.imprimir())



    }


}