package com.beaton.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_click()
    }
    private fun button_click(){
        btn.setOnClickListener{
            pb1.visibility = View.VISIBLE
            pb2.visibility = View.VISIBLE
        }
    }
}