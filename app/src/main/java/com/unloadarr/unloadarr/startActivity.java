package com.unloadarr.unloadarr;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class startActivity extends ActionBarActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

    final Button mStartButton = (Button) findViewById(R.id.startButton);
    mStartButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent activityChangeIntent = new Intent(startActivity.this, menuActivity.class);
            startActivity.this.startActivity(activityChangeIntent);
        }
    });


    }




}
