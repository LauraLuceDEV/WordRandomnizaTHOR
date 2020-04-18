package com.laupicero.wordsrandomnizathor.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.laupicero.wordsrandomnizathor.Controllers.Ctrl_ObtenerDAO;
import com.laupicero.wordsrandomnizathor.POJOS.Palabra;
import com.laupicero.wordsrandomnizathor.R;
import java.util.List;

public class ObtenerPalabrasActivity extends AppCompatActivity {
    private Spinner spnNumPalabras;
    private Spinner spnTipoPalabras;
    private TextView txtReuslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obtener_palabras);

        //Elem
        this.spnNumPalabras = findViewById(R.id.spinerNum);
        this.spnTipoPalabras = findViewById(R.id.spinerTipo);
        this.txtReuslt = findViewById(R.id.resultPalabras);
        TextView btnObtenerPalabras = findViewById(R.id.btnObtenerPalab);

        //Rellenar Spinners
        ArrayAdapter<CharSequence> adap1 = ArrayAdapter.createFromResource(this, R.array.valoresNumericos, android.R.layout.simple_spinner_item);
        spnNumPalabras.setAdapter(adap1);

        ArrayAdapter<CharSequence> adap2 = ArrayAdapter.createFromResource(this, R.array.valoresTypiPalabras, android.R.layout.simple_spinner_item);
        spnTipoPalabras.setAdapter(adap2);

        //Listeners
        btnObtenerPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Palabra> listadoPalabras =  Ctrl_ObtenerDAO.obtenerResultados(Integer.parseInt(spnNumPalabras.getSelectedItem().toString()), spnTipoPalabras.getSelectedItem().toString() );
                txtReuslt.setText(Ctrl_ObtenerDAO.mostrarPalabras(listadoPalabras));
            }
        });
    }
}
