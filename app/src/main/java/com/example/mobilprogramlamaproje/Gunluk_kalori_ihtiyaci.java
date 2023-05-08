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

public class Gunluk_kalori_ihtiyaci extends AppCompatActivity
{
    CheckBox erkek,kadin,yerlesikk,hafif,ortaderece,cok,asiri;
    EditText yask,boyk,kilok;
    Button kilo_almakk,kilo_vermekk;
    TextView sonuccch;
    String yassx,boyyx,kiloox,ondalik;
    Double araislemx,ax,dx,cx,bmr,rmr,ikinciaraislem,x;
    DecimalFormat df;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunluk_kalori_ihtiyaci);
        erkek=findViewById(R.id.erkekk);
        kadin=findViewById(R.id.kadinn);
        kilo_almakk=findViewById(R.id.kilo_almak);
        kilo_vermekk=findViewById(R.id.kilo_vermekkkkkkk);
        sonuccch=findViewById(R.id.sonucxh);
        yask=findViewById(R.id.yasxx);
        boyk=findViewById(R.id.boyxx);
        kilok=findViewById(R.id.kiloxx);
        yerlesikk=findViewById(R.id.yerlesik);
        hafif=findViewById(R.id.hafif_aktif);
        cok=findViewById(R.id.cok_aktif);
        asiri=findViewById(R.id.son_derece_aktif);
        ortaderece=findViewById(R.id.orta_derece_aktif);
        df= new DecimalFormat("#.##");

        kilo_almakk.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                yassx= String.valueOf(yask.getText());
                boyyx= String.valueOf(boyk.getText());
                kiloox= String.valueOf(kilok.getText());

                ax= Double.valueOf(Integer.parseInt(yassx));
                dx=Double.valueOf(Integer.parseInt(boyyx));
                cx=Double.valueOf(Integer.parseInt(kiloox));

                if (erkek.isChecked())
                {
                    araislemx = 66 + (13.7 * cx) + (4.8 * dx) - (6.8 * ax);
                    bmr= araislemx;
                    if (yerlesikk.isChecked())
                    {
                        rmr=bmr * 1.3;
                        ikinciaraislem= rmr + 500;
                        ondalik=df.format(ikinciaraislem);
                        x=Double.valueOf(ondalik);
                        sonuccch.setText(x.toString());
                    }
                    else if (hafif.isChecked())
                    {
                        rmr=bmr * 1.6;
                        ikinciaraislem= rmr + 500;
                        ondalik=df.format(ikinciaraislem);
                        x=Double.valueOf(ondalik);
                        sonuccch.setText(x.toString());
                    }
                    else if (ortaderece.isChecked())
                    {
                        rmr=bmr * 1.7;
                        ikinciaraislem= rmr + 500;
                        ondalik=df.format(ikinciaraislem);
                        x=Double.valueOf(ondalik);
                        sonuccch.setText(x.toString());
                    }
                    else if (cok.isChecked())
                    {
                        rmr=bmr * 2.1;
                        ikinciaraislem= rmr + 500;
                        ondalik=df.format(ikinciaraislem);
                        x=Double.valueOf(ondalik);
                        sonuccch.setText(x.toString());

                    }
                    else if (asiri.isChecked())
                    {
                        rmr=bmr * 2.4;
                        ikinciaraislem= rmr + 500;
                        ondalik=df.format(ikinciaraislem);
                        x=Double.valueOf(ondalik);
                        sonuccch.setText(x.toString());
                    }
                }
                else
                {
                    araislemx= 665 + (9.6 * cx) + (1.8 * dx) - (4.7 * ax);
                    bmr= araislemx;
                    if (yerlesikk.isChecked())
                    {
                        rmr=bmr * 1.3;
                        ikinciaraislem= rmr + 500;
                        ondalik=df.format(ikinciaraislem);
                        x=Double.valueOf(ondalik);
                        sonuccch.setText(x.toString());
                    }
                    else if (hafif.isChecked())
                    {
                        rmr=bmr * 1.5;
                        ikinciaraislem= rmr + 500;
                        ondalik=df.format(ikinciaraislem);
                        x=Double.valueOf(ondalik);
                        sonuccch.setText(x.toString());
                    }
                    else if (ortaderece.isChecked())
                    {
                        rmr=bmr * 1.6;
                        ikinciaraislem= rmr + 500;
                        ondalik=df.format(ikinciaraislem);
                        x=Double.valueOf(ondalik);
                        sonuccch.setText(x.toString());
                    }
                    else if (cok.isChecked())
                    {
                        rmr=bmr * 1.9;
                        ikinciaraislem= rmr + 500;
                        ondalik=df.format(ikinciaraislem);
                        x=Double.valueOf(ondalik);
                        sonuccch.setText(x.toString());

                    }
                    else if (asiri.isChecked())
                    {
                        rmr=bmr * 2.2;
                        ikinciaraislem= rmr + 500;
                        ondalik=df.format(ikinciaraislem);
                        x=Double.valueOf(ondalik);
                        sonuccch.setText(x.toString());
                    }
                }
            }
        });

       kilo_vermekk.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View view)
           {
               yassx= String.valueOf(yask.getText());
               boyyx= String.valueOf(boyk.getText());
               kiloox= String.valueOf(kilok.getText());

               ax= Double.valueOf(Integer.parseInt(yassx));
               dx=Double.valueOf(Integer.parseInt(boyyx));
               cx=Double.valueOf(Integer.parseInt(kiloox));

               if (erkek.isChecked())
               {
                   araislemx = 66 + (13.7 * cx) + (4.8 * dx) - (6.8 * ax);
                   bmr= araislemx;
                   if (yerlesikk.isChecked())
                   {
                       rmr=bmr * 1.3;
                       ikinciaraislem= rmr - 500;
                       ondalik=df.format(ikinciaraislem);
                       x=Double.valueOf(ondalik);
                       sonuccch.setText(x.toString());
                   }
                   else if (hafif.isChecked())
                   {
                       rmr=bmr * 1.6;
                       ikinciaraislem= rmr - 500;
                       ondalik=df.format(ikinciaraislem);
                       x=Double.valueOf(ondalik);
                       sonuccch.setText(x.toString());
                   }
                   else if (ortaderece.isChecked())
                   {
                       rmr=bmr * 1.7;
                       ikinciaraislem= rmr - 500;
                       ondalik=df.format(ikinciaraislem);
                       x=Double.valueOf(ondalik);
                       sonuccch.setText(x.toString());
                   }
                   else if (cok.isChecked())
                   {
                       rmr=bmr * 2.1;
                       ikinciaraislem= rmr - 500;
                       ondalik=df.format(ikinciaraislem);
                       x=Double.valueOf(ondalik);
                       sonuccch.setText(x.toString());

                   }
                   else if (asiri.isChecked())
                   {
                       rmr=bmr * 2.4;
                       ikinciaraislem= rmr - 500;
                       ondalik=df.format(ikinciaraislem);
                       x=Double.valueOf(ondalik);
                       sonuccch.setText(x.toString());
                   }
               }
               else
               {
                   araislemx= 665 + (9.6 * cx) + (1.8 * dx) - (4.7 * ax);
                   bmr= araislemx;
                   if (yerlesikk.isChecked())
                   {
                       rmr=bmr * 1.3;
                       ikinciaraislem= rmr - 500;
                       ondalik=df.format(ikinciaraislem);
                       x=Double.valueOf(ondalik);
                       sonuccch.setText(x.toString());
                   }
                   else if (hafif.isChecked())
                   {
                       rmr=bmr * 1.5;
                       ikinciaraislem= rmr - 500;
                       ondalik=df.format(ikinciaraislem);
                       x=Double.valueOf(ondalik);
                       sonuccch.setText(x.toString());
                   }
                   else if (ortaderece.isChecked())
                   {
                       rmr=bmr * 1.6;
                       ikinciaraislem= rmr - 500;
                       ondalik=df.format(ikinciaraislem);
                       x=Double.valueOf(ondalik);
                       sonuccch.setText(x.toString());
                   }
                   else if (cok.isChecked())
                   {
                       rmr=bmr * 1.9;
                       ikinciaraislem= rmr - 500;
                       ondalik=df.format(ikinciaraislem);
                       x=Double.valueOf(ondalik);
                       sonuccch.setText(x.toString());

                   }
                   else if (asiri.isChecked())
                   {
                       rmr=bmr * 2.2;
                       ikinciaraislem= rmr - 500;
                       ondalik=df.format(ikinciaraislem);
                       x=Double.valueOf(ondalik);
                       sonuccch.setText(x.toString());
                   }
               }

           }
       });

    }
}