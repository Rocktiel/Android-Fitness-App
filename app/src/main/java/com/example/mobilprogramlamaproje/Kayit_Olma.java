package com.example.mobilprogramlamaproje;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
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

import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Kayit_Olma extends AppCompatActivity
{
    Spinner agee,heightt,weightt;
    ArrayAdapter<Integer> adapter,adapter1,adapter2;
    ArrayList<Integer> agelist,weightlist,heightlist;
    String age,height,weight,username,name,surname,password;
    EditText usernamee,namee,surnamee,passwordd;
    Button signupp;
    ImageView  imageView;
    FloatingActionButton floatAction;
    Uri uri;
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
        signupp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                username = usernamee.getText().toString();
                name=namee.getText().toString();
                surname=surnamee.getText().toString();
                password=passwordd.getText().toString();
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