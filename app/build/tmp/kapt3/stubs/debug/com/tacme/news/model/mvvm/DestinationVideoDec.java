package com.tacme.news.model.mvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/tacme/news/model/mvvm/DestinationVideoDec;", "", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "Companion", "app_debug"})
public final class DestinationVideoDec {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "url")
    private java.lang.String url;
    public static final com.tacme.news.model.mvvm.DestinationVideoDec.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public DestinationVideoDec(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject) throws com.tacme.news.utils.ParseException {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tacme/news/model/mvvm/DestinationVideoDec$Companion;", "", "()V", "fromJson", "Lcom/tacme/news/model/mvvm/DestinationVideoDec;", "jsonObject", "Lorg/json/JSONObject;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tacme.news.model.mvvm.DestinationVideoDec fromJson(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject jsonObject) throws com.tacme.news.utils.ParseException {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}