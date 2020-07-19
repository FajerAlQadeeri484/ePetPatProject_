package com.example.epetpat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter {

    ArrayList<Food> fArray;
    Context context;
    ArrayList<String> cartList = new ArrayList<>();

    public FoodAdapter(ArrayList<Food> fArray, Context context) {
        this.fArray = fArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list_item,parent,false);
        FoodAdapter.ViewHolder vh = new FoodAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).foodimg.setImageResource(fArray.get(position).getFoodimg());
        ((ViewHolder) holder).foodname.setText(fArray.get(position).getFoodName());
        ((ViewHolder) holder).price.setText(fArray.get(position).getPrice()+"");
        ((ViewHolder)holder).addicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Added to cart", Toast.LENGTH_SHORT).show();
               /* cartList.add(fArray.get(position).getFoodName());
                Intent array = new Intent(context,Cart.class);
                array.putExtra("added" ,cartList);
                context.startActivity(array);*/

            }
        });

    }

    @Override
    public int getItemCount() {
        return fArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView foodimg;
        public TextView foodname;
        public TextView price;
        public ImageView addicon;
        public View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            foodimg = itemView.findViewById(R.id.imageView10);
            foodname = itemView.findViewById(R.id.textView4);
            price = itemView.findViewById(R.id.textView5);
            addicon = itemView.findViewById(R.id.imageView12);
        }
    }
}
