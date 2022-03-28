package com.apprikot.listable.interfaces

import com.apprikot.listable.interfaces.Configurable

interface Configurable {
    fun config(): Configurable?
    fun hasHeaders(hasHeaders: Boolean): Configurable?
    fun hasSearch(hasSearch: Boolean): Configurable?
    fun hasMargins(hasMargins: Boolean): Configurable?
    fun hasLoadMore(loadMore: Boolean): Configurable?
    fun hasPullRefresh(hasPullRefresh: Boolean): Configurable?
    fun fromPageNum(fromIndex: Int): Configurable?
    fun toPageNum(toIndex: Int): Configurable?
}