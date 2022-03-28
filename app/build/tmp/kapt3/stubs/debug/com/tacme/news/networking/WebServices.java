package com.tacme.news.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH\u0002JD\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012j\u0002`\u0014H\u0002JY\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2%\u0010\u0016\u001a!\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\n0\u0012j\u0002`\u00192\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012j\u0002`\u0014H\u0002J\u008d\u0001\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042U\u0010\u001e\u001aQ\u0012\u0013\u0012\u00110 \u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110 \u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0\u001fj\u0002`%2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012j\u0002`\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006&"}, d2 = {"Lcom/tacme/news/networking/WebServices;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getHeaders", "Ljava/util/HashMap;", "handleFailure", "", "status", "Lcom/tacme/news/helpers/StatusCode;", "response", "Lorg/json/JSONObject;", "body", "details", "onFailure", "Lkotlin/Function1;", "Lcom/tacme/news/networking/WebServiceError;", "Lcom/tacme/news/networking/FailureResult;", "handleSuccess", "onSuccess", "Lkotlin/ParameterName;", "name", "Lcom/tacme/news/networking/SuccessfullResponseResult;", "newsListMVVM", "country", "category", "apiKey", "result", "Lkotlin/Function3;", "", "", "Lcom/tacme/news/model/mvvm/DestinationsListDec;", "newsList", "totalItems", "Lcom/tacme/news/networking/NewsMVVMtListResult;", "app_debug"})
public final class WebServices {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WebServices";
    public static final com.tacme.news.networking.WebServices INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    private final void handleSuccess(com.tacme.news.helpers.StatusCode status, org.json.JSONObject response, kotlin.jvm.functions.Function1<? super org.json.JSONObject, kotlin.Unit> onSuccess, kotlin.jvm.functions.Function1<? super com.tacme.news.networking.WebServiceError, kotlin.Unit> onFailure) {
    }
    
    private final void handleFailure(com.tacme.news.helpers.StatusCode status, org.json.JSONObject response, java.lang.String body, java.lang.String details, kotlin.jvm.functions.Function1<? super com.tacme.news.networking.WebServiceError, kotlin.Unit> onFailure) {
    }
    
    private final java.util.HashMap<java.lang.String, java.lang.String> getHeaders() {
        return null;
    }
    
    public final void newsListMVVM(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super com.tacme.news.model.mvvm.DestinationsListDec[], ? super java.lang.Integer, kotlin.Unit> result, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tacme.news.networking.WebServiceError, kotlin.Unit> onFailure) {
    }
    
    private WebServices() {
        super();
    }
}