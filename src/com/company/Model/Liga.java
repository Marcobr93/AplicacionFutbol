package com.company.Model;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by marco on 29/05/2017.
 */
public class Liga  {
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

    public Liga() {
    }

    public Liga(String nombreEquipo, int partidosJugados, int partidosGanados, int partidosEmpatados, int partidosPerdidos, int golesAFavor, int golesEnContra, int puntos, ArrayList<Equipo> equipos, Competicion competicion) {
        this.setNombreEquipo(nombreEquipo);
        this.setPartidosJugados(partidosJugados);
        this.setPartidosGanados(partidosGanados);
        this.setPartidosEmpatados(partidosEmpatados);
        this.setPartidosPerdidos(partidosPerdidos);
        this.setGolesAFavor(golesAFavor);
        this.setGolesEnContra(golesEnContra);
        this.setPuntos(puntos);
        this.setEquipos(equipos);
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

    // Comparadores


    public static Comparator<Liga> comparadorPorNombreEquipo = new Comparator<Liga>() {
        @Override
        public int compare(Liga liga1, Liga liga2) {
            int res;

            res = liga1.getNombreEquipo().compareToIgnoreCase(liga1.getNombreEquipo());
            return res;
        }
    };

    public static Comparator<Liga> comparadorPorPartidosJugados = new Comparator<Liga>() {
        @Override
        public int compare(Liga liga1, Liga liga2) {
            return (liga2.getPartidosJugados() - liga1.getPartidosJugados());
        }
    };

    public static Comparator<Liga> comparadorPorPartidosGanados = new Comparator<Liga>() {
        @Override
        public int compare(Liga liga1, Liga liga2) {
            return (liga2.getPartidosGanados() - liga1.getPartidosGanados());
        }
    };

    public static Comparator<Liga> comparadorPorPartidosEmpatados = new Comparator<Liga>() {
        @Override
        public int compare(Liga liga1, Liga liga2) {
            return (liga2.getPartidosEmpatados() - liga1.getPartidosEmpatados());
        }
    };

    public static Comparator<Liga> comparadorPorPartidosPerdidos = new Comparator<Liga>() {
        @Override
        public int compare(Liga liga1, Liga liga2) {
            return (liga2.getPartidosPerdidos() - liga1.getPartidosPerdidos());
        }
    };

    public static Comparator<Liga> comparadorPorPuntos = new Comparator<Liga>() {
        @Override
        public int compare(Liga liga1, Liga liga2) {
            return (liga2.getPuntos() - liga1.getPuntos());
        }
    };

    public static Comparator<Liga> comparadorPorGolesAFavor = new Comparator<Liga>() {
        @Override
        public int compare(Liga liga1, Liga liga2) {
            return (liga2.getGolesAFavor() - liga1.getGolesAFavor());
        }
    };

    public static Comparator<Liga> comparadorPorGolesEnContra = new Comparator<Liga>() {
        @Override
        public int compare(Liga liga1, Liga liga2) {
            return (liga2.getGolesEnContra() - liga1.getGolesEnContra());
        }
    };

    public static Comparator<Liga> comparadorPorCompeticion = new Comparator<Liga>() {
        @Override
        public int compare(Liga liga1, Liga liga2) {
            int res;

            res = liga1.getCompeticion().compareTo(liga2.getCompeticion());
            return res;
        }
    };


}
