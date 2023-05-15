package com.example.mobilprogramlamaproje.bolgeler;

import android.content.Intent;
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
import com.example.mobilprogramlamaproje.MainActivity2;
import com.example.mobilprogramlamaproje.sixpack.FragmentHangingLegRaise;
import com.example.mobilprogramlamaproje.sixpack.FragmentInclineCrunch;
import com.example.mobilprogramlamaproje.sixpack.FragmentSideBridges;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackCrunch;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackDumbellLeanOver;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackFingertipTouch;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackFlutterKicks;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackInclineLegRaise;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackLegLowers;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackObliqueTwists;
import com.example.mobilprogramlamaproje.MyAdapter;
import com.example.mobilprogramlamaproje.R;
import com.example.mobilprogramlamaproje.egzersiz;

import java.util.ArrayList;
import java.util.List;


public class FragmentKarinKas extends Fragment implements MyAdapter.SelectedUser
{
    View view;
    List<egzersiz> egzersizList;
    RecyclerView myrecycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_karin_kas, container, false);

        myrecycler=view.findViewById(R.id.myrecyclersixpack);

        egzersizList=new ArrayList<egzersiz>();

        egzersizList.add(new egzersiz("Dumbell Lean Over",R.drawable.dumbelleanover1));
        egzersizList.add(new egzersiz("Fingertip Touch",R.drawable.fingertiptouch1));
        egzersizList.add(new egzersiz("Flutter Kicks",R.drawable.flutterkicks1));
        egzersizList.add(new egzersiz("Hanging Leg Raise",R.drawable.hanginglegraise1));
        egzersizList.add(new egzersiz("Incline Crunch",R.drawable.inclinecrunch1));
        egzersizList.add(new egzersiz("Incline Leg Raise",R.drawable.inclinelegraise1));
        egzersizList.add(new egzersiz("Leg Lowers",R.drawable.leglowers1));
        egzersizList.add(new egzersiz("Crunch",R.drawable.mmmmmmmekik1));
        egzersizList.add(new egzersiz("Oblique Twists",R.drawable.obliquetwists1));
        egzersizList.add(new egzersiz("Side Bridges",R.drawable.sidebridges1));


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

        if(egz.getAd().equals("Flutter Kicks"))
        {
            FragmentSixpackFlutterKicks flutterKicks=new FragmentSixpackFlutterKicks();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,flutterKicks).commit();
        }
        else if(egz.getAd().equals("Dumbell Lean Over"))
        {
            FragmentSixpackDumbellLeanOver leanOver=new FragmentSixpackDumbellLeanOver();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,leanOver).commit();

        }
        else if(egz.getAd().equals("Fingertip Touch"))
        {
            FragmentSixpackFingertipTouch fingertipTouch=new FragmentSixpackFingertipTouch();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,fingertipTouch).commit();

        }
        else if(egz.getAd().equals("Hanging Leg Raise"))
        {
            FragmentHangingLegRaise hangingLegRaise=new FragmentHangingLegRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,hangingLegRaise).commit();

        }
        else if(egz.getAd().equals("Incline Crunch"))
        {
            FragmentInclineCrunch fragmentInclineCrunch=new FragmentInclineCrunch();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,fragmentInclineCrunch).commit();

        }
        else if(egz.getAd().equals("Incline Leg Raise"))
        {
            FragmentSixpackInclineLegRaise sixpackInclineLegRaise=new FragmentSixpackInclineLegRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,sixpackInclineLegRaise).commit();

        }
        else if(egz.getAd().equals("Crunch"))
        {
            FragmentSixpackCrunch crunch=new FragmentSixpackCrunch();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,crunch).commit();

        }
        else if(egz.getAd().equals("Oblique Twists"))
        {
            FragmentSixpackObliqueTwists obliqueTwists=new FragmentSixpackObliqueTwists();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,obliqueTwists).commit();

        }
        else if(egz.getAd().equals("Side Bridges"))
        {
            FragmentSideBridges sideBridges=new FragmentSideBridges();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,sideBridges).commit();

        }
        else if(egz.getAd().equals("Leg Lowers"))
        {
            FragmentSixpackLegLowers legLowers=new FragmentSixpackLegLowers();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,legLowers).commit();

        }
    }
}