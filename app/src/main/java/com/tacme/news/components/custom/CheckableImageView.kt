package com.tacme.news.components.custom

import android.R
import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import android.widget.Checkable
import com.tacme.news.components.custom.CheckableImageView

class CheckableImageView(context: Context?, attrs: AttributeSet?) :
    AppCompatImageView(context!!, attrs), Checkable {
    private var mChecked = false
    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (isChecked) {
            mergeDrawableStates(drawableState, CHECKED_STATE_SET)
        }
        return drawableState
    }

    fun toggle(animate: Boolean) {
        toggle()
        if (mChecked && animate) {
//            YoYo.with(Techniques.Pulse).duration(Constants.ANIM_DURATION_PULSE).playOn(this);
        }
    }

    override fun toggle() {
        isChecked = !mChecked
    }

    override fun isChecked(): Boolean {
        return mChecked
    }

    override fun setChecked(checked: Boolean) {
        if (mChecked == checked) {
            return
        }
        mChecked = checked
        refreshDrawableState()
    }

    companion object {
        private val CHECKED_STATE_SET = intArrayOf(R.attr.state_checked)
    }
}