package com.myosetpaing.readerapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myosetpaing.readerapp.R;
import com.myosetpaing.readerapp.views.holders.NewArrivalViewHolder;

public class NewArrivalRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view=layoutInflater.inflate(R.layout.item_view_new_arrival,viewGroup,false);
        return new NewArrivalViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
