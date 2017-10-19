package com.example.aula7.sqlite.Utilities;

import com.example.aula7.sqlite.Connection.ConnectionSqlite;

import java.security.cert.CRLReason;

/**
 * Created by aula7 on 19/10/17.
 */

public class Utilities {
    public static  String TABLE_users = "users";
    public final static  String TABLE_id = "id";
    public final static  String TABLE_NAME = "name";
    public final static  String TABLE_phone = "phone";

    public  static String CREATE_TABLE = "CREATE TABLE "+TABLE_users +" ("+TABLE_id +" INTEGER, "+TABLE_NAME+" TEXT, "+TABLE_phone+"TEXT)";




}
