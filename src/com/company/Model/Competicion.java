package com.company.Model;

import java.util.ArrayList;

/**
 * Created by marco on 18/05/2017.
 */
public enum Competicion {
    PRIMERA("Primera División"),
    SEGUNDA("Segunda División");

    private ArrayList<Equipo> equipos;
    public ArrayList<Competicion> competiciones = new ArrayList<>();
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

    /**
     * Método para añadir equipos a Primera División
     * @param equipo
     */
    public void añadirEquiposPrimeraDivision(Equipo equipo){
        PRIMERA.añadirEquipos(equipo);
    }

    /**
     * Método para añadir equipos a Segunda División
     * @param equipo
     */
    public void añadirEquiposSegundaDivision(Equipo equipo){
        SEGUNDA.añadirEquipos(equipo);
    }

    /**
     * Método que te muestra los equipos de Primera División
     */
    public void primeraDivision(){
        int indice = 0;

        for (Competicion competicion: PRIMERA.competiciones){
            System.out.println((indice++) + " - " + competicion);
        }
    }

    /**
     * Método que te muestra los equipos de Seguda División
     */
    public void segundaDivision(){
        int indice = 0;

        for (Competicion competicion: SEGUNDA.competiciones){
            System.out.println((indice++) + " - " + competicion);
        }
    }
}
