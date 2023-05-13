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

import com.example.mobilprogramlamaproje.biceps.FragmentBicepsCableChestCompression;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsCableCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsConcentrationCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsDumbbellPreacherCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsHammerCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsInclineReverseDumbbellPress;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsReverseBarbellCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsScotCurlZBar;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsSeatedDumbbellCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsSeatedHammerCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsSingleArmCableCurl;
import com.example.mobilprogramlamaproje.MyAdapter;
import com.example.mobilprogramlamaproje.R;
import com.example.mobilprogramlamaproje.egzersiz;

import java.util.ArrayList;
import java.util.List;

public class FragmentBiceps extends Fragment implements MyAdapter.SelectedUser {

    View view;
    List<egzersiz> egzersizList;
    RecyclerView myrecycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_biceps, container, false);

        myrecycler=view.findViewById(R.id.myrecyclerbiceps);

        egzersizList=new ArrayList<egzersiz>();

        egzersizList.add(new egzersiz("Cable Chest Compression",R.drawable.compression1));
        egzersizList.add(new egzersiz("Cable Curl",R.drawable.curl1));
        egzersizList.add(new egzersiz("Concentration Curl",R.drawable.concentrationcurl1));
        egzersizList.add(new egzersiz("Dumbbell Preacher Curl",R.drawable.dumbbellpreachercurl1));
        egzersizList.add(new egzersiz("Hammer Curl",R.drawable.hammercurl1));
        egzersizList.add(new egzersiz("Incline Reverse Dumbbell Press",R.drawable.nclinereversedumbbellpress1));
        egzersizList.add(new egzersiz("Reverse Barbell Curl",R.drawable.reversebarbellcurl1));
        egzersizList.add(new egzersiz("Scot Curl Z-Bar",R.drawable.scotcurlzbar1));
        egzersizList.add(new egzersiz("Seated Dumbbell Curl",R.drawable.seateddumbbellcurl1));
        egzersizList.add(new egzersiz("Seated Hammer Curl",R.drawable.seatedhammercurl1));
        egzersizList.add(new egzersiz("Single Arm Cable Curl",R.drawable.singlearmcablecurl1));

        myrecycler.setLayoutManager(new LinearLayoutManager(view.getContext()));
        myrecycler.setAdapter(new MyAdapter(view.getContext(),egzersizList,this));

        return view;
    }

    @Override
    public void selecteduser(egzersiz egz) {

        if(egz.getAd().equals("Cable Chest Compression"))
        {
            FragmentBicepsCableChestCompression cableChestCompression=new FragmentBicepsCableChestCompression();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,cableChestCompression).commit();
        }
        else if(egz.getAd().equals("Cable Curl"))
        {
            FragmentBicepsCableCurl cableCurl=new FragmentBicepsCableCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,cableCurl).commit();

        }
        else if(egz.getAd().equals("Concentration Curl"))
        {
            FragmentBicepsConcentrationCurl concentrationCurl=new FragmentBicepsConcentrationCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,concentrationCurl).commit();

        }
        else if(egz.getAd().equals("Dumbbell Preacher Curl"))
        {
            FragmentBicepsDumbbellPreacherCurl dumbbellPreacherCurl=new FragmentBicepsDumbbellPreacherCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbbellPreacherCurl).commit();

        }
        else if(egz.getAd().equals("Hammer Curl"))
        {
            FragmentBicepsHammerCurl hammerCurl=new FragmentBicepsHammerCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,hammerCurl).commit();

        }
        else if(egz.getAd().equals("Incline Reverse Dumbbell Press"))
        {
            FragmentBicepsInclineReverseDumbbellPress inclineReverseDumbbellPress=new FragmentBicepsInclineReverseDumbbellPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,inclineReverseDumbbellPress).commit();

        }
        else if(egz.getAd().equals("Reverse Barbell Curl"))
        {
            FragmentBicepsReverseBarbellCurl reverseBarbellCurl=new FragmentBicepsReverseBarbellCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,reverseBarbellCurl).commit();

        }
        else if(egz.getAd().equals("Scot Curl Z-Bar"))
        {
            FragmentBicepsScotCurlZBar scotCurlZBar=new FragmentBicepsScotCurlZBar();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,scotCurlZBar).commit();

        }
        else if(egz.getAd().equals("Seated Dumbbell Curl"))
        {
            FragmentBicepsSeatedDumbbellCurl seatedDumbbellCurl=new FragmentBicepsSeatedDumbbellCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,seatedDumbbellCurl).commit();

        }
        else if(egz.getAd().equals("Seated Hammer Curl"))
        {
            FragmentBicepsSeatedHammerCurl seatedHammerCurl=new FragmentBicepsSeatedHammerCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,seatedHammerCurl).commit();

        }
        else if(egz.getAd().equals("Single Arm Cable Curl"))
        {
            FragmentBicepsSingleArmCableCurl singleArmCableCurl=new FragmentBicepsSingleArmCableCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,singleArmCableCurl).commit();

        }
    }
}