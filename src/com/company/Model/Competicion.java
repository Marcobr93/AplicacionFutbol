package com.company.Model;

import java.util.ArrayList;

/**
 * Created by marco on 18/05/2017.
 */
public enum Competicion {
    PRIMERA("Primera División"),
    SEGUNDA("Segunda División");

    private ArrayList<Equipo> equipos;

    private final String competicion;

    // Constructores


    Competicion() {
        competicion = "Sin competición";
    }

    Competicion(String competicion) {
        this.competicion = competicion;
    }

    Competicion(String competicion, ArrayList<Equipo> equipos) {
        this.competicion = competicion;
        this.equipos = equipos;
    }

    // Accesores

    public String getCompeticion() {
        return competicion;
    }

    // Métodos

    public void añadirEquipos(Equipo equipo){
        equipos.add(equipo);
    }

    public void añadirEquiposPrimeraDivision(Equipo equipo){
        PRIMERA.añadirEquipos(equipo);
    }

    public void añadirEquiposSegundaDivision(Equipo equipo){
        SEGUNDA.añadirEquipos(equipo);
    }
}
