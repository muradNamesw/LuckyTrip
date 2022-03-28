package com.tacme.news.view.activities.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016\u00a8\u0006\u0015"}, d2 = {"Lcom/tacme/news/view/activities/base/RootActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "applyOverrideConfiguration", "", "overrideConfiguration", "Landroid/content/res/Configuration;", "attachBaseContext", "base", "Landroid/content/Context;", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "loadLanguage", "updateBaseContextLocale", "context", "updateResourcesLocale", "locale", "Ljava/util/Locale;", "updateResourcesLocaleLegacy", "app_debug"})
public class RootActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    public RootActivity() {
        super();
    }
    
    public void loadLanguage() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    @java.lang.Override()
    public void applyOverrideConfiguration(@org.jetbrains.annotations.Nullable()
    android.content.res.Configuration overrideConfiguration) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.content.Context updateBaseContextLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    public android.content.Context updateResourcesLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.content.Context updateResourcesLocaleLegacy(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
}