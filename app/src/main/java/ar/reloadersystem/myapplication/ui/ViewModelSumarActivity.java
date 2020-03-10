package ar.reloadersystem.myapplication.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import ar.reloadersystem.myapplication.R;
import ar.reloadersystem.myapplication.viewmodel.Sumar;
import ar.reloadersystem.myapplication.viewmodel.SumarViewModel;

public class ViewModelSumarActivity extends AppCompatActivity {

    private TextView tvsumar, tvSumarViewModel;
    Button btSumar;

    private SumarViewModel sumarViewModel;
    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model_sumar);


        sumarViewModel = ViewModelProviders.of(this).get(SumarViewModel.class);

        tvsumar = findViewById(R.id.videModelSumarActivitytvSumar);
        tvSumarViewModel = findViewById(R.id.videModelSumarActivitytvSumarViewModel);

        tvsumar.setText(" " + numero);
        tvSumarViewModel.setText(" " + sumarViewModel.getResultado());

        btSumar = findViewById(R.id.btnSumar);

        btSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = Sumar.sumar(numero);
                tvsumar.setText(" " + numero);

                sumarViewModel.setResultado(Sumar.sumar(sumarViewModel.getResultado()));
                tvSumarViewModel.setText("" + sumarViewModel.getResultado());
            }
        });
    }
}
