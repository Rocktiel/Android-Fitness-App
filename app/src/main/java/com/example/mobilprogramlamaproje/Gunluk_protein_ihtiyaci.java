package com.example.mobilprogramlamaproje;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Gunluk_protein_ihtiyaci extends AppCompatActivity
{
    Button result;
    EditText yag;
    TextView resulttt;
    String sonuc,aradeger;
    int deger;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunluk_protein_ihtiyaci);
        result=findViewById(R.id.gunlukprotein);
        yag=findViewById(R.id.yagsizvucut);
        resulttt=findViewById(R.id.resultt);

        result.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                aradeger=yag.getText().toString();
                deger = Integer.parseInt(aradeger);
                sonuc=String.valueOf(deger * 2.75);
                resulttt.setText(sonuc);
            }
        });
    }
}