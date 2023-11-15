package com.jorgearceruiz97.`2dam-u2-pr-ctica-2-ra1-ra2-carta-m-s-alta-jorgitorr`


class Baraja {
    companion object {
        var cartas = ArrayList<Carta>()

        fun crearBaraja(){
            var valores = Palos.values()

            for(v in valores){
                println(v)
            }

            for (i in 0 until 10){

            }
        }

        fun barajar(){
            cartas.shuffle()
        }

        fun dameCarta(){

        }

    }
}