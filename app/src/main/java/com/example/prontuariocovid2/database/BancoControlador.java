package com.example.prontuariocovid2.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BancoControlador {
    private SQLiteDatabase db;
    private CriaBanco banco;

    public BancoControlador(Context context) {
        banco = new CriaBanco(context);
    }

    public String insereDados(String nome,
                              String idade,
                              String temperatura,
                              String tosse,
                              String dor_cabeca,
                              String italia,
                              String indonesia,
                              String portugal,
                              String china,
                              String eua,
                              String diasItalia,
                              String diasIndonesia,
                              String diasPortugal,
                              String diasChina,
                              String diasEua
                              ) {
        ContentValues insertValues;
        long resultado;

        db = banco.getWritableDatabase();
        insertValues = new ContentValues();
        insertValues.put(CriaBanco.COLUMN_NOME, nome);
        insertValues.put(CriaBanco.COLUMN_IDADE, idade);
        insertValues.put(CriaBanco.COLUMN_TEMPERATURA, temperatura);
        insertValues.put(CriaBanco.COLUMN_TOSSE, tosse);
        insertValues.put(CriaBanco.COLUMN_DOR_CABECA, dor_cabeca);
        insertValues.put(CriaBanco.COLUMN_ITALIA, italia);
        insertValues.put(CriaBanco.COLUMN_INDONESIA, indonesia);
        insertValues.put(CriaBanco.COLUMN_PORTUGAL, portugal);
        insertValues.put(CriaBanco.COLUMN_CHINA, china);
        insertValues.put(CriaBanco.COLUMN_EUA, eua);
        insertValues.put(CriaBanco.COLUMN_DIAS_ITALIA, diasItalia);
        insertValues.put(CriaBanco.COLUMN_DIAS_INDONESIA, diasIndonesia);
        insertValues.put(CriaBanco.COLUMN_DIAS_PORTUGAL, diasPortugal);
        insertValues.put(CriaBanco.COLUMN_DIAS_CHINA, diasChina);
        insertValues.put(CriaBanco.COLUMN_DIAS_EUA, diasEua);

        resultado = db.insert(CriaBanco.TABLE_CADASTRO, null, insertValues);
        db.close();

        if (resultado == -1) {
            return "Erro ao inserir registro";
        } else {
            return "Registro inserido com sucesso";
        }
    }
}
