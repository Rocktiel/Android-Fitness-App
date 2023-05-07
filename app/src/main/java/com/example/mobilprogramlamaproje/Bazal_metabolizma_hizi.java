package com.example.mobilprogramlamaproje;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class Bazal_metabolizma_hizi extends AppCompatActivity
{
    CheckBox malee,femalee;
    EditText ageeee,heightttt,weightttt;
    Button calculate;
    TextView sonuccc;
    String yas,boy,kilo,sonuc;
    Double araislem,a,d,c;
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
                    araislem = 88.362 + (13.397 * c) + (4.799 * d) - (5.677 * a);
                    sonuc=araislem.toString();
                    sonuccc.setText(sonuc);
                }
                else
                {
                    araislem= 447.593 + (9.247 * c) + (3.098 * d) - (4.330 * a);
                    sonuc=araislem.toString();
                    sonuccc.setText(sonuc);
                }
            }
        });
    }
}