package com.company.Model;

/**
 * Created by marco on 18/05/2017.
 */
public enum Competicion {
    PRIMERA("Primera División"),
    SEGUNDA("Segunda División"),
    SEGUNDAB("Segunda División B"),
    TERCERA("Tercera División");

    private final String competicion;

    Competicion(String competicion) {
        this.competicion = competicion;
    }

    public String getCompeticion() {
        return competicion;
    }
}
