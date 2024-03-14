package com.example.kiosk

fun menulist(a : Int):ArrayList<AbstractMenu>{
    val burgermenu = arrayListOf<AbstractMenu>(
        Burger("1. Hamburger", "W 5.5", "가장 기본적인 버거"),
        Burger("2. CheeseBurger", "W 6.5", "치즈가 들어간 버거"),
        Burger("3. ShrimpBurger", "W 7.0", "새우 패티가 들어간 버거"))
    val drinksmenu = arrayListOf<AbstractMenu>(
        Drinks("1. Coke", "W 1.5", "코카콜라"),
        Drinks("2. Ice Americano", "W 4.0", "산미 있는 원두로 만든 아메리카노"),
        Drinks("3. Milk Shake", "W 5.5", "달달한 밀크쉐이크")
    )
    val beermenu = arrayListOf<AbstractMenu>(
        Beer("1. 300ml ", "W 3.9", "삿포로 생맥주 300ml"),
        Beer("2. 500ml ", "W 5.5", "삿포로 생맥주 500ml"),
        Beer("3. 병맥주", "W 5.0", "테라, 카스, 켈리 선택 가능")
    )
    when(a){
        1 -> return burgermenu
        2 -> return drinksmenu
        else -> return beermenu
    }
}