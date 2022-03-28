package com.apprikot.listable.views
//
////import com.apprikot.listable.interfaces.Searchable.searchKey
////import com.apprikot.listable.interfaces.Searchable.searchKeys
////import com.apprikot.listable.components.ModelUtils.getNoDuplicated
////import com.apprikot.listable.components.LoadingMore.loadMore
////import com.apprikot.listable.components.LoadingMore.setReleasable
////import com.apprikot.listable.interfaces.Listable.listItemTypeAll
//import com.apprikot.listable.listeners.OnItemClickListener.OnItemClickCallback
//import com.apprikot.listable.interfaces.Listable
//import android.os.Parcelable
//import android.os.Parcel
//import com.apprikot.listable.model.HolderClass
//import android.graphics.Typeface
//import com.apprikot.listable.utils.HashUtils
////import kotlin.Throws
//import android.widget.EditText
//import android.app.Activity
//import android.widget.TextView
//import android.animation.ValueAnimator
//import android.animation.ValueAnimator.AnimatorUpdateListener
//import android.content.Context
//import android.graphics.Bitmap
//import android.util.DisplayMetrics
//import com.bumptech.glide.Glide
//import com.bumptech.glide.request.RequestOptions
//import android.view.animation.Animation
//import com.apprikot.listable.R
//import com.apprikot.listable.views.GeneralListAdapter
//import com.apprikot.listable.components.ModelUtils
//import com.apprikot.listable.views.SearchItem
//import android.view.ViewGroup
//import androidx.core.content.ContextCompat
//import android.widget.TextView.OnEditorActionListener
//import android.view.inputmethod.EditorInfo
//import android.text.TextWatcher
//import android.text.Editable
//import com.apprikot.listable.interfaces.Releasable
//import com.apprikot.listable.components.LoadingMore
//import com.apprikot.listable.components.UnderHeaderVo
//import com.apprikot.listable.listeners.TextEnteredListener
//import com.apprikot.listable.views.RecyclerArrayAdapter
//import android.view.LayoutInflater

import android.content.Context
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup;

import com.apprikot.listable.interfaces.Listable
import com.apprikot.listable.listeners.OnItemClickListener;
import com.apprikot.listable.model.HolderClass;
import com.apprikot.listable.views.viewholders.BaseViewHolder

open class GeneralListAdapter(
    context: Context?,
    data: kotlin.collections.List<Listable?>?,
    onItemClickCallback: OnItemClickListener.OnItemClickCallback?
) : RecyclerArrayAdapter<Listable?, BaseViewHolder?>(context, onItemClickCallback) {
    protected var fragment: Fragment? = null

    constructor(
        context: Context?, data: List<Listable?>?,
        onItemClickCallback: OnItemClickListener.OnItemClickCallback?, fragment: Fragment?
    ) : this(context, data, onItemClickCallback) {
        this.fragment = fragment
    }

    @NonNull
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BaseViewHolder {
        try {
            //RestHolder listItemType = ListItemType.values()[viewType];
            var holderClass: HolderClass? = null
            for (listable in mItems!!) {
                if (listable!!.listItemTypeAll!!.layoutResId == viewType) {
                    holderClass = listable!!.listItemTypeAll
                    break
                }
            }
            val view = mInflater!!.inflate(holderClass!!.layoutResId, viewGroup, false)
            return if (holderClass.isFragment) {
                val constructor = holderClass.viewHolderClass!!.getConstructor(
                    View::class.java, Fragment::class.java
                )
                constructor.newInstance(view, fragment) as BaseViewHolder
            } else {
                val constructor = holderClass.viewHolderClass!!.getConstructor(
                    View::class.java, OnItemClickListener.OnItemClickCallback::class.java
                )
                constructor.newInstance(view, mOnItemClickCallback) as BaseViewHolder
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        val vv : BaseViewHolder? =null
        return vv!!
    }

    override fun onBindViewHolder(viewHolder: BaseViewHolder, position: Int) {
        if (viewHolder.javaClass == mItems!![position]!!.listItemTypeAll!!.viewHolderClass) {
            viewHolder.draw(mItems!![position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return mItems!![position]!!.listItemTypeAll!!.layoutResId
    }

    init {
        addAll(data)
    }
}