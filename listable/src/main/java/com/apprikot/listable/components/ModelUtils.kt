package com.apprikot.listable.components

import com.apprikot.listable.components.UnderHeaderVo
import com.apprikot.listable.interfaces.Listable
import com.apprikot.listable.interfaces.LoadMore
import com.apprikot.listable.interfaces.Releasable
import com.apprikot.listable.model.HolderClass
import com.apprikot.listable.views.viewholders.LoadingMoreViewHolder
import com.apprikot.listable.R
import org.apache.commons.lang3.builder.HashCodeBuilder
import com.apprikot.listable.components.LoadingMore
import org.apache.commons.lang3.builder.EqualsBuilder
import android.os.Bundle
import android.os.Message
import java.util.ArrayList
import java.util.LinkedHashSet

object ModelUtils {
    @JvmStatic
    fun getNoDuplicated(items: ArrayList<Listable?>): ArrayList<Listable?> {
        val set: LinkedHashSet<Listable?> = LinkedHashSet(items)
        return ArrayList(set)
    }

    fun getMessage(key: String?, message: String?): Message {
        val bundle = Bundle()
        bundle.putString(key, message)
        val msg = Message()
        msg.data = bundle
        return msg
    }
}