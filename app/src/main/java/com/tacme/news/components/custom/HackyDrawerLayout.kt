package com.tacme.news.components.custom

import android.content.Context
import android.util.AttributeSet
import androidx.drawerlayout.widget.DrawerLayout
import android.view.MotionEvent
import java.lang.Exception

class HackyDrawerLayout : DrawerLayout {
    constructor(context: Context?) : super(context!!) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(
        context!!, attrs
    ) {
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(
        context!!, attrs, defStyle
    ) {
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        return try {
            super.onInterceptTouchEvent(ev)
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }
}