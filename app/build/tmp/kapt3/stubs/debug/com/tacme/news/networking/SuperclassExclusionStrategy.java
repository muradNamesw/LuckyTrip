package com.tacme.news.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\f\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/tacme/news/networking/SuperclassExclusionStrategy;", "Lcom/google/gson/ExclusionStrategy;", "()V", "getField", "Ljava/lang/reflect/Field;", "theClass", "Ljava/lang/Class;", "fieldName", "", "isFieldInSuperclass", "", "subclass", "shouldSkipClass", "arg0", "shouldSkipField", "fieldAttributes", "Lcom/google/gson/FieldAttributes;", "app_debug"})
public final class SuperclassExclusionStrategy implements com.google.gson.ExclusionStrategy {
    
    @java.lang.Override()
    public boolean shouldSkipClass(@org.jetbrains.annotations.Nullable()
    java.lang.Class<?> arg0) {
        return false;
    }
    
    @java.lang.Override()
    public boolean shouldSkipField(@org.jetbrains.annotations.NotNull()
    com.google.gson.FieldAttributes fieldAttributes) {
        return false;
    }
    
    private final boolean isFieldInSuperclass(java.lang.Class<?> subclass, java.lang.String fieldName) {
        return false;
    }
    
    private final java.lang.reflect.Field getField(java.lang.Class<?> theClass, java.lang.String fieldName) {
        return null;
    }
    
    public SuperclassExclusionStrategy() {
        super();
    }
}