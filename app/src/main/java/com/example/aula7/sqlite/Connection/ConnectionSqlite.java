package com.example.aula7.sqlite.Connection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.aula7.sqlite.Utilities.Utilities;

/**
 * Created by aula7 on 19/10/17.
 */

public class ConnectionSqlite extends SQLiteOpenHelper {
    //sirve para manejar la creacion actulizacion de bd en local esta clase tiene 2 metodos
    //principales

    //final String CREATE_TABLE = "CREATE TABLE usarios (id INTEGER, name TEXT, phone TEXT)";

    public ConnectionSqlite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

        //string name nombre de la bd
        //se utiliza para hacer persistencia
        //int es la version de la base de datos

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //sirve apra crear la configuracion de la bd

        db.execSQL(Utilities.CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        //versionar la bd

        db.execSQL("DROP TABLE IF EXIST usuarios"+Utilities.TABLE_users);
        onCreate(db);


    }






}
