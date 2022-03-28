package com.tacme.news.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Jz\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112h\u0010\u0012\u001ad\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000f0\u0013j\u0002`\u001cH\u0002J\u00b8\u0001\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001e2<\u0010\u001f\u001a8\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(!\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000f0 j\u0002`\"2h\u0010\u0012\u001ad\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000f0\u0013j\u0002`\u001cH\u0002J\u0006\u0010#\u001a\u00020\u000fJ\u00b5\u0002\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00052\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\'2\"\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\'2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052<\u0010\u001f\u001a8\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(!\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000f0 j\u0002`\"2h\u0010\u0012\u001ad\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000f0\u0013j\u0002`\u001c2%\u0010+\u001a!\u0012\u0013\u0012\u00110-\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000f0,j\u0002`.J\u0086\u0003\u0010/\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00052\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\'2\"\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\'2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052<\u0010\u001f\u001a8\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(!\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000f0 j\u0002`\"2h\u0010\u0012\u001ad\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000f0\u0013j\u0002`\u001c2:\u00100\u001a6\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(1\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u000f0 j\u0002`32:\u00104\u001a6\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u000f0 j\u0002`7J\u00de\u0002\u00108\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00052\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\'2\"\u00109\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020:0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020:`\'2\"\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\'2<\u0010\u001f\u001a8\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(!\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000f0 j\u0002`\"2h\u0010\u0012\u001ad\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000f0\u0013j\u0002`\u001c2:\u00100\u001a6\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(1\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u000f0 j\u0002`3J\u0086\u0002\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020=2\u0006\u0010%\u001a\u00020\u00052\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\'2\"\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\'2<\u0010\u001f\u001a8\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(!\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000f0 j\u0002`\"2h\u0010\u0012\u001ad\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000f0\u0013j\u0002`\u001cJ\u0086\u0002\u0010>\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020=2\u0006\u0010%\u001a\u00020\u00052\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\'2\"\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\'2<\u0010\u001f\u001a8\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(!\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000f0 j\u0002`\"2h\u0010\u0012\u001ad\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000f0\u0013j\u0002`\u001cR&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006?"}, d2 = {"Lcom/tacme/news/helpers/NetworkHandler;", "", "()V", "incompletedRequests", "Ljava/util/HashMap;", "", "getIncompletedRequests", "()Ljava/util/HashMap;", "setIncompletedRequests", "(Ljava/util/HashMap;)V", "kTimeOut", "", "getKTimeOut", "()J", "handleOnError", "", "error", "Lcom/androidnetworking/error/ANError;", "onError", "Lkotlin/Function4;", "Lcom/tacme/news/helpers/StatusCode;", "Lkotlin/ParameterName;", "name", "code", "Lorg/json/JSONObject;", "response", "body", "details", "Lcom/tacme/news/helpers/ResponseOnError;", "handleOnResponse", "Lokhttp3/Response;", "onComplete", "Lkotlin/Function2;", "status", "Lcom/tacme/news/helpers/ResponseOnComplete;", "retryRequest", "sendDownloadPostRequest", "urlString", "parameters", "Lkotlin/collections/HashMap;", "headers", "dirPath", "fileName", "onDownloadError", "Lkotlin/Function1;", "Lcom/tacme/news/helpers/DownloadError;", "Lcom/tacme/news/helpers/ResponseOnDownloadError;", "sendDownloadRequest", "onProgress", "bytesUploaded", "totalBytes", "Lcom/tacme/news/helpers/ResponseOnProgress;", "onDownload", "dir", "file", "Lcom/tacme/news/helpers/ResponseOnDownloadComplete;", "sendMultiPartRequest", "files", "Ljava/io/File;", "sendRawDataRequest", "method", "Lcom/tacme/news/helpers/HttpMethod;", "sendRequest", "app_debug"})
public final class NetworkHandler {
    @org.jetbrains.annotations.NotNull()
    public static final com.tacme.news.helpers.NetworkHandler INSTANCE = null;
    private static final long kTimeOut = 120L;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.lang.String, java.lang.Object> incompletedRequests;
    
    private NetworkHandler() {
        super();
    }
    
    public final long getKTimeOut() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.Object> getIncompletedRequests() {
        return null;
    }
    
    public final void setIncompletedRequests(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> p0) {
    }
    
    public final void sendRequest(@org.jetbrains.annotations.NotNull()
    com.tacme.news.helpers.HttpMethod method, @org.jetbrains.annotations.NotNull()
    java.lang.String urlString, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> parameters, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> onError) {
    }
    
    public final void sendRawDataRequest(@org.jetbrains.annotations.NotNull()
    com.tacme.news.helpers.HttpMethod method, @org.jetbrains.annotations.NotNull()
    java.lang.String urlString, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> parameters, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> onError) {
    }
    
    public final void sendMultiPartRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String urlString, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> parameters, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.io.File> files, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> onProgress) {
    }
    
    public final void sendDownloadRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String urlString, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> parameters, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.NotNull()
    java.lang.String dirPath, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> onProgress, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> onDownload) {
    }
    
    public final void sendDownloadPostRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String urlString, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> parameters, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.NotNull()
    java.lang.String dirPath, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tacme.news.helpers.DownloadError, kotlin.Unit> onDownloadError) {
    }
    
    public final void retryRequest() {
    }
    
    private final void handleOnResponse(okhttp3.Response response, kotlin.jvm.functions.Function2<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, kotlin.Unit> onComplete, kotlin.jvm.functions.Function4<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> onError) {
    }
    
    private final void handleOnError(com.androidnetworking.error.ANError error, kotlin.jvm.functions.Function4<? super com.tacme.news.helpers.StatusCode, ? super org.json.JSONObject, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> onError) {
    }
}