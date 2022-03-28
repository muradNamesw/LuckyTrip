package com.tacme.news.view.utils

import android.R
import android.widget.EditText
import android.app.Activity
import android.content.res.Resources
import com.tacme.news.components.custom.CustomTextView
import android.os.Parcelable
import android.os.Bundle
import android.util.TypedValue
import android.util.DisplayMetrics
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import java.lang.Exception

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

    fun setConditioned(textView: CustomTextView, text: String?, isValid: Boolean) {
        if (isValid) {
            textView.visibility = View.VISIBLE
            textView.text = text
        } else {
            textView.visibility = View.GONE
        }
    }

    fun setWithDefault(textView: CustomTextView, text: String?, defaultText: String?) {
        val isValid = text != null && !text.trim { it <= ' ' }.isEmpty()
        textView.text = if (isValid) text else defaultText
    }
    //    public static int getFullImageWidth(Context context, boolean hasMargins) {
    //        int screenWidth = DimenUtils.getScreenSize(context).x;
    //        int dimenRedId = hasMargins ? R.dimen.margin8 : R.dimen.margin4;
    //        int margins = (int) (context.getResources().getDimension(dimenRedId) * 2);
    //        return screenWidth - margins;
    //    }
    /***
     * New-Instance
     */
    const val EXTRA_PARCELABLE = "PARCELABLE"
    const val EXTRA_LONG = "INTEGER"
    const val EXTRA_LIST_PARCELABLE = "LIST_PARCELABLE"
    const val EXTRA_AD = "AD"
    @Deprecated("")
    fun newInstance(fragmentClass: Class<*>, parcelable: Parcelable?): Fragment {
        try {
            val fragment = fragmentClass.newInstance() as Fragment
            val data = Bundle()
            data.putParcelable(EXTRA_PARCELABLE, parcelable)
            fragment.arguments = data
            return fragment
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return Fragment()
    }

    @Deprecated("")
    fun newInstance(fragmentClass: Class<*>, extraLong: Long): Fragment {
        try {
            val fragment = fragmentClass.newInstance() as Fragment
            val data = Bundle()
            data.putLong(EXTRA_LONG, extraLong)
            fragment.arguments = data
            return fragment
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return Fragment()
    }

    @Deprecated("")
    fun newInstance(fragmentClass: Class<*>, parcelable: Parcelable?, extraLong: Long): Fragment {
        try {
            val fragment = fragmentClass.newInstance() as Fragment
            val data = Bundle()
            data.putParcelable(EXTRA_PARCELABLE, parcelable)
            data.putLong(EXTRA_LONG, extraLong)
            fragment.arguments = data
            return fragment
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return Fragment()
    }

    /***
     * Tool-Bar
     */
    var toolbarHeight = -1
    fun getToolbarHeight(activity: Activity?): Int {
        if (activity == null) return -1
        if (toolbarHeight == -1) {
            val tv = TypedValue()
            if (activity.theme.resolveAttribute(R.attr.actionBarSize, tv, true)) {
                toolbarHeight = TypedValue.complexToDimensionPixelSize(
                    tv.data,
                    activity.resources.displayMetrics
                )
            }
        }
        return toolbarHeight
    }

    fun dpToPx(dp: Float): Int {
        return Math.round(dp * (Resources.getSystem().displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT))
    }
}