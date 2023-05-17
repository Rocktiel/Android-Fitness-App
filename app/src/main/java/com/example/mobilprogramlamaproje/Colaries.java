package com.example.mobilprogramlamaproje;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Colaries extends Fragment {




    public TextView kalori;
    RecyclerView rv;



    List<Food> yiyecekListt;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_colaries, container, false);

        rv=view.findViewById(R.id.myrecycler);



        kalori=view.findViewById(R.id.kalori);

        yiyecekListt= new ArrayList<>();


        yiyecekListt.add(new Food("1 Slice White Bread(Thin)","64",R.drawable.slicebread));
        yiyecekListt.add(new Food("Egg(50g)","72",R.drawable.egg));
        yiyecekListt.add(new Food("5 Olives","30",R.drawable.olive));
        yiyecekListt.add(new Food("Apple","47",R.drawable.apple));
        yiyecekListt.add(new Food("Banana","151",R.drawable.banana));
        yiyecekListt.add(new Food("Green Apple","52",R.drawable.greenapple));
        yiyecekListt.add(new Food("Fish","164",R.drawable.fish));
        yiyecekListt.add(new Food("Broccoli","52",R.drawable.broccoli));
        yiyecekListt.add(new Food("Rice(150g)","205",R.drawable.rice));
        yiyecekListt.add(new Food("Fried Chicken(140g)","377",R.drawable.chicken));
        yiyecekListt.add(new Food("Almonds(1 Handful)","142",R.drawable.almond));
        yiyecekListt.add(new Food("Yoghurt(200g)","122",R.drawable.yoghurt));
        yiyecekListt.add(new Food("Boiled Potato(100g)","86",R.drawable.potato));
        yiyecekListt.add(new Food("Hazelnut(1 Handful)","178",R.drawable.hazelnut));
        yiyecekListt.add(new Food("1 Walnut","31",R.drawable.walnut));
        yiyecekListt.add(new Food("Cheese(1 Slice)","93",R.drawable.cheese));
        yiyecekListt.add(new Food("Cucumber","18",R.drawable.cucumber));
        yiyecekListt.add(new Food("Oat(100g)","351",R.drawable.oat));
        yiyecekListt.add(new Food("Tomatoe","20",R.drawable.tomato));
        yiyecekListt.add(new Food("Turkey(60g)","110",R.drawable.turkey));
        yiyecekListt.add(new Food("Milk(1 Cup)","122",R.drawable.milk));



        rv.setLayoutManager(new LinearLayoutManager(view.getContext()));

        rv.setAdapter(new MyAdapterFood(view.getContext(), yiyecekListt, new ClickDelegate(){

            public void onClick(String text){

                String ilkkalori=kalori.getText().toString();
                int gelenkalori=Integer.parseInt(text);
                int ilkkalorii=Integer.parseInt(ilkkalori);
                int sonhal=gelenkalori+ilkkalorii;

                String sonhals=String.valueOf(sonhal);
                kalori.setText(sonhals);
            }

            @Override
            public void onClickDelete(String text) {
                String ilkkalori=kalori.getText().toString();
                int gelenkalori=Integer.parseInt(text);
                int ilkkalorii=Integer.parseInt(ilkkalori);
                int sonhal=ilkkalorii-gelenkalori;

                String sonhals=String.valueOf(sonhal);
                kalori.setText(sonhals);
            }
        }));





        return view;
    }


}