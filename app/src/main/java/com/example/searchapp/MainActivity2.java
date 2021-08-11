package com.example.searchapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<itemModel> names;
    NewAdater adater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerviewSetup();
        SearchSetup();
    }
    private void SearchSetup() {
        EditText search = findViewById(R.id.serch2);
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
    }
    private void filter(String text) {
        ArrayList<itemModel> filterdNames = new ArrayList<>();
        for (itemModel s:names)
        {
            if (s.getId().toLowerCase().contains(text.toLowerCase())){
                filterdNames.add(s);
            }
        }
        adater.filterdNames(filterdNames);
    }
    private void recyclerviewSetup() {
        recyclerView = findViewById(R.id.rv2);
        names = new ArrayList<>();
        itemModel itemModel = new itemModel();
        itemModel.setId("Fashion");
        itemModel itemMode1 = new itemModel();
        itemMode1.setId("Women Fashion");
        itemModel itemMode2 = new itemModel();
        itemMode2.setId("Geeta");
        itemModel itemMode3 = new itemModel();
        itemMode3.setId("Zara");
        itemModel itemMode4 = new itemModel();
        itemMode4.setId("Teser");

        //add in array list
        names.add(itemModel);
        names.add(itemMode1);
        names.add(itemMode2);
        names.add(itemMode4);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adater = new NewAdater(names);
        recyclerView.setAdapter(adater);
    }
}