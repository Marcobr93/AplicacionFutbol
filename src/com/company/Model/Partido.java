package com.company.Model;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class Partido {
    private String EquipoLocal;
    private String EquipoVisitante;
    private String Estadio;
    private String Arbitro;
    private Competicion competicion;
    private int GolLocal;
    private int GolVisitante;

    // Constructores

    public Partido() {
    }

    public Partido(String equipoLocal, String equipoVisitante, Competicion competicion, int golLocal, int golVisitante) {
        EquipoLocal = equipoLocal;
        EquipoVisitante = equipoVisitante;
        this.competicion = competicion;
        GolLocal = golLocal;
        GolVisitante = golVisitante;
    }

    public Partido(String equipoLocal, String equipoVisitante, String estadio, String arbitro, Competicion competicion, int golLocal, int golVisitante) {
        EquipoLocal = equipoLocal;
        EquipoVisitante = equipoVisitante;
        Estadio = estadio;
        Arbitro = arbitro;
        this.competicion = competicion;
        GolLocal = golLocal;
        GolVisitante = golVisitante;
    }

    // Accesores


    public String getEquipoLocal() {
        return EquipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        EquipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return EquipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        EquipoVisitante = equipoVisitante;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String estadio) {
        Estadio = estadio;
    }

    public String getArbitro() {
        return Arbitro;
    }

    public void setArbitro(String arbitro) {
        Arbitro = arbitro;
    }

    public Competicion getCompeticion() {
        return competicion;
    }

    public void setCompeticion(Competicion competicion) {
        this.competicion = competicion;
    }

    public int getGolLocal() {
        return GolLocal;
    }

    public void setGolLocal(int golLocal) {
        GolLocal = golLocal;
    }

    public int getGolVisitante() {
        return GolVisitante;
    }

    public void setGolVisitante(int golVisitante) {
        GolVisitante = golVisitante;
    }
}
