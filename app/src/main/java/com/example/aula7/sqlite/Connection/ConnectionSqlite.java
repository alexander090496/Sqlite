package com.example.aula7.sqlite.Connection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aula7 on 19/10/17.
 */

public class ConnectionSqlite extends SQLiteOpenHelper {
    //sirve para manejar la creacion actulizacion de bd en local esta clase tiene 2 metodos
    //principales


    public ConnectionSqlite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //sirve apra crear la configuracion de la bd
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        //versionar la bd


    }






}
