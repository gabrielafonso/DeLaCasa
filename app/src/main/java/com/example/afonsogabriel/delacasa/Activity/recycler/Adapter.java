package com.example.afonsogabriel.delacasa.Activity.recycler;

import android.support.v7.widget.RecyclerView;
import android.support.annotation.NonNull;

import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.TextView;

import com.example.afonsogabriel.delacasa.R;


public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemLista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_lista,viewGroup, false);

        return new Viewholder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int i) {
        viewholder.Nome.setText("Prefeitura de Maceió");

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        TextView Nome;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            Nome = itemView.findViewById(R.id.textNome);

        }
    }
}
