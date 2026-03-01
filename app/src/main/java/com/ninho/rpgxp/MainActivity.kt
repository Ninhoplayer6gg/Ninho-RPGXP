package com.ninho.rpgxp

import android.opengl.GLSurfaceView
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var glView: GLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            glView = GLSurfaceView(this)
            glView.setEGLContextClientVersion(2)
            glView.setRenderer(SimpleRenderer())

            setContentView(glView)

        } catch (e: Exception) {
            val textView = TextView(this)
            textView.text = e.toString()
            setContentView(textView)
        }
    }

    override fun onPause() {
        super.onPause()
        glView.onPause()
    }

    override fun onResume() {
        super.onResume()
        glView.onResume()
    }
}
