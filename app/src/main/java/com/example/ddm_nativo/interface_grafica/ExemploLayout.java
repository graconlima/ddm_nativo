package com.example.ddm_nativo.interface_grafica;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.ddm_nativo.R;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExemploLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_layout);
        EditText campoNome = findViewById(R.id.campoNome);
        EditText campoSenha = findViewById(R.id.campoSenha);
        Button b = findViewById(R.id.botaoEnviar);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                autenticacao(campoNome.getText().toString(), campoSenha.getText().toString());
            }
        });
    }
    public void autenticacao(String nome, String senha){
        if(nome.equals("Aluno") && senha.equals("123")){
            Toast.makeText(this,"Autenticado", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Não Autenticado", Toast.LENGTH_LONG).show();
        }
    }
}