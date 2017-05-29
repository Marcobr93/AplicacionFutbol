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
    public ArrayList<Partido> partidosPrimera= new ArrayList<>();
    public ArrayList<Partido> partidosSegunda= new ArrayList<>();
    // Constructores

    public MenuPartido() {
    }

    public MenuPartido(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }


    // Métodos

    public void llenarPartidoPrimeraOSegunda(){
        for (Partido partido: partidos) {
            if (partido.getCompeticion().equals(Competicion.PRIMERA)){
                partidosPrimera.add(partido);
            }else if (partido.getCompeticion().equals(Competicion.SEGUNDA)) {
                partidosSegunda.add(partido);
            }
        }
    }

    public void crearPartido() {
        boolean noCreado=true;  //Booleano que permite crear un Partido si no existe ya
        int jornada;
        Equipo equipoLocal=null;   //Variable Equipo que coge el valor de un Equipo que tenga el mismo nombre con equipo1
        String nombreEquipoLocal;         //Variable donde se indica el nombre del Equipo
        Equipo equipoVisitante=null;   //Variable Equipo que coge el valor de un Equipo que tenga el mismo nombre con equipo2
        String nombreEquipoVisitante;         //Variable donde se indica el nombre del Equipo
        boolean equipoRepetido = false;
        String estadio;
        String arbitro;
        int golesLocal;
        int golesVisitante;
        Competicion competicion = null;
        String nombreCompeticion;
        Partido partido;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("Introduzca el nombre del equipo local: ");
            nombreEquipoLocal = scanner.nextLine();

            for (Equipo equipo : equipos) {
                if (equipo.getNombreEquipo().toLowerCase().replace(" ", "").equals(nombreEquipoLocal.toLowerCase().replace(" ", ""))) {
                    equipoLocal = equipo;
                }
            }

        }while (equipoLocal == null);

        do {
            System.out.print("Introduzca el nombre del equipo visitante: ");
            nombreEquipoVisitante = scanner.nextLine();

            for (Equipo equipo : equipos) {
                if (equipo.getNombreEquipo().toLowerCase().replace(" ", "").equals(nombreEquipoVisitante.toLowerCase().replace(" ", ""))) {
                    equipoVisitante = equipo;
                }
            }
            if (nombreEquipoLocal.toLowerCase().replace(" ", "").equals(nombreEquipoVisitante.toLowerCase().replace(" ", ""))) {
                equipoRepetido = true;
            }
        } while (equipoVisitante == null || equipoRepetido == true) ;


            System.out.println("Introduzca el estadio: ");
            estadio = scanner.nextLine();

            System.out.println("Introduzca el arbitro: ");
            arbitro = scanner.nextLine();

            System.out.println("Competición del equipo: ");
            nombreCompeticion = scanner.next();
            if (nombreCompeticion.toLowerCase().replace(" ", "").equals("primera")) {
                competicion = Competicion.PRIMERA;
            } else if (nombreCompeticion.toLowerCase().replace(" ", "").equals("segunda")) {
                competicion = Competicion.SEGUNDA;
            }

            System.out.println("Introduzca los goles del equipo local: ");
            try {
                golesLocal = scanner.nextInt();
            } catch (NullPointerException e) {
                System.out.println("No ha introducido un numero, se le asignara 0");
                golesLocal = 0;
            }

            System.out.println("Introduzca los goles del equipo visitante: ");
            try {
                golesVisitante = scanner.nextInt();
            } catch (NullPointerException e) {
                System.out.println("No ha introducido un numero, se le asignara 0");
                golesVisitante = 0;
            }

            System.out.println("Introduzca la jornada del partido: ");
            jornada = scanner.nextInt();

            partido = new Partido(equipoLocal,nombreEquipoLocal, equipoVisitante,nombreEquipoVisitante, estadio, arbitro, competicion, golesLocal, golesVisitante, jornada);

            if (partido != null) {
                for (Partido partid : partidos) {
                    if ((partido.getJornada() == (partid.getJornada())) || partido.getEquipoLocal().equals(partid.getEquipoLocal())) {
                        noCreado = false;
                    }
                }
                if (noCreado == true) {
                    if (competicion.equals(Competicion.PRIMERA)){
                        partidosPrimera.add(partido);
                    }else if (competicion.equals(Competicion.SEGUNDA)){
                        partidosSegunda.add(partido);
                    }
                    partidos.add(partido);
                }
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
        Iterator<Partido> ITPartidoP = partidosPrimera.iterator();
        Iterator<Partido> ITPartidoS = partidosSegunda.iterator();

        while ( ItPartido.hasNext() ){
            Partido partido = ItPartido.next();
            if (partido.getJornada() == (jornada)) {
                ItPartido.remove();
            }
        }
        while ( ITPartidoP.hasNext() ){
            Partido partido = ITPartidoP.next();
            if (partido.getJornada() == (jornada)) {
                ITPartidoP.remove();
            }
        }
        while ( ITPartidoS.hasNext() ){
            Partido partido = ITPartidoS.next();
            if (partido.getJornada() == (jornada)) {
                ITPartidoS.remove();
            }
        }
    }

    public void buscarPorJornada() {
        int jornada;
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.printf("Introduzca la jornada del partido: ");
        jornada = scanner.nextInt();

        for (Partido partido: partidos){
            if (jornada == partido.getJornada()) {
                System.out.println(partido);
            }
        }
    }

    public void buscarPorJornadaPrimera() {
        int jornada;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Introduzca la jornada del partido: ");
        jornada = scanner.nextInt();

        for (Partido partido: partidosPrimera){
            if (jornada == partido.getJornada()) {
                System.out.println(partido);
            }
        }
    }

    public void buscarPorJornadaSegunda() {
        int jornada;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Introduzca la jornada del partido: ");
        jornada = scanner.nextInt();

        for (Partido partido: partidosSegunda){
            if (jornada == partido.getJornada()) {
                System.out.println(partido);
                System.out.println();
            }
        }
    }

    public void buscarPorEquipo() {
        String nombreEquipo;
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.printf("Introduzca el nombre del equipo que juega el partido: ");
        nombreEquipo = scanner.nextLine().toLowerCase().replace(" ", "").replace("-", "").replace("_", "").replace(".", "");

        for (Partido partido : partidos) {
            if (nombreEquipo.equals(partido.getNombreEquipoLocal().toLowerCase().replace(" ", "").replace("-", "").replace("_", "").replace(".", ""))) {
                System.out.println(partido);
            } else if (nombreEquipo.equals(partido.getNombreEquipoVisitante().toLowerCase().replace(" ", "").replace("-", "").replace("_", "").replace(".", ""))) {
                System.out.println(partido);
                System.out.println();
            }
        }
    }

    public void buscarPorEquipoPrimera() {
        String nombreEquipo;
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.printf("Introduzca el nombre del equipo que juega el partido: ");
        nombreEquipo = scanner.nextLine().toLowerCase().replace(" ", "").replace("-", "").replace("_", "").replace(".", "");

        for (Partido partido : partidosPrimera) {
            if (nombreEquipo.equals(partido.getNombreEquipoLocal().toLowerCase().replace(" ", "").replace("-", "").replace("_", "").replace(".", ""))) {
                System.out.println(partido);
            } else if (nombreEquipo.equals(partido.getNombreEquipoVisitante().toLowerCase().replace(" ", "").replace("-", "").replace("_", "").replace(".", ""))) {
                System.out.println(partido);
            }
        }
    }

    public void buscarPorEquipoSegunda() {
        String nombreEquipo;
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.printf("Introduzca el nombre del equipo que juega el partido: ");
        nombreEquipo = scanner.nextLine().toLowerCase().replace(" ", "").replace("-", "").replace("_", "").replace(".", "");

        for (Partido partido : partidosSegunda) {
            if (nombreEquipo.equals(partido.getNombreEquipoLocal().toLowerCase().replace(" ", "").replace("-", "").replace("_", "").replace(".", ""))) {
                System.out.println(partido);
                System.out.println();
            } else if (nombreEquipo.equals(partido.getNombreEquipoVisitante().toLowerCase().replace(" ", "").replace("-", "").replace("_", "").replace(".", ""))) {
                System.out.println(partido);
            }
        }
    }


    public void listaPartidos(){
        for (Partido partido: partidos){
            System.out.println(partido);
        }
    }

    public void listaPartidosPrimera(){
        for (Partido partido: partidosPrimera){
            System.out.println(partido);
        }
    }

    public void listaPartidosSegunda(){
        for (Partido partido: partidosSegunda){
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