package com.example.mobilprogramlamaproje.calculationfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mobilprogramlamaproje.R;

import java.text.DecimalFormat;

public class Gunluk_protein_ihtiyaci extends AppCompatActivity
{
    Button result;
    EditText yag;
    TextView resulttt;
    String sonuc,aradeger,ondalik;
    Double deger,f,x;
    DecimalFormat df;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunluk_protein_ihtiyaci);
        result=findViewById(R.id.gunlukprotein);
        yag=findViewById(R.id.yagsizvucut);
        resulttt=findViewById(R.id.resultt);
        df= new DecimalFormat("#.##");

        result.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                aradeger=yag.getText().toString();
                deger = Double.valueOf(aradeger);
                f= deger * 2.75;
                ondalik=df.format(f);
                x=Double.valueOf(ondalik);
                resulttt.setText(x.toString());
            }
        });
    }
}