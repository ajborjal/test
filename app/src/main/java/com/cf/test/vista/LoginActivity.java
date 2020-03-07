package com.cf.test.vista;

import androidx.appcompat.app.AppCompatActivity;
import com.cf.test.R;
import com.cf.test.controlador.UsuariosTrs;
import com.cf.test.modelo.Usuario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void validarUsuario(View vista){
        EditText txtNomUsu =findViewById(R.id.txtUsuario);
        EditText txtClaUsu=findViewById(R.id.txtPass);

        UsuariosTrs adminUsu= new UsuariosTrs();
        Usuario usuarioCon=adminUsu.verificarUsuario(txtNomUsu.getText().toString(),txtClaUsu.getText().toString());

        if (usuarioCon!=null){
            Intent intMen= new Intent(getApplicationContext(),MenuActivity.class);
            startActivity(intMen);
        }else {
            Toast.makeText(getApplicationContext(),R.string.denegado_login,Toast.LENGTH_LONG).show();
        }


    }
}
