package com.example.myapplication

class Calculator (private val operator: AbstractOperation){
    fun calculate(num1: Double, num2: Double): Double{ return operator.calculate(num1, num2) }
}