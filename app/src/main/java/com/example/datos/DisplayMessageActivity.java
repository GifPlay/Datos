package com.example.datos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    //Vincular componentes del xml co  java


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        TextView txtRecibeMensaje = findViewById(R.id.textRecibeMensaje);


        // Get the Intent that started this activity and extract the string
        Intent recibeMensaje = getIntent();
        String mensaje = recibeMensaje.getStringExtra(MainActivity.EXTRA_MESSAGE);
        txtRecibeMensaje.setText(mensaje);


    }
}