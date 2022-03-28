package com.tacme.news.components.custom

import android.content.Context
import com.tacme.news.view.utils.FontUtils.getFont
import androidx.appcompat.widget.AppCompatTextView
import android.widget.Checkable
import android.content.res.TypedArray
import com.tacme.news.R
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import com.tacme.news.components.custom.CustomTextView
import com.tacme.news.view.utils.FontUtils

class CustomTextView : AppCompatTextView, Checkable {
    private var mChecked = false
    private var background: Drawable? = null

    constructor(context: Context?) : super(context) {
        init(null)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init(attrs)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(attrs)
    }

    protected fun init(attrs: AttributeSet?) {
        var ordinal = 1
        var checked = false
        if (attrs != null) {
            val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomTabLayout)
            ordinal = typedArray.getInt(R.styleable.CustomTabLayout_customFont, 0)
            checked = typedArray.getBoolean(R.styleable.CustomTabLayout_tabChecked, false)
            typedArray.recycle()
        }
        mChecked = checked
        val typeface = getFont(context, FontUtils.CustomFont.values()[ordinal])
        setTypeface(typeface)
        background = getBackground()
    }

    override fun setError(error: CharSequence) {
        super.setError(error)
        if (error == null) {
            if (background != null) {
                setBackground(background)
            }
        } else {
//            setBackgroundResource(R.drawable.border_red);
        }
    }

    fun setFont(font: FontUtils.CustomFont?) {
        typeface = getFont(context, font!!)
    }

    public override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (isChecked) {
            mergeDrawableStates(drawableState, CHECKED_STATE_SET)
        }
        return drawableState
    }

    override fun setChecked(checked: Boolean) {
        if (mChecked == checked) {
            return
        }
        mChecked = checked
        //        setEnabled(checked);
        refreshDrawableState()
    }

    override fun isChecked(): Boolean {
        return mChecked
    }

    override fun toggle() {
        isChecked = !mChecked
    }

    fun toggle(animate: Boolean) {
        toggle()
        if (mChecked && animate) {
//            YoYo.with(Techniques.Pulse).duration(Constants.ANIM_DURATION_PULSE).playOn(this);
        }
    }

    companion object {
        private val CHECKED_STATE_SET = intArrayOf(android.R.attr.state_checked)
    }
}