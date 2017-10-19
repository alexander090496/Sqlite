package com.example.aula7.sqlite;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aula7.sqlite.Connection.ConnectionSqlite;
import com.example.aula7.sqlite.Utilities.Utilities;

public class Main2Activity2 extends AppCompatActivity {

    Button button;
    EditText editText1,editText2,editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        button =(Button) findViewById(R.id.btn1r);

        Button buttonre = (Button) findViewById(R.id.btn2r);
        EditText editText1 = (EditText) findViewById(R.id.e1);
        EditText editText2 = (EditText) findViewById(R.id.e2);
        EditText editText3 = (EditText) findViewById(R.id.e3);

    }

    public void regresar(View view){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void onClickRegister (View v){
        registeruser();


    }

    public void registeruser(){

        ConnectionSqlite connectionSqlite = new ConnectionSqlite( this,"bd_user",null,1);
        SQLiteDatabase db =connectionSqlite.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Utilities.TABLE_id,editText1.getText().toString());
        values.put(Utilities.TABLE_NAME,editText2.getText().toString());
        values.put(Utilities.TABLE_phone,editText3.getText().toString());

        Long idresult= db.insert(Utilities.TABLE_users,Utilities.TABLE_id,values);

        Toast.makeText(this,"Registro numero :"+idresult,Toast.LENGTH_SHORT).show();

    }
}
