package com.tacme.news.components.custom

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.View
import com.tacme.news.components.custom.GraphicsView

/**
 * Created by Eng Murad Ibraheim
 */
class GraphicsView(context: Context?) : View(context) {
    private val circle: Path
    private val cPaint: Paint
    private val tPaint: Paint
    override fun onDraw(canvas: Canvas) {
        canvas.drawTextOnPath(QUOTE, circle, 485f, 20f, tPaint)
    }

    companion object {
        private const val QUOTE = "This is a curved text"
    }

    init {

//        int color = Color.argb(127, 255, 0, 255);
        circle = Path()
        circle.addCircle(230f, 350f, 150f, Path.Direction.CW)
        cPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        cPaint.style = Paint.Style.STROKE
        cPaint.color = Color.LTGRAY
        cPaint.strokeWidth = 3f

//        setBackgroundResource(R.drawable.heart);
        tPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        tPaint.style = Paint.Style.FILL_AND_STROKE
        tPaint.color = Color.BLACK
        tPaint.textSize = 50f
    }
}