package com.laupicero.wordsrandomnizathor.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.laupicero.wordsrandomnizathor.Controllers.CtrlPPL;
import com.laupicero.wordsrandomnizathor.R;

public class MainActivity extends AppCompatActivity {
    private TextView btnObtenerPalabras;
    private TextView btnCrearListadoPalabras;
    private TextView btnInsertarPalabras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Preparación DB
        CtrlPPL.prepararDB(getApplicationContext());

        this.btnObtenerPalabras = findViewById(R.id.btnObtenerPalabras);
        this.btnCrearListadoPalabras = findViewById(R.id.btnCrearListado);
        this.btnInsertarPalabras = findViewById(R.id.btnInsertarPalabras);


        //LISTENERS
        this.btnObtenerPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_ObtenerPalabras = new Intent(MainActivity.this, ObtenerPalabrasActivity.class);
                startActivity(int_ObtenerPalabras);
            }
        });

        this.btnCrearListadoPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_CrearListadoPalabras = new Intent(MainActivity.this, CrearListadoActivity.class);
                startActivity(int_CrearListadoPalabras);
            }
        });
    }
}
