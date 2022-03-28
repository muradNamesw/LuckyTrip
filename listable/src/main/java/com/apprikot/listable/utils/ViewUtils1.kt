package com.apprikot.listable.utils

import android.animation.ArgbEvaluator
//import com.apprikot.listable.interfaces.Searchable.searchKey
//import com.apprikot.listable.interfaces.Searchable.searchKeys
//import com.apprikot.listable.components.ModelUtils.getNoDuplicated
//import com.apprikot.listable.components.LoadingMore.loadMore
//import com.apprikot.listable.components.LoadingMore.setReleasable
//import com.apprikot.listable.interfaces.Listable.listItemTypeAll
import com.apprikot.listable.listeners.OnItemClickListener.OnItemClickCallback
import com.apprikot.listable.interfaces.Listable
import android.os.Parcelable
import android.os.Parcel
import com.apprikot.listable.model.HolderClass
import android.graphics.Typeface
import com.apprikot.listable.utils.HashUtils
//import kotlin.Throws
import android.widget.EditText
import android.app.Activity
import android.widget.TextView
import android.animation.ValueAnimator
import android.animation.ValueAnimator.AnimatorUpdateListener
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.util.DisplayMetrics
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import android.view.animation.Animation
import com.apprikot.listable.R
import com.apprikot.listable.views.GeneralListAdapter
import com.apprikot.listable.components.ModelUtils
import com.apprikot.listable.views.SearchItem
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import android.widget.TextView.OnEditorActionListener
import android.view.inputmethod.EditorInfo
import android.text.TextWatcher
import android.text.Editable
import com.apprikot.listable.interfaces.Releasable
import com.apprikot.listable.components.LoadingMore
import com.apprikot.listable.components.UnderHeaderVo
import com.apprikot.listable.listeners.TextEnteredListener
import com.apprikot.listable.views.RecyclerArrayAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AnimationUtils
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView

object ViewUtils {
    fun hideKeyboard(vararg editTexts: EditText?) {
        for (editText in editTexts) {
            if (editText == null) {
                continue
            }
            editText.clearFocus()
            val imm =
                editText.context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(editText.windowToken, 0)
        }
    }

    fun showKeyboard(editText: EditText?) {
        if (editText == null) {
            return
        }
        editText.requestFocus()
        val imm =
            editText.context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInputFromWindow(
            editText.applicationWindowToken,
            InputMethodManager.SHOW_FORCED,
            0
        )
    }

    fun setConditioned(textView: TextView, text: String?, isValid: Boolean) {
        if (isValid) {
            textView.visibility = View.VISIBLE
            textView.text = text
        } else {
            textView.visibility = View.GONE
        }
    }

    fun setWithDefault(textView: TextView, text: String?, defaultText: String?) {
        val isValid = text != null && !text.trim { it <= ' ' }.isEmpty()
        textView.text = if (isValid) text else defaultText
    }

    fun animateBackgroundColor(v: View, colorFrom: Int, colorTo: Int) {
        val colorAnimation = ValueAnimator.ofObject(ArgbEvaluator(), colorFrom, colorTo)
        colorAnimation.duration = 250
        colorAnimation.addUpdateListener { animator -> v.setBackgroundColor(animator.animatedValue as Int) }
        colorAnimation.start()
    }

    fun createDrawableFromView(context: Context, view: View): Bitmap {
        val displayMetrics = DisplayMetrics()
        (context as Activity).windowManager.defaultDisplay
            .getMetrics(displayMetrics)
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels)
        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels)
        // TODO: com.tacme.pass.view.buildDrawingCache();
        val bitmap = Bitmap.createBitmap(
            view.measuredWidth,
            view.measuredHeight, Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)
        view.draw(canvas)
        return bitmap
    }

    fun loadLogo(imageView: ImageView, url: String?, stubResId: Int) {
        Glide.with(imageView.context)
            .load(url)
            .apply(RequestOptions.placeholderOf(stubResId).error(stubResId))
            .into(imageView)
    }

    fun pulse(v: View) {
        val pulse = AnimationUtils.loadAnimation(v.context, R.anim.pulse)
        v.clearAnimation()
        v.startAnimation(pulse)
    }

    fun pulseMini(v: View) {
        val pulse = AnimationUtils.loadAnimation(v.context, R.anim.pulse_mini)
        v.clearAnimation()
        v.startAnimation(pulse)
    }
}