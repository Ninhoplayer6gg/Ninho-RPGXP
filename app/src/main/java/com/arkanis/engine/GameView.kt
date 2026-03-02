package com.arkanis.engine

import android.content.Context
import android.view.View
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

class GameView(context: Context) : View(context) {

    private val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawColor(Color.BLACK)

        paint.color = Color.WHITE
        paint.textSize = 60f

        canvas.drawText("Arkanis Engine", 100f, 200f, paint)
    }
}
