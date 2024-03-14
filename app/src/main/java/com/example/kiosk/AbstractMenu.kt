package com.example.kiosk

abstract class AbstractMenu(val name : String, val price : String, val explain : String) {
    abstract fun displaymenu()
}