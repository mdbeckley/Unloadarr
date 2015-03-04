package com.unloadarr.unloadarr;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class aboutUsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        final Button mCheckAbButton = (Button) findViewById(R.id.aboutGoBackMenuButton);
        mCheckAbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(aboutUsActivity.this, menuActivity.class);
                aboutUsActivity.this.startActivity(activityChangeIntent);
            }
        });





        final Button mMenuExitButton = (Button) findViewById(R.id.exitAboutUsButton);
        mMenuExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                System.exit(0);
            }
        });


    }



}
