package com.company.Model;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public enum Posicion {
    Portero("Portero"),
    LateralDerecho("Lateral derecho"),
    Central("Central"),
    LateralIzquierdo("Lateral izquierdo"),
    Centrocampista("Centrocampista"),
    MediaPunta("Media punta"),
    Extremo("Extremo"),
    Delantero("Delantero");

    private final String posicion;
    
    // Constructores

    Posicion() {
        posicion = "Sin posición específica";
    }

    Posicion(String posicion) {
        this.posicion = posicion;
    }

    // Accesores

    public String getPosicion() {
        return posicion;
    }
}
