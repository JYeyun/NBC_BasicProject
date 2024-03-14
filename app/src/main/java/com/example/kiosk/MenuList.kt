package com.example.kiosk

fun menulist(a : Int):ArrayList<AbstractMenu>{
    val burgermenu = arrayListOf<AbstractMenu>(
        Burger("1. Hamburger", 5500, "가장 기본적인 버거"),
        Burger("2. CheeseBurger", 6500, "치즈가 들어간 버거"),
        Burger("3. ShrimpBurger", 7000, "새우 패티가 들어간 버거"))
    val drinksmenu = arrayListOf<AbstractMenu>(
        Drinks("1. Coke", 1500, "코카콜라"),
        Drinks("2. Ice Americano", 4000, "산미 있는 원두로 만든 아메리카노"),
        Drinks("3. Milk Shake", 5500, "달달한 밀크쉐이크")
    )
    val beermenu = arrayListOf<AbstractMenu>(
        Beer("1. 300ml ", 3900, "삿포로 생맥주 300ml"),
        Beer("2. 500ml ", 5500, "삿포로 생맥주 500ml"),
        Beer("3. 병맥주", 5000, "테라, 카스, 켈리 선택 가능")
    )
    when(a){
        1 -> return burgermenu
        2 -> return drinksmenu
        else -> return beermenu
    }
}