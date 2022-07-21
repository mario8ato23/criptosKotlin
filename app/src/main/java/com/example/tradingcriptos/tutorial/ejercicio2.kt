package com.example.tradingcriptos.tutorial

// Interface estudiante
// metodos estudiar reprobar reciben string
// crear clase mario que implemente las interfaces -> recibir una lista de materias

interface IEstudiante {
    fun estudiar(arg: String)

    fun reprobar(arg: String)
}

class MarioEstudiante(val materias: List<String>):IEstudiante {

    override fun estudiar(arg: String) {
        println("Estudiar ${arg}")
    }

    override fun reprobar(arg: String) {
        println("ya reprobaste :( ${arg}")
    }
}
