package com.example.mobilprogramlamaproje;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Exercises#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Exercises extends Fragment {

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

        egzersizList.add(new egzersiz("Bacaklar",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Göğüs",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Karın",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Omuz",R.drawable.bacakkas));


        rv.setLayoutManager(new LinearLayoutManager(view.getContext()));
        rv.setAdapter(new MyAdapter(view.getContext(),egzersizList));


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
            if(person1.getAd().contains(text)){
                filteredList.add(person1);
            }
        }


        rv.setAdapter(new MyAdapter(view.getContext(),filteredList));


    }
}