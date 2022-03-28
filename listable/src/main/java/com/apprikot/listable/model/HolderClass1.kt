package com.apprikot.listable.model

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
import android.graphics.Bitmap
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

/**
 * Created by administrator on 10/24/16.
 */
class HolderClass : Parcelable {
    var viewHolderClass: Class<*>? = null
    var layoutResId: Int
    var isFragment = false
    var isNotes = false

    constructor(layoutResId: Int) {
        this.layoutResId = layoutResId
    }

    constructor(viewHolderClass: Class<*>?, layoutResId: Int) {
        this.viewHolderClass = viewHolderClass
        this.layoutResId = layoutResId
    }

    constructor(viewHolderClass: Class<*>?, layoutResId: Int, isFragment: Boolean) : this(
        viewHolderClass,
        layoutResId
    ) {
        this.isFragment = isFragment
    }

    constructor(
        viewHolderClass: Class<*>?,
        layoutResId: Int,
        isFragment: Boolean,
        isNotes: Boolean
    ) : this(viewHolderClass, layoutResId) {
        this.isFragment = isFragment
        this.isNotes = isNotes
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeSerializable(viewHolderClass)
        dest.writeInt(layoutResId)
        dest.writeByte(if (isFragment) 1.toByte() else 0.toByte())
        dest.writeByte(if (isNotes) 1.toByte() else 0.toByte())
    }

    protected constructor(`in`: Parcel) {
        viewHolderClass = `in`.readSerializable() as Class<*>
        layoutResId = `in`.readInt()
        isFragment = `in`.readByte().toInt() != 0
        isNotes = `in`.readByte().toInt() != 0
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<HolderClass?> = object : Parcelable.Creator<HolderClass?> {
            override fun createFromParcel(source: Parcel): HolderClass? {
                return HolderClass(source)
            }

            override fun newArray(size: Int): Array<HolderClass?> {
                return arrayOfNulls(size)
            }
        }
    }
}