package com.example.proyectoadm.presentation.register.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.proyectoadm.R;
import com.example.proyectoadm.presentation.navigationdrawer.view.NavigationActivity;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText registerEmail,registerName,registerPassword,registerConfirmPassword;
    private Button btRegister, btCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerEmail=findViewById(R.id.tvRegisterEmail);
        registerName=findViewById(R.id.tvRegisterName);
        registerPassword=findViewById(R.id.tvRegisterPassoword);
        registerConfirmPassword=findViewById(R.id.tvConfirmPassword);
        btRegister=findViewById(R.id.btRegistrar);
        btCancel=findViewById(R.id.btCancelar);

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this, NavigationActivity.class);
                startActivity(i);
                finish();
            }
        });

        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
