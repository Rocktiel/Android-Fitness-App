package com.example.mobilprogramlamaproje;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Edit_Profile extends AppCompatActivity
{
    EditText usernameedit,nameedit,surnameedit,ageedit,heightedit,weightedit;
    ImageView img;
    Button updateprofil ;
    ImageView imageView;
    FloatingActionButton floatAction;
    Uri uri;

    String username,name,surname,age,height,weight;

    SQLiteDatabase db;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        usernameedit=findViewById(R.id.username);
        nameedit=findViewById(R.id.name);
        surnameedit=findViewById(R.id.surname);
        ageedit=findViewById(R.id.age);
        heightedit=findViewById(R.id.height);
        weightedit=findViewById(R.id.weight);
        img=findViewById(R.id.resim1);
        updateprofil=findViewById(R.id.updateprofile);




        String usernameee=usernameedit.getText().toString();
        try{

            db=openOrCreateDatabase("Denemee", MODE_PRIVATE, null);
            db.execSQL("CREATE TABLE IF NOT EXISTS denemeusers (id INTEGER PRIMARY KEY ,username VARCHAR, name VARCHAR, surname VARCHAR, password VARCHAR, age VARCHAR, weight VARCHAR, height VARCHAR,image VARCHAR )");
        }catch(Exception e){
            e.printStackTrace();
        }

        Bundle extras=getIntent().getExtras();

        //Intent ii=MainActivity.getIntent();
        String un=extras.getString("nickname");


        Cursor cursor=db.rawQuery("SELECT * FROM denemeusers ",null);
        int usernameIndex=cursor.getColumnIndex("username");
        int nameIndex=cursor.getColumnIndex("name");
        int surnameIndex=cursor.getColumnIndex("surname");
        int ageIndex=cursor.getColumnIndex("age");
        int weightIndex=cursor.getColumnIndex("weight");
        int heightIndex=cursor.getColumnIndex("height");
        int imageindex=cursor.getColumnIndex("image");



        while(cursor.moveToNext())
        {
            String a = cursor.getString(usernameIndex);
            String b = cursor.getString(nameIndex);
            String c = cursor.getString(surnameIndex);
            String d = cursor.getString(ageIndex);
            String e = cursor.getString(weightIndex);
            String f = cursor.getString(heightIndex);
            String uris=cursor.getString(imageindex);
            Uri mUri = Uri.parse(uris);

            if(a.equals(un))
            {
                usernameedit.setText(a);
                nameedit.setText(b);
                surnameedit.setText(c);
                ageedit.setText(d);
                weightedit.setText(e);
                heightedit.setText(f);
                img.setImageURI(mUri);
                break;
            }
        }


        updateprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username=usernameedit.getText().toString();
                name=nameedit.getText().toString();
                surname=surnameedit.getText().toString();
                age=ageedit.getText().toString();
                weight=weightedit.getText().toString();
                height=heightedit.getText().toString();
                //String imageInByte=uri.toString();

                if(username.length()==0 || name.length()==0 || surname.length()==0 || age.length()==0 || weight.length()==0 || height.length()==0 )
                {
                    Toast.makeText(Edit_Profile.this, "Boş değer girdiniz.", Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(Edit_Profile.this, "Güncellendi.", Toast.LENGTH_SHORT).show();
                    db.execSQL("UPDATE denemeusers SET username='"+username+"', name='"+name+"', surname='"+surname+"', age='"+age+"', weight='"+weight+"', height='"+height+"' WHERE username=('"+un+"')");
                }


            }
        });


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