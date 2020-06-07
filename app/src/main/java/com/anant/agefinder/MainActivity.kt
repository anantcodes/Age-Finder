package com.anant.agefinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnExit.setOnClickListener {
            finish()
        }
    }
    fun  BuClickEvent(view: View){
        val userDOB:String=etdate.text.toString()
        val year:Int= Calendar.getInstance().get(Calendar.YEAR)
        if (userDOB.toInt()==0||userDOB.toInt()>=year){
            txtShowAge.text=" invalid input"
            return
        }
        val myAge=year - userDOB.toInt()
        txtShowAge.text = "Your age is $myAge"
    }

}
