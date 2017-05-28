package com.company.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by marco on 19/05/2017.
 */
public class MenuPartido {
    public ArrayList<Partido> partidos = new ArrayList<>();
    public ArrayList<Equipo> equipos = new ArrayList<>();

    // Constructores

    public MenuPartido(ArrayList<Partido> partidos) {
    }

    // Métodos

    public void crearPartido() {


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

    public void buscarPorJornada() {
        int jornada;
        Scanner scanner = new Scanner(System.in);

        for (Partido partido: partidos){
            System.out.println(partido);
        }

        System.out.println();
        System.out.printf("Introduzca la jornada del partido: ");
        jornada = scanner.nextInt();

        for (Partido partido: partidos){
            if (jornada == partido.getJornada()) {
                System.out.println(partido);
            }
        }
    }

    public void buscarPorEquipo() {
        String nombreEquipo;
        Scanner scanner = new Scanner(System.in);

        for (Partido partido: partidos){
            System.out.println(partido);
        }

        System.out.println();
        System.out.printf("Introduzca la jornada del partido: ");
        nombreEquipo = scanner.nextLine().toLowerCase().replace(" ","").replace("-", "").replace("_", "").replace(".", "");

        for (Partido partido: partidos){
            if (nombreEquipo.equals(partido.getNombreEquipo().toLowerCase().replace(" ","").replace("-", "").replace("_", "").replace(".", ""))) {
                System.out.println(partido);
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