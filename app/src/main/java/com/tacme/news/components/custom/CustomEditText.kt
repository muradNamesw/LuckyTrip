package com.tacme.news.components.custom

import android.content.Context
import com.tacme.news.view.utils.FontUtils.getFont
import androidx.appcompat.widget.AppCompatEditText
import com.tacme.news.components.custom.CustomEditText.DrawableClickListener
import android.content.res.TypedArray
import android.graphics.Rect
import com.tacme.news.R
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.KeyEvent
import com.tacme.news.components.custom.CustomEditText.DrawableClickListener.DrawablePosition
import android.view.MotionEvent
import com.tacme.news.view.utils.FontUtils
//import kotlin.Throws

class CustomEditText : AppCompatEditText {
    private var drawableRight: Drawable? = null
    private var drawableLeft: Drawable? = null
    private var drawableTop: Drawable? = null
    private var drawableBottom: Drawable? = null
    var actionX = 0
    var actionY = 0
//    private var background: Drawable? = null
    override fun setCompoundDrawables(
        left: Drawable?,
        top: Drawable?,
        right: Drawable?,
        bottom: Drawable?
    ) {
        if (left != null) {
            drawableLeft = left
        }
        if (right != null) {
            drawableRight = right
        }
        if (top != null) {
            drawableTop = top
        }
        if (bottom != null) {
            drawableBottom = bottom
        }
        super.setCompoundDrawables(left, top, right, bottom)
    }

    override fun setCompoundDrawablesRelative(
        left: Drawable?,
        top: Drawable?,
        right: Drawable?,
        bottom: Drawable?
    ) {
        if (left != null) {
            drawableLeft = left
        }
        if (right != null) {
            drawableRight = right
        }
        if (top != null) {
            drawableTop = top
        }
        if (bottom != null) {
            drawableBottom = bottom
        }
        super.setCompoundDrawablesRelative(left, top, right, bottom)
    }

    private var clickListener: DrawableClickListener? = null

    constructor(context: Context?) : super(context!!) {
        init(null)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context!!, attrs) {
        init(attrs)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context!!,
        attrs,
        defStyleAttr
    ) {
        init(attrs)
    }

    private fun init(attrs: AttributeSet?) {
        var ordinal = 1
        if (attrs != null) {
            val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomTabLayout)
            ordinal = typedArray.getInt(R.styleable.CustomTabLayout_customFont, 0)
            typedArray.recycle()
        }
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

    override fun onKeyPreIme(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            clearFocus()
        }
        return super.onKeyPreIme(keyCode, event)
    }

    interface DrawableClickListener {
        enum class DrawablePosition {
            TOP, BOTTOM, LEFT, RIGHT
        }

        fun onClick(target: DrawablePosition?)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        var bounds: Rect?
        if (event.action == MotionEvent.ACTION_DOWN) {
            actionX = event.x.toInt()
            actionY = event.y.toInt()
            if (drawableBottom != null
                && drawableBottom!!.bounds.contains(actionX, actionY)
            ) {
                clickListener!!.onClick(DrawablePosition.BOTTOM)
                return super.onTouchEvent(event)
            }
            if (drawableTop != null
                && drawableTop!!.bounds.contains(actionX, actionY)
            ) {
                clickListener!!.onClick(DrawablePosition.TOP)
                return super.onTouchEvent(event)
            }

            // this works for left since container shares 0,0 origin with bounds
            if (drawableLeft != null) {
                bounds = null
                bounds = drawableLeft!!.bounds
                var x: Int
                var y: Int
                val extraTapArea = (13 * resources.displayMetrics.density + 0.5).toInt()
                x = actionX
                y = actionY
                if (!bounds.contains(actionX, actionY)) {
                    /** Gives the +20 area for tapping.  */
                    x = (actionX - extraTapArea)
                    y = (actionY - extraTapArea)
                    if (x <= 0) x = actionX
                    if (y <= 0) y = actionY
                    /** Creates square from the smallest value  */
                    if (x < y) {
                        y = x
                    }
                }
                if (bounds.contains(x, y) && clickListener != null) {
                    clickListener!!
                        .onClick(DrawablePosition.LEFT)
                    event.action = MotionEvent.ACTION_CANCEL
                    return false
                }
            }
            if (drawableRight != null) {
                bounds = null
                bounds = drawableRight!!.bounds
                var x: Int
                var y: Int
                val extraTapArea = 13
                /**
                 * IF USER CLICKS JUST OUT SIDE THE RECTANGLE OF THE DRAWABLE
                 * THAN ADD X AND SUBTRACT THE Y WITH SOME VALUE SO THAT AFTER
                 * CALCULATING X AND Y CO-ORDINATE LIES INTO THE DRAWBABLE
                 * BOUND. - this process help to increase the tappable area of
                 * the rectangle.
                 */
                x = (actionX + extraTapArea)
                y = (actionY - extraTapArea)
                /**Since this is right drawable subtract the value of x from the width
                 * of com.tacme.pass.view. so that width - tappedarea will result in x co-ordinate in drawable bound.
                 */
                x = width - x

                /*x can be negative if user taps at x co-ordinate just near the width.
                 * e.g views width = 300 and user taps 290. Then as per previous calculation
                 * 290 + 13 = 303. So subtract X from getWidth() will result in negative value.
                 * So to avoid this add the value previous added when x goes negative.
                 */if (x <= 0) {
                    x += extraTapArea
                }

                /* If result after calculating for extra tappable area is negative.
                 * assign the original value so that after subtracting
                 * extratapping area value doesn't go into negative value.
                 */if (y <= 0) y = actionY
                /**If drawble bounds contains the x and y points then move ahead. */
                if (bounds.contains(x, y) && clickListener != null) {
                    clickListener!!
                        .onClick(DrawablePosition.RIGHT)
                    event.action = MotionEvent.ACTION_CANCEL
                    return false
                }
                return super.onTouchEvent(event)
            }
        }
        return super.onTouchEvent(event)
    }

    @Throws(Throwable::class)
    protected fun finalize() {
        drawableRight = null
        drawableBottom = null
        drawableLeft = null
        drawableTop = null
//        super.finalize()
    }

    fun setDrawableClickListener(listener: DrawableClickListener?) {
        clickListener = listener
    }
}