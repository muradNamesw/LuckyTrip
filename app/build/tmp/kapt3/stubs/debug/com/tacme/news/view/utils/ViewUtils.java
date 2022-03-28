package com.tacme.news.view.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\n\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J#\u0010\u0013\u001a\u00020\u00142\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J&\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0007J \u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020&J\"\u0010\'\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0010\u0010)\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006+"}, d2 = {"Lcom/tacme/news/view/utils/ViewUtils;", "", "()V", "EXTRA_AD", "", "EXTRA_LIST_PARCELABLE", "EXTRA_LONG", "EXTRA_PARCELABLE", "toolbarHeight", "", "getToolbarHeight", "()I", "setToolbarHeight", "(I)V", "dpToPx", "dp", "", "activity", "Landroid/app/Activity;", "hideKeyboard", "", "editTexts", "", "Landroid/widget/EditText;", "([Landroid/widget/EditText;)V", "newInstance", "Landroidx/fragment/app/Fragment;", "fragmentClass", "Ljava/lang/Class;", "parcelable", "Landroid/os/Parcelable;", "extraLong", "", "setConditioned", "textView", "Lcom/tacme/news/components/custom/CustomTextView;", "text", "isValid", "", "setWithDefault", "defaultText", "showKeyboard", "editText", "app_debug"})
public final class ViewUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.tacme.news.view.utils.ViewUtils INSTANCE = null;
    
    /**
     * *
     * New-Instance
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PARCELABLE = "PARCELABLE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_LONG = "INTEGER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_LIST_PARCELABLE = "LIST_PARCELABLE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_AD = "AD";
    
    /**
     * *
     * Tool-Bar
     */
    private static int toolbarHeight = -1;
    
    private ViewUtils() {
        super();
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.widget.EditText... editTexts) {
    }
    
    public final void showKeyboard(@org.jetbrains.annotations.Nullable()
    android.widget.EditText editText) {
    }
    
    public final void setConditioned(@org.jetbrains.annotations.NotNull()
    com.tacme.news.components.custom.CustomTextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String text, boolean isValid) {
    }
    
    public final void setWithDefault(@org.jetbrains.annotations.NotNull()
    com.tacme.news.components.custom.CustomTextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String defaultText) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public final androidx.fragment.app.Fragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> fragmentClass, @org.jetbrains.annotations.Nullable()
    android.os.Parcelable parcelable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public final androidx.fragment.app.Fragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> fragmentClass, long extraLong) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public final androidx.fragment.app.Fragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> fragmentClass, @org.jetbrains.annotations.Nullable()
    android.os.Parcelable parcelable, long extraLong) {
        return null;
    }
    
    public final int getToolbarHeight() {
        return 0;
    }
    
    public final void setToolbarHeight(int p0) {
    }
    
    public final int getToolbarHeight(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
        return 0;
    }
    
    public final int dpToPx(float dp) {
        return 0;
    }
}