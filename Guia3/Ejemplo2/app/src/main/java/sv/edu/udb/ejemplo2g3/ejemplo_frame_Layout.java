package sv.edu.udb.ejemplo2g3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ejemplo_frame_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_frame_layout);
    }

    public void finalizarActividad(View v){
        finish();
    }
}