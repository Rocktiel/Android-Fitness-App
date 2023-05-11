package com.example.mobilprogramlamaproje.calculationfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mobilprogramlamaproje.R;

import java.text.DecimalFormat;

public class Bazal_metabolizma_hizi extends AppCompatActivity
{
    CheckBox malee,femalee;
    EditText ageeee,heightttt,weightttt;
    Button calculate;
    TextView sonuccc;
    String yas,boy,kilo,sonuc;
    Double araislem,a,d,c,x;
    DecimalFormat df;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazal_metabolizma_hizi);
        malee=findViewById(R.id.male);
        femalee=findViewById(R.id.female);
        ageeee=findViewById(R.id.ageeeeeee);
        heightttt=findViewById(R.id.heightttttttt);
        weightttt=findViewById(R.id.weightttttttt);
        calculate=findViewById(R.id.BazalMetabolizmaHızı);
        sonuccc=findViewById(R.id.sonuc);
        df= new DecimalFormat("#.##");

        calculate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                yas= String.valueOf(ageeee.getText());
                boy= String.valueOf(heightttt.getText());
                kilo= String.valueOf(weightttt.getText());

                a= Double.valueOf(Integer.parseInt(yas));
                d=Double.valueOf(Integer.parseInt(boy));
                c=Double.valueOf(Integer.parseInt(kilo));

                if (malee.isChecked())
                {
                    araislem = 66 + (13.7 * c) + (4.8 * d) - (6.8 * a);
                    sonuc=df.format(araislem);
                    x=Double.valueOf(sonuc);
                    sonuccc.setText(x.toString());
                }
                else
                {
                    araislem= 665 + (9.6 * c) + (1.8 * d) - (4.7 * a);
                    sonuc=df.format(araislem);
                    x=Double.valueOf(sonuc);
                    sonuccc.setText(x.toString());
                }
            }
        });
    }
}