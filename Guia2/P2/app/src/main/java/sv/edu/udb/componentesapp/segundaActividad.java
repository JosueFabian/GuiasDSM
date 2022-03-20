package sv.edu.udb.componentesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class segundaActividad extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        tvNombre=(TextView) findViewById(R.id.textViewNombre);
        tvEdad=(TextView) findViewById(R.id.textViewEdad);

        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("txtNombre");
        String edad = bundle.getString("txtEdad");

        tvNombre.setText(nombre);
        tvEdad.setText(edad);
    }

    public void finaliar (View v){
        finish();
    }
}