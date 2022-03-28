package com.tacme.news.components.custom

import android.content.Context
import android.graphics.Typeface
import android.content.res.TypedArray
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View
import com.tacme.news.R
import android.view.ViewGroup
import android.widget.TextView
import com.tacme.news.components.custom.CustomTextView
import android.widget.LinearLayout
import com.apprikot.listable.utils.FontUtils
import com.google.android.material.tabs.TabLayout
import com.tacme.news.view.utils.DimenUtils
import java.util.ArrayList

class CustomTabLayout : TabLayout {
    private var mTypeface: Typeface? = null

    constructor(context: Context?) : super(context!!) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(
        context!!, attrs
    ) {
        init(attrs)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context!!, attrs, defStyleAttr
    ) {
        init(attrs)
    }

    private fun init(attrs: AttributeSet?) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomTabLayout)
        val ordinal = typedArray.getInt(R.styleable.CustomTabLayout_customFont, 0)
        mTypeface = FontUtils.getFont(context, FontUtils.CustomFont.values()[ordinal])
        typedArray.recycle()
    }

    override fun addTab(tab: Tab) {
        super.addTab(tab)
        val mainView = getChildAt(0) as ViewGroup
        val tabView = mainView.getChildAt(tab.position) as ViewGroup
        for (i in 0 until tabView.childCount) {
            val tabViewChild = tabView.getChildAt(i)
            if (tabViewChild is TextView) {
                val textView = tabViewChild as CustomTextView
                textView.setTypeface(mTypeface, Typeface.NORMAL)
                val parentView = textView.parent as View
                parentView.setPadding(20, 0, 20, 0)
            }
        }
    }

    fun setWeights(vararg weights: Float?) {
        val slidingTabStrip = getChildAt(0) as ViewGroup
        if (weights.size != slidingTabStrip.childCount) {
            return
        }
        for (i in 0 until weights.size) {
            val tab1 = slidingTabStrip.getChildAt(i)
            val layoutParams = tab1.layoutParams as LinearLayout.LayoutParams
            layoutParams.weight = weights[i]!!
            tab1.layoutParams = layoutParams
        }
    }

    fun selectTab(index: Int) {
        val tab = getTabAt(index)
        tab?.select()
    }

    fun getTextWidth(sampleText: String): Float {
        val paint = Paint()
        val bounds = Rect()
        paint.typeface = mTypeface
        val textSize = resources.getDimension(R.dimen.font_medium)
        paint.textSize = textSize
        paint.getTextBounds(sampleText, 0, sampleText.length, bounds)
        return bounds.width() * 1.35f
    }

    fun adaptWeights(titles: List<String>) {
        val screenWidth = DimenUtils.getScreenSize(context).x
        val widths = getWidths(titles)
        var maxW = Float.MIN_VALUE
        for (w in widths) {
            if (maxW < w) {
                maxW = w
            }
        }
        var sum = 0f
        for (w in widths) {
            sum += w
        }
        if (sum > screenWidth || maxW > screenWidth / widths.size) {
            tabMode = MODE_SCROLLABLE
            setWeights(*getWeights(widths, sum))
        }
    }

    private fun getWeights(widths: List<Float>, sum: Float): Array<Float> {
        val weights: MutableList<Float> = ArrayList()
        for (w in widths) {
            weights.add(w / sum)
        }
        return weights.toTypedArray()
    }

    private fun getWidths(titles: List<String>): List<Float> {
        val widths: MutableList<Float> = ArrayList()
        for (title in titles) {
            widths.add(getTextWidth(title))
        }
        return widths
    }
}