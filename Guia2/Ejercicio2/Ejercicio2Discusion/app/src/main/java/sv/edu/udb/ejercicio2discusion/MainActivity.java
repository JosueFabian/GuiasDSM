package sv.edu.udb.ejercicio2discusion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Nombre;
    private EditText Horas;
    double iss = 0.02;
    double afp = 0.03;
    double rent = 0.04;
    double PagoHora = 8.5;
    double descuentos,salarioNeto , salarioTotal;
    double descuentoIss, descuentoAfp, descuentoRenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = (EditText)findViewById(R.id.etNombre);
        Horas = (EditText)findViewById(R.id.etHoras);
    }

    public void calcular (View v){

        int hora = Integer.parseInt(Horas.getText().toString());
        salarioTotal = hora * PagoHora;
        descuentos = (iss + afp + rent) * salarioTotal;
        salarioNeto = salarioTotal - descuentos;
        descuentoAfp = salarioTotal * afp;
        descuentoIss = salarioTotal * iss;
        descuentoRenta = salarioTotal * rent;

        Intent i = new Intent(this, Resultados.class);
        i.putExtra("etNombre", Nombre.getText().toString());
        i.putExtra("descuentoAFP",String.valueOf(descuentoAfp));
        i.putExtra("descuentoISS",String.valueOf(descuentoIss));
        i.putExtra("descuentoRenta",String.valueOf(descuentoRenta));
        i.putExtra("SalarioTotal", String.valueOf(salarioTotal));
        i.putExtra("SalarioNeto", String.valueOf(salarioNeto));
        i.putExtra("etHoras", Horas.getText().toString());
        startActivity(i);
    }
}