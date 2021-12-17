package com.example.prontuariocovid2.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BancoControlador {
    private SQLiteDatabase db;
    private CriaBanco banco;

    public BancoControlador(Context context){
        banco = new CriaBanco(context);
    }

    public String insereDados(String nome, String idade, String temperatura, String tosse, String dor_cabeca){
        ContentValues insertValues;
        long resultado;

        db = banco.getWritableDatabase();
        insertValues = new ContentValues();
        insertValues.put(CriaBanco.COLUMN_NOME, nome);
        insertValues.put(CriaBanco.COLUMN_IDADE, idade);
        insertValues.put(CriaBanco.COLUMN_TEMPERATURA, temperatura);
        insertValues.put(CriaBanco.COLUMN_TOSSE, tosse);
        insertValues.put(CriaBanco.COLUMN_DOR_CABECA, dor_cabeca);

        resultado = db.insert(CriaBanco.TABLE_CADASTRO, null, insertValues);
        db.close();

        if (resultado ==-1) {
            return "Erro ao inserir registro";
        } else {
            return "Registro inserido com sucesso";
        }
    }
}
