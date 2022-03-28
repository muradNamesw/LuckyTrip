package com.apprikot.listable.interfaces

import com.apprikot.listable.interfaces.Configurable

interface Searchable {
    val searchKey: String?
    val searchKeys: List<String?>?
}