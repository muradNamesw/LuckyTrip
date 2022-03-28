package com.tacme.news.components.custom

import android.content.Context
import android.util.AttributeSet
import androidx.viewpager.widget.ViewPager
import android.view.MotionEvent

class StaticViewPager(context: Context?, attrs: AttributeSet?) : ViewPager(
    context!!, attrs
) {
     private var enabledStaticViewPager = false
    override fun onTouchEvent(event: MotionEvent): Boolean {
        return enabledStaticViewPager && super.onTouchEvent(event)
    }

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return enabledStaticViewPager && super.onInterceptTouchEvent(event)
    }

    fun setPagingenabledStaticViewPager(enabledStaticViewPager: Boolean) {
        this.enabledStaticViewPager = enabledStaticViewPager
    }
}