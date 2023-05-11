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

import com.example.mobilprogramlamaproje.triceps.FragmentTricepsBenchDips;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsCloseGripBenchPress;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsDiamondPushUp;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsDumbbellKickback;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsOneArmLyingTricepsExtension;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsOneArmReversePushdown;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsPushdown;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsRopePushDown;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsSeatedTricepsPress;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsSkullCrusher;
import com.example.mobilprogramlamaproje.MyAdapter;
import com.example.mobilprogramlamaproje.R;
import com.example.mobilprogramlamaproje.egzersiz;

import java.util.ArrayList;
import java.util.List;

public class FragmentTriceps extends Fragment implements MyAdapter.SelectedUser {
    View view;
    List<egzersiz> egzersizList;
    RecyclerView myrecycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_triceps, container, false);

        myrecycler=view.findViewById(R.id.myrecyclertriceps);

        egzersizList=new ArrayList<egzersiz>();

        egzersizList.add(new egzersiz("Bench Dips",R.drawable.benchdips));
        egzersizList.add(new egzersiz("Close Grip Bench Press",R.drawable.closegripbenchpress));
        egzersizList.add(new egzersiz("Diamond Push Up",R.drawable.diamondpushup));
        egzersizList.add(new egzersiz("Lying Barbell Triceps Extension",R.drawable.lyingbarbell));
        egzersizList.add(new egzersiz("One Arm Lying Triceps Extension",R.drawable.onearmlying));
        egzersizList.add(new egzersiz("One Arm Reverse Pushdown",R.drawable.onearmreversepush));
        egzersizList.add(new egzersiz("Rope PushDown",R.drawable.removal));
        egzersizList.add(new egzersiz("Seated Triceps Press",R.drawable.seatedtricepspress));
        egzersizList.add(new egzersiz("Skull Crusher",R.drawable.skullcrusher));
        egzersizList.add(new egzersiz("Triceps Dumbbell Kickback",R.drawable.tricepsdumbellkickback));
        egzersizList.add(new egzersiz("Triceps Pushdown",R.drawable.tricepspushdown));

        myrecycler.setLayoutManager(new LinearLayoutManager(view.getContext()));
        myrecycler.setAdapter(new MyAdapter(view.getContext(),egzersizList,this));

        return view;
    }
    @Override
    public void selecteduser(egzersiz egz) {

        if(egz.getAd().equals("Bench Dips"))
        {
            FragmentTricepsBenchDips benchdips=new FragmentTricepsBenchDips();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,benchdips).commit();
        }
        else if(egz.getAd().equals("Close Grip Bench Press"))
        {
            FragmentTricepsCloseGripBenchPress closegripbenchpress=new FragmentTricepsCloseGripBenchPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,closegripbenchpress).commit();
        }
        else if(egz.getAd().equals("Diamond Push Up"))
        {
            FragmentTricepsDiamondPushUp diamondpushup=new FragmentTricepsDiamondPushUp();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,diamondpushup).commit();
        }
        else if(egz.getAd().equals("One Arm Lying Triceps Extension"))
        {
            FragmentTricepsOneArmLyingTricepsExtension onearmlying=new FragmentTricepsOneArmLyingTricepsExtension();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,onearmlying).commit();
        }
        else if(egz.getAd().equals("One Arm Reverse Pushdown"))
        {
            FragmentTricepsOneArmReversePushdown onearmreverse=new FragmentTricepsOneArmReversePushdown();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,onearmreverse).commit();
        }
        else if(egz.getAd().equals("Rope PushDown"))
        {
            FragmentTricepsRopePushDown ropepushdown=new FragmentTricepsRopePushDown();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,ropepushdown).commit();
        }
        else if(egz.getAd().equals("Seated Triceps Press"))
        {
            FragmentTricepsSeatedTricepsPress seatedTricepsPress=new FragmentTricepsSeatedTricepsPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,seatedTricepsPress).commit();
        }
        else if(egz.getAd().equals("Skull Crusher"))
        {
            FragmentTricepsSkullCrusher skullCrusher=new FragmentTricepsSkullCrusher();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,skullCrusher).commit();
        }
        else if(egz.getAd().equals("Triceps Dumbbell Kickback"))
        {
            FragmentTricepsDumbbellKickback tricepsDumbbellKickback=new FragmentTricepsDumbbellKickback();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,tricepsDumbbellKickback).commit();
        }
        else if(egz.getAd().equals("Triceps Pushdown"))
        {
            FragmentTricepsPushdown tricepsPushdown=new FragmentTricepsPushdown();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,tricepsPushdown).commit();
        }


    }
}