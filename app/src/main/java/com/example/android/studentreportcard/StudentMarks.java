package com.example.android.studentreportcard;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import static android.R.attr.y;

/**
 * Created by Admin on 8/23/2017.
 */

public class StudentMarks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_marks);

        // Action bar color
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#006064"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

    }

    public void StudentMarks(View view) {


        Spinner studentname = (Spinner) findViewById(R.id.marksYear);
        String f1= studentname.getSelectedItem().toString();

        Spinner grade = (Spinner) findViewById(R.id.marksSem);
        String f2= grade.getSelectedItem().toString();

        Spinner gender = (Spinner) findViewById(R.id.marksBranch);
        String f3= gender.getSelectedItem().toString();






        if(f1.equals("Siphesihle Khoza")&& f2.equals("10") && f3.equals("Female") )
        {

            Intent i = new Intent(this, TakeMarks.class);
            startActivity(i);


        }

        else {

            Toast.makeText(this, "Permission Denied", Toast.LENGTH_LONG).show();
        }

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