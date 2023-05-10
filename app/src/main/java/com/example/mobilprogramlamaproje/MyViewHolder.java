package com.example.mobilprogramlamaproje;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView text;
    ImageView img;

    public MyViewHolder(@NonNull View itemView,RecylerViewClick click) {
        super(itemView);

        text=itemView.findViewById(R.id.textView);
        img=itemView.findViewById(R.id.image22);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click!=null){
                    int pos=getAdapterPosition();
                    if(pos!=RecyclerView.NO_POSITION){
                        click.onItemClick(pos);
                    }

                }

            }
        });
    }
}
