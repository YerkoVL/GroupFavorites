package com.androidstudio.utp.groupfavorites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidstudio.utp.groupfavorites.Modelos.Peliculas;

import java.util.ArrayList;

public class PeliculasCatalogActivity extends AppCompatActivity {
    private ArrayList<Peliculas> ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peliculas_catalog);
    }
}
