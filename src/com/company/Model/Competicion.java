package com.company.Model;

import java.util.ArrayList;

/**
 * Created by marco on 18/05/2017.
 */
public enum Competicion {
    PRIMERA("Primera"),
    SEGUNDA("Segunda");

    private final String competicion;

    // Constructores


    Competicion() {
        competicion = "Sin competición";
    }

    Competicion(String competicion) {
        this.competicion = competicion;
    }


    // Accesores

    public String getCompeticion() {
        return competicion;
    }


}
