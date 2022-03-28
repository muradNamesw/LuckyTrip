package com.apprikot.listable.views

//import com.apprikot.listable.interfaces.Searchable.searchKey
//import com.apprikot.listable.interfaces.Searchable.searchKeys
//import com.apprikot.listable.components.ModelUtils.getNoDuplicated
//import com.apprikot.listable.components.LoadingMore.loadMore
//import com.apprikot.listable.components.LoadingMore.setReleasable
//import com.apprikot.listable.interfaces.Listable.listItemTypeAll
import com.apprikot.listable.listeners.OnItemClickListener.OnItemClickCallback
import com.apprikot.listable.interfaces.Listable
import com.apprikot.listable.model.HolderClass
//import kotlin.Throws
import android.content.Context
import androidx.fragment.app.Fragment

class GeneralStickyListAdapter : GeneralListAdapter {
    private val mHeadersMap: Map<Long, Listable>? = null
    private val holderClass: HolderClass? = null
    private var TAG = "Adapter"

    constructor(
        context: Context?,
        data: List<Listable?>?,
        onItemClickCallback: OnItemClickCallback?
    ) : super(context, data, onItemClickCallback) {
    }

    constructor(
        context: Context?, data: List<Listable?>?,
        onItemClickCallback: OnItemClickCallback?, fragment: Fragment
    ) : super(context, data, onItemClickCallback, fragment) {
        TAG = fragment.javaClass.simpleName
    }
}