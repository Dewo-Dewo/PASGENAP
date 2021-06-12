package com.example.pasgenap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.util.Log;

import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<ModelView> dataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        recyclerView = findViewById(R.id.recyclerview);

        addData();

        adapter = new MahasiswaAdapter(dataArrayList, new MahasiswaAdapter.Callback() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("nama", dataArrayList.get(position).getName());
                intent.putExtra("nim", dataArrayList.get(position).getNim());
                intent.putExtra("nohp", dataArrayList.get(position).getNoHp());
                intent.putExtra("email", dataArrayList.get(position).getEmail());
                startActivity(intent);
            }
        });

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }

    public void addData(){
        dataArrayList = new ArrayList<>();
        dataArrayList.add(new ModelView("bimo", "14438752", "911", "bimo@gmail.com"));
        dataArrayList.add(new ModelView("ganjo", "14438752", "911", "bimo@gmail.com"));
        dataArrayList.add(new ModelView("banned", "14438752", "911", "bimo@gmail.com"));
        dataArrayList.add(new ModelView("ginjee", "14438752", "911", "bimo@gmail.com"));
        dataArrayList.add(new ModelView("bulio", "14438752", "911", "bimo@gmail.com"));
        dataArrayList.add(new ModelView("xsr", "14438752", "911", "bimo@gmail.com"));
        dataArrayList.add(new ModelView("welieeft", "14438752", "911", "bimo@gmail.com"));

    }
}