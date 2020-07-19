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

public class OtherAdapter extends RecyclerView.Adapter {

    ArrayList<Other> oArray;
    Context context;

    public OtherAdapter(ArrayList<Other> oArray, Context context) {
        this.oArray = oArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list_item,parent,false);
        OtherAdapter.ViewHolder vh = new OtherAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).otherimg.setImageResource(oArray.get(position).getOtherimg());
        ((ViewHolder) holder).othername.setText(oArray.get(position).getOtherName());
        ((ViewHolder) holder).otherprice.setText(oArray.get(position).getOtherprice()+"");
        ((ViewHolder) holder).addicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return oArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView otherimg;
        public TextView othername;
        public TextView otherprice;
        public ImageView addicon;
        public View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            otherimg = itemView.findViewById(R.id.imageView10);
            othername = itemView.findViewById(R.id.textView4);
            otherprice = itemView.findViewById(R.id.textView5);
            addicon = itemView.findViewById(R.id.imageView12);
        }
    }

}
