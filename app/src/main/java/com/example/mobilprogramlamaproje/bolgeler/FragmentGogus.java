package com.example.mobilprogramlamaproje.bolgeler;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mobilprogramlamaproje.Exercises;
import com.example.mobilprogramlamaproje.chest.FragmentChestBenchPress;
import com.example.mobilprogramlamaproje.chest.FragmentChestCableCrossover;
import com.example.mobilprogramlamaproje.chest.FragmentChestDeclinePress;
import com.example.mobilprogramlamaproje.chest.FragmentChestDips;
import com.example.mobilprogramlamaproje.chest.FragmentChestDumbellPullover;
import com.example.mobilprogramlamaproje.chest.FragmentChestInclineDumbellFly;
import com.example.mobilprogramlamaproje.chest.FragmentChestInclinedPushups;
import com.example.mobilprogramlamaproje.chest.FragmentChestModifiedPushups;
import com.example.mobilprogramlamaproje.chest.FragmentChestPecDeckFly;
import com.example.mobilprogramlamaproje.chest.FragmentChestPushUp;
import com.example.mobilprogramlamaproje.chest.FragmentChestSmithMachineBenchPress;
import com.example.mobilprogramlamaproje.MyAdapter;
import com.example.mobilprogramlamaproje.R;
import com.example.mobilprogramlamaproje.egzersiz;

import java.util.ArrayList;
import java.util.List;

public class FragmentGogus extends Fragment implements MyAdapter.SelectedUser {

    View view;
    List<egzersiz> egzersizList;
    RecyclerView myrecycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_gogus, container, false);

        myrecycler=view.findViewById(R.id.myrecyclerchest);

        egzersizList=new ArrayList<egzersiz>();

        egzersizList.add(new egzersiz("Bench Press",R.drawable.benchpress1));
        egzersizList.add(new egzersiz("Cable Crossover",R.drawable.cablecrossover1));
        egzersizList.add(new egzersiz("Decline Press",R.drawable.declinepress1));
        egzersizList.add(new egzersiz("Dips",R.drawable.ddips1));
        egzersizList.add(new egzersiz("Dumbell Pullover",R.drawable.dumbbelpullover1));
        egzersizList.add(new egzersiz("Incline Dumbell Fly",R.drawable.inclinedumbbellfly1));
        egzersizList.add(new egzersiz("Inclined Push-ups",R.drawable.inclinedpushups1));
        egzersizList.add(new egzersiz("Modified Push-ups",R.drawable.modifiedpushups1));
        egzersizList.add(new egzersiz("Pec Deck Fly",R.drawable.pecdeckfly1));
        egzersizList.add(new egzersiz("Push-Up",R.drawable.pppushup1));
        egzersizList.add(new egzersiz("Smith Machine-Bench Press",R.drawable.smithmachinebenchpress1));

        myrecycler.setLayoutManager(new LinearLayoutManager(view.getContext()));
        myrecycler.setAdapter(new MyAdapter(view.getContext(),egzersizList,this));

        setupBackOnPressed();

        return view;
    }

    private void setupBackOnPressed()
    {
        requireActivity().getOnBackPressedDispatcher().addCallback(new OnBackPressedCallback(true)
        {
            @Override
            public void handleOnBackPressed()
            {
                if(isEnabled())
                {
                    Exercises exercises =new Exercises();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentler,exercises).commit();
                }
            }
        });
    }

    @Override
    public void selecteduser(egzersiz egz) {

        if(egz.getAd().equals("Bench Press"))
        {
            FragmentChestBenchPress benchPress=new FragmentChestBenchPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,benchPress).commit();

        }
        else if(egz.getAd().equals("Cable Crossover"))
        {
            FragmentChestCableCrossover cableCrossover=new FragmentChestCableCrossover();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,cableCrossover).commit();

        }
        else if(egz.getAd().equals("Decline Press"))
        {
            FragmentChestDeclinePress declinePress=new FragmentChestDeclinePress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,declinePress).commit();

        }
        else if(egz.getAd().equals("Dips"))
        {
            FragmentChestDips dips=new FragmentChestDips();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dips).commit();

        }
        else if(egz.getAd().equals("Dumbell Pullover"))
        {
            FragmentChestDumbellPullover dumbellPullover=new FragmentChestDumbellPullover();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbellPullover).commit();

        }
        else if(egz.getAd().equals("Incline Dumbell Fly"))
        {
            FragmentChestInclineDumbellFly chestInclineDumbellFly=new FragmentChestInclineDumbellFly();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,chestInclineDumbellFly).commit();

        }
        else if(egz.getAd().equals("Inclined Push-ups"))
        {
            FragmentChestInclinedPushups chestInclinedPushups=new FragmentChestInclinedPushups();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,chestInclinedPushups).commit();

        }
        else if(egz.getAd().equals("Modified Push-ups"))
        {
            FragmentChestModifiedPushups modifiedPushups=new FragmentChestModifiedPushups();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,modifiedPushups).commit();

        }
        else if(egz.getAd().equals("Pec Deck Fly"))
        {
            FragmentChestPecDeckFly pecDeckFly=new FragmentChestPecDeckFly();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,pecDeckFly).commit();

        }else if(egz.getAd().equals("Push-Up"))
        {
            FragmentChestPushUp pushUp=new FragmentChestPushUp();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,pushUp).commit();

        }else if(egz.getAd().equals("Smith Machine-Bench Press"))
        {
            FragmentChestSmithMachineBenchPress smithMachineBenchPress=new FragmentChestSmithMachineBenchPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,smithMachineBenchPress).commit();

        }
    }
}