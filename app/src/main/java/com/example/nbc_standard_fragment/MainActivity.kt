package com.example.nbc_standard_fragment

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.nbc_standard_fragment.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private val TAG_HOME_FRAGMENT = "home_fragment"
    private val TAG_DASH_FRAGMENT = "records_fragment"
    private val TAG_NOTIFY_FRAGMENT = "community_fragment"

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setFragment(TAG_HOME_FRAGMENT, HomeFragment())

        binding.bottomNavigation.setOnItemSelectedListener {   item ->
            when(item.itemId){
                R.id.home -> setFragment(TAG_HOME_FRAGMENT, HomeFragment())
                R.id.dashboard->setFragment(TAG_DASH_FRAGMENT, DashBoardFragment())
                R.id.notifications -> setFragment(TAG_NOTIFY_FRAGMENT, NotificationsFragment())
            }
            true
        }
    }
    private fun setFragment(tag:String, fragment:Fragment){
        val manager:FragmentManager = supportFragmentManager
        val ft:FragmentTransaction = manager.beginTransaction()

        if(manager.findFragmentByTag(tag)==null){
            ft.add(R.id.show_fragment, fragment, tag)
        }

        val home = manager.findFragmentByTag(TAG_HOME_FRAGMENT)
        val dash = manager.findFragmentByTag(TAG_DASH_FRAGMENT)
        val noti = manager.findFragmentByTag(TAG_NOTIFY_FRAGMENT)

        if(home != null) ft.hide(home)
        if(dash != null) ft.hide(dash)
        if(noti != null) ft.hide(noti)

        if(tag == TAG_HOME_FRAGMENT) {
            if(home != null) ft.show(home)
        }
        if(tag == TAG_DASH_FRAGMENT) {
            if(dash != null) ft.show(dash)
        }
        if(tag == TAG_NOTIFY_FRAGMENT) {
            if(noti != null) ft.show(noti)
        }
        ft.commit()
    }
}