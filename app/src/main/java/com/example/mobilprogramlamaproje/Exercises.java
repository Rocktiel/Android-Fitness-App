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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Exercises#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Exercises extends Fragment implements RecylerViewClick {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Exercises() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Exercises.
     */
    // TODO: Rename and change types and number of parameters
    public static Exercises newInstance(String param1, String param2) {
        Exercises fragment = new Exercises();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

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
        rv.setAdapter(new MyAdapter(view.getContext(),egzersizList, (RecylerViewClick) this));

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
        rv.setAdapter(new MyAdapter(view.getContext(),filteredList, (RecylerViewClick) this));
    }
    public void onItemClick(int position) {


        if(position==0){
            FragmentKarinKas karinkas=new FragmentKarinKas();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,karinkas).commit();

        }
        else if(position==2){
            FragmentBiceps biceps=new FragmentBiceps();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,biceps).commit();

        }
        else if(position==3){
            FragmentBaldir baldir=new FragmentBaldir();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,baldir).commit();

        }
        else if(position==4){
            FragmentGogus gogus=new FragmentGogus();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,gogus).commit();

        }
        else if(position==5){
            FragmentOnKollar onkollar=new FragmentOnKollar();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,onkollar).commit();

        }
        else if(position==6){
            FragmentBacaklar bacak=new FragmentBacaklar();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,bacak).commit();

        }
        else if(position==7){
            FragmentOmuzlar omuz=new FragmentOmuzlar();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,omuz).commit();

        }
        else if(position==8){
            FragmentTriceps triceps=new FragmentTriceps();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,triceps).commit();

        }
        else if(position==1){
            FragmentGeri geri=new FragmentGeri();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,geri).commit();

        }

    }

}