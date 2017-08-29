package com.example.android.studentreportcard;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Admin on 8/24/2017.
 */

public class Marks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_marks);

        /*getSupportActionBar().hide();*/ // Hide Action bar

        // Action bar color
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#006064"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);


        // subject 1 marks retrieving
        DBconnection db= new DBconnection(this);
        String s1 = db.subjectI();
        String s2 = db.subjectII();
        String s3 = db.subjectIII();
        String s4 = db.subjectIIII();
        String s5 = db.subjectIIIII();
        String s6 = db.subjectIIIIII();
        int total= db.total();
        float percent=db.percent();
        db.close();

        // Set textview
        TextView f1= (TextView) findViewById(R.id.s1);
        f1.setText(s1);

        TextView f2= (TextView) findViewById(R.id.s2);
        f2.setText(s2);

        TextView f3= (TextView) findViewById(R.id.s3);
        f3.setText(s3);

        TextView f4= (TextView) findViewById(R.id.s4);
        f4.setText(s4);

        TextView f5= (TextView) findViewById(R.id.s5);
        f5.setText(s5);

        TextView f6= (TextView) findViewById(R.id.s6);
        f6.setText(s6);


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
