package com.stefan.dociconpack;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.jahirfiquitiva.paperboard.activities.MainActivity;


public class HomeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);

        finish();

    }
}