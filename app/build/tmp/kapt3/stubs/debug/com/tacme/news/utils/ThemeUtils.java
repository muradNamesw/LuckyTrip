package com.tacme.news.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/tacme/news/utils/ThemeUtils;", "", "()V", "theme", "Lcom/tacme/news/utils/ThemeUtils$ThemeStyle;", "changeToTheme", "", "activity", "Landroid/app/Activity;", "onActivityCreateSetTheme", "ThemeStyle", "app_debug"})
public final class ThemeUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.tacme.news.utils.ThemeUtils INSTANCE = null;
    private static final com.tacme.news.utils.ThemeUtils.ThemeStyle theme = null;
    
    private ThemeUtils() {
        super();
    }
    
    public final void changeToTheme(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.tacme.news.utils.ThemeUtils.ThemeStyle theme) {
    }
    
    public final void onActivityCreateSetTheme(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/tacme/news/utils/ThemeUtils$ThemeStyle;", "", "(Ljava/lang/String;I)V", "gradientBlue", "white", "transparent", "app_debug"})
    public static enum ThemeStyle {
        /*public static final*/ gradientBlue /* = new gradientBlue() */,
        /*public static final*/ white /* = new white() */,
        /*public static final*/ transparent /* = new transparent() */;
        
        ThemeStyle() {
        }
    }
}