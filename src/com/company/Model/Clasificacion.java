package com.company.Model;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by marco on 29/05/2017.
 */
public class Clasificacion {
    private String nombreEquipo;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int golesAFavor;
    private int golesEnContra;
    private int puntos;
    private ArrayList<Equipo> equipos;
    private Competicion competicion;

    // Constructores

    public Clasificacion() {
    }

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

    public int getDiferenciaDeGoles() {
        return getGolesAFavor() - getGolesEnContra();
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Competicion getCompeticion() {
        return competicion;
    }

    public void setCompeticion(Competicion competicion) {
        this.competicion = competicion;
    }

    @Override
    public String toString() {
        return "Clasificacion{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", partidosJugados=" + partidosJugados +
                ", partidosGanados=" + partidosGanados +
                ", partidosEmpatados=" + partidosEmpatados +
                ", partidosPerdidos=" + partidosPerdidos +
                ", golesAFavor=" + golesAFavor +
                ", golesEnContra=" + golesEnContra +
                ", Diferencia de Goles: " + getDiferenciaDeGoles() +
                ", puntos=" + puntos +
                '}';
    }


    // Comparadores


    public static Comparator<Clasificacion> comparadorPorNombreEquipo = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            int res;

            res = clasificacion1.getNombreEquipo().compareToIgnoreCase(clasificacion2.getNombreEquipo());
            return res;
        }
    };

    public static Comparator<Clasificacion> comparadorPorPartidosJugados = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getPartidosJugados() - clasificacion1.getPartidosJugados());
        }
    };

    public static Comparator<Clasificacion> comparadorPorPartidosGanados = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getPartidosGanados() - clasificacion1.getPartidosGanados());
        }
    };

    public static Comparator<Clasificacion> comparadorPorPartidosEmpatados = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getPartidosEmpatados() - clasificacion1.getPartidosEmpatados());
        }
    };

    public static Comparator<Clasificacion> comparadorPorPartidosPerdidos = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getPartidosPerdidos() - clasificacion1.getPartidosPerdidos());
        }
    };

    public static Comparator<Clasificacion> comparadorPorPuntos = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getPuntos() - clasificacion1.getPuntos());
        }
    };

    public static Comparator<Clasificacion> comparadorPorGolesAFavor = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getGolesAFavor() - clasificacion1.getGolesAFavor());
        }
    };

    public static Comparator<Clasificacion> comparadorPorGolesEnContra = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getGolesEnContra() - clasificacion1.getGolesEnContra());
        }
    };

    public static Comparator<Clasificacion> comparadorPorDiferenciaDeGoles = new Comparator<Clasificacion>() {
        @Override
        public int compare(Clasificacion clasificacion1, Clasificacion clasificacion2) {
            return (clasificacion2.getDiferenciaDeGoles() - clasificacion1.getDiferenciaDeGoles());
        }
    };
}
