package com.example.myapplication

class SubstractOperation : AbstractOperation() {
    override fun calculate(num1: Double, num2: Double): Double {
        var result = num1 - num2
        println("${num1} - ${num2} = ${result}")

        return result
    }
}