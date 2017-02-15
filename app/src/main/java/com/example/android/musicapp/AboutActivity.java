package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Adds the toolbar to the top of the screen
        android.support.v7.widget.Toolbar toolBar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        toolBar.showOverflowMenu();

        // Sets the text for the page
        TextView aboutText = (TextView) findViewById(R.id.about);
        aboutText.setText(Html.fromHtml(getString(R.string.about_text)));

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
            case R.id.home:
                Intent homePage = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(homePage);
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
