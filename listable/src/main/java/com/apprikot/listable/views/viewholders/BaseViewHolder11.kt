package com.apprikot.listable.views.viewholders

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
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.apprikot.listable.listeners.OnItemClickListener

abstract class BaseViewHolder : RecyclerView.ViewHolder {
    protected var onItemClickListener: OnItemClickListener? = null

    constructor(itemView: View?) : super(itemView!!) {}
    constructor(itemView: View?, onItemClickCallback: OnItemClickCallback?) : super(
        itemView!!
    ) {
        if (onItemClickCallback != null) {
            onItemClickListener = OnItemClickListener(
                adapterPosition, onItemClickCallback
            )
        }
    }

    open fun draw(listable: Listable?) {
        if (onItemClickListener != null) {
            onItemClickListener!!.setListableItem(listable)
            onItemClickListener!!.setPosition(adapterPosition)
        }
    }

    protected fun attachClickListener(vararg views: View) {
        for (view in views) {
            view.setOnClickListener(onItemClickListener)
        }
    }

    protected fun find(id: Int): View {
        return itemView.findViewById(id)
    }

    protected val context: Context
        protected get() = itemView.context

    protected fun getString(resId: Int): String {
        return context.getString(resId)
    }

    protected fun getColor(resId: Int): Int {
        return ContextCompat.getColor(context, resId)
    }

    protected fun loadImage(iconUrl: String?, imageView: ImageView) {
        Glide.with(imageView.context).load(iconUrl).into(imageView)
    }

    protected fun loadImage(iconUrl: String?, imageView: ImageView, place: Int) {
        Glide.with(imageView.context)
            .load(iconUrl)
            .apply(RequestOptions.placeholderOf(place).error(place))
            .into(imageView)
    }
}