package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        // Declare ImageView for NavBar
        ImageView homeButton = (ImageView) findViewById(R.id.home);
        ImageView libraryButton = (ImageView) findViewById(R.id.library);
        ImageView storeButton = (ImageView) findViewById(R.id.store);

        // Set onClickListeners for NavBar icons

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goHome = new Intent(RadioActivity.this, MainActivity.class);
                startActivity(goHome);
            }
        });

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLibrary = new Intent(RadioActivity.this, LibraryActivity.class);
                startActivity(goLibrary);
            }
        });

        storeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goStore = new Intent(RadioActivity.this, StoreActivity.class);
                startActivity(goStore);
            }
        });
    }
}
