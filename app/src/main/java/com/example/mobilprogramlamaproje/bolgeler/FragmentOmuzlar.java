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

import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderArnoldPress;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderBarbellFrontRaise;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderBarbellShoulderPress;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderBehindTheNeckPress;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderBentOverCableLateralRaise;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderDumbbellFrontRaise;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderDumbbellShoulderPress;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderLateralRaise;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderOneArmCableLateralRaise;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderSeatedLateralRaise;
import com.example.mobilprogramlamaproje.shoulder.FragmentUprightRow;
import com.example.mobilprogramlamaproje.shoulder.FragmentWeightPlateFrontRaises;
import com.example.mobilprogramlamaproje.MyAdapter;
import com.example.mobilprogramlamaproje.R;
import com.example.mobilprogramlamaproje.egzersiz;

import java.util.ArrayList;
import java.util.List;

public class FragmentOmuzlar extends Fragment implements MyAdapter.SelectedUser {

    View view;
    List<egzersiz> egzersizList;
    RecyclerView myrecycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_omuzlar, container, false);

        myrecycler=view.findViewById(R.id.myrecyclershoulder);

        egzersizList=new ArrayList<egzersiz>();

        egzersizList.add(new egzersiz("Arnold Press",R.drawable.arnoldpress1));
        egzersizList.add(new egzersiz("Barbell Front Raise",R.drawable.barbellfrontraise1));
        egzersizList.add(new egzersiz("Barbell Shoulder Press",R.drawable.barbellshoulderpress1));
        egzersizList.add(new egzersiz("Behind The Neck Press",R.drawable.behindtheneckpress1));
        egzersizList.add(new egzersiz("Bent Over Cable Lateral Raise",R.drawable.bentovercablelateralraise1));
        egzersizList.add(new egzersiz("Dumbbell Front Raise",R.drawable.dumbbellfrontraise1));
        egzersizList.add(new egzersiz("Dumbbell Shoulder Press",R.drawable.dumbbellshoulderpress1));
        egzersizList.add(new egzersiz("Lateral Raise",R.drawable.lateralraise1));
        egzersizList.add(new egzersiz("One Arm Cable Lateral Raise",R.drawable.onearmcablelateralraise1));
        egzersizList.add(new egzersiz("Seated Lateral Raise",R.drawable.seatedlateralraise1));
        egzersizList.add(new egzersiz("Upright Row",R.drawable.uprightrow1));
        egzersizList.add(new egzersiz("Weight Plate Front Raises",R.drawable.weightplatefrontraises1));

        myrecycler.setLayoutManager(new LinearLayoutManager(view.getContext()));
        myrecycler.setAdapter(new MyAdapter(view.getContext(),egzersizList,this));

        return view;
    }

    @Override
    public void selecteduser(egzersiz egz) {

        if(egz.getAd().equals("Arnold Press"))
        {
            FragmentShoulderArnoldPress arnoldPress=new FragmentShoulderArnoldPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,arnoldPress).commit();

        }
        else if(egz.getAd().equals("Barbell Front Raise"))
        {
            FragmentShoulderBarbellFrontRaise barbellFrontRaise=new FragmentShoulderBarbellFrontRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,barbellFrontRaise).commit();

        }
        else if(egz.getAd().equals("Barbell Shoulder Press"))
        {
            FragmentShoulderBarbellShoulderPress barbellShoulderPress=new FragmentShoulderBarbellShoulderPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,barbellShoulderPress).commit();

        }
        else if(egz.getAd().equals("Behind The Neck Press"))
        {
            FragmentShoulderBehindTheNeckPress behindTheNeckPress=new FragmentShoulderBehindTheNeckPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,behindTheNeckPress).commit();

        }
        else if(egz.getAd().equals("Bent Over Cable Lateral Raise"))
        {
            FragmentShoulderBentOverCableLateralRaise bentOverCableLateralRaise=new FragmentShoulderBentOverCableLateralRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,bentOverCableLateralRaise).commit();

        }
        else if(egz.getAd().equals("Dumbbell Front Raise"))
        {
            FragmentShoulderDumbbellFrontRaise dumbbellFrontRaise=new FragmentShoulderDumbbellFrontRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbbellFrontRaise).commit();

        }
        else if(egz.getAd().equals("Dumbbell Shoulder Press"))
        {
            FragmentShoulderDumbbellShoulderPress dumbbellShoulderPress=new FragmentShoulderDumbbellShoulderPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbbellShoulderPress).commit();

        }
        else if(egz.getAd().equals("Lateral Raise"))
        {
            FragmentShoulderLateralRaise lateralRaise=new FragmentShoulderLateralRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,lateralRaise).commit();

        }
        else if(egz.getAd().equals("One Arm Cable Lateral Raise"))
        {
            FragmentShoulderOneArmCableLateralRaise oneArmCableLateralRaise=new FragmentShoulderOneArmCableLateralRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,oneArmCableLateralRaise).commit();

        }else if(egz.getAd().equals("Seated Lateral Raise"))
        {
            FragmentShoulderSeatedLateralRaise seatedLateralRaise=new FragmentShoulderSeatedLateralRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,seatedLateralRaise).commit();

        }else if(egz.getAd().equals("Upright Row"))
        {
            FragmentUprightRow uprightRow=new FragmentUprightRow();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,uprightRow).commit();

        }else if(egz.getAd().equals("Weight Plate Front Raises"))
        {
            FragmentWeightPlateFrontRaises weightPlateFrontRaises=new FragmentWeightPlateFrontRaises();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,weightPlateFrontRaises).commit();
        }
    }
}