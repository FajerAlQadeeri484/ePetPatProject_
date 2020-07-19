package com.example.epetpat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Company extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);

        TextView call = findViewById(R.id.call);
        TextView msg = findViewById(R.id.message);
        TextView aboutUs = findViewById(R.id.aboutus);

        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

                String aEmailList[] = { "petGrooming@gmail.com" };

                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, aEmailList);

                emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Grooming Service Request");

                emailIntent.setType("plain/text");
                emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "To order the grooming service please complete the following:\n\nName:\nPhone number:\nAddress:\nDay and time preferred:\n\nFor any queries write here: ");

                startActivity(emailIntent);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT > 22) {

                    if (ActivityCompat.checkSelfPermission(Company.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                        ActivityCompat.requestPermissions(Company.this, new String[]{Manifest.permission.CALL_PHONE}, 101);

                        return;
                    }
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + "12345678"));
                    startActivity(callIntent);
                } else {

                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + "12345678"));
                    startActivity(callIntent);
                }
            }
        });
        //////////////////////////////
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_paw:
                        Intent intent1 = new Intent(Company.this, CatInfo1.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_shop:
                        Intent intent2 = new Intent(Company.this, Shop.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_groom:
                        break;
                }
                return false;
            }
        });

        ///////////////////////////////////

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Company.this,AboutUs.class);
                startActivity(a);
            }
        });

    }
}