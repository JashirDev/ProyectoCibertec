package com.example.proyectoadm.presentation.main.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.proyectoadm.R;
import com.example.proyectoadm.presentation.navigationdrawer.view.NavigationActivity;
import com.example.proyectoadm.presentation.register.view.RegisterActivity;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    private Button btLogin;
    private TextInputEditText tiEmail, tiPassword;
    private TextView tvGoToRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = findViewById(R.id.btLogin);
        tiEmail= findViewById(R.id.tiEmail);
        tiPassword= findViewById(R.id.tiPassword);
        tvGoToRegister=findViewById(R.id.tvGoRegister);


        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NavigationActivity.class);
                startActivity(i);
            }
        });

        tvGoToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}
