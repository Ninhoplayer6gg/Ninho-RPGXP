package com.arkanis.engine

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "Arkanis Engine Iniciada 🚀"
        textView.textSize = 24f

        setContentView(textView)
    }
}
