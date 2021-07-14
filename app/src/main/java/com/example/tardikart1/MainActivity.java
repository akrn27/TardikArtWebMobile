package com.example.tardikart1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nameuser, walletuser, creation, news, mywork, contactus, mainmenus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameuser = findViewById(R.id.nameuser);
        walletuser = findViewById(R.id.walletuser);

        creation = findViewById(R.id.creation);
        news = findViewById(R.id.news);
        mywork = findViewById(R.id.mywork);
        contactus = findViewById(R.id.contactus);
        mainmenus = findViewById(R.id.mainmenus);
    }
}