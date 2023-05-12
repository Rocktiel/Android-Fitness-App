package com.example.mobilprogramlamaproje.triceps;

import static android.content.Context.MODE_PRIVATE;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mobilprogramlamaproje.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentTricepsDumbbellKickback#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTricepsDumbbellKickback extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentTricepsDumbbellKickback() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTricepsDumbbellKickback.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentTricepsDumbbellKickback newInstance(String param1, String param2) {
        FragmentTricepsDumbbellKickback fragment = new FragmentTricepsDumbbellKickback();
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

    Button button;
    EditText weight,set,tekrar;
    SQLiteDatabase db;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_triceps_dumbbell_kickback, container, false);

        button=view.findViewById(R.id.add);
        weight=view.findViewById(R.id.weight);
        set=view.findViewById(R.id.set);
        tekrar=view.findViewById(R.id.rep);

        Intent ii=getActivity().getIntent();
        String un=ii.getStringExtra("nickname");

        String ad="Triceps Dumbbell Kickback";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightt=weight.getText().toString();
                String sett=set.getText().toString();
                String tekrarr=tekrar.getText().toString();
                if(weightt.length()==0 || sett.length()==0 || tekrarr.length()==0 )
                {
                    Toast.makeText(getContext(), "Boş olamaz.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    try{
                        db=view.getContext().openOrCreateDatabase(un,MODE_PRIVATE,null);
                        db.execSQL("CREATE TABLE IF NOT EXISTS denemeantrenman (id INTEGER PRIMARY KEY , name VARCHAR, weight VARCHAR, setsayi VARCHAR, tekrarsayi VARCHAR )");
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    db.execSQL("INSERT INTO denemeantrenman(name,weight,setsayi,tekrarsayi) VALUES('"+ad+"','"+weightt+"','"+sett+"','"+tekrarr+"')");
                    Toast.makeText(getContext(), "Kayıt başarılı.", Toast.LENGTH_SHORT).show();
                    weight.setText("");
                    set.setText("");
                    tekrar.setText("");
                }
            }
        });
        return view;
    }
}