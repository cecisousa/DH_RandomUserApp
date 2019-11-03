package com.example.dh_randomuserapp.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dh_randomuserapp.R;
import com.example.dh_randomuserapp.model.Result;
import com.example.dh_randomuserapp.view.adapter.ProfileRecyclerViewAdapter;
import com.example.dh_randomuserapp.viewmodel.ProfileViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProfileViewModel viewModel;
    private List<Result> listaResults = new ArrayList<>();
    private ProfileRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        viewModel.getPerfil();

        viewModel.getItemProfile().observe(this, itemLista -> {
            adapter.atualizaItem(itemLista);
        });
    }

    public void initViews() {
        recyclerView = findViewById(R.id.recyclerViewProfile);
        viewModel = ViewModelProviders.of(this).get(ProfileViewModel.class);
        adapter = new ProfileRecyclerViewAdapter(listaResults);
    }
}
