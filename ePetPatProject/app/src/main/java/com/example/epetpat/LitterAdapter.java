package com.example.epetpat;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Calendar;

public class LitterAdapter extends RecyclerView.Adapter {

    ArrayList<Litter> lArray;
    ArrayList<CartClass> cartArray;
    Context context;

    public LitterAdapter(ArrayList<Litter> lArray, Context context) {
        this.lArray = lArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list_item,parent,false);
        LitterAdapter.ViewHolder vh = new LitterAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).litterimg.setImageResource(lArray.get(position).getLitterimg());
        ((ViewHolder) holder).littername.setText(lArray.get(position).getLitterName());
        ((ViewHolder) holder).litterprice.setText(lArray.get(position).getLitterprice()+"");
        ((ViewHolder) holder).addicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Added to cart", Toast.LENGTH_SHORT).show();
               /* String n = lArray.get(position).getLitterName();
                int p = lArray.get(position).getLitterprice();
                CartClass f = new CartClass(n,p);
                cartArray.add(f);*/


             /*   SharedPreferences.Editor editor = sharedPreferences.edit();
                //Gson gson = new Gson();
                //String json = gson.toJson(myCart);
                //editor.putString("item name", json);
                editor.putString("name","food");
                editor.putInt("price","")*/
            }
        });
    }

    @Override
    public int getItemCount() {
        return lArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView litterimg;
        public TextView littername;
        public TextView litterprice;
        public ImageView addicon;
        public View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            litterimg = itemView.findViewById(R.id.imageView10);
            littername = itemView.findViewById(R.id.textView4);
            litterprice = itemView.findViewById(R.id.textView5);
            addicon = itemView.findViewById(R.id.imageView12);
        }
    }

}
