package com.tacme.news.components.custom

import android.content.Context
import android.widget.FrameLayout
import android.content.res.TypedArray
import android.util.AttributeSet
import android.util.Log
import com.tacme.news.R
import android.view.View.MeasureSpec
import com.tacme.news.components.custom.AspectRatioFrameLayout

/**
 * Created by Eng Murad Ibraheim on 8/11/18.
 */
class AspectRatioFrameLayout : FrameLayout {
    private var mAspectRatio // width/height ratio
            = 0f

    constructor(context: Context?) : super(context) {}
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initAttributes(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        initAttributes(context, attrs)
    }

    private fun initAttributes(context: Context, attrs: AttributeSet) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.AspectRatioFrameLayout)
        mAspectRatio = typedArray.getFloat(R.styleable.AspectRatioFrameLayout_aspectRatio, 1.0f)
        typedArray.recycle()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        var widthMeasureSpec = widthMeasureSpec
        var heightMeasureSpec = heightMeasureSpec
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)
        if (DEBUG) Log.d(TAG, "widthMode:$widthMode, heightMode:$heightMode")
        if (DEBUG) Log.d(TAG, "widthSize:$widthSize, heightSize:$heightSize")
        if (widthMode == MeasureSpec.EXACTLY && heightMode == MeasureSpec.EXACTLY) {
            // do nothing
        } else if (widthMode == MeasureSpec.EXACTLY) {
            heightMeasureSpec =
                MeasureSpec.makeMeasureSpec((widthSize / mAspectRatio).toInt(), MeasureSpec.EXACTLY)
        } else if (heightMode == MeasureSpec.EXACTLY) {
            widthMeasureSpec = MeasureSpec.makeMeasureSpec(
                (heightSize * mAspectRatio).toInt(),
                MeasureSpec.EXACTLY
            )
        } else {
            // do nothing
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    companion object {
        private const val TAG = "AspectRatioFrameLayout"
        private const val DEBUG = false
    }
}