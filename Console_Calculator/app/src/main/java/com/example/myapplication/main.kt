package com.example.myapplication
import java.lang.NumberFormatException

fun main(){
    var num1 = 0.0
    var num2 = 0.0
    var operator = ""
    var op = arrayOf("+", "-", "*", "/", "%")

    while(num2 != -1.0) {
        println("=========================================")
        try {
            print("첫번째 수 : ")
            num1 = readLine()!!.toDouble()
            if(num1 == -1.0) break

            print("연산자 : ")
            operator = readLine()!!
            if (!op.contains(operator)) { //연산자가 아닐 시 다시 입력받음
                println("!!지정된 연산자를 입력해주세요!!")
                continue
            }

            print("두번째 수 : ")
            num2 = readLine()!!.toDouble()

        } catch (e: NumberFormatException) { //숫자를 입력받지 않은 경우 예외처리
            println("!!숫자를 입력해주세요!!")
            continue
        }

        when (operator) { // 연산자에 따른 클래스 호출
            "+" -> Calculator(AddOperation()).calculate(num1, num2)
            "-" -> Calculator(SubstractOperation()).calculate(num1, num2)
            "*" -> Calculator(MultiplyOperation()).calculate(num1, num2)
            "/" -> Calculator(DivideOperation()).calculate(num1, num2)
            "%" -> Calculator(RemainOperation()).calculate(num1, num2)
        }
    }
}



