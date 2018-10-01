package com.sistemasvox.marcelo.paises;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.sistemasvox.marcelo.paises.model.domain.Pais;
import com.sistemasvox.marcelo.paises.model.domain.PaisAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    List<Pais> paises;
    PaisAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = new ListView(this);
        setContentView(listView);
        paises = new ArrayList<Pais>();
        paises.add(new Pais("1", "China", "1,415,045,928", 1));
        paises.add(new Pais("2", "India", "1,354,051,854", 2));
        paises.add(new Pais("3", "United States", "326,766,748", 3));
        paises.add(new Pais("4", "Indonesia", "266,794,980", 4));
        paises.add(new Pais("5", "Brazil", "210,867,954", 5));
        paises.add(new Pais("6", "Pakistan", "200,813,818", 6));
        paises.add(new Pais("7", "Nigeria", "195,875,237", 7));
        paises.add(new Pais("8", "Bangladesh", "166,368,149", 8));
        paises.add(new Pais("9", "Russia", "143,964,709", 9));
        paises.add(new Pais("10", "Mexico", "130,759,074", 10));
        listView.setAdapter(new PaisAdapter(this,paises));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Pais pais = (Pais) parent.getItemAtPosition(position);
        Toast.makeText(this, pais.getNomePais(), Toast.LENGTH_SHORT).show();
    }

}
