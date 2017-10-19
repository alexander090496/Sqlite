package com.example.aula7.sqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Connection;
import android.view.View;

import com.example.aula7.sqlite.Connection.ConnectionSqlite;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectionSqlite connectionSqlite= new ConnectionSqlite(this,"bd_users",null, 1);

    }

    public void ingresar(View view){
        Intent intent= new Intent(this,Main2Activity2.class);
        startActivity(intent);
    }



}
