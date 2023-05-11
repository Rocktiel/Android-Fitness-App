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

import com.example.mobilprogramlamaproje.back.FragmentBackBarfixReverseGrip;
import com.example.mobilprogramlamaproje.back.FragmentBackBumbellShrug;
import com.example.mobilprogramlamaproje.back.FragmentBackDumbellRow;
import com.example.mobilprogramlamaproje.back.FragmentBackDumbellShrug;
import com.example.mobilprogramlamaproje.back.FragmentBackHyperExtension;
import com.example.mobilprogramlamaproje.back.FragmentBackLetPullDown;
import com.example.mobilprogramlamaproje.back.FragmentBackPullUp;
import com.example.mobilprogramlamaproje.back.FragmentBackSeatedCableRow;
import com.example.mobilprogramlamaproje.back.FragmentBackSuperman;
import com.example.mobilprogramlamaproje.back.FragmentBackTBarRow;
import com.example.mobilprogramlamaproje.back.FragmentBentOverTwoArmDumbellRow;
import com.example.mobilprogramlamaproje.MyAdapter;
import com.example.mobilprogramlamaproje.R;
import com.example.mobilprogramlamaproje.egzersiz;

import java.util.ArrayList;
import java.util.List;

public class FragmentGeri extends Fragment implements MyAdapter.SelectedUser {

    View view;
    List<egzersiz> egzersizList;
    RecyclerView myrecycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_geri, container, false);

        myrecycler=view.findViewById(R.id.myrecyclerback);

        egzersizList=new ArrayList<egzersiz>();

        egzersizList.add(new egzersiz("Bumbell Shrug",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Dumbell Row",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Dumbell Shrug",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Let Pull Down",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Pull Up",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Seated Cable Row",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Hyper Extension",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Bent Over Two Arm Dumbell Row",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Superman",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("T-Bar Row",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Barfix Reverse Grip",R.drawable.bacakkas));

        myrecycler.setLayoutManager(new LinearLayoutManager(view.getContext()));
        myrecycler.setAdapter(new MyAdapter(view.getContext(),egzersizList,this));

        return view;
    }

    @Override
    public void selecteduser(egzersiz egz) {

        if(egz.getAd().equals("Bumbell Shrug"))
        {
            FragmentBackBumbellShrug backBumbellShrug=new FragmentBackBumbellShrug();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,backBumbellShrug).commit();

        }
        else if(egz.getAd().equals("Dumbell Row"))
        {
            FragmentBackDumbellRow dumbellRow=new FragmentBackDumbellRow();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbellRow).commit();

        }
        else if(egz.getAd().equals("Dumbell Shrug"))
        {
            FragmentBackDumbellShrug dumbellShrug=new FragmentBackDumbellShrug();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbellShrug).commit();

        }
        else if(egz.getAd().equals("Let Pull Down"))
        {
            FragmentBackLetPullDown letPullDown=new FragmentBackLetPullDown();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,letPullDown).commit();

        }
        else if(egz.getAd().equals("Pull Up"))
        {
            FragmentBackPullUp pullUp=new FragmentBackPullUp();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,pullUp).commit();

        }
        else if(egz.getAd().equals("Seated Cable Row"))
        {
            FragmentBackSeatedCableRow seatedCableRow=new FragmentBackSeatedCableRow();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,seatedCableRow).commit();

        }
        else if(egz.getAd().equals("Hyper Extension"))
        {
            FragmentBackHyperExtension hyperExtension=new FragmentBackHyperExtension();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,hyperExtension).commit();

        }
        else if(egz.getAd().equals("Bent Over Two Arm Dumbell Row"))
        {
            FragmentBentOverTwoArmDumbellRow bentOverTwoArmDumbellRow=new FragmentBentOverTwoArmDumbellRow();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,bentOverTwoArmDumbellRow).commit();

        }
        else if(egz.getAd().equals("Superman"))
        {
            FragmentBackSuperman superman=new FragmentBackSuperman();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,superman).commit();

        }
        else if(egz.getAd().equals("T-Bar Row"))
        {
            FragmentBackTBarRow tBarRow=new FragmentBackTBarRow();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,tBarRow).commit();

        }
        else if(egz.getAd().equals("Barfix Reverse Grip"))
        {
            FragmentBackBarfixReverseGrip backBarfixReverseGrip=new FragmentBackBarfixReverseGrip();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,backBarfixReverseGrip).commit();

        }
    }
}
