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
    MediaPunta("Mediapunta"),
    Extremo("Extremo"),
    Delantero("Delantero");

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
