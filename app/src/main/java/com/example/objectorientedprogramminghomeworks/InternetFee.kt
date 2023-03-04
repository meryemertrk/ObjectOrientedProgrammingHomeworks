package com.example.objectorientedprogramminghomeworks

class InternetFee {

    fun internetFee(quota:Int) :Int {
       var fee = 0

        if(quota > 50){
            val overQuota = quota - 50
            fee = 100 + overQuota * 4

        }
        else{
            fee = 100

        }

        return fee

    }
}