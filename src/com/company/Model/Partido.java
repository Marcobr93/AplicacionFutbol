package com.company.Model;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private String estadio;
    private String arbitro;
    private Competicion competicion;
    private int golLocal;
    private int golVisitante;

    // Constructores

    public Partido() {
    }

    public Partido(String equipoLocal, String equipoVisitante, Competicion competicion, int golLocal, int golVisitante) {
        this.setEquipoLocal(equipoLocal);
        this.setEquipoVisitante(equipoVisitante);
        this.setCompeticion(competicion);
        this.setGolLocal(golLocal);
        this.setGolVisitante(golVisitante);
    }

    public Partido(String equipoLocal, String equipoVisitante, String estadio, String arbitro, Competicion competicion, int golLocal, int golVisitante) {
        this.setEquipoLocal(equipoLocal);
        this.setEquipoVisitante(equipoVisitante);
        this.setEstadio(estadio);
        this.setArbitro(arbitro);
        this.setCompeticion(competicion);
        this.setGolLocal(golLocal);
        this.setGolVisitante(golVisitante);
    }

    // Accesores


    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    public Competicion getCompeticion() {
        return competicion;
    }

    public void setCompeticion(Competicion competicion) {
        this.competicion = competicion;
    }

    public int getGolLocal() {
        return golLocal;
    }

    public void setGolLocal(int golLocal) {
        this.golLocal = golLocal;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }

    // Comparadores

}
