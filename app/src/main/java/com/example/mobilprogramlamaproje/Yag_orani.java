package com.example.mobilprogramlamaproje;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Yag_orani extends AppCompatActivity
{
    CheckBox maleee,femaleee;
    EditText bel,boyun,boyy;
    TextView sonucccx;
    Button hesapla;
    String bell,boyunnn,boyyy,ondalik;
    Double araislem,a,d,c,e,f,x;
    DecimalFormat df;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yag_orani);
        maleee=findViewById(R.id.malee);
        femaleee=findViewById(R.id.femalee);
        hesapla=findViewById(R.id.yagorani);
        bel=findViewById(R.id.waist);
        boyun=findViewById(R.id.neck);
        boyy=findViewById(R.id.boy);
        sonucccx=findViewById(R.id.sonuc);
        df= new DecimalFormat("#.##");

        hesapla.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                bell = bel.getText().toString();
                boyunnn = boyun.getText().toString();
                boyyy = boyy.getText().toString();

                d=Double.valueOf(Integer.parseInt(bell));
                c=Double.valueOf(Integer.parseInt(boyunnn));
                e=Double.valueOf(Integer.parseInt(boyyy));

                a=Math.log(10);

                if (maleee.isChecked())
                {
                    araislem = 1.0324 - 0.19077 * a * (d - c) + 0.15456 * a * e;
                    f= 495 / araislem;
                    ondalik=df.format(f);
                    x=Double.valueOf(ondalik);
                    sonucccx.setText(x.toString());
                }
                else
                {
                    araislem = 1.0324 - 0.19077 * a * (d - c) + 0.15456 * a * e;
                    f= 495 / araislem;
                    ondalik=df.format(f);
                    x=Double.valueOf(ondalik);
                    sonucccx.setText(x.toString());
                }
            }
        });
    }
}