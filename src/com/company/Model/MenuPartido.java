package com.company.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by marco on 19/05/2017.
 */
public class MenuPartido {
    MenuEquipo menuEquipo = new MenuEquipo();
    public ArrayList<Partido> partidos = new ArrayList<>();

    // Métodos

    public void crearPartido() {
        Equipo equipoLocal = null;
        String nombreEquipoLocal;
        Equipo equipoVisitante = null;
        String nombreEquipoVisitante;
        String estadio;
        String arbitro;
        Competicion competicion;
        int golLocal;
        int golVisitante;
        int jornada;
        Partido partido;
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Introduzca nombre del primer equipo");
            nombreEquipoLocal = input.nextLine();
            for (Equipo equipo : menuEquipo.equipos) {
                if (equipo.getNombreEquipo().toLowerCase().replace(" ", "").replace("-", "").equals(nombreEquipoLocal.toLowerCase().replace(" ", "").replace("-", ""))) {
                    equipoLocal = equipo;
                }
            }
            if (equipoLocal == null) {
                System.out.println("Introduzca un nombre de equipo correcto");
            }
        } while (equipoLocal == null);

        do {
            System.out.println("Introduzca el nombre del segundo equipo");
            nombreEquipoVisitante = input.nextLine();
            for (Equipo equipo : menuEquipo.equipos) {
                if (equipo.getNombreEquipo().toLowerCase().replace(" ", "").replace("-", "").equals(nombreEquipoVisitante.toLowerCase().replace(" ", "").replace("-", ""))) {
                    equipoVisitante = equipo;
                }
            }
            if (nombreEquipoVisitante == null) {
                System.out.println("Introduzca un nombre de equipo correcto");
            }
        } while (equipoVisitante == null);

        System.out.println("Introduzca el estadio");
        estadio = input.nextLine();

        System.out.println("Introduzca el arbitro");
        arbitro = input.nextLine();

        System.out.println("Introduzca la categoria");
        competicion = Competicion.PRIMERA;

        System.out.println("Introduzca los goles del equipo local");
        golLocal = input.nextInt();

        System.out.println("Introduzca los goles del equipo visitante");
        golVisitante = input.nextInt();

        System.out.println("Introduzca la jornada del partido");
        jornada = input.nextInt();

        partido = new Partido(equipoLocal, equipoVisitante, estadio, arbitro, competicion, golLocal, golVisitante, jornada);

        if (partido != null) {
            partidos.add(partido);
        }
    }

    public void eliminarPartido(){
        int jornada;
        Scanner input = new Scanner(System.in);

        for (Partido partido: partidos){
            System.out.println(partido);
        }

        System.out.printf("Introduzca la jornada del partido: ");
        jornada = input.nextInt();

        Iterator<Partido> ItPartido = partidos.iterator();
        while ( ItPartido.hasNext() ){
            Partido partido = ItPartido.next();
            if (partido.getJornada() == (jornada)) {
                ItPartido.remove();
            }
        }
    }

    public void listaPartidos(){
        for (Partido partido: partidos){
            System.out.println(partido);
        }
    }


    // Ordenación

    public void ordenacionPorLocal(){
        Collections.sort(partidos, Partido.comparadorPorLocal);

        listaPartidos();
    }

    public void ordenacionPorVisitante(){
        Collections.sort(partidos, Partido.comparadorPorVisitante);

        listaPartidos();
    }

    public void ordenacionPorEstadio(){
        Collections.sort(partidos, Partido.comparadorPorEstadio);

        listaPartidos();
    }

    public void ordenacionPorJornada(){
        Collections.sort(partidos, Partido.comparadorPorJornada);

        listaPartidos();
    }

    public void ordenacionPorGolesLocal(){
        Collections.sort(partidos, Partido.comparadorPorGolesLocal);

        listaPartidos();
    }

    public void ordenacionPorGolesVisitante(){
        Collections.sort(partidos, Partido.comparadorPorGolesVisitante);

        listaPartidos();
    }
}

/*
 public void listaPartidos(){
        for (Partido partido: partidos){
            System.out.println(partido);
        }
    }

    public void eliminarPartido(){
        Scanner scanner = new Scanner(System.in);
        int numero;

        Iterator<Partido> itPartido = partidos.iterator();

        listaPartidos();

        System.out.println();

        System.out.println("Introduzca el número del partido que desea borrar");
        numero = scanner.nextInt();

        while (itPartido.hasNext()){
            Partido partido = itPartido.next();

            if (numero == partido.getNumeroPartido()){
                itPartido.remove();
            }
        }
    }
 */