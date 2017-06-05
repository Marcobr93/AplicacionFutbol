package com.company.Model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class Partido implements Comparable<Partido>, Comparator<Partido>, Serializable{

    private static final long serialVersionUID = -2085995544179777674L;
    private Equipo equipoLocal;                 // equipo local
    private String nombreEquipoLocal;           // String nombre del equipo local
    private Equipo equipoVisitante;             // equipo visitante
    private String nombreEquipoVisitante;       // nombre del equipo visitante
    private String estadio;                     // nombre del estadio
    private String arbitro;                     // nombre del árbitro
    private Competicion competicion;            // competición en la que se disputa el partido
    private int golLocal;                       // gol del equipo local
    private int golVisitante;                   // gol del equipo visitante
    private int jornada;                        // jornada en la que se disputa el partido

    // Constructores

    public Partido() {
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

    public Partido(Equipo equipoLocal, String nombreEquipoLocal, Equipo equipoVisitante, String nombreEquipoVisitante, String estadio, String arbitro, Competicion competicion, int golLocal, int golVisitante, int jornada) {
        this.equipoLocal = equipoLocal;
        this.nombreEquipoLocal = nombreEquipoLocal;
        this.equipoVisitante = equipoVisitante;
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


    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
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

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Competicion getCompeticion() {
        return competicion;
    }

    public void setCompeticion(Competicion competicion) {
        this.competicion = competicion;
    }



    @Override
    public String toString() {
        return "Jornada: " + jornada +
                "-->" +
                " Local: '" + nombreEquipoLocal + '\'' +
                ",  Visitante: '" + nombreEquipoVisitante + '\'' +
                ",  Estadio: '" + estadio + '\'' +
                ",  Árbitro: '" + arbitro + '\'' +
                ",  Competición: " + competicion +
                ",  Goles local: " + golLocal +
                ",  Goles visitante: " + golVisitante +
                '.';
    }

    // Comparadores

    @Override
    public int compareTo(Partido partido) {
        return Integer.compare(this.getJornada(), partido.getJornada());
    }

    /**
     * Compara para saber si dos partidos son iguales, utiliza primero el nombre del equipo local y en
     * caso de que sean iguales, utiliza la jornada del partido.
     * @param partido1
     * @param partido2
     * @return
     */
    @Override
    public int compare(Partido partido1, Partido partido2) {
        int res;

        res = partido1.getNombreEquipoLocal().compareToIgnoreCase(partido2.getNombreEquipoLocal());
        if (res != 0){
            return res;
        }
        return Integer.compare(partido1.getJornada(), partido2.getJornada());
    }

    /**
     * Ordena y muestra todos los partidos por el equipo local
     */
    public static Comparator<Partido> comparadorPorLocal = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            int res = partido1.getNombreEquipoLocal().compareToIgnoreCase(partido2.getNombreEquipoLocal());
            return res;
        }
    };

    /**
     * Ordena y muestra todos los partidos por el equipo visitante
     */
    public static Comparator<Partido> comparadorPorVisitante = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            int res = partido1.getNombreEquipoVisitante().compareToIgnoreCase(partido2.getNombreEquipoVisitante());
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
     * Ordena y muestra todos los partidos por el árbitro que dirigió el partido
     */
    public static Comparator<Partido> comparadorPorArbitro = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            int res = partido1.getArbitro().compareToIgnoreCase(partido2.getArbitro());
            return res;
        }
    };

    /**
     * Ordena y muestra los partidos por su jornada
     */
    public static Comparator<Partido> comparadorPorJornada = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            return (partido1.getJornada() - partido2.getJornada());
        }
    };

    /**
     * Ordena y muestra los partidos en los que losl equipos locales han marcado más goles
     */
    public static Comparator<Partido> comparadorPorGolesLocal = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            return (partido2.getGolLocal() - partido1.getGolLocal());
        }
    };

    /**
     * Ordena y muestra los partidos en los que losl equipos visitantes han marcado más goles
     */
    public static Comparator<Partido> comparadorPorGolesVisitante = new Comparator<Partido>() {
        @Override
        public int compare(Partido partido1, Partido partido2) {
            return (partido2.getGolVisitante() - partido1.getGolVisitante());
        }
    };

    /**
     *
     * @param obj
     * @return Se consideran dos partidos iguales si tienen el mismo nombre de Equipo Local
     */
    @Override
    public boolean equals(Object obj) {
        if( this == obj ) { return true; }

        if ( obj == null ) { return false; }

        if ( this.getClass() != obj.getClass() ) { return false; }

        Partido partido = (Partido) obj;

        // Se consideran dos equipos iguales si tienen el mismo nombre
        return Objects.equals(this.getNombreEquipoLocal(), partido.getNombreEquipoLocal());
    }
}
