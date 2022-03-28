package com.tacme.news.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0010\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ \u0010\u0011\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004J\u0018\u0010\u0011\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/tacme/news/utils/ViewUtils;", "", "()V", "toolbarHeight", "", "getToolbarHeight", "()I", "setToolbarHeight", "(I)V", "handleError", "", "activity", "Landroid/app/Activity;", "error", "Lcom/tacme/news/networking/WebServiceError;", "noConnection", "serverError", "showDialog", "title", "message", "", "showMessageCorrect", "mActivity", "app_debug"})
public final class ViewUtils {
    
    /**
     * *
     * Tool-Bar
     */
    private static int toolbarHeight = -1;
    public static final com.tacme.news.utils.ViewUtils INSTANCE = null;
    
    public final int getToolbarHeight() {
        return 0;
    }
    
    public final void setToolbarHeight(int p0) {
    }
    
    public final void handleError(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.tacme.news.networking.WebServiceError error) {
    }
    
    public final void showDialog(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, int title, int message) {
    }
    
    public final void showDialog(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showMessageCorrect(@org.jetbrains.annotations.NotNull()
    android.app.Activity mActivity, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void serverError(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    public final void noConnection(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    private ViewUtils() {
        super();
    }
}