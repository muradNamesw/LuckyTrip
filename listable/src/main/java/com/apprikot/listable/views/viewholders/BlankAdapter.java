package com.apprikot.listable.views.viewholders;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public class BlankAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}