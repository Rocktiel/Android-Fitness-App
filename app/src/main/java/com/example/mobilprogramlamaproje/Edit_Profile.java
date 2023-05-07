package com.example.mobilprogramlamaproje;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Edit_Profile extends AppCompatActivity
{
    Button updateprofil ;
    ImageView imageView;
    FloatingActionButton floatAction;
    Uri uri;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        updateprofil=findViewById(R.id.editprofile);
        imageView=findViewById(R.id.resim1);
        floatAction=findViewById(R.id.resimguncelleme);
        floatAction.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ImagePicker.with(Edit_Profile.this).crop().compress(1024).maxResultSize(1080, 1080).start();
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