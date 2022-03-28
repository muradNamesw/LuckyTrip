package com.tacme.news.components.custom;

import java.lang.System;

/**
 * Created by Murad Adnan on 2019-07-16.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\rR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/tacme/news/components/custom/CustomTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Landroid/widget/Checkable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mChecked", "", "isChecked", "onCreateDrawableState", "", "extraSpace", "setChecked", "", "checked", "toggle", "animate", "Companion", "app_debug"})
public final class CustomTextInputLayout extends com.google.android.material.textfield.TextInputLayout implements android.widget.Checkable {
    private boolean mChecked = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.tacme.news.components.custom.CustomTextInputLayout.Companion Companion = null;
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    private java.util.HashMap _$_findViewCache;
    
    public CustomTextInputLayout(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public CustomTextInputLayout(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CustomTextInputLayout(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public int[] onCreateDrawableState(int extraSpace) {
        return null;
    }
    
    @java.lang.Override()
    public void setChecked(boolean checked) {
    }
    
    @java.lang.Override()
    public boolean isChecked() {
        return false;
    }
    
    @java.lang.Override()
    public void toggle() {
    }
    
    public final void toggle(boolean animate) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tacme/news/components/custom/CustomTextInputLayout$Companion;", "", "()V", "CHECKED_STATE_SET", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}