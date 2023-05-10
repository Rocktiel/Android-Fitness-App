package com.example.mobilprogramlamaproje.bolgeler;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mobilprogramlamaproje.MyAdapter;
import com.example.mobilprogramlamaproje.R;
import com.example.mobilprogramlamaproje.RecylerViewClick;
import com.example.mobilprogramlamaproje.egzersiz;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentTriceps#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTriceps extends Fragment implements RecylerViewClick {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentTriceps() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTriceps.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentTriceps newInstance(String param1, String param2) {
        FragmentTriceps fragment = new FragmentTriceps();
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
    List<egzersiz> egzersizList;
    RecyclerView myrecycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_triceps, container, false);

        myrecycler=view.findViewById(R.id.myrecyclertriceps);

        egzersizList=new ArrayList<egzersiz>();

        egzersizList.add(new egzersiz("Flutter Kicks",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Side Bridges",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Superman",R.drawable.bacakkas));
        egzersizList.add(new egzersiz("Hanging Leg Raise",R.drawable.bacakkas));

        myrecycler.setLayoutManager(new LinearLayoutManager(view.getContext()));
        myrecycler.setAdapter(new MyAdapter(view.getContext(),egzersizList, (RecylerViewClick) this));




        return view;
    }

    @Override
    public void onItemClick(int position) {

    }
}