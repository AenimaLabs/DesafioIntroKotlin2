package com.example.desafiointrokotlin2

data class LibrosEscolares (var nombrelibros: String,
                            var isbn: String,
                            var añopublicacion: Int,
                            var editorial: String,
                            var cantidadpáginas: Int,
                            var precio: Int,
                            var autor: String,
                            var librodigital: Boolean = true) {
}