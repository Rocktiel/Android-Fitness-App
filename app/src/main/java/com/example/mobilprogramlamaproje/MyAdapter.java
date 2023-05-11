package com.example.mobilprogramlamaproje;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    List<egzersiz> egzersizler;
    //private final RecylerViewClick click;
    private SelectedUser selectedUser;

    public MyAdapter(Context context, List<egzersiz> egzersizler,SelectedUser selectedUser) {
        this.context = context;
        this.egzersizler = egzersizler;
        this.selectedUser=selectedUser;
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

        egzersiz egz=egzersizler.get(position);

        String username=egz.getAd();
        int imggg=egz.getImage();


        holder.img.setImageResource(imggg);
        holder.text.setText(username);


    }

    @Override
    public int getItemCount() {
        return egzersizler.size();
    }

    public interface SelectedUser{
        void selecteduser(egzersiz egz);
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView text;
        public ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.textView);
            img = itemView.findViewById(R.id.image22);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectedUser.selecteduser(egzersizler.get(getAdapterPosition()));


                }
            });
        }
    }
}



