package com.tacme.news.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/tacme/news/app/MyApplication;", "Landroidx/multidex/MultiDexApplication;", "()V", "preferences", "Landroid/content/SharedPreferences;", "getPreferences", "()Landroid/content/SharedPreferences;", "setPreferences", "(Landroid/content/SharedPreferences;)V", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "updateBaseContextLocale", "context", "updateResourcesLocale", "locale", "Ljava/util/Locale;", "updateResourcesLocaleLegacy", "Companion", "app_debug"})
public final class MyApplication extends androidx.multidex.MultiDexApplication {
    @org.jetbrains.annotations.Nullable()
    private android.content.SharedPreferences preferences;
    @org.jetbrains.annotations.Nullable()
    private static com.tacme.news.app.MyApplication instance;
    public static final com.tacme.news.app.MyApplication.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getPreferences() {
        return null;
    }
    
    public final void setPreferences(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    private final android.content.Context updateBaseContextLocale(android.content.Context context) {
        return null;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    private final android.content.Context updateResourcesLocale(android.content.Context context, java.util.Locale locale) {
        return null;
    }
    
    private final android.content.Context updateResourcesLocaleLegacy(android.content.Context context, java.util.Locale locale) {
        return null;
    }
    
    public MyApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/tacme/news/app/MyApplication$Companion;", "", "()V", "instance", "Lcom/tacme/news/app/MyApplication;", "getInstance", "()Lcom/tacme/news/app/MyApplication;", "setInstance", "(Lcom/tacme/news/app/MyApplication;)V", "applicationContext", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.tacme.news.app.MyApplication getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable()
        com.tacme.news.app.MyApplication p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context applicationContext() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}