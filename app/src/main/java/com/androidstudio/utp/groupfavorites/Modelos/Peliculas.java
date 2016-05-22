package com.androidstudio.utp.groupfavorites.Modelos;

/**
 * Created by ORACLE on 21/05/2016.
 */
public class Peliculas {
    String Nombre;
    String Tipos;
    String DireccionURL;
    String Descripcion;

    public Peliculas(String nombre, String tipos, String direccionURL, String descripcion) {
        this.Nombre = nombre;
        this.Tipos = tipos;
        this.DireccionURL = direccionURL;
        this.Descripcion = descripcion;
    }
}
