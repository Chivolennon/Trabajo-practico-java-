package com.example.ezbro;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>
{
    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context contexto;

    public ListAdapter(List<ListElement> itemList, Context contexto)
    {
        this.mInflater = LayoutInflater.from(contexto);
        this.contexto = contexto;
        this.mData = itemList;
    }
    @Override
    public int getItemCount()
    {
        return mData.size();
    }
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ListAdapter.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position)
    {
        holder.bindData(mData.get(position));
    }

    public void setItem(List<ListElement> items)
    {
        mData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView iconImagen;
        TextView nombre, ciudad, estado;

        ViewHolder( View itemView)
        {
            super(itemView);
            iconImagen = itemView.findViewById(R.id.ezz);
            nombre = itemView.findViewById(R.id.nombre);
            ciudad = itemView.findViewById(R.id.Ciudad);
            estado = itemView.findViewById(R.id.estado);
        }

        void bindData(final ListElement item )
        {
            iconImagen.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            nombre.setText(item.getNombre());
            ciudad.setText(item.getCiudad());
            estado.setText(item.getEstado());
        }
    }




}
