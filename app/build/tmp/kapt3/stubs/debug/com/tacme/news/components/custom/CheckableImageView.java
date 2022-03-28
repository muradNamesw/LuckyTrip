package com.tacme.news.components.custom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/tacme/news/components/custom/CheckableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/Checkable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mChecked", "", "isChecked", "onCreateDrawableState", "", "extraSpace", "", "setChecked", "", "checked", "toggle", "animate", "Companion", "app_debug"})
public final class CheckableImageView extends androidx.appcompat.widget.AppCompatImageView implements android.widget.Checkable {
    private boolean mChecked = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.tacme.news.components.custom.CheckableImageView.Companion Companion = null;
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    private java.util.HashMap _$_findViewCache;
    
    public CheckableImageView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public int[] onCreateDrawableState(int extraSpace) {
        return null;
    }
    
    public final void toggle(boolean animate) {
    }
    
    @java.lang.Override()
    public void toggle() {
    }
    
    @java.lang.Override()
    public boolean isChecked() {
        return false;
    }
    
    @java.lang.Override()
    public void setChecked(boolean checked) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tacme/news/components/custom/CheckableImageView$Companion;", "", "()V", "CHECKED_STATE_SET", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}