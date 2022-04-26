package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Car> {

    private Context context;
    private int resource;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Car> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        convertView = layoutInflater.inflate(resource,parent,false);

        ImageView imageView = convertView.findViewById(R.id.myimg);

        TextView txtcarname = convertView.findViewById(R.id.txtcarname);

        TextView txtcarcname = convertView.findViewById(R.id.txtcarcname);

        imageView.setImageResource(getItem(position).getImg());

        txtcarname.setText(getItem(position).getCarname());

        txtcarcname.setText(getItem(position).getCarcname());

        return convertView;
    }
}
