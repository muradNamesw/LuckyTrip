package com.tacme.news.components.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/tacme/news/components/interfaces/ViewPagerItem;", "", "pageIndex", "", "getPageIndex", "()I", "setPageIndex", "(I)V", "onMessage", "", "messageId", "data", "Landroid/os/Bundle;", "onPageSelected", "onPageUnselected", "app_debug"})
public abstract interface ViewPagerItem {
    
    public abstract void onPageSelected();
    
    public abstract void onPageUnselected();
    
    public abstract void onMessage(int messageId, @org.jetbrains.annotations.Nullable()
    android.os.Bundle data);
    
    public abstract int getPageIndex();
    
    public abstract void setPageIndex(int p0);
}