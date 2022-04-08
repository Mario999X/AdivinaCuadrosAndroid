package com.example.adivinacuadros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jugarAdivinacion(View view){
        Intent intent = new Intent(MainActivity.this, ActivityJuego.class);
        startActivity(intent);
    }

    public void verListaCuadros(View view){
        Intent intent = new Intent(MainActivity.this, ActivityListaCuadros.class);
        startActivity(intent);
    }


    public void verAcercaDe(View view){
        Intent intent = new Intent(MainActivity.this, ActivityAcercaDe.class);
        startActivity(intent);
    }
}