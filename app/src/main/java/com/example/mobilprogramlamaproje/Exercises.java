package com.example.mobilprogramlamaproje;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mobilprogramlamaproje.bolgeler.FragmentBacaklar;
import com.example.mobilprogramlamaproje.bolgeler.FragmentBaldir;
import com.example.mobilprogramlamaproje.bolgeler.FragmentBiceps;
import com.example.mobilprogramlamaproje.bolgeler.FragmentGeri;
import com.example.mobilprogramlamaproje.bolgeler.FragmentGogus;
import com.example.mobilprogramlamaproje.bolgeler.FragmentKarinKas;
import com.example.mobilprogramlamaproje.bolgeler.FragmentOmuzlar;
import com.example.mobilprogramlamaproje.bolgeler.FragmentOnKollar;
import com.example.mobilprogramlamaproje.bolgeler.FragmentTriceps;

import java.util.ArrayList;
import java.util.List;

public class Exercises extends Fragment implements MyAdapter.SelectedUser {
    View view;

    RecyclerView rv;

    List<egzersiz> egzersizList;

    SearchView sv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_exercises, container, false);

        rv=view.findViewById(R.id.myrecycler);

        egzersizList=new ArrayList<egzersiz>();

        egzersizList.add(new egzersiz("Sixpack",R.drawable.sixpackv3));
        egzersizList.add(new egzersiz("Back",R.drawable.back));
        egzersizList.add(new egzersiz("Biceps",R.drawable.biceps));
        egzersizList.add(new egzersiz("Calf",R.drawable.craf));
        egzersizList.add(new egzersiz("Chest",R.drawable.chest));
        egzersizList.add(new egzersiz("Forearm",R.drawable.forearm));
        egzersizList.add(new egzersiz("Legs",R.drawable.legs));
        egzersizList.add(new egzersiz("Shoulder",R.drawable.shoulder));
        egzersizList.add(new egzersiz("Triceps",R.drawable.triceps));

        rv.setLayoutManager(new LinearLayoutManager(view.getContext()));
        rv.setAdapter(new MyAdapter(view.getContext(),egzersizList,this::selecteduser));

        sv=view.findViewById(R.id.searchviewexercise);
        sv.clearFocus();

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }
        });
        return view;
    }

    private void filterList(String text) {
        List<egzersiz> filteredList=new ArrayList<>();
        for(egzersiz person1 : egzersizList){
            if(person1.getAd().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(person1);
            }
        }
        rv.setAdapter(new MyAdapter(view.getContext(),filteredList,this::selecteduser));
    }

    @Override
    public void selecteduser(egzersiz egz) {

        if(egz.getAd().equals("Sixpack")){
            FragmentKarinKas karinkas=new FragmentKarinKas();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,karinkas).commit();

        }
        else if(egz.getAd().equals("Biceps")){
            FragmentBiceps biceps=new FragmentBiceps();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,biceps).commit();

        }
        else if(egz.getAd().equals("Calf")){
            FragmentBaldir baldir=new FragmentBaldir();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,baldir).commit();

        }
        else if(egz.getAd().equals("Chest")){
            FragmentGogus gogus=new FragmentGogus();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,gogus).commit();

        }
        else if(egz.getAd().equals("Forearm")){
            FragmentOnKollar onkollar=new FragmentOnKollar();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,onkollar).commit();

        }
        else if(egz.getAd().equals("Legs")){
            FragmentBacaklar bacak=new FragmentBacaklar();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,bacak).commit();

        }
        else if(egz.getAd().equals("Shoulder")){
            FragmentOmuzlar omuz=new FragmentOmuzlar();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,omuz).commit();

        }
        else if(egz.getAd().equals("Triceps")){
            FragmentTriceps triceps=new FragmentTriceps();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,triceps).commit();

        }
        else if(egz.getAd().equals("Back")){
            FragmentGeri geri=new FragmentGeri();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,geri).commit();

        }

    }
}