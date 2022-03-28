package com.apprikot.listable.listeners

import androidx.fragment.app.Fragment

interface FragmentStackManager {
    var currentTabFragment: Fragment?
    val currentMainFragment: Fragment?
}