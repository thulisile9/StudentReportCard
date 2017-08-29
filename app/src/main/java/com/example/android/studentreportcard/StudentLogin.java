package com.example.android.studentreportcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Admin on 8/23/2017.
 */

public class StudentLogin extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        getSupportActionBar().hide(); // Hide Action bar
    }


    public void loginStudent(View view) {

        EditText StudentName = (EditText) findViewById(R.id.student_username);
        EditText StudentPassword = (EditText) findViewById(R.id.student_password);


        /*PROFILE  */
        if(StudentName.getText().toString().equals("bonang") && StudentPassword.getText().toString().equals("bonang"))
        {
            Intent i = new Intent(this, StudentproA.class);
            startActivity(i);
        }



        /*PROFILE  */
        else if(StudentName.getText().toString().equals("12r01a05a3") && StudentPassword.getText().toString().equals("5a3"))
        {
            Intent i = new Intent(this, StudentproA.class);
            startActivity(i);
        }

        /*PROFILE  */
        else if(StudentName.getText().toString().equals("12r01a05a7") && StudentPassword.getText().toString().equals("5a7"))
        {
            Intent i = new Intent(this, StudentproA.class);
            startActivity(i);
        }


        else
        {
            Toast.makeText(this,"Wrong Username or Password!", Toast.LENGTH_LONG).show();

        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_student_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}