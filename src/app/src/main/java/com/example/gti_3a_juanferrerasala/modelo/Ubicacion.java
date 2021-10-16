package com.example.gti_3a_juanferrerasala.modelo;

// ------------------------------------------------------------------
//Nombre del fichero: Ubicacion
//Autor: Juan Ferrera Sala
//Descripcion: Modelo que contiene la ubicacion del modelo medicion
// ------------------------------------------------------------------

public class Ubicacion {

    private double latitud;

    private  double longitud;

    public Ubicacion(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

}
