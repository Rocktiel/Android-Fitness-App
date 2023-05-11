package com.example.mobilprogramlamaproje.bolgeler;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mobilprogramlamaproje.forearm.FragmentForearmBarbellWristCurl;
import com.example.mobilprogramlamaproje.forearm.FragmentForearmReverseWristCurl;
import com.example.mobilprogramlamaproje.forearm.FragmentForearmSeatedDumbellWristCurl;
import com.example.mobilprogramlamaproje.forearm.FragmentForearmWristRotation;
import com.example.mobilprogramlamaproje.MyAdapter;
import com.example.mobilprogramlamaproje.R;
import com.example.mobilprogramlamaproje.egzersiz;

import java.util.ArrayList;
import java.util.List;

public class FragmentOnKollar extends Fragment implements MyAdapter.SelectedUser {

    View view;
    List<egzersiz> egzersizList;
    RecyclerView myrecycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_on_kollar, container, false);

        myrecycler=view.findViewById(R.id.myrecyclerforearm);

        egzersizList=new ArrayList<egzersiz>();

        egzersizList.add(new egzersiz("Barbell Wrist Curl",R.drawable.barbellwristcurl));
        egzersizList.add(new egzersiz("Reverse Wrist Curl",R.drawable.reversewristcurl));
        egzersizList.add(new egzersiz("Seated Dumbell Wrist Curl",R.drawable.seateddumbellwristcurl));
        egzersizList.add(new egzersiz("Wrist Rotation",R.drawable.wristrotation));

        myrecycler.setLayoutManager(new LinearLayoutManager(view.getContext()));
        myrecycler.setAdapter(new MyAdapter(view.getContext(),egzersizList,this));

        return view;
    }

    @Override
    public void selecteduser(egzersiz egz) {

        if(egz.getAd().equals("Barbell Wrist Curl"))
        {
            FragmentForearmBarbellWristCurl barbellWristCurl=new FragmentForearmBarbellWristCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,barbellWristCurl).commit();
        }
        else if(egz.getAd().equals("Reverse Wrist Curl"))
        {
            FragmentForearmReverseWristCurl reverseWristCurl=new FragmentForearmReverseWristCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,reverseWristCurl).commit();
        }
        else if(egz.getAd().equals("Seated Dumbell Wrist Curl"))
        {
            FragmentForearmSeatedDumbellWristCurl seatedDumbellWristCurl=new FragmentForearmSeatedDumbellWristCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,seatedDumbellWristCurl).commit();
        }
        else if(egz.getAd().equals("Wrist Rotation"))
        {
            FragmentForearmWristRotation wristRotation=new FragmentForearmWristRotation();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,wristRotation).commit();
        }
    }
}