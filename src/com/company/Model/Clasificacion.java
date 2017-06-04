package com.company.Model;

import java.util.Comparator;

/**
 * Created by marco on 29/05/2017.
 */
public class Clasificacion {
    private String nombreEquipo;            // nombre del equipo
    private int partidosJugados;            // nº partidos jugados
    private int partidosGanados;            // nº partidos ganados
    private int partidosEmpatados;          // nº partidos empatados
    private int partidosPerdidos;           // nº partidos perdidos
    private int golesAFavor;                // nº goles a favor
    private int golesEnContra;              // nº goles en contra
    private int puntos;                     // nº de puntos obtenidos en el campeonato
    private Competicion competicion;        // competición que disputa el equipo

    // Constructores

    /**
     * Constructor por defecto
     */
    public Clasificacion() {
    }

    /**
     * Constructor con todos los atributos
     * @param nombreEquipo
     * @param partidosJugados
     * @param partidosGanados
     * @param partidosEmpatados
     * @param partidosPerdidos
     * @param golesAFavor
     * @param golesEnContra
     * @param puntos
     * @param competicion
     */
    public Clasificacion(String nombreEquipo, int partidosJugados, int partidosGanados, int partidosEmpatados, int partidosPerdidos, int golesAFavor, int golesEnContra, int puntos,  Competicion competicion) {
        this.setNombreEquipo(nombreEquipo);
        this.setPartidosJugados(partidosJugados);
        this.setPartidosGanados(partidosGanados);
        this.setPartidosEmpatados(partidosEmpatados);
        this.setPartidosPerdidos(partidosPerdidos);
        this.setGolesAFavor(golesAFavor);
        this.setGolesEnContra(golesEnContra);
        this.setPuntos(puntos);
        this.setCompeticion(competicion);
    }

    // Accesores


    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    /**
     * Getter para calcular la diferencia de goles(goles a favor - goles en contra)
     * @return
     */
    public int getDiferenciaDeGoles() {
        return getGolesAFavor() - getGolesEnContra();
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Competicion getCompeticion() {
        return competicion;
    }

    public void setCompeticion(Competicion competicion) {
        this.competicion = competicion;
    }



    @Override
    public String toString() {
        return
                nombreEquipo  +
                ",  Partidos jugados: " + partidosJugados +
                ",  Partidos ganados: " + partidosGanados +
                ",  Partidos empatados: " + partidosEmpatados +
                ",  Partidos perdidos: " + partidosPerdidos +
                ",  Goles a favor: " + golesAFavor +
                ",  Goles en contra: " + golesEnContra +
                ",  Diferencia de Goles: " + getDiferenciaDeGoles() +
                ",  Puntos: " + puntos +
                '.';
    }


    // Comparadores

    /**
     * Compara los equipos por su nombre
     */
    public static Comparator<Clasificacion> comparadorPorNombreEquipo = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            int res;

            res = clasificacion1.getNombreEquipo().compareToIgnoreCase(clasificacion2.getNombreEquipo());
            return res;
        }
    };

    /**
     * Compara los equipos por los partidos jugados
     */
    public static Comparator<Clasificacion> comparadorPorPartidosJugados = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getPartidosJugados() - clasificacion1.getPartidosJugados());
        }
    };

    /**
     * Compara los equipos por los partidos ganados
     */
    public static Comparator<Clasificacion> comparadorPorPartidosGanados = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getPartidosGanados() - clasificacion1.getPartidosGanados());
        }
    };

    /**
     * Compara los equipos por los partidos empatados
     */
    public static Comparator<Clasificacion> comparadorPorPartidosEmpatados = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getPartidosEmpatados() - clasificacion1.getPartidosEmpatados());
        }
    };

    /**
     * Compara los equipos por los partidos perdidos
     */
    public static Comparator<Clasificacion> comparadorPorPartidosPerdidos = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getPartidosPerdidos() - clasificacion1.getPartidosPerdidos());
        }
    };

    /**
     * Compara los equipos por los puntos obtenidos
     */
    public static Comparator<Clasificacion> comparadorPorPuntos = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getPuntos() - clasificacion1.getPuntos());
        }
    };

    /**
     * Compara los equipos por los goles a favor marcados
     */
    public static Comparator<Clasificacion> comparadorPorGolesAFavor = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getGolesAFavor() - clasificacion1.getGolesAFavor());
        }
    };

    /**
     * Compara los equipos por los goles en contra recibidos
     */
    public static Comparator<Clasificacion> comparadorPorGolesEnContra = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getGolesEnContra() - clasificacion1.getGolesEnContra());
        }
    };

    /**
     * Compara los equipos por la diferencia de goles(goles a favor - goles en contra)
     */
    public static Comparator<Clasificacion> comparadorPorDiferenciaDeGoles = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getDiferenciaDeGoles() - clasificacion1.getDiferenciaDeGoles());
        }
    };
}
