package com.apprikot.listable.components

import com.apprikot.listable.components.UnderHeaderVo
import com.apprikot.listable.interfaces.Listable
import com.apprikot.listable.interfaces.LoadMore
import com.apprikot.listable.interfaces.Releasable
import com.apprikot.listable.model.HolderClass
import com.apprikot.listable.views.viewholders.LoadingMoreViewHolder
//import com.apprikot.listable.R
import org.apache.commons.lang3.builder.HashCodeBuilder
import com.apprikot.listable.components.LoadingMore
import org.apache.commons.lang3.builder.EqualsBuilder
import android.os.Bundle
import com.apprikot.listable.R

class LoadingMore : UnderHeaderVo, Listable {
    private var mLoadMoreAll: LoadMore? = null
    private var mReleasable: Releasable? = null
    private val code = 555

    constructor(loadMore: LoadMore?) {
        mLoadMoreAll = loadMore
    }

    constructor() {}

    fun loadMore() {
        if (mLoadMoreAll != null) {
            mLoadMoreAll!!.loadMore()
        }
    }

    fun setReleasable(releasable: Releasable?) {
        mReleasable = releasable
    }

    fun release() {
        if (mReleasable != null) {
            mReleasable!!.release()
        }
    }

    constructor(headerId: Long) {
        this.headerId = headerId
    }

//    override fun getListItemType(): HolderClass {
//        return HolderClass(LoadingMoreViewHolder::class.java, R.layout.item_loading_more)
//    }

    override fun hashCode(): Int {
        return HashCodeBuilder().append(code).toHashCode()
    }

    override val listItemTypeAll: HolderClass?
        get() =  HolderClass(LoadingMoreViewHolder::class.java, R.layout.item_loading_more)

//    override fun getListItemTypeAll(): HolderClass {
//        get() = HolderClass(LoadingMoreViewHolder::class.java, R.layout.item_loading_more)
//    }

    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if (other !is LoadingMore) {
            return false
        }
        return EqualsBuilder().append(code, other.code).isEquals
    }
}