package com.tacme.news.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/tacme/news/helpers/Validate;", "", "()V", "isBlank", "", "text", "", "isNumber", "value", "isValidEmail", "email", "isValidPasswordLength", "password", "minPasswordLength", "", "isValidPhone", "phone", "passwordsMatch", "confirmPassword", "app_debug"})
public final class Validate {
    @org.jetbrains.annotations.NotNull()
    public static final com.tacme.news.helpers.Validate INSTANCE = null;
    
    private Validate() {
        super();
    }
    
    public final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return false;
    }
    
    public final boolean isValidPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
        return false;
    }
    
    public final boolean isBlank(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return false;
    }
    
    public final boolean isValidPasswordLength(@org.jetbrains.annotations.NotNull()
    java.lang.String password, int minPasswordLength) {
        return false;
    }
    
    public final boolean passwordsMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmPassword) {
        return false;
    }
    
    public final boolean isNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
}