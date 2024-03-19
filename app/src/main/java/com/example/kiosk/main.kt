package com.example.kiosk

fun main(){
    displayinfo() // 시작 메뉴 출력
}

fun displayinfo(){
    println("[ SHAKESHAKE MENU ]")
    println("1. Bugers   | 앵거스 비프 통살을 다져만든 버거")
    println("2. Drinks   | 매장에서 직접 만드는 음료")
    println("3. Beer     | 뉴욕 브루클린 브루어리에서 양조한 맥주")
    println("0. 종료")
    try { //메뉴 입력받기
        val inputMenu = readLine()?.toInt()
        when(inputMenu){
            0 -> println("선택을 종료합니다.")
            1, 2, 3 -> displaymenu(inputMenu) // 선택한 메뉴로 페이지 넘기기
            else -> {
                println("메뉴를 선택해주세요.")
                displayinfo()
            }
        }
    } catch(e:NumberFormatException){ //입력받은 값이 Int가 아니면 출력
        println("잘못된 값을 입력하셨습니다.")
        displayinfo()
    }
}
fun displaymenu(inputMenu : Int){
    val menu = menulist(inputMenu)

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
            else -> println("%s의 값은 %d원입니다.".format(menu[input-1].name, menu[input-1].price))
        }
    }catch (e:NumberFormatException){//입력된 값이 Int가 아니면 출력
        println("잘못된 값을 입력하셨습니다.")
        displayinfo()
    }
}