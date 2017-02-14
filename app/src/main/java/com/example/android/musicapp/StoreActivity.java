package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        // Declare ImageView for NavBar
        ImageView homeButton = (ImageView) findViewById(R.id.home);
        ImageView libraryButton = (ImageView) findViewById(R.id.library);
        ImageView radioButton = (ImageView) findViewById(R.id.radio);

        // Set onClickListeners for NavBar icons

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHome = new Intent(StoreActivity.this, MainActivity.class);
                startActivity(goHome);
            }
        });

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLibrary = new Intent(StoreActivity.this, LibraryActivity.class);
                startActivity(goLibrary);
            }
        });

        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goRadio = new Intent(StoreActivity.this, RadioActivity.class);
                startActivity(goRadio);
            }
        });
    }
}
