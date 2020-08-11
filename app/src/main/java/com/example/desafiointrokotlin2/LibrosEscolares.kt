package com.example.desafiointrokotlin2

import android.util.Log

data class LibrosEscolares (val nombrelibros: String,
                            val isbn: Long,
                            val añopublicacion: Short,
                            val editorial: String,
                            val cantidadpáginas: Int,
                            val precio: Double,
                            val autor: String,
                            val tipodelibro: Char) {


    fun precioFormateado(): String {
        return "\$${this.precio}"
    }
    fun imprimir(): String {
        return "$nombrelibros - $isbn - $añopublicacion - $editorial - $cantidadpáginas -${precioFormateado()} - $autor - $tipodelibro"
    }
}


