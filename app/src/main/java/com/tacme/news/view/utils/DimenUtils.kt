package com.tacme.news.view.utils

import android.content.Context
import android.graphics.Point

object DimenUtils {
    fun pixelsToDp(context: Context, dimenId: Int): Int {
        val dimen = context.resources.getDimension(dimenId)
        return (dimen / context.resources.displayMetrics.density).toInt()
    }

    fun getScreenSize(context: Context): Point {
        val width = context.resources.displayMetrics.widthPixels
        val height = context.resources.displayMetrics.heightPixels
        return Point(width, height)
    }
}