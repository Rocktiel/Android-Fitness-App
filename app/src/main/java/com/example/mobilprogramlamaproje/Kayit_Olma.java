package com.example.mobilprogramlamaproje;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.service.controls.actions.FloatAction;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Kayit_Olma extends AppCompatActivity
{
    SQLiteDatabase db;
    Spinner agee,heightt,weightt;
    ArrayAdapter<Integer> adapter,adapter1,adapter2;
    ArrayList<Integer> agelist,weightlist,heightlist;
    String age,height,weight,username2,name2,surname2,password2,age2,height2,weight2,username3,name3,surname3,password3;
    EditText usernamee,namee,surnamee,passwordd;
    Button signupp;
    ImageView  imageView;
    FloatingActionButton floatAction;
    Uri uri;

    String imageInByte;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit_olma);
        imageView=findViewById(R.id.resim);
        floatAction=findViewById(R.id.resimekleme);
        usernamee=findViewById(R.id.username);
        namee=findViewById(R.id.name);
        surnamee=findViewById(R.id.surname);
        passwordd=findViewById(R.id.password);
        signupp=findViewById(R.id.signup);
        agee=findViewById(R.id.age);
        heightt=findViewById(R.id.height);
        weightt=findViewById(R.id.weight);

        try{

            db=this.openOrCreateDatabase("Denemee",MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS denemeusers (id INTEGER PRIMARY KEY ,username VARCHAR, name VARCHAR, surname VARCHAR, password VARCHAR, age VARCHAR, weight VARCHAR, height VARCHAR,image VARCHAR )");
        }catch(Exception e){
            e.printStackTrace();
        }

        signupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int countt=1;


                username3=usernamee.getText().toString();
                name3=namee.getText().toString();
                surname3=surnamee.getText().toString();
                password3=passwordd.getText().toString();
                if(uri==null){
                    Toast.makeText(Kayit_Olma.this, "Resim seçiniz.", Toast.LENGTH_SHORT).show();
                }else{
                    imageInByte=uri.toString();
                    if(username3.length()==0 || name3.length()==0 || surname3.length()==0 || password3.length()==0 ){
                        Toast.makeText(Kayit_Olma.this, "Lütfen boş olan bilgileri doldurun.", Toast.LENGTH_SHORT).show();
                    }else{

                        Cursor cursor=db.rawQuery("SELECT * FROM denemeusers WHERE username='"+username3+"' ",null);
                        int usernameIndex=cursor.getColumnIndex("username");
                /*int nameIndex=cursor.getColumnIndex("name");
                int surnameIndex=cursor.getColumnIndex("surname");
                int passwordIndex=cursor.getColumnIndex("password");
                int ageIndex=cursor.getColumnIndex("age");
                int weightIndex=cursor.getColumnIndex("weight");
                int heightIndex=cursor.getColumnIndex("height");*/

                        while(cursor.moveToNext()) {
                            username2 = cursor.getString(usernameIndex);
                    /*name2 = cursor.getString(nameIndex);
                    surname2 = cursor.getString(surnameIndex);
                    password2 = cursor.getString(passwordIndex);
                    age2 = cursor.getString(ageIndex);
                    weight2 = cursor.getString(weightIndex);
                    height2 = cursor.getString(heightIndex);*/

                            if(username3.equals(username2)){
                                Toast.makeText(Kayit_Olma.this, "Bu kullanıcı adı alınmış.", Toast.LENGTH_SHORT).show();
                                countt=0;
                                break;

                            }



                        }

                        if(countt==1)
                        {
                            db.execSQL("INSERT INTO denemeusers(username,name,surname,password,age,weight,height,image) VALUES('"+username3+"','"+name3+"','"+surname3+"','"+password3+"','"+age+"','"+weight+"','"+height+"','"+imageInByte+"')");
                            Toast.makeText(Kayit_Olma.this, "Kayıt başarılı.", Toast.LENGTH_SHORT).show();
                            Intent ii=new Intent(Kayit_Olma.this,MainActivity.class);
                            startActivity(ii);
                        }
                    }

                }








            }
        });



        agelist=new ArrayList<>();
        weightlist=new ArrayList<>();
        heightlist=new ArrayList<>();
        for (int i=15;i<80;i++)
        {
            agelist.add(i);
        }
        adapter=new ArrayAdapter<Integer>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,agelist);
        agee.setAdapter(adapter);

        for (int a=35;a<200;a++)
        {
            weightlist.add(a);
        }
        adapter1=new ArrayAdapter<Integer>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,weightlist);
        weightt.setAdapter(adapter1);

        for (int b=140;b<200;b++)
        {
            heightlist.add(b);
        }
        adapter2=new ArrayAdapter<Integer>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,heightlist);
        heightt.setAdapter(adapter2);

        agee.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                age=agee.getItemAtPosition(i).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {
                age=agee.getItemAtPosition(0).toString();
            }
        });

        heightt.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                height=heightt.getItemAtPosition(i).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {
                height=heightt.getItemAtPosition(0).toString();
            }
        });

        weightt.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                weight=weightt.getItemAtPosition(i).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {
                weight=weightt.getItemAtPosition(0).toString();
            }
        });

        floatAction.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ImagePicker.with(Kayit_Olma.this).crop().compress(1024).maxResultSize(1080, 1080).start();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
         uri = data.getData();
         imageView.setImageURI(uri);
    }
}