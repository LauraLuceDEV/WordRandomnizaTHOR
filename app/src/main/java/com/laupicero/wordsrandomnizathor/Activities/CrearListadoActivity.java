package com.laupicero.wordsrandomnizathor.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.laupicero.wordsrandomnizathor.Controllers.Ctrl_ObtenerDAO;
import com.laupicero.wordsrandomnizathor.R;

public class CrearListadoActivity extends AppCompatActivity {
    private Spinner spNumPalabras;
    private EditText etListadoPalabras;
    private TextView tvResult;
    private Button btnObtener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar_lista);

        //Bindeamos
        this.spNumPalabras = findViewById(R.id.spinerNumObtLista);
        this.etListadoPalabras = findViewById(R.id.etIntro);
        this.tvResult = findViewById(R.id.tvResult);
        this.btnObtener = findViewById(R.id.btnObtenerListRnd);

        //Rellenamos Spiner
        ArrayAdapter<CharSequence> adap1 = ArrayAdapter.createFromResource(this, R.array.valoresNumericos, android.R.layout.simple_spinner_item);
        spNumPalabras.setAdapter(adap1);

        //LISTENER OBTENER PALABRAS
        this.btnObtener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(Ctrl_ObtenerDAO.ObtenerPalabrasListadoRandom(Integer.parseInt(spNumPalabras.getSelectedItem().toString()), etListadoPalabras.getText().toString()));
            }
        });

    }
}
