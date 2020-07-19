package com.example.epetpat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CatAdapter extends RecyclerView.Adapter {


    ArrayList<cats> cArray;
    Context c;

    public CatAdapter(ArrayList<cats> cArray, Context c) {
        this.cArray = cArray;
        this.c = c;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).img.setImageResource(cArray.get(position).getImage());
        ((ViewHolder) holder).catName.setText(cArray.get(position).getName());
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(c,catDetails.class);
                i.putExtra("cat",cArray.get(position));
                c.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return cArray.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public Button catName;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.imageView6);
            catName = itemView.findViewById(R.id.button);
        }
    }
}
