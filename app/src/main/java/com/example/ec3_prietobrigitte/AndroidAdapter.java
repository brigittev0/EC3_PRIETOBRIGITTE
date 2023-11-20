package com.example.ec3_prietobrigitte;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ec3_prietobrigitte.databinding.ItemAndroidBinding;

import java.util.ArrayList;

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.ViewHolder> {
    private ArrayList<ruta> lista = new ArrayList<>();
    @NonNull
    @Override
    public AndroidAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                ItemAndroidBinding.inflate(LayoutInflater.from(parent.getContext()),
                        parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidAdapter.ViewHolder holder, int position) {
        final ruta objAndroid = lista.get(position);
        holder.binding.image.setImageResource(objAndroid.getImagen());
        holder.binding.tvparadero.setText(objAndroid.getParadero());
        holder.binding.tvfechah.setText(objAndroid.getFechahora());
        holder.binding.tvpasajero.setText(objAndroid.getPasajero());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
    public void setData(ArrayList<ruta> data){
        lista.addAll(data);
        notifyDataSetChanged();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemAndroidBinding binding;
        public ViewHolder(ItemAndroidBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
    }
    }
}
