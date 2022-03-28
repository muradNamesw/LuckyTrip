package com.apprikot.listable.utils

//import com.apprikot.listable.interfaces.Searchable.searchKey
//import com.apprikot.listable.interfaces.Searchable.searchKeys
import com.apprikot.listable.components.ModelUtils.getNoDuplicated
//import com.apprikot.listable.components.LoadingMore.loadMore
//import com.apprikot.listable.components.LoadingMore.setReleasable
//import com.apprikot.listable.interfaces.Listable.listItemTypeAll
import com.apprikot.listable.interfaces.Listable
//import kotlin.Throws
import com.apprikot.listable.views.GeneralListAdapter
import com.apprikot.listable.views.SearchItem
import android.util.Log
import com.apprikot.listable.interfaces.Searchable
import java.util.ArrayList

class SearchManager {
    var mGeneralListAdapter: GeneralListAdapter? = null
    var mItems: ArrayList<Listable?>? = null
    fun withAdapter(generalListAdapter: GeneralListAdapter): SearchManager {
        mGeneralListAdapter = generalListAdapter
        mItems = ArrayList(generalListAdapter.mItems)
        return this
    }

    fun withSearchResult(searchResult: List<Listable?>?): SearchManager {
        notify(searchResult)
        return this
    }

    fun checkEmpty(searchKey: String) {
        if (searchKey.isEmpty()) {
            notify(mItems)
        }
    }

    fun search(searchKey: String, notify: Boolean): List<Listable?> {
        val result = filter(searchKey)
        if (notify) {
            notify(result)
        }
        return result
    }

    fun filter(searchKey: String): ArrayList<Listable?> {
        var result: ArrayList<Listable?> = ArrayList()
        if (searchKey.isEmpty()) {
            result.addAll(mItems!!)
        } else {
            for (item in mItems!!) {
                if (item is Searchable) {
                    val value = (item as Searchable).searchKey
                    val values = (item as Searchable).searchKeys
                    if (values != null) {
                        for (v in values) {
                            if (v!!.toLowerCase().contains(searchKey.toLowerCase())) {
                                result.add(item)
                            }
                        }
                    }
                    if (value != null) {
                        if (value.toLowerCase().contains(searchKey.toLowerCase())) {
                            result.add(item)
                        }
                    }
                }
            }
        }
        result = getNoDuplicated(result)
        val index = mGeneralListAdapter!!.indexOf(SearchItem())
        if (index != -1) {
            val searchItem = mGeneralListAdapter!!.getItem(index) as SearchItem
            result.remove(searchItem)
            result.add(0, searchItem)
        }
        return result
    }

    private fun notify(items: List<Listable?>?) {
        if (mGeneralListAdapter == null) {
            Log.e(SearchManager::class.java.simpleName, "Adapter is null! This shouldn't happen.")
            return
        }
        mGeneralListAdapter!!.clear()
        mGeneralListAdapter!!.addAll(items)
        mGeneralListAdapter!!.notifyDataSetChanged()
    }
}