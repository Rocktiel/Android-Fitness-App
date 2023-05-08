package com.example.mobilprogramlamaproje;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Vucut_kitle_indeksi extends AppCompatActivity
{
    EditText boyss,kiloss;
    Button vucut_kitlee;
    TextView sonucss,bilgii,bilgi11;
    String boyc,kiloc,ondalik;
    Double araislem,a,c,x,metre;
    DecimalFormat df;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vucut_kitle_indeksi);
        boyss=findViewById(R.id.boys);
        kiloss=findViewById(R.id.kilos);
        vucut_kitlee=findViewById(R.id.vucut_kitle);
        sonucss=findViewById(R.id.sonucs);
        bilgii=findViewById(R.id.bilgi);
        bilgi11=findViewById(R.id.bilgi1);
        df= new DecimalFormat("#.##");

        vucut_kitlee.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                boyc=boyss.getText().toString();
                kiloc=kiloss.getText().toString();

                a= Double.valueOf(Integer.parseInt(boyc));
                c=Double.valueOf(Integer.parseInt(kiloc));
                metre= a / 100;

                araislem= c / (metre * metre);
                ondalik=df.format(araislem);
                x=Double.valueOf(araislem);

                if (x < 18.49)
                {
                    sonucss.setText(x.toString());
                    bilgii.setText("It shows that you are not the appropriate weight for your height, that you are weak. Weakness is an undesirable condition that poses a risk for some diseases. In order for you to reach the appropriate weight for your height, you should eat a sufficient and balanced diet, and take care to improve your eating habits.");
                    bilgi11.setText("Below The Ideal Weight");
                }
                else if (x < 24.99 && x > 18.5)
                {
                    sonucss.setText(x.toString());
                    bilgii.setText("It shows that you are the appropriate weight according to your height. Take care to maintain this weight by eating an adequate and balanced diet and doing regular physical activity.");
                    bilgi11.setText("The Ideal Weight");
                }
                else if (x < 29.99 && x > 25 )
                {
                    sonucss.setText(x.toString());
                    bilgii.setText("It indicates that your body weight is too much " +
                            " compared to your height. Being overweight leads to obesity (obesity), which is a risk factor for many diseases, if the necessary precautions are not taken.");
                    bilgi11.setText("Above The Ideal Weight");
                }
                else if(x > 30)
                {
                    sonucss.setText(x.toString());
                    bilgii.setText("It is an indication that your body weight is too much according to your height, in other words, that you are fat. Obesity, cardiovascular diseases, diabetes, hypertension v.b. it is a risk factor for chronic diseases. It is very important for your health to get down to normal weight by applying to a health institution and getting thin under the supervision of a physician / dietitian. Please, contact the medical institution.");
                    bilgi11.setText("Far Above The Ideal Weight");
                }
            }
        });
    }
}