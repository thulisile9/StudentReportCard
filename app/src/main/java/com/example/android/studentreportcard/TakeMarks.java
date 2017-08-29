package com.example.android.studentreportcard;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Admin on 8/25/2017.
 */

public class TakeMarks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_marks);

        // Action bar color
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#006064"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

    }




    public void StudentMarks(View view) {

        int myNum = 0;

        Spinner proA = (Spinner) findViewById(R.id.student_name);
        String r1= proA.getSelectedItem().toString();

        MarksHelper helper = new MarksHelper(this);
        Subjects subMarks = helper.createMarks();


        EditText m1 = (EditText) findViewById(R.id.sub1);
        int m1v= -1;
        try {
            myNum = Integer.parseInt(m1.getText().toString());
            m1v = myNum;
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }



        EditText m2 = (EditText) findViewById(R.id.sub2);
        int m2v= -1;
        try {
            myNum =  Integer.parseInt(m2.getText().toString());
            m2v = myNum;
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }


        EditText m3 = (EditText) findViewById(R.id.sub3);
        int m3v= -1;
        try {
            myNum = Integer.parseInt(m3.getText().toString());
            m3v = myNum;
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }

        EditText m4 = (EditText) findViewById(R.id.sub4);
        int m4v= -1;
        try {
            myNum = Integer.parseInt(m4.getText().toString());
            m4v = myNum;
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }



        EditText m5 = (EditText) findViewById(R.id.sub5);
        int m5v= -1;
        try {
            myNum =  Integer.parseInt(m5.getText().toString());
            m5v = myNum;
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }


        EditText m6 = (EditText) findViewById(R.id.sub6);
        int m6v= -1;
        try {
            myNum = Integer.parseInt(m6.getText().toString());
            m6v = myNum;
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }



        if(r1.equals("Siphesihle Khoza")) {


            if(m1v > 100 || m1v < 0 || m1.getText().toString().equals("") )
            {
                Toast.makeText(this,"Enter marks in between 0-100 in subject I.", Toast.LENGTH_LONG).show();
            }

            else if(m2v > 100 || m2v < 0 || m2.getText().toString().equals(""))
            {
                Toast.makeText(this,"Enter marks in between 0-100 in subject II.", Toast.LENGTH_LONG).show();

            }

            else if(m3v > 100 || m3v < 0 || m3.getText().toString().equals(""))
            {
                Toast.makeText(this,"Enter marks in between 0-100 in subject III.", Toast.LENGTH_LONG).show();

            }

            if(m4v > 100 || m4v < 0 || m1.getText().toString().equals("") )
            {
                Toast.makeText(this,"Enter marks in between 0-100 in subject IIII.", Toast.LENGTH_LONG).show();
            }

            else if(m5v > 100 || m5v < 0 || m5.getText().toString().equals(""))
            {
                Toast.makeText(this,"Enter marks in between 0-100 in subject IIIII.", Toast.LENGTH_LONG).show();

            }

            else if(m6v > 100 || m6v < 0 || m3.getText().toString().equals(""))
            {
                Toast.makeText(this,"Enter marks in between 0-100 in subject IIIIII.", Toast.LENGTH_LONG).show();

            }

            else{

                // Save Marks into database
                DBconnection marksB = new DBconnection(this);
                marksB.insert(subMarks);
                marksB.close();
                Toast.makeText(this, "Marks has been awarded to " +r1+ ".", Toast.LENGTH_LONG).show();

            }



        }


        else if(r1.equals("Zanele Malulake")) {

            Toast.makeText(this, "This " +r1+ " has not been registered", Toast.LENGTH_LONG).show();

            // Save Marks into database
            /*DBconnectionC marksC = new DBconnectionC(this);
            marksC.insert(subMarks);
            marksC.close();
            Toast.makeText(this, "Marks has been awarded to " +r1+ ".", Toast.LENGTH_LONG).show();*/
        }



        else if(r1.equals("Shile Nkosi")) {

            if(m1v > 100 || m1v < 0)
            {
                Toast.makeText(this,"Enter marks in between 0-100 in subject I.", Toast.LENGTH_LONG).show();
            }

            else if(m2v > 100 || m2v < 0)
            {
                Toast.makeText(this,"Enter marks in between 0-100 in subject II.", Toast.LENGTH_LONG).show();

            }

            else if(m3v > 100 || m3v < 0)
            {
                Toast.makeText(this,"Enter marks in between 0-100 in subject III.", Toast.LENGTH_LONG).show();

            }

            else {

                // Save Marks into database
                DBconnection marks = new DBconnection(this);
                marks.insert(subMarks);
                marks.close();
                Toast.makeText(this, "Marks has been awarded to " +r1+ ".", Toast.LENGTH_LONG).show();
            }


        }

        else  if(r1.equals("Thulisile Khoza")) {

            Toast.makeText(this, "This " +r1+ " has not been registered.", Toast.LENGTH_LONG).show();

            // Save Marks into database
            /*DBconnectionA marksA = new DBconnectionA(this);
            marksA.insert(subMarks);
            marksA.close();
            Toast.makeText(this, "Marks has been awarded to " +r1+ ".", Toast.LENGTH_LONG).show();*/
        }

        else  if(r1.equals("Thabo Moloi")) {

            Toast.makeText(this, "This " +r1+ " has not been registered.", Toast.LENGTH_LONG).show();

            // Save Marks into database
            /*DBconnectionA marksA = new DBconnectionA(this);
            marksA.insert(subMarks);
            marksA.close();
            Toast.makeText(this, "Marks has been awarded to " +r1+ ".", Toast.LENGTH_LONG).show();*/
        }

        else  if(r1.equals("Lerato Nkosi")) {

            Toast.makeText(this, "This " +r1+ " has not been registered.", Toast.LENGTH_LONG).show();

            // Save Marks into database
            /*DBconnectionA marksA = new DBconnectionA(this);
            marksA.insert(subMarks);
            marksA.close();
            Toast.makeText(this, "Marks has been awarded to " +r1+ ".", Toast.LENGTH_LONG).show();*/
        }




        else
        {
            Toast.makeText(this, "Permission denied", Toast.LENGTH_LONG).show();
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
    }}

