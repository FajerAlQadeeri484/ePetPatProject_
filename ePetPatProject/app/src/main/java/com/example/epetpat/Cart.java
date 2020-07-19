package com.example.epetpat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {
    ArrayList<CartClass> myCart = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        //Bundle bundle = getIntent().getExtras();
        //ArrayList<CartClass> arrayList = (ArrayList<CartClass>) bundle.getSerializable("theCart");


        /*Bundle cartt = getIntent().getExtras();
        ArrayList<String>arrayList=cartt.getStringArrayList("added");

        ListView listView = findViewById(R.id.listview);
        ArrayAdapter<String> items = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(items);*/


        /////////////////////////////////////////////////////////////////
        //ArrayList<CartClass> myCart = new ArrayList<>();
        //CartClass c1 = new CartClass(f.getFoodName(),f.getPrice(),f.getFoodimg());
        //myCart.add(c1);

        /*RecyclerView cartRv = findViewById(R.id.cartRv);
        //to organize the recyclerView in the xml
        cartRv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        cartRv.setLayoutManager(lm);
        /////////////////////////////
        CartAdapter adapter = new CartAdapter(myCart,this);
        cartRv.setAdapter(adapter);*/

    }
    /*public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        //Gson gson = new Gson();
        //String json = gson.toJson(myCart);
        //editor.putString("item name", json);
        editor.putString("name","food");
        editor.putInt("price","")
    }*/
}