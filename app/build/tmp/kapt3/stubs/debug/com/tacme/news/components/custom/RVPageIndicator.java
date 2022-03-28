package com.tacme.news.components.custom;

import java.lang.System;

/**
 * A PageIndicator is responsible to show an visual indicator on the total views
 * number and the current visible com.tacme.pass.view.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0006H&\u00a8\u0006\r"}, d2 = {"Lcom/tacme/news/components/custom/RVPageIndicator;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "notifyDataSetChanged", "", "setCurrentItem", "item", "", "setOnPageChangeListener", "listener", "setRecyclerView", "view", "Landroidx/recyclerview/widget/RecyclerView;", "initialPosition", "app_debug"})
public abstract interface RVPageIndicator extends androidx.viewpager.widget.ViewPager.OnPageChangeListener {
    
    /**
     * Bind the indicator to a ViewPager.
     *
     * @param view
     */
    public abstract void setRecyclerView(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView view);
    
    /**
     * Bind the indicator to a ViewPager.
     *
     * @param view
     * @param initialPosition
     */
    public abstract void setRecyclerView(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView view, int initialPosition);
    
    /**
     * Set the current page of both the ViewPager and indicator.
     *
     *
     *
     * This **must** be used if you need to set the page before
     * the views are drawn on screen (e.g., default start page).
     *
     * @param item
     */
    public abstract void setCurrentItem(int item);
    
    /**
     * Set a page change listener which will receive forwarded events.
     *
     * @param listener
     */
    public abstract void setOnPageChangeListener(@org.jetbrains.annotations.Nullable()
    androidx.viewpager.widget.ViewPager.OnPageChangeListener listener);
    
    /**
     * Notify the indicator that the fragment list has changed.
     */
    public abstract void notifyDataSetChanged();
}