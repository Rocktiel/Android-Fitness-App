package com.example.mobilprogramlamaproje;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    Intent i;
    SQLiteDatabase db;

    Button signin;
    EditText Name,Password;
    TextView signup;
    String name,password;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signup =findViewById(R.id.signup);
        signin=findViewById(R.id.signin);

        Name=findViewById(R.id.name);
        Password=findViewById(R.id.password);
        String gfhgfhj=signup.getText().toString();

        try
        {

            db=this.openOrCreateDatabase("Denemee",MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS denemeusers (id INTEGER PRIMARY KEY ,username VARCHAR, name VARCHAR, surname VARCHAR, password VARCHAR, age VARCHAR, weight VARCHAR, height VARCHAR,image VARCHAR )");
        }catch(Exception e){
            e.printStackTrace();
        }



        signup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),Kayit_Olma.class);
                startActivity(intent);
            }
        });

        signin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                name=Name.getText().toString();
                password=Password.getText().toString();
                if(name.length()==0 || password.length()==0){


                    Toast.makeText(MainActivity.this, "Boş olamaz.", Toast.LENGTH_SHORT).show();
                }else{
                    int aa=1;
                    Cursor cursor=db.rawQuery("SELECT * FROM denemeusers ",null);
                    int usernameIndex=cursor.getColumnIndex("username");
                    int passwordIndex=cursor.getColumnIndex("password");


                    while(cursor.moveToNext()) {
                        String a = cursor.getString(usernameIndex);
                        String b = cursor.getString(passwordIndex);

                        if(name.equals(a) && password.equals(b) )
                        {
                            aa=0;
                            i=new Intent(MainActivity.this,MainActivity2.class);
                            i.putExtra("nickname",a);
                            startActivity(i);
                            finish();
                            break;

                        }
                    }
                    if(aa==1){
                        Toast.makeText(MainActivity.this, "Hata", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        new AlertDialog.Builder(this).setMessage("Are you sure want to exit ?").setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        finish();
                    }
                }).setNegativeButton("No",null).show();

        super.onBackPressed();
    }
}