package com.example.objectorientedprogramminghomeworks

class NumberOfLetters {

    fun numberOfLetters(word:String,letter:Char){

        var result = 0

        for(w in word){
            if(w == letter){
                result++
            }
        }

        println("Number Of Letters : $result")

    }
}