package ar.reloadersystem.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ar.reloadersystem.myapplication.R;

public class MainActivity extends AppCompatActivity {

    private Button btViewModelSumarActivity;
    private Button btViewModelUserActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configView();
    }

    private void configView() {

        btViewModelSumarActivity = findViewById(R.id.mainActivityBtViewModelSumar);
        btViewModelUserActivity = findViewById(R.id.mainActivityBtViewModelUser);
        btViewModelSumarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ViewModelSumarActivity.class));
            }
        });

        btViewModelUserActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ViewModelUserActivity.class));
            }
        });


    }
}
