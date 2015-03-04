package com.unloadarr.unloadarr;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class menuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //

        final Button mAboutButton = (Button) findViewById(R.id.aboutUsButton);
        mAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //still need to fix second parameter argument to activity that needs to be coded

                Intent activityChangeIntent = new Intent(menuActivity.this, aboutUsActivity.class);
                menuActivity.this.startActivity(activityChangeIntent);
            }
        });

        final Button mCheckAbButton = (Button) findViewById(R.id.checkAbButton);
        mCheckAbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(menuActivity.this, checkDateActivity.class);
                menuActivity.this.startActivity(activityChangeIntent);
            }
        });

        final Button mEnterDateButton = (Button) findViewById(R.id.enterDateButton);
        mEnterDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //still need to fix second parameter argument to activity that needs to be coded

                Intent activityChangeIntent = new Intent(menuActivity.this, enterDateActivity.class);
                menuActivity.this.startActivity(activityChangeIntent);
            }
        });

        final Button mViewDateButton = (Button) findViewById(R.id.viewDateButton);
        mViewDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //still need to fix second parameter argument to activity that needs to be coded

                Intent activityChangeIntent = new Intent(menuActivity.this, viewDatesActivity.class);
                menuActivity.this.startActivity(activityChangeIntent);
            }
        });

        final Button mMenuExitButton = (Button) findViewById(R.id.exitMenuButton);
        mMenuExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                        System.exit(0);
            }
        });

        //

    }
}
