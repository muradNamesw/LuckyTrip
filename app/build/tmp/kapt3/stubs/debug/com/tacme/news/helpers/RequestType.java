package com.tacme.news.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lcom/tacme/news/helpers/RequestType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "getRequest", "postRequest", "multiPartRequest", "downloadRequest", "Companion", "app_debug"})
public enum RequestType {
    /*public static final*/ getRequest /* = new getRequest(0) */,
    /*public static final*/ postRequest /* = new postRequest(0) */,
    /*public static final*/ multiPartRequest /* = new multiPartRequest(0) */,
    /*public static final*/ downloadRequest /* = new downloadRequest(0) */;
    private int value;
    public static final com.tacme.news.helpers.RequestType.Companion Companion = null;
    
    public final int getValue() {
        return 0;
    }
    
    public final void setValue(int p0) {
    }
    
    RequestType(int value) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tacme/news/helpers/RequestType$Companion;", "", "()V", "getBy", "Lcom/tacme/news/helpers/RequestType;", "value", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tacme.news.helpers.RequestType getBy(int value) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}