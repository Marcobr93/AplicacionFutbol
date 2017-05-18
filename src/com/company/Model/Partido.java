package com.company.Model;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class Partido extends Equipo {
    private String equipoLocal;
    private String equipoVisitante;
    private String estadio;
    private String arbitro;
    private Competicion competicion;
    private int golLocal;
    private int golVisitante;
    private int jornada;
    private int numeroPartido;  //respecto a esa jornada, esto nos permitirá poder borrar los partidos de una jornada

    // Constructores

    public Partido() {
    }

    public Partido(String equipoLocal, String equipoVisitante, int golLocal, int golVisitante, int numeroPartido) {
        this.setEquipoLocal(equipoLocal);
        this.setEquipoVisitante(equipoVisitante);
        this.setGolLocal(golLocal);
        this.setGolVisitante(golVisitante);
        this.setNumeroPartido(numeroPartido);
    }

    public Partido(String equipoLocal, String equipoVisitante, String estadio, String arbitro, Competicion competicion, int golLocal, int golVisitante, int jornada, int numeroPartido) {
        this.setEquipoLocal(equipoLocal);
        this.setEquipoVisitante(equipoVisitante);
        this.setEstadio(estadio);
        this.setArbitro(arbitro);
        this.setCompeticion(competicion);
        this.setGolLocal(golLocal);
        this.setGolVisitante(golVisitante);
        this.setJornada(jornada);
        this.setNumeroPartido(numeroPartido);
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

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    public int getNumeroPartido() {
        return numeroPartido;
    }

    public void setNumeroPartido(int numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "equipoLocal='" + equipoLocal + '\'' +
                ", equipoVisitante='" + equipoVisitante + '\'' +
                ", estadio='" + estadio + '\'' +
                ", arbitro='" + arbitro + '\'' +
                ", competicion=" + competicion +
                ", golLocal=" + golLocal +
                ", golVisitante=" + golVisitante +
                ", jornada=" + jornada +
                ", numeroPartido=" + numeroPartido +
                '}';
    }

    // Comparadores

    /**
     * Ordena y muestra todos los partidos por el equipo local
     */
    public static Comparator<Partido> comparadorPorLocal = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            int res = partido1.getEquipoLocal().compareToIgnoreCase(partido2.getEquipoLocal());
            return res;
        }
    };

    /**
     * Ordena y muestra todos los partidos por el equipo visitante
     */
    public static Comparator<Partido> comparadorPorVisitante = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            int res = partido1.getEquipoVisitante().compareToIgnoreCase(partido2.getEquipoVisitante());
            return res;
        }
    };

    /**
     * Ordena y muestra todos los partidos por su estadio
     */
    public static Comparator<Partido> comparadorPorEstadio = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            int res = partido1.getEstadio().compareToIgnoreCase(partido2.getEstadio());
            return res;
        }
    };

    /**
     * Ordena y muestra los partidos por su jornada
     */
    public static Comparator<Partido> comparadorPorJornada = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            return (partido2.getJornada() - partido1.getJornada());
        }
    };

    @Override
    public boolean equals(Object obj) {
        if( this == obj ) { return true; }

        if ( obj == null ) { return false; }

        if ( this.getClass() != obj.getClass() ) { return false; }

        Partido partido = (Partido) obj;

        // Se consideran dos equipos iguales si tienen el mismo nombre
        return Objects.equals(this.getNumeroPartido(), partido.getNumeroPartido());
    }
}
