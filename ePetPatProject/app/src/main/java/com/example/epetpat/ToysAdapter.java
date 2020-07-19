package com.example.epetpat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ToysAdapter extends RecyclerView.Adapter {

    ArrayList<Toys> tArray;
    Context context;

    public ToysAdapter(ArrayList<Toys> tArray, Context context) {
        this.tArray = tArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list_item,parent,false);
        ToysAdapter.ViewHolder vh = new ToysAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).toysimg.setImageResource(tArray.get(position).getToyimg());
        ((ViewHolder) holder).toysname.setText(tArray.get(position).getToyName());
        ((ViewHolder) holder).toysprice.setText(tArray.get(position).getToyprice()+"");
        ((ViewHolder) holder).addicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return tArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView toysimg;
        public TextView toysname;
        public TextView toysprice;
        public ImageView addicon;
        public View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            toysimg = itemView.findViewById(R.id.imageView10);
            toysname = itemView.findViewById(R.id.textView4);
            toysprice = itemView.findViewById(R.id.textView5);
            addicon = itemView.findViewById(R.id.imageView12);
        }
    }
}
