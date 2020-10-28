package com.progra.mi_cartera_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Ingresos extends AppCompatActivity {


    public Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos);




    //comunicacion con el spinner
        spinner2 = (Spinner)findViewById(R.id.spinner2);

        String [] Ingresos = {"Ingreso pasivo", "Ingreso activo"};

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item_spiners, Ingresos);
        spinner2.setAdapter(adapter);

    }



    //metodos para navegar entre activitys
    public void Inicio (View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

}