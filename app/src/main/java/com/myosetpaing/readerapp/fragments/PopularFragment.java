package com.myosetpaing.readerapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myosetpaing.readerapp.R;
import com.myosetpaing.readerapp.adapters.PopularRecyclerViewAdapter;

public class PopularFragment extends Fragment {
    public static PopularFragment newInstance() {
        PopularFragment fragment = new PopularFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_popular, container, false);
        RecyclerView rvPopular=view.findViewById(R.id.rv_popular);
        rvPopular.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        PopularRecyclerViewAdapter adapter=new PopularRecyclerViewAdapter();
        rvPopular.setAdapter(adapter);
        return view;
    }
}
