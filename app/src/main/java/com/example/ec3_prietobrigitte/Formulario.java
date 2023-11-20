package com.example.ec3_prietobrigitte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ec3_prietobrigitte.databinding.ActivityFormularioBinding;
import com.google.android.material.snackbar.Snackbar;

public class Formulario extends AppCompatActivity  implements View.OnClickListener{

    private ActivityFormularioBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFormularioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnbuscar.setOnClickListener(this);
        binding.btnlista.setOnClickListener(this);
    }

    private Boolean validardistrito(){
        boolean respuesta = true;
        if(binding.tvdistrito.getText().toString().trim().isEmpty()){
            binding.tvdistrito.setFocusableInTouchMode(true);
            binding.tvdistrito.requestFocus();
            respuesta = false;
        }
        return respuesta;
    }
    private Boolean validarcontra(){
        boolean respuesta = true;
        if(binding.tvfechafin.getText().toString().trim().isEmpty()){
            binding.tvfechafin.setFocusableInTouchMode(true);
            binding.tvfechafin.requestFocus();
            respuesta = false;
        }
        return respuesta;
    }

    private Boolean validarFormulario(){
        boolean respuesta = false;
        String mensaje = "";
        if(!validardistrito()){
            mensaje ="Ingrese su ndistrito ";
        }else if(!validarcontra()){
            mensaje ="Ingrese su fecha";
        }else
            respuesta = true;
        if(!respuesta)
            Snackbar.make(binding.getRoot(), mensaje, Toast.LENGTH_LONG + 2000).show();
        return respuesta;
    }
    @Override
    public void onClick(View v) {
        if (validarFormulario()){
        if(v.getId() == R.id.btnbuscar){
            /*startActivity(new Intent(Formulario.this,
                    datos.class));*/
        }
    } else if (v.getId() == R.id.btnlista){
            startActivity(new Intent(Formulario.this,
                    lista.class));
        }
}
}