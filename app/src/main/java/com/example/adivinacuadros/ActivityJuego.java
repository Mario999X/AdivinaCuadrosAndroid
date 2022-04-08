package com.example.adivinacuadros;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adivinacuadros.Model.Cuadro;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class ActivityJuego extends AppCompatActivity {

    List<Cuadro> cuadroList = new ArrayList<>();
    int random;

    TextView textViewVidas, textViewPuntos;
    ImageView imageViewJuego;
    EditText editTextNombreJuego;
    Button btnConfirmar;


    int vidas = 3;
    int puntos = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        textViewVidas = findViewById(R.id.textViewVidas);
        textViewPuntos = findViewById(R.id.textViewPuntos);
        imageViewJuego = findViewById(R.id.imageViewJuego);
        editTextNombreJuego = findViewById(R.id.editTextNombreJuego);
        btnConfirmar = findViewById(R.id.btnConfirmar);

        rellenarLista();
        cuadroRandom();
        empezarJuego();
    }


    // ENCONTRAR UN MEJOR METODO
    private void rellenarLista() {

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

    private int cuadroRandom(){
        random = (int) (Math.random() * cuadroList.size());
        imageViewJuego.setImageResource(cuadroList.get(random).getImagen());
        return random;
    }

    private void empezarJuego() {
        btnConfirmar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String adivinacion = editTextNombreJuego.getText().toString();
                String cuadroElegido = cuadroList.get(random).getNombre();
                if (adivinacion.equalsIgnoreCase(cuadroElegido)){
                    Toast.makeText(ActivityJuego.this, "¡Acertaste!", Toast.LENGTH_SHORT).show();
                    puntos = puntos + 1;
                } else {
                    Toast.makeText(ActivityJuego.this, "¡Fallaste!", Toast.LENGTH_SHORT).show();
                    vidas = vidas - 1;
                    if (vidas == 0){
                        Snackbar.make(findViewById(R.id.layoutJuego), "¡Fin del juego! | Puntuación: "+ puntos, Snackbar.LENGTH_LONG).show();
                        vidas = 3;
                        puntos = 0;
                        textViewVidas.setText("Vidas: ");
                        textViewPuntos.setText("Puntos: ");
                    }
                }
                cuadroRandom();
                editTextNombreJuego.setText("");
                textViewVidas.setText("Vidas: " + vidas);
                textViewPuntos.setText("Puntos: " + puntos);
            }
        });
    }

}
