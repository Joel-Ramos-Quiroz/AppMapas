package com.example.appmapas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variables()
    }
/*
Nuestra Variable
 */
private fun variables(){
    var myVariable="Hola Mundo"
    println(myVariable)
}
}