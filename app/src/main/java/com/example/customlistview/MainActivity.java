package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);


        ArrayList<Car> arrayList = new ArrayList<>();

        arrayList.add(new Car(R.drawable.car1,"Swift","Suzuki"));
        arrayList.add(new Car(R.drawable.car2,"Verna","Honda"));
        arrayList.add(new Car(R.drawable.car3,"Figo","Hundia"));
        arrayList.add(new Car(R.drawable.car4,"i20","Hundia"));
        arrayList.add(new Car(R.drawable.car5,"Ameze","Honda"));
        arrayList.add(new Car(R.drawable.car6,"Aulto","Suzuki"));

        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.list_row,arrayList);

        listView.setAdapter(customAdapter);
    }
}