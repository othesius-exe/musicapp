package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare ImageView for NavBar
        ImageView libraryButton = (ImageView) findViewById(R.id.library);
        ImageView radioButton = (ImageView) findViewById(R.id.radio);
        ImageView storeButton = (ImageView) findViewById(R.id.store);

        // Set onClickListeners for NavBar icons

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLibrary = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(goLibrary);
            }
        });

        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goRadio = new Intent(MainActivity.this, RadioActivity.class);
                startActivity(goRadio);
            }
        });

        storeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goStore = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(goStore);
            }
        });

    }
}
