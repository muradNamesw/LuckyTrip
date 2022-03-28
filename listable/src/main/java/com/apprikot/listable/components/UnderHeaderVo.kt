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

open class UnderHeaderVo {
    var listItemType: HolderClass? = null
    var headerId: Long = -1
}