package com.company.Model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class Partido extends Equipo {
    private Equipo equipoLocal;
    private String nombreEquipoLocal;
    private Equipo equipoVisitante;
    private String nombreEquipoVisitante;
    private String estadio;
    private String arbitro;
    private Competicion competicion;
    private int golLocal;
    private int golVisitante;
    private int jornada;

    // Constructores

    public Partido() {
    }

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, Competicion competicion, int golLocal, int golVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.competicion = competicion;
        this.golLocal = golLocal;
        this.golVisitante = golVisitante;
    }

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, String estadio, String arbitro, Competicion competicion, int golLocal, int golVisitante, int jornada) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.estadio = estadio;
        this.arbitro = arbitro;
        this.competicion = competicion;
        this.golLocal = golLocal;
        this.golVisitante = golVisitante;
        this.jornada = jornada;
    }

    public Partido(String nombreEquipoLocal, String nombreEquipoVisitante, String estadio, String arbitro, Competicion competicion, int golLocal, int golVisitante, int jornada) {
        this.nombreEquipoLocal = nombreEquipoLocal;
        this.nombreEquipoVisitante = nombreEquipoVisitante;
        this.estadio = estadio;
        this.arbitro = arbitro;
        this.competicion = competicion;
        this.golLocal = golLocal;
        this.golVisitante = golVisitante;
        this.jornada = jornada;
    }

    // Accesores


    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    @Override
    public String getEstadio() {
        return estadio;
    }

    @Override
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    @Override
    public Competicion getCompeticion() {
        return competicion;
    }

    @Override
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


    public static Comparator<Partido> getComparadorPorLocal() {
        return comparadorPorLocal;
    }

    public static void setComparadorPorLocal(Comparator<Partido> comparadorPorLocal) {
        Partido.comparadorPorLocal = comparadorPorLocal;
    }

    public static Comparator<Partido> getComparadorPorVisitante() {
        return comparadorPorVisitante;
    }

    public static void setComparadorPorVisitante(Comparator<Partido> comparadorPorVisitante) {
        Partido.comparadorPorVisitante = comparadorPorVisitante;
    }

    public static Comparator<Partido> getComparadorPorEstadio() {
        return comparadorPorEstadio;
    }

    public static void setComparadorPorEstadio(Comparator<Partido> comparadorPorEstadio) {
        Partido.comparadorPorEstadio = comparadorPorEstadio;
    }

    public static Comparator<Partido> getComparadorPorJornada() {
        return comparadorPorJornada;
    }

    public static void setComparadorPorJornada(Comparator<Partido> comparadorPorJornada) {
        Partido.comparadorPorJornada = comparadorPorJornada;
    }

    public String getNombreEquipoLocal() {
        return nombreEquipoLocal;
    }

    public void setNombreEquipoLocal(String nombreEquipoLocal) {
        this.nombreEquipoLocal = nombreEquipoLocal;
    }

    public String getNombreEquipoVisitante() {
        return nombreEquipoVisitante;
    }

    public void setNombreEquipoVisitante(String nombreEquipoVisitante) {
        this.nombreEquipoVisitante = nombreEquipoVisitante;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "nombreEquipoLocal='" + nombreEquipoLocal + '\'' +
                ", nombreEquipoVisitante='" + nombreEquipoVisitante + '\'' +
                ", estadio='" + estadio + '\'' +
                ", arbitro='" + arbitro + '\'' +
                ", competicion=" + competicion +
                ", golLocal=" + golLocal +
                ", golVisitante=" + golVisitante +
                ", jornada=" + jornada +
                '}';
    }

    // Comparadores

    /**
     * Ordena y muestra todos los partidos por el equipo local
     */
    public static Comparator<Partido> comparadorPorLocal = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            int res = partido1.getEquipoLocal().getNombreEquipo().compareToIgnoreCase(partido2.getEquipoLocal().getNombreEquipo());
            return res;
        }
    };

    /**
     * Ordena y muestra todos los partidos por el equipo visitante
     */
    public static Comparator<Partido> comparadorPorVisitante = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            int res = partido1.getEquipoVisitante().getNombreEquipo().compareToIgnoreCase(partido2.getEquipoVisitante().getNombreEquipo());
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

    public static Comparator<Partido> comparadorPorGolesLocal = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            return (partido2.getGolLocal() - partido1.getGolLocal());
        }
    };

    public static Comparator<Partido> comparadorPorGolesVisitante = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            return (partido2.getGolVisitante() - partido1.getGolVisitante());
        }
    };

    @Override
    public boolean equals(Object obj) {
        if( this == obj ) { return true; }

        if ( obj == null ) { return false; }

        if ( this.getClass() != obj.getClass() ) { return false; }

        Partido partido = (Partido) obj;

        // Se consideran dos equipos iguales si tienen el mismo nombre
        return Objects.equals(this.getEquipoLocal(), partido.getEquipoVisitante());
    }
}
