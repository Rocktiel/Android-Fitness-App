package com.example.mobilprogramlamaproje;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapterTraining extends RecyclerView.Adapter<MyAdapterTraining.MyViewHolder> {

    Context context;
    List<antrenman> antrenmanlar;

    private SelectedUserTra selectedUser;

    public MyAdapterTraining(Context context, List<antrenman> antrenmanlar, SelectedUserTra selectedUser) {
        this.context = context;
        this.antrenmanlar = antrenmanlar;
        this.selectedUser=selectedUser;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyAdapterTraining.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.antrenmandeneme,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        /*holder.text.setText(antrenmanlar.get(position).getName());
        holder.textweight.setText(antrenmanlar.get(position).getWeight());
        holder.textset.setText(antrenmanlar.get(position).getSet());
        holder.texttekrar.setText(antrenmanlar.get(position).getRepetition());*/

        antrenman ant=antrenmanlar.get(position);

        String name=ant.getName();
        String weight=ant.getWeight();
        String set=ant.getSet();
        String rep=ant.getRepetition();



        holder.text.setText(name);
        holder.textweight.setText(weight);
        holder.textset.setText(set);
        holder.texttekrar.setText(rep);

    }

    @Override
    public int getItemCount() {
        return antrenmanlar.size();
    }

    public interface SelectedUserTra{
        void selecteduser(antrenman ant);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView text,textweight,textset,texttekrar;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.textViewad);
            textweight = itemView.findViewById(R.id.textViewweight);
            textset = itemView.findViewById(R.id.textViewset);
            texttekrar = itemView.findViewById(R.id.textViewtekrar);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectedUser.selecteduser(antrenmanlar.get(getAdapterPosition()));


                }
            });


        }
    }

}
