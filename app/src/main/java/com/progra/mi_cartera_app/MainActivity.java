package com.progra.mi_cartera_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {



    //declaracion de los elementos que voy a utilizar
    public Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //comunicacion con los elementos a utulizar
        spinner1 = (Spinner)findViewById(R.id.spinner);



        //introduzco los valores al spinner
        String [] Meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_spiners,Meses);
        spinner1.setAdapter(adapter);

    }



    //metodos para navegar entre activitys
    public void  Ingreso (View view){
        Intent Ingresos = new Intent(this, com.progra.mi_cartera_app.Ingresos.class);
        startActivity(Ingresos);
    }


}