package com.jorgearceruiz97.`2dam-u2-pr-ctica-2-ra1-ra2-carta-m-s-alta-jorgitorr`


class Baraja {
    companion object {
        var cartas = ArrayList<Carta>()
        fun crearBaraja(){
            var palos = Palos.values()
            var naipes = Naipes.values()

            for(palo in palos){
                for(naipe in naipes){
                    cartas.add(Carta(naipe,palo, naipe.valorMin, naipe.valorMax, naipe.valorMin))
                }
            }
        }

        fun barajar(){
            cartas.shuffle()
        }

        fun dameCarta():Carta{
            var carta = cartas[cartas.size-1]
            cartas.remove(carta)
            return carta
        }

    }
}