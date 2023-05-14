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
import com.example.mobilprogramlamaproje.legs.FragmentLegsBulgarianSquat;
import com.example.mobilprogramlamaproje.legs.FragmentLegsDumbellLunge;
import com.example.mobilprogramlamaproje.legs.FragmentLegsDumbellSquat;
import com.example.mobilprogramlamaproje.legs.FragmentLegsHackSquat;
import com.example.mobilprogramlamaproje.legs.FragmentLegsLegExtension;
import com.example.mobilprogramlamaproje.legs.FragmentLegsLegPress;
import com.example.mobilprogramlamaproje.legs.FragmentLegsOneArmToTheSideDeadlift;
import com.example.mobilprogramlamaproje.legs.FragmentLegsOneLeggedCollapse;
import com.example.mobilprogramlamaproje.legs.FragmentLegsSquat;
import com.example.mobilprogramlamaproje.legs.FragmentLegsStandingLegCurl;
import com.example.mobilprogramlamaproje.MyAdapter;
import com.example.mobilprogramlamaproje.R;
import com.example.mobilprogramlamaproje.egzersiz;

import java.util.ArrayList;
import java.util.List;

public class FragmentBacaklar extends Fragment implements MyAdapter.SelectedUser  {

    View view;
    List<egzersiz> egzersizList;
    RecyclerView myrecycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_bacaklar, container, false);

        myrecycler=view.findViewById(R.id.myrecyclerlegs);

        egzersizList=new ArrayList<egzersiz>();

        egzersizList.add(new egzersiz("Bulgarian Squat",R.drawable.bulgariansquat));
        egzersizList.add(new egzersiz("Dumbell Lunge",R.drawable.lunge));
        egzersizList.add(new egzersiz("Dumbell Squat",R.drawable.squat));
        egzersizList.add(new egzersiz("Hack Squat",R.drawable.hacksquat));
        egzersizList.add(new egzersiz("Leg Extension",R.drawable.legextension));
        egzersizList.add(new egzersiz("Leg Press",R.drawable.legpress));
        egzersizList.add(new egzersiz("One Arm To The Side Deadlift",R.drawable.deadlift1));
        egzersizList.add(new egzersiz("One-Legged Collapse",R.drawable.collapse));
        egzersizList.add(new egzersiz("Squat",R.drawable.squat1));
        egzersizList.add(new egzersiz("Standing Leg Curl",R.drawable.standing));
        egzersizList.add(new egzersiz("Steated Leg Curl",R.drawable.seatedlegcurl1));

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

        if(egz.getAd().equals("Bulgarian Squat"))
        {
            FragmentLegsBulgarianSquat bulgarianSquat=new FragmentLegsBulgarianSquat();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,bulgarianSquat).commit();

        }
        else if(egz.getAd().equals("Dumbell Lunge"))
        {
            FragmentLegsDumbellLunge dumbellLunge=new FragmentLegsDumbellLunge();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbellLunge).commit();

        }
        else if(egz.getAd().equals("Dumbell Squat"))
        {
            FragmentLegsDumbellSquat dumbellSquat=new FragmentLegsDumbellSquat();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbellSquat).commit();

        }
        else if(egz.getAd().equals("Hack Squat"))
        {
            FragmentLegsHackSquat behindTheNeckPress=new FragmentLegsHackSquat();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,behindTheNeckPress).commit();

        }
        else if(egz.getAd().equals("Leg Extension"))
        {
            FragmentLegsLegExtension legExtension=new FragmentLegsLegExtension();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,legExtension).commit();

        }
        else if(egz.getAd().equals("Leg Press"))
        {
            FragmentLegsLegPress legPress=new FragmentLegsLegPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,legPress).commit();

        }
        else if(egz.getAd().equals("One Arm To The Side Deadlift"))
        {
            FragmentLegsOneArmToTheSideDeadlift oneArmToTheSideDeadlift=new FragmentLegsOneArmToTheSideDeadlift();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,oneArmToTheSideDeadlift).commit();

        }
        else if(egz.getAd().equals("One-Legged Collapse"))
        {
            FragmentLegsOneLeggedCollapse oneLeggedCollapse=new FragmentLegsOneLeggedCollapse();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,oneLeggedCollapse).commit();

        }
        else if(egz.getAd().equals("Squat"))
        {
            FragmentLegsSquat squat=new FragmentLegsSquat();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,squat).commit();

        }else if(egz.getAd().equals("Standing Leg Curl"))
        {
            FragmentLegsStandingLegCurl standingLegCurl=new FragmentLegsStandingLegCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,standingLegCurl).commit();

        }
    }
}