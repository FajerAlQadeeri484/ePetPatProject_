package com.example.epetpat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VideoAdapter extends RecyclerView.Adapter {

    ArrayList<Video> vArray;
    Context context;

    public VideoAdapter(ArrayList<Video> vArray, Context context) {
        this.vArray = vArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).title.setText(vArray.get(position).getVideoTitle());
        ((ViewHolder)holder).title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(context,videoDetails.class);
                e.putExtra("video",vArray.get(position));
                context.startActivity(e);
            }
        });
    }

    @Override
    public int getItemCount() {
        return vArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public Button title;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            title = itemView.findViewById(R.id.button2);
        }
    }
}
