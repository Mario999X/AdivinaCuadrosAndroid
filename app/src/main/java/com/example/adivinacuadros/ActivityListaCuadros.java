package com.example.adivinacuadros;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adivinacuadros.Model.Cuadro;

import java.util.ArrayList;
import java.util.List;

public class ActivityListaCuadros extends AppCompatActivity {

    List<Cuadro> cuadroList = new ArrayList<>();
    RecyclerAdapter adapterCuadros;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cuadros);
        cargarLista();
    }

    private void rellenarLista(){

        Cuadro c1 = new Cuadro("Dignidad", R.drawable.dignidad_simpson);
        Cuadro c2 = new Cuadro("La Gioconda", R.drawable.gioconda);
        Cuadro c3 = new Cuadro("La Noche Estrellada", R.drawable.noche_estrellada);
        Cuadro c4 = new Cuadro("Las Meninas", R.drawable.meninas);
        Cuadro c5 = new Cuadro("Guernica", R.drawable.guernica);
        Cuadro c6 = new Cuadro("El Grito", R.drawable.grito);
        Cuadro c7 = new Cuadro("El Jardin de las Delicias", R.drawable.jardin_delicias);
        Cuadro c8 = new Cuadro("Leccion de anatomia", R.drawable.leccion_anatomia);
        Cuadro c9 = new Cuadro("El matrimonio Arnolfini", R.drawable.matrimonio_arnolfini);
        Cuadro c10 = new Cuadro("El nacimiento de Venus", R.drawable.nacimiento_de_venus);
        Cuadro c11 = new Cuadro("La Persistencia de la memoria", R.drawable.persistencia_de_la_memoria);
        Cuadro c12 = new Cuadro("La ultima cena", R.drawable.ultima_cena);
        Cuadro c13 = new Cuadro("Los girasoles", R.drawable.los_girasoles);
        Cuadro c14 = new Cuadro("La rendicion de Breda", R.drawable.rendicion);
        Cuadro c15 = new Cuadro("La Libertad guiando al pueblo", R.drawable.libertad_pueblo);
        Cuadro c16 = new Cuadro("Los fusilamientos del 3 de mayo", R.drawable.el_3_de_mayo);
        Cuadro c17 = new Cuadro("Condenados por la Inquisicion", R.drawable.condenados_por_inquisicion);
        Cuadro c18 = new Cuadro("El caminante sobre un mar de nubes", R.drawable.caminante_mar_nubes);
        //Cuadro c = new Cuadro("", );

        cuadroList.add(c1);
        cuadroList.add(c2);
        cuadroList.add(c3);
        cuadroList.add(c4);
        cuadroList.add(c5);
        cuadroList.add(c6);
        cuadroList.add(c7);
        cuadroList.add(c8);
        cuadroList.add(c9);
        cuadroList.add(c10);
        cuadroList.add(c11);
        cuadroList.add(c12);
        cuadroList.add(c13);
        cuadroList.add(c14);
        cuadroList.add(c15);
        cuadroList.add(c16);
        cuadroList.add(c17);
        cuadroList.add(c18);
        //cuadroList.add();
    }

    private void cargarLista(){
        rellenarLista();
        recyclerView = findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(layoutManager);

        adapterCuadros = new RecyclerAdapter(cuadroList, recyclerView.getContext());
        recyclerView.setAdapter(adapterCuadros);

    }
}
