package com.example.datos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Creación de Constante para pasar datos
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
   // EditText txtMensaje = findViewById(R.id.txtMensaje);
    //vincula al boton del archivo activity_main.xml con el MainActivity.java
    // Button btnEnviar = findViewById(R.id.btnEnviar);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        EditText etNombre = findViewById(R.id.etNombre),
                etEmail = findViewById(R.id.etEmail),
                etAsunto = findViewById(R.id.etAsunto),
                etMensaje = findViewById(R.id.etMensaje);
        Button btnEnviar = findViewById(R.id.btnEnviar);

        final Intent enviarMensaje = new Intent(this, DisplayMessageActivity.class);
        String nombre = etNombre.getText().toString();
        String email = etEmail.getText().toString();
        String asunto = etAsunto.getText().toString();
        String mensaje = etMensaje.getText().toString();

        String message = "Nombre: " + nombre +
                "\nEmail: " + email +
                "\nAsunto: " + asunto +
                "\nMensaje: " + mensaje;

        enviarMensaje.putExtra(EXTRA_MESSAGE, message);
        startActivity(enviarMensaje);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(enviarMensaje);
            }
        });
    }

    public void LimpiarFormulario(View view){
        EditText etNombre = findViewById(R.id.etNombre),
        etEmail = findViewById(R.id.etEmail),
        etAsunto = findViewById(R.id.etAsunto),
        etMensaje = findViewById(R.id.etMensaje);

        etNombre.setText("");
        etEmail.setText("");
        etAsunto.setText("");
        etMensaje.setText("");
    }

}