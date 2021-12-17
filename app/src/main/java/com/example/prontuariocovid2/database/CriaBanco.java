package com.example.prontuariocovid2.database;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class CriaBanco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "cadastro.db";
    public static final String TABLE_CADASTRO = "cadastro";
    public static final String COLUMN_NOME = "nome";
    public static final String COLUMN_IDADE = "idade";
    public static final String COLUMN_TEMPERATURA = "temperatura";
    public static final String COLUMN_TOSSE = "tosse";
    public static final String COLUMN_DOR_CABECA = "dor_cabeca";
    public static final String COLUMN_ITALIA = "italia";
    public static final String COLUMN_INDONESIA = "indonesia";
    public static final String COLUMN_PORTUGAL = "portugal";
    public static final String COLUMN_CHINA = "china";
    public static final String COLUMN_EUA = "eua";
    public static final String COLUMN_DIAS_ITALIA = "dias_italia";
    public static final String COLUMN_DIAS_INDONESIA = "dias_indonesia";
    public static final String COLUMN_DIAS_PORTUGAL = "dias_portugal";
    public static final String COLUMN_DIAS_CHINA = "dias_china";
    public static final String COLUMN_DIAS_EUA = "dias_eua";
    public static final int VERSAO = 4;

    public CriaBanco(Context context) {
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "
                + TABLE_CADASTRO
                + "("
                + COLUMN_NOME
                + " TEXT NOT NULL, "
                + COLUMN_IDADE
                + " INTEGER NOT NULL, "
                + COLUMN_TEMPERATURA
                + " INTEGER NOT NULL, "
                + COLUMN_TOSSE
                + " INTEGER, "
                + COLUMN_DOR_CABECA
                + " INTEGER, "
                + COLUMN_ITALIA
                + " BOOLEAN, "
                + COLUMN_INDONESIA
                + " BOOLEAN, "
                + COLUMN_PORTUGAL
                + " BOOLEAN, "
                + COLUMN_CHINA
                + " BOOLEAN, "
                + COLUMN_EUA
                + " BOOLEAN, "
                + COLUMN_DIAS_ITALIA
                + " INTEGER, "
                + COLUMN_DIAS_INDONESIA
                + " INTEGER, "
                + COLUMN_DIAS_PORTUGAL
                + " INTEGER, "
                + COLUMN_DIAS_CHINA
                + " INTEGER, "
                + COLUMN_DIAS_EUA
                + " INTEGER "
                +");"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CADASTRO);
        onCreate(db);
    }

}
