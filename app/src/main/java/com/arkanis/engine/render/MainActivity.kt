package com.arkanis.engine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arkanis.engine.render.GameView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(GameView(this))
    }
}
