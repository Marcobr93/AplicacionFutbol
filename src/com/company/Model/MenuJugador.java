package com.company.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class MenuJugador {

    public ArrayList<Jugador> jugadores = new ArrayList<>();
    public ArrayList<Equipo> equipos = new ArrayList<>();
    public ArrayList<Jugador> jugadors = new ArrayList<>();

    // Constructores


    public MenuJugador() {
    }


    public MenuJugador(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }


    // Métodos
/*
    public boolean existeJugadorEnArrayEquipo(String nombreEquipo){
        for (Equipo equipo: equipos) {
            if (equipo.getJugadores().equals(nombreEquipo)){
                return true;
            }
        }
        return false;
    }
*/
/*
    public void llenarEquipoDeJugadores(Jugador jugador){

        for (Equipo equipo: equipos) {
            if (equipo.getNombreEquipo().equals(jugador.getEquipo())){
                equipos.add((Equipo) jugador);
            }
        }
    }
*/
    public void crearJugador(){

        Scanner scanner = new Scanner(System.in);
        String nombreJugador;
        String apellidosJugador;
        Posicion posicion = null;
        String posicionElegida;
        String capitanString;
        boolean capitan;
        double altura;
        double peso;
        int dorsal;
        int edad;
        int partidosJugados;
        int tarjetasAmarillas;
        int tarjetasRoja;
        int goles;
        int golesEnPropia;
        int golesRecibidos;
        int asistencias;
        String equipoNombre;
        Jugador jugador;

        do {
            System.out.println("Nombre del jugador: ");
            nombreJugador = scanner.nextLine().trim().replaceAll("\\s+", " ");
        } while (nombreJugador.equals(""));

        do {
            System.out.println("Apellido del jugador: ");
            apellidosJugador = scanner.nextLine().trim().replaceAll("\\s+", " ");
        } while (apellidosJugador.equals(""));
        
        
        System.out.println("Posición del jugador: ");
        posicionElegida = scanner.nextLine();
        if (posicionElegida.toLowerCase().replace(" ", "").equals("portero")) {
            posicion = Posicion.Portero;
        } else if (posicionElegida.toLowerCase().replace(" ", "").replace(" ", "").equals("lateralderecho")) {
            posicion = Posicion.LateralDerecho;
        } else if (posicionElegida.toLowerCase().replace(" ", "").replace(" ", "").equals("central")) {
            posicion = Posicion.Central;
        } else if (posicionElegida.toLowerCase().replace(" ", "").replace(" ", "").equals("lateralizquierdo")) {
            posicion = Posicion.LateralIzquierdo;
        } else if (posicionElegida.toLowerCase().replace(" ", "").replace(" ", "").equals("centrocampista")) {
            posicion = Posicion.Centrocampista;
        } else if (posicionElegida.toLowerCase().replace(" ", "").replace(" ", "").equals("mediapunta")) {
            posicion = Posicion.MediaPunta;
        } else if (posicionElegida.toLowerCase().replace(" ", "").replace(" ", "").equals("extremo")) {
            posicion = Posicion.Extremo;
        } else if (posicionElegida.toLowerCase().replace(" ", "").replace(" ", "").equals("delantero")) {
            posicion = Posicion.Delantero;
        }

        System.out.println("Introduzca si es o no el jugadir capitán del equipo");
        capitanString = scanner.next();
        if (capitanString.toLowerCase().replace("í", "i").equals("si")) {
            capitan = true;
        }else {
            capitan = false;
        }

        do {
            System.out.println("Altura del jugador: ");
            altura = scanner.nextDouble();
        } while (altura < 0.0);

        do {
            System.out.println("Peso del jugador: ");
            peso = scanner.nextDouble();
        } while (peso < 0.0);

        do {
            System.out.println("Dorsal del jugador: ");
            dorsal = scanner.nextInt();
        } while (dorsal < 0);

        do {
            System.out.println("Edad del jugador: ");
            edad = scanner.nextInt();
        } while (edad < 0);

        do {
            System.out.println("Partidos jugados del jugador: ");
            partidosJugados = scanner.nextInt();
        } while (partidosJugados < 0);

        do {
            System.out.println("Tarjetas amarillas del jugador: ");
            tarjetasAmarillas = scanner.nextInt();
        } while (tarjetasAmarillas < 0);

        do {
            System.out.println("Tarjetas rojas del jugador: ");
            tarjetasRoja = scanner.nextInt();
        } while (tarjetasRoja < 0);

        do {
            System.out.println("Goles del jugador: ");
            goles = scanner.nextInt();
        } while (goles < 0);

        do {
            System.out.println("Goles en propia del jugador: ");
            golesEnPropia = scanner.nextInt();
        } while (golesEnPropia < 0);

        do {
            System.out.println("Goles recibidos del jugador: ");
            golesRecibidos = scanner.nextInt();
        } while (golesRecibidos < 0);

        do {
            System.out.println("Asistencias del jugador: ");
            asistencias = scanner.nextInt();
        } while (asistencias < 0);

        scanner.nextLine();
        do {
            System.out.println("Introduzca el nombre del equipo");
            equipoNombre = scanner.nextLine();
           // if (existeJugadorEnArrayEquipo(equipoNombre)){
           //     System.out.println("El jugador ya existe en ese equipo");
           //     scanner.nextLine();
           // }

            for (Equipo equip : equipos) {
                if (equip.getNombreEquipo().toLowerCase().replace(" ", "").equals(equipoNombre.toLowerCase().replace(" ", ""))) {
                    equipoNombre = equip.getNombreEquipo();
                }
            }
        }while(equipoNombre == null);


        jugador = new Jugador(nombreJugador,apellidosJugador,posicion,capitan,altura,peso,dorsal,edad,partidosJugados,tarjetasAmarillas,tarjetasRoja,goles,golesEnPropia,golesRecibidos,asistencias,equipoNombre);

        if (jugador!= null) {
            jugadores.add(jugador);
        }
    }

    public void eliminarJugador(ArrayList<Jugador> jugadors){
        Scanner scanner = new Scanner(System.in);
        int dorsal;

        Iterator<Jugador> itJugador = jugadors.iterator();

        listaJugadoresEquipo();

        System.out.println();

        System.out.println("Introduzca el dorsal del jugador que desea borrar: ");
        dorsal = scanner.nextInt();

        while (itJugador.hasNext()){
            Jugador jugador = itJugador.next();

            if (dorsal == jugador.getDorsal()){
                itJugador.remove();
            }
        }
    }

    public void buscarJugador() {
        String nombre;
        int indice = 0;
        Scanner input = new Scanner(System.in);

        for (Jugador jugador: jugadores){
           System.out.println(jugador.getNombreJugador() + " " + jugador.getApellidosJugador());
        }

        System.out.println();
        System.out.printf("Introduzca el nombre del jugador: ");
        nombre = input.nextLine().toLowerCase().replace(" ","").replace("-", "");

        for (Jugador jugador: jugadores){
            if (nombre.equals(jugador.getNombreJugador().toLowerCase().replace(" ","").replace("-", ""))) {
                System.out.println(jugador);
                indice++;
            }
        }
        if(indice==0) {
            System.out.println("No existe el jugador");
        }
    }


    public void listaJugadores(){
        int indice = 0;
        for (Jugador jugador: jugadores){
            System.out.println((indice++) + " - " + jugador);
        }
    }

    public void listaJugadoresEquipo(){
        int indice = 0;
        for (Jugador jugador: jugadors){
            System.out.println((indice++) + " - " + jugador);
        }
    }

    public ArrayList<Jugador> elegirEquipo() {

        Scanner scanner = new Scanner(System.in);
        String nombreIntroducido;

        System.out.println();
        System.out.printf("Introduzca el nombre del equipo: ");
        nombreIntroducido = scanner.nextLine();

        for (Jugador jugador: jugadores){
            if (nombreIntroducido.equals(jugador.getsEquipo())) {
                System.out.println(jugador);
                jugadors.add(jugador);
            }
        }
        return jugadors;
    }

    public void pichichiPrimera(){
        int indice = 0;

        for (Jugador jugador: jugadores) {

        }
    }

    // Ordenación

    public void ordenacionPorNombre(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorNombre);

        listaJugadoresEquipo();
    }

    public void ordenacionPorApellidos(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorApellidos);

        listaJugadoresEquipo();
    }

    public void ordenacionPorPosicion(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorPosicion);

        listaJugadoresEquipo();
    }

    public void ordenacionPorDorsal(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorDorsal);

        listaJugadoresEquipo();
    }

    public void ordenacionPorAltura(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorAltura);

        listaJugadoresEquipo();
    }

    public void ordenacionPorPeso(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorPeso);

        listaJugadoresEquipo();
    }

    public void ordenacionPorEdad(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorEdad);

        listaJugadores();
    }

    public void ordenacionPorPartidosJugados(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorPartidosJugados);

        listaJugadoresEquipo();
    }

    public void ordenacionPorTarjetasAmarillas(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorTarjetasAmarillas);

        listaJugadoresEquipo();
    }

    public void ordenacionPorTarjetasRojas(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorTarjetasRojas);

        listaJugadoresEquipo();
    }

    public void ordenacionPorGoles(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorGoles);

        listaJugadoresEquipo();
    }

    public void ordenacionPorGolesEnPropia(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorGolesEnPropia);

        listaJugadoresEquipo();
    }

    public void ordenacionPorGolesRecibidos(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorGolesRecibidos);

        listaJugadoresEquipo();
    }

    public void ordenacionPorAsistencias(ArrayList<Jugador> jugadors){
        Collections.sort(jugadors, Jugador.comparadorPorAsistencias);

        listaJugadoresEquipo();
    }
}
