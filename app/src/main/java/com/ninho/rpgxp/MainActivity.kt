package com.ninho.rpgxp

import android.app.Activity
import android.os.Bundle

class MainActivity : Activity() {

    init {
        System.loadLibrary("native-lib")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
