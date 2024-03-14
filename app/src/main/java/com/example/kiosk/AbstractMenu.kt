package com.example.kiosk

abstract class AbstractMenu(val name : String, val price : Int, val explain : String) {
    abstract fun displaymenu()
}