package com.example.mockapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FieldDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field_data);

        RecyclerView _rv_field_data = (RecyclerView) findViewById(R.id.rv_field_data);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        SnapHelper snapHelper = new PagerSnapHelper();
        _rv_field_data.setLayoutManager(layoutManager);
        snapHelper.attachToRecyclerView(_rv_field_data);

        List<FieldDataClass> fieldDataClassList = new ArrayList<FieldDataClass>()
        {{
            add(new FieldDataClass("podatak_1_1", "podatak_2_1", 0));
            add(new FieldDataClass("podatak_1_2", "podatak_2_2", 0));
            add(new FieldDataClass("podatak_1_3", "podatak_2_3", 0));
            add(new FieldDataClass("podatak_1_4", "podatak_2_4", 0));
            add(new FieldDataClass("podatak_1_5", "podatak_2_5", 0));

        }};

        FieldDataAdapter fieldDataAdapter = new FieldDataAdapter(this, fieldDataClassList);
        _rv_field_data.setAdapter(fieldDataAdapter);
    }
}