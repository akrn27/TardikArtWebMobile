package com.example.tardikart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    Button btnLogOut;
    FirebaseAuth mAuth;

    TextView nameuser, walletuser, creation, news, mywork, contactus, mainmenus, pagetitle, pagesubtitle;

    //This is for directed to another page when click the icon
    private LinearLayout newsicon, myworkicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        mAuth = FirebaseAuth.getInstance();

        nameuser = findViewById(R.id.nameuser);
        walletuser = findViewById(R.id.walletuser);

        creation = findViewById(R.id.creation);
        news = findViewById(R.id.news);
        mywork = findViewById(R.id.mywork);
        contactus = findViewById(R.id.contactus);
        mainmenus = findViewById(R.id.mainmenus);

        pagetitle = findViewById(R.id.pagetitle);
        pagesubtitle = findViewById(R.id.pagesubtitle);

        //This is to go to another page with icon to NewsPage
        newsicon = findViewById(R.id.newsicon);
        newsicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewsPage();
            }
        });

        //This is to go to another page with icon to MyWorkPage
        myworkicon = findViewById(R.id.myworkicon);
        myworkicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyImage();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        FirebaseUser user= mAuth.getCurrentUser();
        if (user == null){
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        }
    }

    //for newspage
    public void openNewsPage(){
        Intent intent = new Intent(this, NewsPage.class);
        startActivity(intent);
    }
    //for myimage page
    public void openMyImage(){
        Intent intent = new Intent(this, MyImage.class);
        startActivity(intent);
    }
}