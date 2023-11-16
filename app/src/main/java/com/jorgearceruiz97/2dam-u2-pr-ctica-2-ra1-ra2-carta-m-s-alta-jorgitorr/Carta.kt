package com.jorgearceruiz97.`2dam-u2-pr-ctica-2-ra1-ra2-carta-m-s-alta-jorgitorr`


class Carta (nombre:Naipes, palo:Palos, puntosMax:Int, puntosMin: Int, idDrawable:Int){
    val nombre = nombre
    val palo = palo
    val puntosMax = puntosMax
    val puntosMin = puntosMin
    val idDrawable = idDrawable
    override fun toString(): String {
        return "${palo.toString().lowercase()}_${idDrawable}"
    }


}