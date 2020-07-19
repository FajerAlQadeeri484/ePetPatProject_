package com.example.epetpat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter {

    ArrayList<CartClass> cArray;
    Context context;

    public CartAdapter(ArrayList<CartClass> cArray, Context context) {
        this.cArray = cArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_list_item,parent,false);
        CartAdapter.ViewHolder vh = new CartAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).cartname.setText(cArray.get(position).getNameInCart());
        ((ViewHolder) holder).cartprice.setText(cArray.get(position).getPriceInCart()+"");
    }

    @Override
    public int getItemCount() {
        return cArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView cartname;
        public TextView cartprice;
        public ImageView delicon;
        public View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            cartname = itemView.findViewById(R.id.textView18);
            cartprice = itemView.findViewById(R.id.textView19);
            delicon = itemView.findViewById(R.id.imageView3);
        }
    }
}
