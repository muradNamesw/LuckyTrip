package com.apprikot.listable.utils

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
import java.util.HashMap

object FontUtils {
    const val CORBEL_BOLD = "Corbel Bold.ttf"
    const val ACCESSORIES = "Aladin-Regular.ttf"
    private var customFonts: HashMap<CustomFont, Typeface>? = null
    fun getFont(context: Context, customFont: CustomFont): Typeface? {
        if (customFonts == null) {
            customFonts = HashMap<CustomFont, Typeface>()
//            customFonts = HashMap<CustomFont, Typeface?>()
        }
        if (!customFonts!!.containsKey(customFont) || customFonts!![customFont] == null) {
            val typeface = Typeface.createFromAsset(context.assets, "fonts/" + customFont.fontName)
            customFonts!!.put(customFont, typeface)
        }
        return customFonts!![customFont]
    }

    enum class CustomFont(val fontName: String) {
        CORBEL_BOLD(FontUtils.CORBEL_BOLD), ACCESSORIES(FontUtils.ACCESSORIES);

    }
}