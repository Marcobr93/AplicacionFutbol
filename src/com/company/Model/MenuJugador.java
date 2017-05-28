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

    // Constructores


    public MenuJugador() {
    }


    public MenuJugador(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }


    // Métodos

    public boolean existeJugadorEnArrayEquipo(String nombreEquipo){
        for (Equipo equipo: equipos) {
            if (equipo.getJugadores().equals(nombreEquipo)){
                return true;
            }
        }
        return false;
    }


    public void llenarEquipoDeJugadores(Jugador jugador){

        for (Equipo equipo: equipos) {
            if (equipo.getNombreEquipo().equals(jugador.getEquipo())){
                equipos.add((Equipo) jugador);
            }
        }
    }

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
        Equipo equipo = null;
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
            System.out.println("Asistenciass del jugador: ");
            asistencias = scanner.nextInt();
        } while (asistencias < 0);

        do {
            System.out.println("Introduzca el nombre del equipo");
            equipoNombre = scanner.next().trim().replaceAll("\\s+", " ");
            if (existeJugadorEnArrayEquipo(equipoNombre)){
                System.out.println("El jugador ya existe en ese equipo");
                scanner.nextLine();
            }

            for (Equipo equip : equipos) {
                if (equip.getNombreEquipo().toLowerCase().replace(" ", "").equals(equipoNombre.toLowerCase().replace(" ", ""))) {
                    equipo = equip;
                }
            }
        }while (existeJugadorEnArrayEquipo(equipoNombre));


        jugador = new Jugador(nombreJugador,apellidosJugador,posicion,capitan,altura,peso,dorsal,edad,partidosJugados,tarjetasAmarillas,tarjetasRoja,goles,golesEnPropia,golesRecibidos,asistencias,equipo);

        if (jugador!= null) {
            jugadores.add(jugador);
        }
        llenarEquipoDeJugadores(jugador);
    }

    public void eliminarJugador(){
        Scanner scanner = new Scanner(System.in);
        int dorsal;

        Iterator<Jugador> itJugador = jugadores.iterator();

        listaJugadores();

        System.out.println();

        System.out.println("Introduzca el dorsal del jugador que desea borrar");
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

    public void buscarEquipo() {
        int index=0;
        String equipo;
        Scanner input = new Scanner(System.in);

        for (Equipo equipoe: equipos) {
            System.out.println(equipoe);
        }

        System.out.println();
        System.out.printf("Introduzca el equipo del jugador: ");
        equipo = input.nextLine().toLowerCase().replace(" ","").replace("-", "");

        for (Jugador jugador: jugadores){
            try {
                if (equipo.equals(jugador.getEquipo().getNombreEquipo().toLowerCase().replace(" ","").replace("-", ""))) {
                    System.out.println(jugador);
                    index++;
                }
            } catch (NullPointerException e) {
                break;
            }
        }
        if (index==0) {
            System.out.println("No hay");
        }

        System.out.println();
        input.nextLine();
        System.out.println("Pulse Enter para continuar");
        input.nextLine();
    }

    public void listaJugadores(){
        int indice = 0;
        for (Jugador jugador: jugadores){
            System.out.println((indice++) + " - " + jugador);
        }
    }

    public void elegirEquipo() {
        Scanner scanner = new Scanner(System.in);
        String nombreIntroducido;

        System.out.println();
        System.out.printf("Introduzca el nombre del equipo: ");
        nombreIntroducido = scanner.nextLine().toLowerCase().replace(" ","").replace("-", "");

        for (Jugador jugador: jugadores){
            if (nombreIntroducido.equals(jugador.getEquipo())) {
                System.out.println(jugador);
            }
        }
    }


    // Ordenación

    public void ordenacionPorNombre(){
        Collections.sort(jugadores, Jugador.comparadorPorNombre);

        listaJugadores();
    }

    public void ordenacionPorApellidos(){
        Collections.sort(jugadores, Jugador.comparadorPorApellidos);

        listaJugadores();
    }

    public void ordenacionPorPosicion(){
        Collections.sort(jugadores, Jugador.comparadorPorPosicion);

        listaJugadores();
    }

    public void ordenacionPorDorsal(){
        Collections.sort(jugadores, Jugador.comparadorPorDorsal);

        listaJugadores();
    }

    public void ordenacionPorAltura(){
        Collections.sort(jugadores, Jugador.comparadorPorAltura);

        listaJugadores();
    }

    public void ordenacionPorPeso(){
        Collections.sort(jugadores, Jugador.comparadorPorPeso);

        listaJugadores();
    }

    public void ordenacionPorEdad(){
        Collections.sort(jugadores, Jugador.comparadorPorEdad);

        listaJugadores();
    }

    public void ordenacionPorPartidosJugados(){
        Collections.sort(jugadores, Jugador.comparadorPorPartidosJugados);

        listaJugadores();
    }

    public void ordenacionPorTarjetasAmarillas(){
        Collections.sort(jugadores, Jugador.comparadorPorTarjetasAmarillas);

        listaJugadores();
    }

    public void ordenacionPorTarjetasRojas(){
        Collections.sort(jugadores, Jugador.comparadorPorTarjetasRojas);

        listaJugadores();
    }

    public void ordenacionPorGoles(){
        Collections.sort(jugadores, Jugador.comparadorPorGoles);

        listaJugadores();
    }

    public void ordenacionPorGolesEnPropia(){
        Collections.sort(jugadores, Jugador.comparadorPorGolesEnPropia);

        listaJugadores();
    }

    public void ordenacionPorGolesRecibidos(){
        Collections.sort(jugadores, Jugador.comparadorPorGolesRecibidos);

        listaJugadores();
    }

    public void ordenacionPorAsistencias(){
        Collections.sort(jugadores, Jugador.comparadorPorAsistencias);

        listaJugadores();
    }

    public void ordenacionPorEquipo(){
        Collections.sort(jugadores, Jugador.comparadorPorEquipo);

        listaJugadores();
    }

}


/*
if (jugador!= null) {
            for (Jugador jugador1 : jugadores) {
                if (jugador1.getEquipo().toLowerCase().replace(" ", "").replace("-", "").replace("_", "").equals(jugador.getEquipo().toLowerCase().replace(" ", "").replace("-", "").replace("_", ""))) {
                    noCreado = false;
                }
            }
            if (noCreado) {
                jugadores.add(jugador);
                equipos.add((Equipo) jugador);
            }
        }
 */

/*
public void llenarEquipoDeJugadores(Jugador jugador){

        for (Equipo equipo: equipos) {
            if (equipo.getNombreEquipo().equals(jugador.getEquipo())){
                equipo.getJugadores().add(jugador);
            }
        }
    }
 */