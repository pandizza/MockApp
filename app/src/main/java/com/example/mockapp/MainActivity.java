package com.example.mockapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_pocni = (Button) findViewById(R.id.btn_start);

        btn_pocni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToFieldDataActivity();
            }
        });
    }

    private void switchToFieldDataActivity() {
        Intent it_switch_to_rv = new Intent(this, FieldDataActivity.class);
        startActivity(it_switch_to_rv);
    }
}