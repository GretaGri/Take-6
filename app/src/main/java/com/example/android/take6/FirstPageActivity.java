package com.example.android.take6;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by Greta on 2018-02-03.
 */

public class FirstPageActivity extends CustomToast {
    RadioButton twoPlayers, threePlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        twoPlayers = findViewById(R.id.twoPlayers);
        threePlayers = findViewById(R.id.threePlayers);

    }

    public void gameStart (View View) {
        if (twoPlayers.isChecked()) {Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);}
        else if (threePlayers.isChecked()) {Intent intent = new Intent(this, MainActivityTen.class);
        this.startActivity(intent);}
        else {
            toast("Please, select game.");
        }

    }
    // this is to create the menu bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    // this is to create the different parts of the menu bar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about_application:
                Intent intent1 = new Intent(this, AboutApplication.class);
                this.startActivity(intent1);
                return true;
            case R.id.quiz:
                Intent intent2 = new Intent(this, HowToPlay.class);
                this.startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
