package com.example.datos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Datos2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos2);

        //vincula al boton del archivo activity_main.xml con el MainActivity.java
        Button btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ira2 = new Intent(Datos2.this,MainActivity.class);
                startActivity(ira2);
            }
        });

    }
}