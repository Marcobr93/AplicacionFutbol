package com.company.Model;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public enum Posicion {
    Portero,
    LateralDerecho,
    Central,
    LateralIzquierdo,
    Centrocampista,
    MediaPunta,
    Extremo,
    Delantero;

    private final String Posicion;
    
    // Constructores

    Posicion() {
        Posicion = "Sin posición específica";
    }

    Posicion(String posicion) {
        Posicion = posicion;
    }

    // Accesores

    public String getPosicion() {
        return Posicion;
    }
}
