package ar.reloadersystem.myapplication.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import java.util.ArrayList;
import java.util.List;

import ar.reloadersystem.myapplication.R;
import ar.reloadersystem.myapplication.User;
import ar.reloadersystem.myapplication.viewmodel.UserViewModel;

public class ViewModelUserActivity extends AppCompatActivity {

    private EditText etNombre, etEdad;
    private Button btSalvar, btVerUser;
    private TextView tvUser, tvUserViewModel;

    private UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model_user);

        tvUser = findViewById(R.id.userActivityTvUser);
        tvUserViewModel = findViewById(R.id.userActivityTvUserViewModel);

        etNombre = findViewById(R.id.userActivityEtNombre);
        etEdad = findViewById(R.id.userActivityEtEdad);

        btSalvar = findViewById(R.id.userActivityBtSalvar);
        btVerUser = findViewById(R.id.userActivityBtVer);

        userViewModel = ViewModelProviders.of(this).get(UserViewModel.class);

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                User user= new User();
                user.setEdad(etEdad.getText().toString());
                user.setNombre(etNombre.getText().toString());
                userViewModel.addUser(user);
            }
        });

        btVerUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String texto = "";
                for(User user: userViewModel.getUserList()){
                    texto += user.getNombre() + " "+ user.getEdad()+"\n";
                }

                tvUserViewModel.setText(texto);
            }
        });
    }
}
