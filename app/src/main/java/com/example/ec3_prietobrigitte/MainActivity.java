package com.example.ec3_prietobrigitte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ec3_prietobrigitte.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnsesion.setOnClickListener(this);
        validarNombre();
    }

    private Boolean validarNombre(){
        boolean respuesta = true;
        if(binding.tvnombre2.getText().toString().trim().isEmpty()){
            binding.tvnombre2.setFocusableInTouchMode(true);
            binding.tvnombre2.requestFocus();
            respuesta = false;
        }
        return respuesta;
    }
    private Boolean validarcontra(){
        boolean respuesta = true;
        if(binding.tvcontra.getText().toString().trim().isEmpty()){
            binding.tvcontra.setFocusableInTouchMode(true);
            binding.tvcontra.requestFocus();
            respuesta = false;
        }
        return respuesta;
    }

    private Boolean validarFormulario(){
        boolean respuesta = false;
        String mensaje = "";
        if(!validarNombre()){
            mensaje ="Ingrese su nombre ";
        }else if(!validarcontra()){
            mensaje ="Ingrese su  contraseña";
        }else
            respuesta = true;
        if(!respuesta)
            Snackbar.make(binding.getRoot(), mensaje, Toast.LENGTH_LONG + 2000).show();
        return respuesta;
    }

    @Override
    public void onClick(View v) {

        if (validarFormulario()){
            if(v.getId() == R.id.btnsesion){
                startActivity(new Intent(MainActivity.this,
                        Formulario.class));
        }

    }
    }
}