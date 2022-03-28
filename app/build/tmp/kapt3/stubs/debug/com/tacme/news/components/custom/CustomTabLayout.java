package com.tacme.news.components.custom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u001b\u001a\u00020\u0016H\u0002\u00a2\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\tJ#\u0010!\u001a\u00020\u000e2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00160\u0019\"\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010#R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/tacme/news/components/custom/CustomTabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTypeface", "Landroid/graphics/Typeface;", "adaptWeights", "", "titles", "", "", "addTab", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "getTextWidth", "", "sampleText", "getWeights", "", "widths", "sum", "(Ljava/util/List;F)[Ljava/lang/Float;", "getWidths", "init", "selectTab", "index", "setWeights", "weights", "([Ljava/lang/Float;)V", "app_debug"})
public final class CustomTabLayout extends com.google.android.material.tabs.TabLayout {
    private android.graphics.Typeface mTypeface;
    private java.util.HashMap _$_findViewCache;
    
    private final void init(android.util.AttributeSet attrs) {
    }
    
    @java.lang.Override()
    public void addTab(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    public final void setWeights(@org.jetbrains.annotations.NotNull()
    java.lang.Float... weights) {
    }
    
    public final void selectTab(int index) {
    }
    
    public final float getTextWidth(@org.jetbrains.annotations.NotNull()
    java.lang.String sampleText) {
        return 0.0F;
    }
    
    public final void adaptWeights(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> titles) {
    }
    
    private final java.lang.Float[] getWeights(java.util.List<java.lang.Float> widths, float sum) {
        return null;
    }
    
    private final java.util.List<java.lang.Float> getWidths(java.util.List<java.lang.String> titles) {
        return null;
    }
    
    public CustomTabLayout(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public CustomTabLayout(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CustomTabLayout(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
}