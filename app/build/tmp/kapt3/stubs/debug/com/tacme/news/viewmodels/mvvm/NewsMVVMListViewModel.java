package com.tacme.news.viewmodels.mvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010.\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u000100J\u0012\u00101\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u0010\u00102\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u000100R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010$\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b\'\u0010#R\u001a\u0010(\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010\nR(\u0010+\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#\u00a8\u00064"}, d2 = {"Lcom/tacme/news/viewmodels/mvvm/NewsMVVMListViewModel;", "Lcom/tacme/news/viewmodels/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "count", "", "getCount", "()I", "setCount", "(I)V", "currentIndex", "getCurrentIndex", "setCurrentIndex", "itemsList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/apprikot/listable/interfaces/Listable;", "getItemsList", "()Landroidx/lifecycle/MutableLiveData;", "setItemsList", "(Landroidx/lifecycle/MutableLiveData;)V", "onDataLoaded", "Lkotlin/Function0;", "", "getOnDataLoaded", "()Lkotlin/jvm/functions/Function0;", "setOnDataLoaded", "(Lkotlin/jvm/functions/Function0;)V", "onError", "Lkotlin/Function1;", "Lcom/tacme/news/networking/WebServiceError;", "getOnError", "()Lkotlin/jvm/functions/Function1;", "setOnError", "(Lkotlin/jvm/functions/Function1;)V", "showNoResults", "", "getShowNoResults", "setShowNoResults", "totalItems", "getTotalItems", "setTotalItems", "updateProgressState", "getUpdateProgressState", "setUpdateProgressState", "loadInitial", "activity", "Landroid/app/Activity;", "loadNewsList", "loadNext", "Factory", "app_debug"})
public final class NewsMVVMListViewModel extends com.tacme.news.viewmodels.BaseViewModel {
    private int currentIndex = 1;
    private int count = 20;
    private int totalItems = 0;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> showNoResults;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> updateProgressState;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onDataLoaded;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.tacme.news.networking.WebServiceError, kotlin.Unit> onError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.apprikot.listable.interfaces.Listable>> itemsList;
    
    public final int getCurrentIndex() {
        return 0;
    }
    
    public final void setCurrentIndex(int p0) {
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    public final int getTotalItems() {
        return 0;
    }
    
    public final void setTotalItems(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getShowNoResults() {
        return null;
    }
    
    public final void setShowNoResults(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getUpdateProgressState() {
        return null;
    }
    
    public final void setUpdateProgressState(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDataLoaded() {
        return null;
    }
    
    public final void setOnDataLoaded(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.tacme.news.networking.WebServiceError, kotlin.Unit> getOnError() {
        return null;
    }
    
    public final void setOnError(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.tacme.news.networking.WebServiceError, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.apprikot.listable.interfaces.Listable>> getItemsList() {
        return null;
    }
    
    public final void setItemsList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.apprikot.listable.interfaces.Listable>> p0) {
    }
    
    public NewsMVVMListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final void loadInitial(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    public final void loadNext(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    private final void loadNewsList(android.app.Activity activity) {
    }
    
    /**
     * A creator is used to inject the project ID into the ViewModel
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/tacme/news/viewmodels/mvvm/NewsMVVMListViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        private final android.app.Application application = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}