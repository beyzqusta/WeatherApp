package com.example.waetherjava.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.waetherjava.Adapter.FutureAdapter;
import com.example.waetherjava.Domains.FutureDomains;
import com.example.waetherjava.R;

import java.util.ArrayList;

public class FutureActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterTomorrow;
    public RecyclerView recyclerView;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);
        
        initRecylerview();
        setVeriable();

    }

    private void setVeriable() {

        ImageView backBtn=findViewById(R.id.backBtn);
        backBtn.setOnClickListener(v -> startActivity(new Intent(FutureActivity.this,MainActivity.class)));
    }

    private void initRecylerview() {

        ArrayList<FutureDomains> items=new ArrayList<>();
        items.add(new FutureDomains("Monday","Stormy","Stormy",20,15));
        items.add(new FutureDomains("Sunday","Rainy","Rainy",20,18));
        items.add(new FutureDomains("Wednesday","Windy","Windy",29,25));
        items.add(new FutureDomains("Thursday","Sunny","sunny",41,32));
        items.add(new FutureDomains("Friday","Cloudy","cloudy",35,31));
        items.add(new FutureDomains("Saturday","Cloudy Sunny","Cloudy Sunny",33,28));
        items.add(new FutureDomains("Tuesday","Rainy","Rainy",27,21));

        recyclerView=findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        adapterTomorrow=new FutureAdapter(items);
        recyclerView.setAdapter(adapterTomorrow);
    }
}