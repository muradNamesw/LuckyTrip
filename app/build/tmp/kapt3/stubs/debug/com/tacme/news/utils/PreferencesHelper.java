package com.tacme.news.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002J\u0019\u0010\u0005\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0086\u0002J\u0019\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000eH\u0086\u0002J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0086\u0002J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000fH\u0086\u0002J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007J$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/tacme/news/utils/PreferencesHelper;", "", "()V", "settings", "Landroid/content/SharedPreferences;", "get", "", "", "key", "value", "(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;", "", "defaultVal", "", "", "Lorg/json/JSONObject;", "getResourceString", "resId", "removeValue", "", "set", "(Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "app_debug"})
public final class PreferencesHelper {
    private android.content.SharedPreferences settings;
    @org.jetbrains.annotations.NotNull()
    public static final com.tacme.news.utils.PreferencesHelper.Companion Companion = null;
    private static com.tacme.news.utils.PreferencesHelper instance;
    private static android.content.Context context;
    
    public PreferencesHelper() {
        super();
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String[] value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String[] get(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String[] value) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String get(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultVal) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.json.JSONObject get(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    org.json.JSONObject defaultVal) {
        return null;
    }
    
    public final int get(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defaultVal) {
        return 0;
    }
    
    public final float get(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float defaultVal) {
        return 0.0F;
    }
    
    public final boolean get(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defaultVal) {
        return false;
    }
    
    public final void removeValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResourceString(int resId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/tacme/news/utils/PreferencesHelper$Companion;", "", "()V", "context", "Landroid/content/Context;", "instance", "Lcom/tacme/news/utils/PreferencesHelper;", "getInstance", "initInstance", "", "pContext", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void initInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context pContext) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tacme.news.utils.PreferencesHelper getInstance() {
            return null;
        }
    }
}