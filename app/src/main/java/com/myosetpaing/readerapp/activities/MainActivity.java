package com.myosetpaing.readerapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.myosetpaing.readerapp.R;
import com.myosetpaing.readerapp.adapters.NewArrivalRecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RecyclerView rvNewArrival=findViewById(R.id.rv_newArrival);
        rvNewArrival.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        NewArrivalRecyclerViewAdapter adapter=new NewArrivalRecyclerViewAdapter();
        rvNewArrival.setAdapter(adapter);
    }
}
