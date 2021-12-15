package com.example.prontuariocovid2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editNome = findViewById(R.id.edit_nome);
        EditText editIdade = findViewById(R.id.edit_idade);
        EditText editTemperatura = findViewById(R.id.edit_temperatura);
        EditText editTosse = findViewById(R.id.edit_tosse);
        EditText editDorCabeca = findViewById(R.id.edit_dor_cabeca);
        CheckBox editItalia = findViewById(R.id.edit_italia);
        CheckBox editIndonesia = findViewById(R.id.edit_indonesia);
        CheckBox editPortugal = findViewById(R.id.edit_portugal);
        CheckBox editChina = findViewById(R.id.edit_china);
        CheckBox editEua = findViewById(R.id.edit_eua);
        EditText editDiasItalia = findViewById(R.id.edit_diasIt);
        EditText editDiasIndonesia = findViewById(R.id.edit_diasInd);
        EditText editDiasPortugal = findViewById(R.id.edit_diasPt);
        EditText editDiasChina = findViewById(R.id.edit_diasChi);
        EditText editDiasEua = findViewById(R.id.edit_diasEua);
        Button btnEnviar = findViewById(R.id.button_enviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


}