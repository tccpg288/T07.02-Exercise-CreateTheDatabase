package com.example.android.waitlist.data;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// TODO (1) extend the SQLiteOpenHelper class
public class WaitlistDbHelper extends SQLiteOpenHelper {


    public WaitlistDbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public WaitlistDbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    // TODO (2) Create a static final String called DATABASE_NAME and set it to "waitlist.db"

    // TODO (3) Create a static final int called DATABASE_VERSION and set it to 1

    // TODO (4) Create a Constructor that takes a context and calls the parent constructor

    // TODO (5) Override the onCreate method

        // TODO (6) Inside, create an String query called SQL_CREATE_WAITLIST_TABLE that will create the table

        // TODO (7) Execute the query by calling execSQL on sqLiteDatabase and pass the string query SQL_CREATE_WAITLIST_TABLE

    // TODO (8) Override the onUpgrade method

        // TODO (9) Inside, execute a drop table query, and then call onCreate to re-create it

}