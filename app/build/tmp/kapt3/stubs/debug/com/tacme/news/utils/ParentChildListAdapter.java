package com.tacme.news.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 $2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0005$%&\'(B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH&J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\bH\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\u0015H&J\b\u0010\u001a\u001a\u00020\u0015H&J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bH\u0016JD\u0010!\u001a\u00020\u001122\u0010\"\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\u000bj\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u0001`\u000f2\b\b\u0002\u0010#\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR:\u0010\n\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\u000bj\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u0001`\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/tacme/news/utils/ParentChildListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "hasFooter", "", "itemTypes", "", "", "[Ljava/lang/Integer;", "itemsList", "Ljava/util/ArrayList;", "", "", "", "Lkotlin/collections/ArrayList;", "bindItem", "", "pos", "buildItemTypes", "getFooterView", "Landroid/view/View;", "getItemCount", "getItemViewType", "position", "getMainView", "getSubView", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapItems", "newItems", "footer", "Companion", "FooterViewHolder", "MainItemViewHolder", "SubItemViewHolder", "ViewHolder", "app_debug"})
public abstract class ParentChildListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private boolean hasFooter = false;
    private java.lang.Integer[] itemTypes = {};
    private java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> itemsList;
    @org.jetbrains.annotations.NotNull()
    public static final com.tacme.news.utils.ParentChildListAdapter.Companion Companion = null;
    private static final int MAIN_ITEM_VIEW = 1;
    private static final int SUB_ITEM_VIEW = 2;
    private static final int FOOTER_VIEW = 3;
    
    public ParentChildListAdapter() {
        super();
    }
    
    public final void swapItems(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> newItems, boolean footer) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View getMainView();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View getSubView();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View getFooterView();
    
    private final void buildItemTypes() {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public abstract void bindItem(int pos);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0096\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/tacme/news/utils/ParentChildListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tacme/news/utils/ParentChildListAdapter;Landroid/view/View;)V", "bindItem", "", "pos", "", "app_debug"})
    public class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(int pos) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0096\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/tacme/news/utils/ParentChildListAdapter$MainItemViewHolder;", "Lcom/tacme/news/utils/ParentChildListAdapter$ViewHolder;", "Lcom/tacme/news/utils/ParentChildListAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tacme/news/utils/ParentChildListAdapter;Landroid/view/View;)V", "app_debug"})
    public class MainItemViewHolder extends com.tacme.news.utils.ParentChildListAdapter.ViewHolder {
        
        public MainItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0096\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/tacme/news/utils/ParentChildListAdapter$SubItemViewHolder;", "Lcom/tacme/news/utils/ParentChildListAdapter$ViewHolder;", "Lcom/tacme/news/utils/ParentChildListAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tacme/news/utils/ParentChildListAdapter;Landroid/view/View;)V", "app_debug"})
    public class SubItemViewHolder extends com.tacme.news.utils.ParentChildListAdapter.ViewHolder {
        
        public SubItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0096\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/tacme/news/utils/ParentChildListAdapter$FooterViewHolder;", "Lcom/tacme/news/utils/ParentChildListAdapter$ViewHolder;", "Lcom/tacme/news/utils/ParentChildListAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tacme/news/utils/ParentChildListAdapter;Landroid/view/View;)V", "app_debug"})
    public class FooterViewHolder extends com.tacme.news.utils.ParentChildListAdapter.ViewHolder {
        
        public FooterViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/tacme/news/utils/ParentChildListAdapter$Companion;", "", "()V", "FOOTER_VIEW", "", "MAIN_ITEM_VIEW", "SUB_ITEM_VIEW", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}