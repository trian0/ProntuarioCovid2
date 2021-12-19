package com.example.prontuariocovid2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prontuariocovid2.database.BancoControlador;

public class InsereDado extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button editBtn = (Button) findViewById(R.id.button_enviar);

        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BancoControlador banco = new BancoControlador(getBaseContext());
                EditText editNome =  (EditText) findViewById(R.id.edit_nome);
                EditText editIdade = (EditText) findViewById(R.id.edit_idade);
                EditText editTemperatura = (EditText) findViewById(R.id.edit_temperatura);
                EditText editTosse = (EditText) findViewById(R.id.edit_tosse);
                EditText editDorCabeca = (EditText) findViewById(R.id.edit_dor_cabeca);
                CheckBox editItalia = (CheckBox) findViewById(R.id.edit_italia);
                CheckBox editIndonesia = (CheckBox) findViewById(R.id.edit_indonesia);
                CheckBox editPortugal = (CheckBox) findViewById(R.id.edit_portugal);
                CheckBox editChina = (CheckBox) findViewById(R.id.edit_china);
                CheckBox editEua = (CheckBox) findViewById(R.id.edit_eua);
                EditText editDiasItalia = (EditText) findViewById(R.id.edit_diasIt);
                EditText editDiasIndonesia = (EditText) findViewById(R.id.edit_diasInd);
                EditText editDiasPortugal = (EditText) findViewById(R.id.edit_diasPt);
                EditText editDiasChina = (EditText) findViewById(R.id.edit_diasChi);
                EditText editDiasEua = (EditText) findViewById(R.id.edit_diasEua);
                String editNomeString = editNome.getText().toString();
                String editIdadeString = editIdade.getText().toString();
                String editTemperaturaString = editTemperatura.getText().toString();
                String editTosseString = editTosse.getText().toString();
                String editDorCabecaString = editDorCabeca.getText().toString();
                String editItaliaString;
                String editIndonesiaString;
                String editPortugalString;
                String editChinaString;
                String editEuaString;
                if(editItalia.isChecked()){
                    editItaliaString = "true";
                } else {
                    editItaliaString = "false";
                }
                if(editIndonesia.isChecked()){
                    editIndonesiaString = "true";
                } else {
                    editIndonesiaString = "false";
                }
                if(editPortugal.isChecked()){
                    editPortugalString = "true";
                } else {
                    editPortugalString = "false";
                }
                if(editChina.isChecked()){
                    editChinaString = "true";
                } else {
                    editChinaString = "false";
                }
                if(editEua.isChecked()){
                    editEuaString = "true";
                } else {
                    editEuaString = "false";
                }
                String editDiasItaliaString = editDiasItalia.getText().toString();
                String editDiasIndonesiaString = editDiasIndonesia.getText().toString();
                String editDiasPortugalString = editDiasPortugal.getText().toString();
                String editDiasChinaString = editDiasChina.getText().toString();
                String editDiasEuaString = editDiasEua.getText().toString();
                String resultado;

                resultado = banco.insereDados(
                        editNomeString,
                        editIdadeString,
                        editTemperaturaString,
                        editTosseString,
                        editDorCabecaString,
                        editItaliaString,
                        editIndonesiaString,
                        editPortugalString,
                        editChinaString,
                        editEuaString,
                        editDiasItaliaString,
                        editDiasIndonesiaString,
                        editDiasPortugalString,
                        editDiasChinaString,
                        editDiasEuaString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });

    }

}
