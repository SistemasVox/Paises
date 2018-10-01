package com.sistemasvox.marcelo.paises.model.domain;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sistemasvox.marcelo.paises.R;

import java.util.List;

public class PaisAdapter extends BaseAdapter {

    Context ctx;
    List<Pais> lista;

    public PaisAdapter(Context ctx, List<Pais> lista) {
        this.ctx = ctx;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Passo 1 Criar o Objeto Pais
        Pais pais = lista.get(position);

        //Passo 2 Criar Linha (Lista de Layouts)
        View linha = LayoutInflater.from(ctx).inflate(R.layout.paises,null);

        //Passo 3
        ImageView img = (ImageView) linha.findViewById(R.id.Foto);
        TextView Rank = (TextView) linha.findViewById(R.id.Rank);
        TextView Pais = (TextView) linha.findViewById(R.id.Pais);
        TextView Populacao = (TextView) linha.findViewById(R.id.Populacao);

        TypedArray fotos = ctx.getResources().obtainTypedArray(R.array.fotos);
        img.setImageDrawable(fotos.getDrawable(pais.getFoto()));
        Rank.setText("Rank: " + pais.getRank());
        Pais.setText("País: " + pais.getPais());
        Populacao.setText("População: " + pais.getPopulacao());

        return linha;
    }
}
