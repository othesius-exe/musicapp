package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // Declare ImageView for NavBar
        ImageView homeButton = (ImageView) findViewById(R.id.home);
        ImageView radioButton = (ImageView) findViewById(R.id.radio);
        ImageView storeButton = (ImageView) findViewById(R.id.store);

        // Set onClickListeners for NavBar icons

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHome = new Intent(LibraryActivity.this, MainActivity.class);
                startActivity(goHome);
            }
        });

        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goRadio = new Intent(LibraryActivity.this, RadioActivity.class);
                startActivity(goRadio);
            }
        });

        storeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goStore = new Intent(LibraryActivity.this, StoreActivity.class);
                startActivity(goStore);
            }
        });
    }
}
