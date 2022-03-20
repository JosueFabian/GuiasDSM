package sv.edu.udb.ejercicio2discusion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    private TextView tvnombre;
    private TextView tvhoras;
    private TextView tvDescuentoISS;
    private TextView tvDescuentoAFP;
    private TextView tvDescuentoRenta;
    private TextView tvsalarioTotal;
    private TextView tvsalarioNeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados2);

        tvnombre = (TextView) findViewById(R.id.tvNombre);
        tvhoras = (TextView) findViewById(R.id.tvHoras);
        tvDescuentoISS = (TextView) findViewById(R.id.tvISS);
        tvDescuentoAFP = (TextView) findViewById(R.id.tvAFP);
        tvDescuentoRenta = (TextView) findViewById(R.id.tvRenta);
        tvsalarioTotal = (TextView) findViewById(R.id.tvSalarioTotal);
        tvsalarioNeto = (TextView) findViewById(R.id.tvSalarioNeto);

        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("etNombre");
        String descuentoAfp = bundle.getString("descuentoAFP");
        String descuentoIss = bundle.getString("descuentoISS");
        String descuentoRenta = bundle.getString("descuentoRenta");
        String salarioTotal = bundle.getString("SalarioTotal");
        String salarioNeto = bundle.getString("SalarioNeto");
        String horas = bundle.getString("etHoras");

        tvnombre.setText(getResources().getString(R.string.Nombre, nombre));
        tvhoras.setText(getResources().getString(R.string.horas, horas));
        tvDescuentoRenta.setText(getResources().getString(R.string.DescuentoRenta, descuentoRenta));
        tvDescuentoISS.setText(getResources().getString(R.string.DescuentoISS,descuentoIss));
        tvDescuentoAFP.setText(getResources().getString(R.string.DescuentoAFP, descuentoAfp));
        tvsalarioTotal.setText(getResources().getString(R.string.salarioTotal, salarioTotal));
        tvsalarioNeto.setText(getResources().getString(R.string.salarioNeto,  salarioNeto));
    }
    public void conclude (View v){finish();}
}