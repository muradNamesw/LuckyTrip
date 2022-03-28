package com.tacme.news.components.custom

import android.R
import android.content.Context
import android.util.AttributeSet
import android.widget.Checkable
import com.google.android.material.textfield.TextInputLayout
import com.tacme.news.components.custom.CustomTextInputLayout

/**
 * Created by Murad Adnan on 2019-07-16.
 */
class CustomTextInputLayout : TextInputLayout, Checkable {
    private var mChecked = false

    constructor(context: Context?) : super(context!!) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(
        context!!, attrs
    ) {
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context!!, attrs, defStyleAttr
    ) {
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
        private val CHECKED_STATE_SET = intArrayOf(R.attr.state_checked)
    }
}