package com.example.mobilprogramlamaproje;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    List<egzersiz> egzersizler;

    public MyAdapter(Context context, List<egzersiz> egzersizler) {
        this.context = context;
        this.egzersizler = egzersizler;
    }

    public void setFilteredList(List<egzersiz> filteredList){
        this.egzersizler=filteredList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.egzersiz,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.img.setImageResource(egzersizler.get(position).getImage());
        holder.text.setText(egzersizler.get(position).getAd());

    }

    @Override
    public int getItemCount() {
        return egzersizler.size();
    }
}
