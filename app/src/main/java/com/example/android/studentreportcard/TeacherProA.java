package com.example.android.studentreportcard;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Admin on 8/23/2017.
 */

public class TeacherProA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacherpro_a);


        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#006064"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);


    }

    public void Student(View view) {

        Intent i = new Intent(this,StudentMarks.class);
        startActivity(i);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 1, 0, "logout").setIcon(R.drawable.logout)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Intent intent = new Intent(this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);

                return true;
            default:
                return false;
        }
    }



}