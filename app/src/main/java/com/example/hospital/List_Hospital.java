package com.example.hospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class List_Hospital extends AppCompatActivity  {
    private RecyclerView rvHospital;
    private final ArrayList<Hospital> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_list__hospital);

        rvHospital = findViewById(R.id.rv_hospital);
        rvHospital.setHasFixedSize( true);

        list.addAll(HospitalData.getListData());
        showRecycleList();



    }
    private void showRecycleList(){
        rvHospital.setLayoutManager(new LinearLayoutManager(this));
        ListHospitalAdapter listHeroAdapter = new ListHospitalAdapter(list);
        rvHospital.setAdapter(listHeroAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedItem) {
        if (selectedItem == R.id.about) {
            Intent moveIntent = new Intent(List_Hospital.this, About.class);
            startActivity(moveIntent);

        }
    }



}
