package com.example.ddm_nativo.componente_customizado_baixo_nivel;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ComponenteCustomizadoBaixoNivel extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Tela t = new Tela(this);
        setContentView(t);

        //passo 4
        /*new Thread(t).start();
        setContentView(t);*/
    }
}