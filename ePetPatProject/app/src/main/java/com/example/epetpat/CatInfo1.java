package com.example.epetpat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class CatInfo1 extends AppCompatActivity {
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_info1);

        ////
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
         bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                 switch (item.getItemId()){
                     case R.id.nav_paw:
                         break;

                     case R.id.nav_shop:
                         Intent intent2 = new Intent(CatInfo1.this, Shop.class);
                         startActivity(intent2);
                         break;

                     case R.id.nav_groom:
                         Intent intent3 = new Intent(CatInfo1.this, Company.class);
                         startActivity(intent3);
                         break;
                 }
                 return false;
             }
         });

        //////////////////////////////////////////////////////////////////////////////////////
        final Button catOnOff = findViewById(R.id.catOnOff);
        final ImageView catOn = findViewById(R.id.catOn);
        final ImageView catOff = findViewById(R.id.catOff);
        final RecyclerView woolinfo = findViewById(R.id.VideoRecyclerView);

        final Button woolOnOff = findViewById(R.id.woolOnOff);
        final ImageView woolOn = findViewById(R.id.woolOn);
        final ImageView woolOff = findViewById(R.id.woolOff);
        final RecyclerView catinfo = findViewById(R.id.CatRecyclerView);

        catOff.setVisibility(View.INVISIBLE);
        catOn.setVisibility(View.VISIBLE);
        woolinfo.setVisibility(View.INVISIBLE);

        woolOff.setVisibility(View.VISIBLE);
        woolOn.setVisibility(View.INVISIBLE);
        catinfo.setVisibility(View.VISIBLE);


        catOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catOff.setVisibility(View.INVISIBLE);
                catOn.setVisibility(View.VISIBLE);
                woolinfo.setVisibility(View.INVISIBLE);
                catinfo.setVisibility(View.VISIBLE);
                woolOff.setVisibility(View.VISIBLE);
                woolOn.setVisibility(View.INVISIBLE);

            }
        });

        woolOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catOff.setVisibility(View.VISIBLE);
                catOn.setVisibility(View.INVISIBLE);
                woolinfo.setVisibility(View.VISIBLE);
                catinfo.setVisibility(View.INVISIBLE);
                woolOff.setVisibility(View.INVISIBLE);
                woolOn.setVisibility(View.VISIBLE);

            }
        });
        //////////////////////////////////

        ArrayList<cats> myCats = new ArrayList<>();
        cats c1 = new cats(R.drawable.exoticshorthair,"Exotic Shorthair","It is a breed of cat developed as a short-haired version of the Persian. The Exotic is similar to the Persian in many ways, including temperament and conformation, a flat nose and face with the exceptions of the short dense coat.");
        cats c2 = new cats(R.drawable.balinesecat,"Balinese cat","The Balinese is a long-haired breed of domestic cat with Siamese-style point coloration and sapphire-blue eyes.");
        cats c3 = new cats(R.drawable.persiancat,"Persian cat","It is a long-haired breed of cat characterized by its round face and short muzzle. It is also known as the Persian Longhair in the English-speaking countries. The first documented ancestors of the Persian were imported into Italy from Iran around 1620.");
        cats c4 = new cats(R.drawable.bengalcat,"Bengal cat","It is a domesticated cat breed created from hybrids of domestic cats, especially the spotted Egyptian Mau, with the Asian leopard cat. The breed name comes from the leopard cat's taxonomic name.");
        cats c5 = new cats(R.drawable.siamesecat,"Siamese cat","It cat is one of the first distinctly recognized breeds of Asian cat. Derived from the Wichianmat landrace, one of several varieties of cat native to Thailand, the original Siamese became one of the most popular breeds in Europe and North America in the 19th century.");
        cats c6 = new cats(R.drawable.scottishfoldd,"Scottish Fold","It is a breed of domestic cat with a natural dominant-gene mutation that affects cartilage throughout the body, causing the ears to fold, bending forward and down towards the front of the head, which gives the cat what is often described as an owl-like appearance.");
        cats c7 = new cats(R.drawable.turkishangora,"Turkish Angora","They are one of the ancient, natural breeds of cat, having originated in central Turkey, in the Ankara region. The breed has been documented as early as the 17th century and is believed to be the origin of the mutations for both the color white and long hair.");
        cats c8 = new cats(R.drawable.sphynxcat,"Sphynx cat","It is known for its lack of coat. Hairlessness in cats is a naturally occurring genetic mutation; however, the Sphynx cat, as a breed, was developed through selective breeding, starting in the 1960s.");
        myCats.add(c1);
        myCats.add(c2);
        myCats.add(c3);
        myCats.add(c4);
        myCats.add(c5);
        myCats.add(c6);
        myCats.add(c7);
        myCats.add(c8);

        RecyclerView rv = findViewById(R.id.CatRecyclerView);
        //to organize the recyclerView in the xml
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(lm);
        ///////////////////////////////////

        CatAdapter adapter = new CatAdapter(myCats,this);
        rv.setAdapter(adapter);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        ArrayList<Video> myVideo = new ArrayList<>();
        Video v1 = new Video("Welcoming a Cat","android.resource://"+ getPackageName() + "/" + R.raw.howtocareforyournewcat);
        Video v2 = new Video("What Cats Love","android.resource://"+ getPackageName() + "/" + R.raw.whatcatslove);
        Video v3 = new Video("What Cats Hate","android.resource://"+ getPackageName() + "/" + R.raw.whatcatshate);
        Video v4 = new Video("Bathing a Cat","android.resource://"+ getPackageName() + "/" + R.raw.bathingacat);
        Video v5 = new Video("Eye Cleaning","android.resource://"+ getPackageName() + "/" + R.raw.eyescleaning);
        Video v6 = new Video("Nail Trimming","android.resource://"+ getPackageName() + "/" + R.raw.nailtrimming);
        Video v7 = new Video("Training Cats","android.resource://"+ getPackageName() + "/" + R.raw.trainingcats);
        Video v8 = new Video("Train Cat To Use Litter Box","android.resource://"+ getPackageName() + "/" + R.raw.traincattouselitterbox);
        myVideo.add(v1);
        myVideo.add(v2);
        myVideo.add(v3);
        myVideo.add(v4);
        myVideo.add(v5);
        myVideo.add(v6);
        myVideo.add(v7);
        myVideo.add(v8);
        RecyclerView rv2 = findViewById(R.id.VideoRecyclerView);
        //to organize the recyclerView in the xml
        rv2.setHasFixedSize(true);
        RecyclerView.LayoutManager lm2 = new LinearLayoutManager(this);
        rv2.setLayoutManager(lm2);
        //
        VideoAdapter adapter2 = new VideoAdapter(myVideo,this);
        rv2.setAdapter(adapter2);
        ///////////////////////////////////////////////////////////////////////////////////////
        Button btnLogout = findViewById(R.id.logout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToLogin = new Intent(CatInfo1.this,Login.class);
                startActivity(intToLogin);
            }
        });

    }

}