package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Adds the toolbar to the top of the screen
        android.support.v7.widget.Toolbar toolBar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        toolBar.showOverflowMenu();
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
                Intent aboutPage = new Intent(AboutActivity.this, AboutActivity.class);
                startActivity(aboutPage);
                break;
            case R.id.settings:
                Intent settingsPage = new Intent(AboutActivity.this, SettingsActivity.class);
                startActivity(settingsPage);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
