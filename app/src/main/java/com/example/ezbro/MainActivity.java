package com.example.ezbro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;


public class MainActivity extends AppCompatActivity {


    Spinner strDeptos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView usuario = findViewById(R.id.txtUsuario);
        TextView clave = findViewById(R.id.txtContra);
        Button ingreso = (Button) findViewById(R.id.btnLogin);

        ingreso.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(usuario.getText().toString().equals("admin") && clave.getText().toString().equals("admin"))
                {
                    Toast.makeText(MainActivity.this, "Ingreso Correcto!",Toast.LENGTH_LONG).show();
                    Intent newActivity = new Intent(MainActivity.this, segundoActivity.class);
                    startActivity(newActivity);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Ingreso erroneo, intente denuevo",Toast.LENGTH_LONG).show();
                }

            }
        });
         strDeptos = (Spinner)findViewById(R.id.ctnSpinner);
         ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.strDeptos, android.R.layout.simple_spinner_item);
         strDeptos.setAdapter(adapter);
}}