package com.example.objectorientedprogramminghomeworks

class SalaryAccount {

    fun salaryAccount(day:Int) :Int {

        val workingHour = day * 8
        println("Working Hour : $workingHour")

        var salary = 0

        if(workingHour > 160){
            val shift = workingHour - 160
            salary = 160 * 10 + shift * 20

        }
        else{
           salary = workingHour * 10
        }

        return salary


    }
}