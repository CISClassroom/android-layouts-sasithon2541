package com.cislab.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Instant

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            val i =Intent(this,LinearActivity::class.java)
            startActivity(i)
        }

        button2.setOnClickListener(){
            val i =Intent(this,RelativeActivity::class.java)
            startActivity(i)
        }

        button4.setOnClickListener(){
            val i =Intent(this,ConstrantActivity::class.java)
            startActivity(i)
        }
    }
}
