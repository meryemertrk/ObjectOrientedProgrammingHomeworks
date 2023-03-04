package com.example.objectorientedprogramminghomeworks

class FactorialCalculus {

    fun factorial(num:Int) :Int{
        var sonuc = 1

        for(i in 1..num){
            sonuc = sonuc * i
        }
        return sonuc
    }
}