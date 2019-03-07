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
import com.myosetpaing.readerapp.adapters.FeatureRecyclerViewAdapter;

public class FeatureFragment extends Fragment {
    public static FeatureFragment newInstance() {
        FeatureFragment fragment = new FeatureFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feature, container, false);
        RecyclerView rvFeature = view.findViewById(R.id.rv_feature);
        rvFeature.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        FeatureRecyclerViewAdapter adapter = new FeatureRecyclerViewAdapter();
        rvFeature.setAdapter(adapter);
        return view;


    }


}
