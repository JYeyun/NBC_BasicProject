package com.example.myapplication

class RemainOperation : AbstractOperation() {
    override fun calculate(num1: Double, num2: Double): Double {
        var result = num1 % num2
        println("${num1} / ${num2} 의 나머지는 ${result}")

        return result
    }
}