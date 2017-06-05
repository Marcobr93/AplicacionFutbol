package com.company.Model;


/**
 * Created by marco on 18/05/2017.
 */

/**
 * Enum Competicion que contiene las dos competiciones contempladas en este proyecto, primera y segunda división.
 */
public enum Competicion{
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
