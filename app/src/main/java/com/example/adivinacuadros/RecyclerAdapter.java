package com.example.adivinacuadros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.adivinacuadros.Model.Cuadro;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    List<Cuadro> cuadroList;
    Context context;

    public RecyclerAdapter(List<Cuadro> cuadroList, Context context) {
        this.cuadroList = cuadroList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_elementos_lista, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {

        Cuadro item = cuadroList.get(position);
        holder.tituloCuadro.setText(item.getNombre());

        Glide.with(context).load(item.getImagen()).into(holder.imageViewCuadroLista);
    }

    @Override
    public int getItemCount() {
        return cuadroList.size();
    }

    // CLASE VIEWHOLDER
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tituloCuadro;
        ImageView imageViewCuadroLista;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tituloCuadro = itemView.findViewById(R.id.textViewTitulo);
            imageViewCuadroLista = itemView.findViewById(R.id.imageViewCuadroLista);
        }
    }
}
