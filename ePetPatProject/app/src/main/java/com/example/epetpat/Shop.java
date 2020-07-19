package com.example.epetpat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.gson.Gson;

import java.util.ArrayList;

public class Shop extends AppCompatActivity {
    public static SharedPreferences preferences;
    ArrayList<CartClass> myCart = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        final ImageView cart = findViewById(R.id.imageView15);
        final ImageView cart2 = findViewById(R.id.imageView152);
        final Intent goToCart = new Intent(Shop.this,Cart.class);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToCart.putExtra("theCart",myCart);
                startActivity(goToCart);
            }
        });
        cart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToCart.putExtra("theCart",myCart);
                startActivity(goToCart);
            }
        });

        final Button foodOnOff = findViewById(R.id.foodOnOff);
        final ImageView foodOn = findViewById(R.id.foodOn);
        final ImageView foodOff = findViewById(R.id.foodOff);
        final RecyclerView foodRecyclerView = findViewById(R.id.foodRecyclerView);

        final Button toysOnOff = findViewById(R.id.toysOnOff);
        final ImageView toysOn = findViewById(R.id.toysOn);
        final ImageView toysOff = findViewById(R.id.toysOff);
        final RecyclerView toysRecyclerView = findViewById(R.id.toysRecyclerView);

        final Button litterOnOff = findViewById(R.id.litterOnOff);
        final ImageView litterOn = findViewById(R.id.litterOn);
        final ImageView litterOff = findViewById(R.id.litterOff);
        final RecyclerView litterRecyclerView = findViewById(R.id.litterRecyclerView);

        final Button otherOnOff = findViewById(R.id.otherOnOff);
        final ImageView otherOn = findViewById(R.id.otherOn);
        final ImageView otherOff = findViewById(R.id.otherOff);
        final RecyclerView otherRecyclerView = findViewById(R.id.otherRecyclerView);

        foodOff.setVisibility(View.INVISIBLE);
        foodOn.setVisibility(View.VISIBLE);
        foodRecyclerView.setVisibility(View.VISIBLE);

        toysOff.setVisibility(View.VISIBLE);
        toysOn.setVisibility(View.INVISIBLE);
        toysRecyclerView.setVisibility(View.INVISIBLE);

        litterOff.setVisibility(View.VISIBLE);
        litterOn.setVisibility(View.INVISIBLE);
        litterRecyclerView.setVisibility(View.INVISIBLE);

        otherOff.setVisibility(View.VISIBLE);
        otherOn.setVisibility(View.INVISIBLE);
        otherRecyclerView.setVisibility(View.INVISIBLE);

        foodOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodOff.setVisibility(View.INVISIBLE);
                foodOn.setVisibility(View.VISIBLE);
                foodRecyclerView.setVisibility(View.VISIBLE);
                toysOff.setVisibility(View.VISIBLE);
                litterOff.setVisibility(View.VISIBLE);
                otherOff.setVisibility(View.VISIBLE);
                toysOn.setVisibility(View.INVISIBLE);
                litterOn.setVisibility(View.INVISIBLE);
                otherOn.setVisibility(View.INVISIBLE);
                toysRecyclerView.setVisibility(View.INVISIBLE);
                litterRecyclerView.setVisibility(View.INVISIBLE);
                otherRecyclerView.setVisibility(View.INVISIBLE);
            }
        });

        toysOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toysOff.setVisibility(View.INVISIBLE);
                toysOn.setVisibility(View.VISIBLE);
                toysRecyclerView.setVisibility(View.VISIBLE);
                foodOff.setVisibility(View.VISIBLE);
                litterOff.setVisibility(View.VISIBLE);
                otherOff.setVisibility(View.VISIBLE);
                foodOn.setVisibility(View.INVISIBLE);
                litterOn.setVisibility(View.INVISIBLE);
                otherOn.setVisibility(View.INVISIBLE);
                foodRecyclerView.setVisibility(View.INVISIBLE);
                litterRecyclerView.setVisibility(View.INVISIBLE);
                otherRecyclerView.setVisibility(View.INVISIBLE);
            }
        });

        litterOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                litterOff.setVisibility(View.INVISIBLE);
                litterOn.setVisibility(View.VISIBLE);
                litterRecyclerView.setVisibility(View.VISIBLE);
                toysOff.setVisibility(View.VISIBLE);
                foodOff.setVisibility(View.VISIBLE);
                otherOff.setVisibility(View.VISIBLE);
                toysOn.setVisibility(View.INVISIBLE);
                foodOn.setVisibility(View.INVISIBLE);
                otherOn.setVisibility(View.INVISIBLE);
                toysRecyclerView.setVisibility(View.INVISIBLE);
                foodRecyclerView.setVisibility(View.INVISIBLE);
                otherRecyclerView.setVisibility(View.INVISIBLE);
            }
        });

        otherOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otherOff.setVisibility(View.INVISIBLE);
                otherOn.setVisibility(View.VISIBLE);
                otherRecyclerView.setVisibility(View.VISIBLE);
                toysOff.setVisibility(View.VISIBLE);
                litterOff.setVisibility(View.VISIBLE);
                foodOff.setVisibility(View.VISIBLE);
                toysOn.setVisibility(View.INVISIBLE);
                litterOn.setVisibility(View.INVISIBLE);
                foodOn.setVisibility(View.INVISIBLE);
                toysRecyclerView.setVisibility(View.INVISIBLE);
                litterRecyclerView.setVisibility(View.INVISIBLE);
                foodRecyclerView.setVisibility(View.INVISIBLE);
            }
        });
        //////////////////////////////////////////////////////////////////////////////////////////////////////////Food
        ArrayList<Food> myFood = new ArrayList<>();
        Food f1 = new Food("Tuna fillet",4,R.drawable.tunafillet);
        Food f2 = new Food("Royal Canin",8,R.drawable.royalcanin);
        Food f3 = new Food("Babycat Milk",9,R.drawable.babycatmilk);
        Food f4 = new Food("Hearty Cuts",2,R.drawable.heartycuts);
        Food f5 = new Food("Tuna Snappr",4,R.drawable.tunasnappr);
        Food f6 = new Food("Dry Cat Food",2,R.drawable.foodc);
        Food f7 = new Food("Ocean Fish",5,R.drawable.oceanfish);
        Food f8 = new Food("Real Rabbit",10,R.drawable.realrabbit);
        myFood.add(f1);
        myFood.add(f2);
        myFood.add(f3);
        myFood.add(f4);
        myFood.add(f5);
        myFood.add(f6);
        myFood.add(f7);
        myFood.add(f8);
        RecyclerView rv = findViewById(R.id.foodRecyclerView);
        //to organize the recyclerView in the xml
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        /////////////////////////////
        FoodAdapter adapter = new FoodAdapter(myFood,this);
        rv.setAdapter(adapter);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////Toys
        ArrayList<Toys> myToys = new ArrayList<>();
        Toys t1 = new Toys("Mouse paper yarn",2,R.drawable.mousepaperyarn);
        Toys t2 = new Toys("Play Tunnel",3,R.drawable.playtunnel);
        Toys t3 = new Toys("Feather Toy",2,R.drawable.cattoy);
        Toys t4 = new Toys("Catnip Cushion",4,R.drawable.catnipcushion);
        Toys t5 = new Toys("Cheese Chase",3,R.drawable.cheesechase);
        Toys t6 = new Toys("Scratching Toy",5,R.drawable.scratchingtoy);
        Toys t7 = new Toys("Crazy Mouse",8,R.drawable.crazymouse);
        Toys t8 = new Toys("Feather Hider",13,R.drawable.featherhider);
        myToys.add(t1);
        myToys.add(t2);
        myToys.add(t3);
        myToys.add(t4);
        myToys.add(t5);
        myToys.add(t6);
        myToys.add(t7);
        myToys.add(t8);
        RecyclerView rv2 = findViewById(R.id.toysRecyclerView);
        //to organize the recyclerView in the xml
        rv2.setHasFixedSize(true);
        RecyclerView.LayoutManager lm2 = new LinearLayoutManager(this);
        rv2.setLayoutManager(lm2);
        /////////////////////////////
        ToysAdapter adapter2 = new ToysAdapter(myToys,this);
        rv2.setAdapter(adapter2);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////Liter
        ArrayList<Litter> myLitter = new ArrayList<>();
        Litter l8 = new Litter("White Clumping",5,R.drawable.whiteclumping);
        Litter l2 = new Litter("Baby Powder Scented",3,R.drawable.babypowder);
        Litter l3 = new Litter("White Bentonite",5,R.drawable.whitebentonite);
        Litter l4 = new Litter("Lavender Bentonite",5,R.drawable.lavenderbentonite);
        Litter l5 = new Litter("Orange and Lime Litter",3,R.drawable.orangelime);
        Litter l6 = new Litter("Soap Scented",4,R.drawable.soapscented);
        Litter l7 = new Litter("Absorbent White",2,R.drawable.absorbentwhite);
        Litter l1 = new Litter("Fine Super Clump",3,R.drawable.catlitter);
        myLitter.add(l1);
        myLitter.add(l2);
        myLitter.add(l3);
        myLitter.add(l4);
        myLitter.add(l5);
        myLitter.add(l6);
        myLitter.add(l7);
        myLitter.add(l8);
        RecyclerView rv3 = findViewById(R.id.litterRecyclerView);
        //to organize the recyclerView in the xml
        rv3.setHasFixedSize(true);
        RecyclerView.LayoutManager lm3 = new LinearLayoutManager(this);
        rv3.setLayoutManager(lm3);
        /////////////////////////////
        LitterAdapter adapter3 = new LitterAdapter(myLitter,this);
        rv3.setAdapter(adapter3);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////Other
        ArrayList<Other> myOther = new ArrayList<>();
        Other o6 = new Other("Cat Collar",3,R.drawable.catcollar);
        Other o7 = new Other("E-Collar",2,R.drawable.ecollar);
        Other o3 = new Other("Flasher",3,R.drawable.flasher);
        Other o4 = new Other("Electronic Pet Comb",5,R.drawable.electroniccomb);
        Other o5 = new Other("Bett Marino",23,R.drawable.bettmarino);
        Other o1 = new Other("Fenjo Cushion",12,R.drawable.cushion);
        Other o2 = new Other("Lint Roller",5,R.drawable.lintroller);
        Other o8 = new Other("Transport Box",25,R.drawable.transportbox);
        myOther.add(o1);
        myOther.add(o2);
        myOther.add(o3);
        myOther.add(o4);
        myOther.add(o5);
        myOther.add(o6);
        myOther.add(o7);
        myOther.add(o8);
        RecyclerView rv4 = findViewById(R.id.otherRecyclerView);
        //to organize the recyclerView in the xml
        rv4.setHasFixedSize(true);
        RecyclerView.LayoutManager lm4 = new LinearLayoutManager(this);
        rv4.setLayoutManager(lm4);
        /////////////////////////////
        OtherAdapter adapter4 = new OtherAdapter(myOther,this);
        rv4.setAdapter(adapter4);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_paw:
                        Intent intent1 = new Intent(Shop.this, CatInfo1.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_shop:
                        break;

                    case R.id.nav_groom:
                        Intent intent3 = new Intent(Shop.this, Company.class);
                        startActivity(intent3);
                        break;
                }
                return false;
            }
        });

    }

}