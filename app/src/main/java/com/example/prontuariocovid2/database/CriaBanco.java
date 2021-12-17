package com.example.prontuariocovid2.database;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class CriaBanco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "cadastro.db";
    public static final String TABLE_CADASTRO = "cadastro";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOME = "nome";
    public static final String COLUMN_IDADE = "idade";
    public static final String COLUMN_TEMPERATURA = "temperatura";
    public static final String COLUMN_TOSSE = "tosse";
    public static final String COLUMN_DOR_CABECA = "dor_cabeca";
    public static final int VERSAO = 1;

    public CriaBanco(Context context){
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "
                + TABLE_CADASTRO
                + " ( "
                + COLUMN_ID
                + " PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_NOME
                + " TEXT NOT NULL, "
                + COLUMN_IDADE
                + "INTEGER NOT NULL, "
                + COLUMN_TEMPERATURA
                + "INTEGER NOT NULL, "
                + COLUMN_TOSSE
                + "INTEGER NOT NULL, "
                + COLUMN_DOR_CABECA
                + "INTEGER NOT NULL " + ");"
                );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CADASTRO);
        onCreate(db);
    }

}
