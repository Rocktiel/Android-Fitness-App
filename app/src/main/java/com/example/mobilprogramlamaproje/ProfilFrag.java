package com.example.mobilprogramlamaproje;

import static android.content.Context.MODE_PRIVATE;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfilFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfilFrag extends Fragment
{
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    Button editprofil;

    public ProfilFrag() {
        // Required empty public constructor
    }
    public static ProfilFrag newInstance(String param1, String param2) {
        ProfilFrag fragment = new ProfilFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    TextView username,name,surname,age,height,weight;
    ImageView img;

    SQLiteDatabase db;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_profil, container, false);

        username=view.findViewById(R.id.textView);
        name=view.findViewById(R.id.textView1);
        surname=view.findViewById(R.id.textView4);
        age=view.findViewById(R.id.textView6);
        height=view.findViewById(R.id.textView10);
        weight=view.findViewById(R.id.textView8);
        img=view.findViewById(R.id.resim1);

        try{

            db=view.getContext().openOrCreateDatabase("Denemee", MODE_PRIVATE, null);
            db.execSQL("CREATE TABLE IF NOT EXISTS denemeusers (id INTEGER PRIMARY KEY ,username VARCHAR, name VARCHAR, surname VARCHAR, password VARCHAR, age VARCHAR, weight VARCHAR, height VARCHAR,image VARCHAR )");
        }catch(Exception e){
            e.printStackTrace();
        }

        Intent ii=getActivity().getIntent();
        String un=ii.getStringExtra("nickname");



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
                username.setText(a);
                name.setText(b);
                surname.setText(c);
                age.setText(d);
                weight.setText(e);
                height.setText(f);
                img.setImageURI(mUri);
                break;
            }
        }


        editprofil=view.findViewById(R.id.editprofile);
        editprofil.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity().getApplication(),Edit_Profile.class);
                intent.putExtra("nickname",username.getText().toString());
                startActivity(intent);
            }
        });

        return view;
    }
}