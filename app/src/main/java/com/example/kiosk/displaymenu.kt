package com.example.kiosk

fun displaymenu(a : Int){
    val menu = menulist(a)

    for(i in 0 until menu.size){
        menu[i].displaymenu()
    }
    println("4. 뒤로 가기")
    println("0. 종료")

    try{
        val input = readln().toInt()
        when(input){
            4 -> displayinfo()
            0 -> println()
            else -> println("%s의 값은 %s입니다.".format(menu[input-1].name, menu[input-1].price))
        }
    }catch (e:NumberFormatException){//입력된 값이 Int가 아니면 출력
        println("잘못된 값을 입력하셨습니다.")
        displayinfo()
    }
}