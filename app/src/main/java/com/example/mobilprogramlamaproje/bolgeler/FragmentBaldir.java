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

import com.example.mobilprogramlamaproje.calf.FragmentBarbellSeatedCalfRaise;
import com.example.mobilprogramlamaproje.calf.FragmentBarbellSeatedCalfRaiseOneLeg;
import com.example.mobilprogramlamaproje.calf.FragmentCalfBarbellCalfRaise;
import com.example.mobilprogramlamaproje.calf.FragmentCalfDumbbellSeatedCalfRaise;
import com.example.mobilprogramlamaproje.calf.FragmentCalfDumbbellVault;
import com.example.mobilprogramlamaproje.calf.FragmentCalfOneArmPushUps;
import com.example.mobilprogramlamaproje.calf.FragmentCalfStandingDumbbellCalfRaise;
import com.example.mobilprogramlamaproje.calf.FragmentCalfStandingDumbbellCalfRaiseOneToe;
import com.example.mobilprogramlamaproje.MyAdapter;
import com.example.mobilprogramlamaproje.R;
import com.example.mobilprogramlamaproje.egzersiz;

import java.util.ArrayList;
import java.util.List;

public class FragmentBaldir extends Fragment implements MyAdapter.SelectedUser {

    View view;
    List<egzersiz> egzersizList;
    RecyclerView myrecycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_baldir, container, false);

        myrecycler=view.findViewById(R.id.myrecyclercalf);

        egzersizList=new ArrayList<egzersiz>();

        egzersizList.add(new egzersiz("Barbell Calf Raise",R.drawable.barbellcalfraise1));
        egzersizList.add(new egzersiz("Barbell Seated Calf Raise One Leg",R.drawable.aaleg1));
        egzersizList.add(new egzersiz("Barbell Seated Calf Raise",R.drawable.aaaaaraise1));
        egzersizList.add(new egzersiz("Dumbbell Seated Calf Raise",R.drawable.bbbbbraise1));
        egzersizList.add(new egzersiz("Dumbbell Vault",R.drawable.vault1));
        egzersizList.add(new egzersiz("One-Arm Push-Ups",R.drawable.pushups1));
        egzersizList.add(new egzersiz("Standing Dumbbell Calf Raise One Toe",R.drawable.onetoe1));
        egzersizList.add(new egzersiz("Standing Dumbbell Calf Raise",R.drawable.dddddraise1));
        egzersizList.add(new egzersiz("Seated Calf Raise Machine",R.drawable.seatedcalfraisemachine1));

        myrecycler.setLayoutManager(new LinearLayoutManager(view.getContext()));
        myrecycler.setAdapter(new MyAdapter(view.getContext(),egzersizList,this));

        return view;
    }

    @Override
    public void selecteduser(egzersiz egz) {

        if(egz.getAd().equals("Barbell Calf Raise"))
        {
            FragmentCalfBarbellCalfRaise barbellCalfRaise=new FragmentCalfBarbellCalfRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,barbellCalfRaise).commit();

        }
        else if(egz.getAd().equals("Barbell Seated Calf Raise One Leg"))
        {
            FragmentBarbellSeatedCalfRaiseOneLeg barbellSeatedCalfRaiseOneLeg=new FragmentBarbellSeatedCalfRaiseOneLeg();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,barbellSeatedCalfRaiseOneLeg).commit();

        }
        else if(egz.getAd().equals("Barbell Seated Calf Raise"))
        {
            FragmentBarbellSeatedCalfRaise barbellSeatedCalfRaise=new FragmentBarbellSeatedCalfRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,barbellSeatedCalfRaise).commit();

        }
        else if(egz.getAd().equals("Dumbbell Seated Calf Raise"))
        {
            FragmentCalfDumbbellSeatedCalfRaise dumbbellSeatedCalfRaise=new FragmentCalfDumbbellSeatedCalfRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbbellSeatedCalfRaise).commit();

        }
        else if(egz.getAd().equals("Dumbbell Vault"))
        {
            FragmentCalfDumbbellVault dumbbellVault=new FragmentCalfDumbbellVault();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbbellVault).commit();

        }
        else if(egz.getAd().equals("One-Arm Push-Ups"))
        {
            FragmentCalfOneArmPushUps oneArmPushUps=new FragmentCalfOneArmPushUps();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,oneArmPushUps).commit();

        }
        else if(egz.getAd().equals("Standing Dumbbell Calf Raise One Toe"))
        {
            FragmentCalfStandingDumbbellCalfRaiseOneToe standingDumbbellCalfRaiseOneToe=new FragmentCalfStandingDumbbellCalfRaiseOneToe();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,standingDumbbellCalfRaiseOneToe).commit();

        }
        else if(egz.getAd().equals("Standing Dumbbell Calf Raise"))
        {
            FragmentCalfStandingDumbbellCalfRaise standingDumbbellCalfRaise=new FragmentCalfStandingDumbbellCalfRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,standingDumbbellCalfRaise).commit();

        }
    }
}