package com.example.kiosk

fun displaymenu(a : Int){
    var menu = menulist(a)

    for(i in 0 until menu.size){
        menu[i].displaymenu()
    }
    println("0. 종료")

    try{
        var input = readLine()!!.toInt()
        if(input == 0) displayinfo()
        else println("%s의 값은 %s원입니다.".format(menu[input-1].name, menu[input-1].price))

    }catch (e:NumberFormatException){
        println("잘못된 값을 입력하셨습니다.")
        displayinfo()
    }
}