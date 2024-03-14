package com.example.kiosk

class Beer(name : String, price : Int, explain : String) : AbstractMenu(name, price, explain){
    override fun displaymenu(){
        println("%-17s | %6d | %s".format(name, price, explain))
    }
}