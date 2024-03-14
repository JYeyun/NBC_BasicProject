package com.example.kiosk

class Drinks (name : String, price : String, explain : String) : AbstractMenu(name, price, explain){
    override fun displaymenu(){
        println("%-17s | %4s | %s".format(name, price, explain))
    }
}