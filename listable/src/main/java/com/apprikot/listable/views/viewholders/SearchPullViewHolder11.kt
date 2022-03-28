package com.apprikot.listable.views.viewholders

//import com.apprikot.listable.interfaces.Searchable.searchKey
//import com.apprikot.listable.interfaces.Searchable.searchKeys
//import com.apprikot.listable.components.ModelUtils.getNoDuplicated
//import com.apprikot.listable.components.LoadingMore.loadMore
//import com.apprikot.listable.components.LoadingMore.setReleasable
//import com.apprikot.listable.interfaces.Listable.listItemTypeAllAll
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
import android.view.View
import android.widget.ImageView
import com.apprikot.listable.utils.ViewUtils

class SearchPullViewHolder(itemView: View?, onItemClickCallback: OnItemClickCallback?) :
    BaseViewHolder(itemView, onItemClickCallback) {
    private val searchEditText: EditText?
    private val clearImageView: ImageView?
    private var searchItem: SearchItem? = null
    override fun draw(listable: Listable?) {
        super.draw(listable)
        searchItem = listable as SearchItem?
        searchItem!!.searchEditText = searchEditText
        if (searchItem!!.searchText != null) {
            searchEditText!!.setText(searchItem!!.searchText)
        }
        if (searchItem!!.focused) {
            searchEditText!!.requestFocus()
        }
        //        attachClickListener(clearImageView);
    }

    init {
        searchEditText = find(R.id.etxt_search) as EditText
        clearImageView = find(R.id.img_cancel_search) as ImageView
        searchEditText!!.setOnEditorActionListener { v, actionId, event ->
            var handled = false
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                if (searchItem!!.textEnteredListener != null) {
                    ViewUtils.hideKeyboard(searchEditText)
                    searchItem!!.textEnteredListener!!.onTextEntered(searchEditText.text.toString())
                }
                handled = true
            }
            handled
        }
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                searchItem!!.textEnteredListener!!.onTextChanged(s.toString())
            }

            override fun afterTextChanged(s: Editable) {}
        })
        clearImageView!!.setOnClickListener { searchEditText.setText("") }
    }
}