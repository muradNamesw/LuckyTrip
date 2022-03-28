package com.tacme.news.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/tacme/news/utils/PrefHelp;", "", "()V", "LANG", "", "LAST_CHECK_IN", "QUERIES_HISTORY", "UDID", "USER", "prefs", "Landroid/content/SharedPreferences;", "getAppLang", "context", "Landroid/content/Context;", "getLang", "getLocale", "Ljava/util/Locale;", "getPrefs", "getUdid", "isEnglish", "", "logout", "", "setLang", "lang", "setUdid", "udid", "app_debug"})
public final class PrefHelp {
    private static android.content.SharedPreferences prefs;
    private static final java.lang.String LANG = "lang";
    private static final java.lang.String USER = "USER";
    private static final java.lang.String UDID = "UDID";
    private static final java.lang.String LAST_CHECK_IN = "LAST_CHECK_IN";
    private static final java.lang.String QUERIES_HISTORY = "QUERIES_HISTORY";
    public static final com.tacme.news.utils.PrefHelp INSTANCE = null;
    
    private final android.content.SharedPreferences getPrefs(android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLang(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Locale getLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void setLang(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String lang) {
    }
    
    public final boolean isEnglish(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppLang(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void logout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void setUdid(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String udid) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUdid(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private PrefHelp() {
        super();
    }
}