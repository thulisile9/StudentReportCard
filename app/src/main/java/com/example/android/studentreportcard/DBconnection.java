package com.example.android.studentreportcard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Admin on 8/25/2017.
 */

public class DBconnection extends SQLiteOpenHelper {


    public DBconnection(Context context) {
        super(context, "MDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql="CREATE TABLE marks (sub1 NUMBER, sub2 NUMBER, sub3 NUMBER,sub4 NUMBER, sub5 NUMBER, sub6 NUMBER);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    /* ###################### DB Profile 1 ################################### */

    public void insert(Subjects subMarks) {

        ContentValues data= new ContentValues();
        data.put("sub1", subMarks.getSub1());
        data.put("sub2", subMarks.getSub2());
        data.put("sub3", subMarks.getSub3());
        data.put("sub4", subMarks.getSub4());
        data.put("sub5", subMarks.getSub5());
        data.put("sub6", subMarks.getSub6());

        SQLiteDatabase database= getWritableDatabase();
        database.insert("marks", null, data);
    }

    public String subjectI() {

        String sub1= "";
        SQLiteDatabase database= getReadableDatabase();
        Cursor cursor= database.rawQuery("SELECT sub1 FROM marks;", null);

        while (cursor.moveToNext()) {
            String s1= cursor.getString(cursor.getColumnIndex("sub1"));
            sub1 = s1;
        }
        return sub1;
    }


    public String subjectII() {

        String sub2= "";
        SQLiteDatabase database= getReadableDatabase();
        Cursor cursor= database.rawQuery("SELECT sub2 FROM marks;", null);

        while (cursor.moveToNext()) {
            String s2= cursor.getString(cursor.getColumnIndex("sub2"));
            sub2 = s2;
        }
        return sub2;
    }

    public String subjectIII() {

        String sub3= "";
        SQLiteDatabase database= getReadableDatabase();
        Cursor cursor= database.rawQuery("SELECT sub3 FROM marks;", null);

        while (cursor.moveToNext()) {
            String s3= cursor.getString(cursor.getColumnIndex("sub3"));
            sub3 = s3;
        }
        return sub3;

    }
    public String subjectIIII() {

        String sub4= "";
        SQLiteDatabase database= getReadableDatabase();
        Cursor cursor= database.rawQuery("SELECT sub4 FROM marks;", null);

        while (cursor.moveToNext()) {
            String s4= cursor.getString(cursor.getColumnIndex("sub4"));
            sub4 = s4;
        }
        return sub4;

    }
    public String subjectIIIII() {

        String sub5= "";
        SQLiteDatabase database= getReadableDatabase();
        Cursor cursor= database.rawQuery("SELECT sub5 FROM marks;", null);

        while (cursor.moveToNext()) {
            String s5= cursor.getString(cursor.getColumnIndex("sub5"));
            sub5 = s5;
        }
        return sub5;

    }
    public String subjectIIIIII() {

        String sub6= "";
        SQLiteDatabase database= getReadableDatabase();
        Cursor cursor= database.rawQuery("SELECT sub6 FROM marks;", null);

        while (cursor.moveToNext()) {
            String s6= cursor.getString(cursor.getColumnIndex("sub6"));
            sub6 = s6;
        }
        return sub6;

    }

    public int total() {

        int ttl= 0;
        SQLiteDatabase database= getReadableDatabase();
        Cursor cursor= database.rawQuery("SELECT * FROM marks;", null);

        while (cursor.moveToNext()) {
            int s1= cursor.getInt(cursor.getColumnIndex("sub1"));
            int s2= cursor.getInt(cursor.getColumnIndex("sub2"));
            int s3= cursor.getInt(cursor.getColumnIndex("sub3"));
            int s4= cursor.getInt(cursor.getColumnIndex("sub4"));
            int s5= cursor.getInt(cursor.getColumnIndex("sub5"));
            int s6= cursor.getInt(cursor.getColumnIndex("sub6"));
            ttl = s1+s2+s3+s4+s5+s6;
        }
        return ttl;

    }


    public float percent() {
        float tot = total();
        float mx = 75f;
        return (tot / mx) * 100;
    }
    /* ###################### DB Profile 1 ENDS ################################### */




}