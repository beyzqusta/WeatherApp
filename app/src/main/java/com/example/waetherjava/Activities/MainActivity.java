package com.example.waetherjava.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.waetherjava.Adapter.HurlyAdapter;
import com.example.waetherjava.Domains.Hurly;
import com.example.waetherjava.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   private RecyclerView.Adapter adapterhourly;
   private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecylerview();
        setVeriable();

    }

    private void setVeriable() {

        TextView next=findViewById(R.id.textview14);
        next.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,
                FutureActivity.class)));
    }

    private void initRecylerview() {

        ArrayList<Hurly> items=new ArrayList<>();
        items.add(new Hurly("9 pm ",28, "Cloudy"));
        items.add(new Hurly("11 pm",32, "Sunny"));
        items.add(new Hurly("12 pm",21, "Windy"));
        items.add(new Hurly("1 am",19, "Rainy"));
        items.add(new Hurly("2 am",22, "Stormy"));

        recyclerView=findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterhourly=new HurlyAdapter(items);
        recyclerView.setAdapter(adapterhourly);


    }
}