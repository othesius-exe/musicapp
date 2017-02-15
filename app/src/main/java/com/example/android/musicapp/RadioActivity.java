package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        // Adds the toolbar to the top of the screen
        android.support.v7.widget.Toolbar toolBar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        toolBar.showOverflowMenu();

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

    // Menu functions
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    // Click events for each menu item
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.about:
                Intent aboutPage = new Intent(RadioActivity.this, AboutActivity.class);
                startActivity(aboutPage);
                break;
            case R.id.settings:
                Intent settingsPage = new Intent(RadioActivity.this, SettingsActivity.class);
                startActivity(settingsPage);
                break;
            case R.id.home:
                Intent homePage = new Intent(RadioActivity.this, MainActivity.class);
                startActivity(homePage);
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
