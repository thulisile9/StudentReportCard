package com.example.android.studentreportcard;

import android.app.Activity;
import android.widget.EditText;

/**
 * Created by Admin on 8/25/2017.
 */

public class MarksHelper {

    private final Activity activity;

    public MarksHelper(Activity activity){
        this.activity= activity;
    }


    private String getTextFieldValue(int fieldID ) {

        EditText field= (EditText) activity.findViewById(fieldID);
        String value= field.getText().toString();
        return value;
    }



    public String getSub1() {

        return getTextFieldValue(R.id.sub1);

    }

    public String getSub2(){

        return getTextFieldValue(R.id.sub2);
    }


    public String getSub3(){

        return getTextFieldValue(R.id.sub3);
    }

            public String getSub4(){

            return getTextFieldValue(R.id.sub4);

        }



        public String getSub5(){

            return getTextFieldValue(R.id.sub5);
        }


        public String getSub6(){

            return getTextFieldValue(R.id.sub6);
        }


    public Subjects createMarks() {

        return new Subjects(getSub1(), getSub2(), getSub3(),getSub4(),getSub5(),getSub6());
    }
}