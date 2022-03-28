package com.tacme.news.view.adapters;

import java.lang.System;

/**
 * Created by Murad Adnan on 2019-11-25.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%B\u001f\b\u0016\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\rH\u0016J\"\u0010\"\u001a\u00020\u00152\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007Ra\u0010\u000b\u001aI\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lcom/tacme/news/view/adapters/BaseRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tacme/news/view/adapters/BaseRecyclerAdapter$BaseViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/apprikot/listable/interfaces/Listable;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItems", "()Ljava/util/ArrayList;", "setItems", "onClickItem", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "position", "Landroid/view/View;", "view", "", "anyObject", "", "getOnClickItem", "()Lkotlin/jvm/functions/Function3;", "setOnClickItem", "(Lkotlin/jvm/functions/Function3;)V", "getItemCount", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapItems", "newItems", "BaseViewHolder", "OnClickCallback", "app_debug"})
public final class BaseRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tacme.news.view.adapters.BaseRecyclerAdapter.BaseViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.apprikot.listable.interfaces.Listable> items;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super android.view.View, java.lang.Object, kotlin.Unit> onClickItem;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.apprikot.listable.interfaces.Listable> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.apprikot.listable.interfaces.Listable> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<java.lang.Integer, android.view.View, java.lang.Object, kotlin.Unit> getOnClickItem() {
        return null;
    }
    
    public final void setOnClickItem(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super android.view.View, java.lang.Object, kotlin.Unit> p0) {
    }
    
    public BaseRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.apprikot.listable.interfaces.Listable> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tacme.news.view.adapters.BaseRecyclerAdapter.BaseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tacme.news.view.adapters.BaseRecyclerAdapter.BaseViewHolder holder, int position) {
    }
    
    public final void swapItems(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.apprikot.listable.interfaces.Listable> newItems) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u001d\u001a\u00020\u00182\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u001f\"\u00020\u0014H\u0016\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\tH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rRa\u0010\u000e\u001aI\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\""}, d2 = {"Lcom/tacme/news/view/adapters/BaseRecyclerAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "listableItem", "Lcom/apprikot/listable/interfaces/Listable;", "getListableItem", "()Lcom/apprikot/listable/interfaces/Listable;", "setListableItem", "(Lcom/apprikot/listable/interfaces/Listable;)V", "onClickItem", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "position", "Landroid/view/View;", "view", "", "anyObject", "", "getOnClickItem", "()Lkotlin/jvm/functions/Function3;", "setOnClickItem", "(Lkotlin/jvm/functions/Function3;)V", "attachClickListener", "views", "", "([Landroid/view/View;)V", "onBindView", "app_debug"})
    public static class BaseViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private com.apprikot.listable.interfaces.Listable listableItem;
        @org.jetbrains.annotations.Nullable()
        private androidx.databinding.ViewDataBinding binding;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super android.view.View, java.lang.Object, kotlin.Unit> onClickItem;
        
        @org.jetbrains.annotations.Nullable()
        public final com.apprikot.listable.interfaces.Listable getListableItem() {
            return null;
        }
        
        public final void setListableItem(@org.jetbrains.annotations.Nullable()
        com.apprikot.listable.interfaces.Listable p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.databinding.ViewDataBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.Nullable()
        androidx.databinding.ViewDataBinding p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function3<java.lang.Integer, android.view.View, java.lang.Object, kotlin.Unit> getOnClickItem() {
            return null;
        }
        
        public final void setOnClickItem(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super android.view.View, java.lang.Object, kotlin.Unit> p0) {
        }
        
        public BaseViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding binding) {
            super(null);
        }
        
        public void onBindView(@org.jetbrains.annotations.NotNull()
        com.apprikot.listable.interfaces.Listable listableItem) {
        }
        
        public void attachClickListener(@org.jetbrains.annotations.NotNull()
        android.view.View... views) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/tacme/news/view/adapters/BaseRecyclerAdapter$OnClickCallback;", "", "(Lcom/tacme/news/view/adapters/BaseRecyclerAdapter;)V", "onClick", "", "view", "Landroid/view/View;", "obj", "Lcom/apprikot/listable/interfaces/Listable;", "app_debug"})
    public final class OnClickCallback {
        
        public OnClickCallback() {
            super();
        }
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.apprikot.listable.interfaces.Listable obj) {
        }
    }
}