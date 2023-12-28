package com.example.a7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(Context context) {
        super(context, "databaseName", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE TODO (" +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "TITLE TEXT, CONTENT TEXT, DATE TEXT, TYPE TEXT, STATUS INTEGER)";

        db.execSQL(sql);

        String data = "INSERT INTO TODO VALUES(0, 'Học Java', 'Học Java cơ bản','27/02/2023','Bình thường', 1), " +
                "(1, 'Học React Native', 'Học React Native cơ bản','27/04/2023','Dễ', 0), " +
                "(2, 'Học Kotlin', 'Học Kotlin cơ bản','28/05/2018','Khó', 0)";


        db.execSQL(data);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(oldVersion != newVersion) {
            db.execSQL("DROP TABLE IF EXISTS TODO");
            onCreate(db);
        }
    }

}
