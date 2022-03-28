package com.apprikot.listable.views

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
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList
import java.util.LinkedHashSet

abstract class RecyclerArrayAdapter<M : Listable?, VH : RecyclerView.ViewHolder?>() :
    RecyclerView.Adapter<VH>() {
    var mItems: ArrayList<M>? = null
        protected set
    protected var mOnItemClickCallback: OnItemClickCallback? = null
    protected var mInflater: LayoutInflater? = null

    //protected HolderClass holderClass;
    constructor(context: Context?, onItemClickCallback: OnItemClickCallback?) : this() {
        mItems = ArrayList()
        mOnItemClickCallback = onItemClickCallback
        mInflater = LayoutInflater.from(context)
    }

    //    @Override
    //    public int getItemViewType(int position) {
    //        return mmItems.get(position).getListItemType();
    //    }
    fun add(`object`: M) {
        mItems!!.add(`object`)
    }

    fun add(index: Int, `object`: M) {
        mItems!!.add(index, `object`)
    }

    fun addAll(collection: Collection<M>?) {
        if (collection != null) {
            mItems!!.addAll(collection)
        }
    }

    fun addAll(index: Int, collection: Collection<M>?) {
        if (collection != null && index >= 0) {
            mItems!!.addAll(index, collection)
        }
    }

    fun notifyNoDuplicates() {
        mItems = ArrayList(LinkedHashSet(mItems))
        notifyDataSetChanged()
    }

    fun addAll(mItems: ArrayList<M>?) {
        mItems!!.addAll(mItems!!)
    }

    fun indexOf(`object`: M): Int {
        return mItems!!.indexOf(`object`)
    }

    operator fun contains(`object`: M): Boolean {
        return mItems!!.contains(`object`)
    }

    fun clear() {
        mItems!!.clear()
        notifyDataSetChanged()
    }

    fun remove(`object`: M) {
        mItems!!.remove(`object`)
    }

    fun remove(position: Int) {
        mItems!!.removeAt(position)
    }

    fun removeAll(mItems: ArrayList<M>?) {
        mItems!!.removeAll(mItems)
    }

    fun getItem(position: Int): M {
        return mItems!![position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return mItems!!.size
    }

    fun empty(): Boolean {
        return itemCount == 0
    }

    init {
        setHasStableIds(true)
    }
}