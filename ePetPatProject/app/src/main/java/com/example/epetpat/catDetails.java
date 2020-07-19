package com.example.epetpat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class catDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_details);

        Bundle b = getIntent().getExtras();
        cats c = (cats) b.getSerializable("cat");

        ImageView catimg = findViewById(R.id.imageView8);
        TextView catName = findViewById(R.id.textView);
        TextView catInfo = findViewById(R.id.textView3);

        catimg.setImageResource(c.getImage());
        catName.setText(c.getName());
        catInfo.setText(c.getInformation());
    }
}