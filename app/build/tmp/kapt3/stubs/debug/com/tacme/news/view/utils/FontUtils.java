package com.tacme.news.view.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/tacme/news/view/utils/FontUtils;", "", "()V", "customFonts", "", "Lcom/tacme/news/view/utils/FontUtils$CustomFont;", "Landroid/graphics/Typeface;", "getFont", "context", "Landroid/content/Context;", "customFont", "CustomFont", "app_debug"})
public final class FontUtils {
    private static java.util.Map<com.tacme.news.view.utils.FontUtils.CustomFont, android.graphics.Typeface> customFonts;
    public static final com.tacme.news.view.utils.FontUtils INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Typeface getFont(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.tacme.news.view.utils.FontUtils.CustomFont customFont) {
        return null;
    }
    
    private FontUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/tacme/news/view/utils/FontUtils$CustomFont;", "", "fontName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getFontName", "()Ljava/lang/String;", "ENGLISH_MEDIUM", "ARABIC_MEDIUM", "app_debug"})
    public static enum CustomFont {
        /*public static final*/ ENGLISH_MEDIUM /* = new ENGLISH_MEDIUM(null) */,
        /*public static final*/ ARABIC_MEDIUM /* = new ARABIC_MEDIUM(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fontName = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFontName() {
            return null;
        }
        
        CustomFont(java.lang.String fontName) {
        }
    }
}