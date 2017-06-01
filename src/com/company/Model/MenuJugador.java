package com.company.Model;

import java.util.*;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class MenuJugador {
    public ArrayList<Equipo> equipos = new ArrayList<>();
    public ArrayList<Jugador> jugadores = new ArrayList<>();
    public ArrayList<Jugador> jugadoresPrimera = new ArrayList<>();
    public ArrayList<Jugador> jugadoresSegunda = new ArrayList<>();
    public ArrayList<Jugador> jugadoresEquipo = new ArrayList<>();
    public ArrayList<Jugador> porterosPrimera = new ArrayList<>();
    public ArrayList<Jugador> porterosSegunda = new ArrayList<>();

    // Constructores


    public MenuJugador() {
    }


    public MenuJugador(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }


    // Métodos

    public void añadirPorteroPrimera(){

        for (Jugador jugador: jugadoresPrimera) {
            if (jugador.getPosicion().equals(Posicion.Portero) && jugador.getPartidosJugados() >= 28){
                porterosPrimera.add(jugador);
            }
        }
    }

    public void añadirPorteroSegunda(){

        for (Jugador jugador: jugadoresSegunda) {
            if (jugador.getPosicion().equals(Posicion.Portero) && jugador.getPartidosJugados() >= 28){
                porterosSegunda.add(jugador);
            }
        }
    }


    public void añadirJugadoresPrimeraSegunda() {
        for (Jugador jugador : jugadores) {
            if (jugador.getCompeticion().equals(Competicion.PRIMERA)) {
                jugadoresPrimera.add(jugador);
            } else if (jugador.getCompeticion().equals(Competicion.SEGUNDA)) {
                jugadoresSegunda.add(jugador);
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
        double altura = 0;
        double peso = 0;
        int dorsal = 0;
        int edad = 0;
        int partidosJugados = 0;
        int tarjetasAmarillas = 0;
        int tarjetasRoja = 0;
        int goles = 0;
        int golesEnPropia = 0;
        int golesRecibidos = 0;
        int asistencias = 0;
        String equipoNombre;
        Jugador jugador;
        String nombreCompeticion;
        Competicion competicion = null;

        do {
            System.out.println("Nombre del jugador: ");
            nombreJugador = scanner.nextLine().trim().replaceAll("\\s+", " ");
        } while (nombreJugador.equals(""));

        do {
            System.out.println("Apellido del jugador: ");
            apellidosJugador = scanner.nextLine().trim().replaceAll("\\s+", " ");
        } while (apellidosJugador.equals(""));

        do {
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
                 } else if (!posicionElegida.equals("portero")){
                     posicion = null;
                 } else if (!posicionElegida.equals("lateralderecho")){
                     posicion = null;
                 }else if (!posicionElegida.equals("lateralizquierdo")){
                     posicion = null;
                 } else if (!posicionElegida.equals("centrocampista")){
                     posicion = null;
                 }else if (!posicionElegida.equals("mediapunta")){
                     posicion = null;
                 } else if (!posicionElegida.equals("extremo")){
                     posicion = null;
                 }else if (!posicionElegida.equals("delantero")){
                     posicion = null;
                 }
         }while (posicion == null);


        System.out.println("Introduzca si es o no el jugadir capitán del equipo");
        capitanString = scanner.next();
        if (capitanString.toLowerCase().replace("í", "i").equals("si")) {
            capitan = true;
        }else {
            capitan = false;
        }

        do {
            System.out.println("Altura del jugador: ");
            try{
                altura = scanner.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduzca una altura válida.");
                scanner.next();
            }
        } while (altura <= 0.0);

        do {
            System.out.println("Peso del jugador: ");
            try{
                peso = scanner.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduzca un peso válido.");
                scanner.next();
            }
        } while (peso <= 0.0);

        do {
            System.out.println("Dorsal del jugador: ");
            try{
                dorsal = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduzca un dorsal válido.");
                scanner.next();
            }
        } while (dorsal <= 0);

        do {
            System.out.println("Edad del jugador: ");
            try{
                edad = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduzca una edad válida.");
                scanner.next();
            }
        } while (edad <= 0);

        do {
            System.out.println("Partidos jugados del jugador: ");
            try{
                partidosJugados = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduzca una cantidad válida.");
                scanner.next();
            }
        } while (partidosJugados <= 0);

        do {
            System.out.println("Tarjetas amarillas del jugador: ");
            try{
                tarjetasAmarillas = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduzca una cantidad válida.");
                scanner.next();
            }
        } while (tarjetasAmarillas <= 0);

        do {
            System.out.println("Tarjetas rojas del jugador: ");
            try{
                tarjetasRoja = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca una cantidad válida.");
                scanner.next();
            }
        } while (tarjetasRoja <= 0);

        do {
            System.out.println("Goles del jugador: ");
            try {
                goles = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca una cantidad válida.");
                scanner.next();
            }
        } while (goles <= 0);

        do {
            System.out.println("Goles en propia del jugador: ");
            try {
                golesEnPropia = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca una cantidad válida.");
                scanner.next();
            }
        } while (golesEnPropia <= 0);

        // Solo los porteros tendrán como atributo Goles recibidos
        if (posicionElegida.toLowerCase().replace(" ", "").equals("portero")) {
            do {
                System.out.println("Goles recibidos del jugador: ");
                try {
                    golesRecibidos = scanner.nextInt();
                }catch (InputMismatchException e) {
                    System.out.println("Por favor, introduzca una cantidad válida.");
                    scanner.next();
                }
            } while (golesRecibidos <= 0);
        }

        do {
            System.out.println("Asistencias del jugador: ");
            try{
                asistencias = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca una cantidad válida.");
                scanner.next();
            }
        } while (asistencias <= 0);

        scanner.nextLine();
        do {
            System.out.println("Introduzca el nombre del equipo");
            equipoNombre = scanner.nextLine();

            for (Equipo equip : equipos) {
                if (equip.getNombreEquipo().toLowerCase().replace(" ", "").equals(equipoNombre.toLowerCase().replace(" ", ""))) {
                    equipoNombre = equip.getNombreEquipo();
                }
            }
        }while(equipoNombre == null);

        do {
            System.out.println("Introduzca si el equipo juega en Primera o en Segunda: ");
            nombreCompeticion = scanner.next();
            if (nombreCompeticion.toLowerCase().replace(" ", "").equals("primera")){
                competicion = Competicion.PRIMERA;
            }else if(nombreCompeticion.toLowerCase().replace(" ", "").equals("segunda")){
                competicion = Competicion.SEGUNDA;
            }else if (!nombreCompeticion.equals("primera")){
                competicion = null;
            }else if (!nombreCompeticion.equals("segunda")){
                competicion = null;
            }
        }while (nombreCompeticion == null);



        jugador = new Jugador(nombreJugador,apellidosJugador,posicion,capitan,altura,peso,dorsal,edad,partidosJugados,tarjetasAmarillas,tarjetasRoja,goles,golesEnPropia,golesRecibidos,asistencias,equipoNombre,competicion);

        if (jugador!= null) {
            jugadores.add(jugador);
        }
    }

    public void eliminarJugador(ArrayList<Jugador> jugadors){
        Scanner scanner = new Scanner(System.in);
        int dorsal = 0;

        Iterator<Jugador> itJugador = jugadors.iterator();

        listaJugadoresEquipo();

        System.out.println();

        do {
            System.out.println("Introduzca el dorsal del jugador que desea borrar: ");
            try {
                dorsal = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduzca un dorsal válido.");
                scanner.next();
            }
        }while (dorsal <= 0);


        while (itJugador.hasNext()){
            Jugador jugador = itJugador.next();

            if (dorsal == jugador.getDorsal()){
                itJugador.remove();
            }
        }
    }

    public void buscarJugador() {
        String nombre;
        Scanner scanner = new Scanner(System.in);

        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombreJugador() + " " + jugador.getApellidosJugador());
        }

        System.out.println();

        System.out.printf("Introduzca solo el nombre del jugador: ");
        nombre = scanner.nextLine().toLowerCase().replace(" ", "").replace("-", "");
        try {
            for (Jugador jugador : jugadores) {

                if (nombre.equals(jugador.getNombreJugador().toLowerCase().replace(" ", "").replace("-", ""))) {
                    System.out.println(jugador);
                }
            }
        } catch (NullPointerException e) {
            scanner.next();
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
                jugadoresEquipo.add(jugador);
            }
        }
        return jugadoresEquipo;
    }


    public void listaJugadores(){
        int indice = 1;
        for (Jugador jugador: jugadores){
            System.out.println((indice++) + " - " + jugador);
        }
    }

    public void listaJugadoresEquipo(){
        int indice = 1;
        for (Jugador jugador: jugadoresEquipo){
            System.out.println((indice++) + " - " + jugador);
        }
    }

    public void listaJugadoresEquiposPrimera(){
        int indice = 0;
        for (Jugador jugador: jugadoresPrimera){
            System.out.println((indice++) + " - " + jugador);
        }
    }

    public void listaJugadoresEquiposSegunda(){
        int indice = 1;
        for (Jugador jugador: jugadoresSegunda){
            System.out.println((indice++) + " - " + jugador);
        }
    }

    public void listaPorterosPrimera(){
        int indice = 1;

        for (Jugador jugador: porterosPrimera) {
            System.out.println((indice++) + " - " + jugador);
        }
    }

    public void listaPorterosSegunda(){
        int indice = 1;

        for (Jugador jugador: porterosSegunda) {
            System.out.println((indice++) + " - " + jugador);
        }
    }

    // Ordenación

    public void ordenacionPorNombre(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorNombre);

        listaJugadoresEquipo();
    }

    public void ordenacionPorApellidos(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorApellidos);

        listaJugadoresEquipo();
    }

    public void ordenacionPorPosicion(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorPosicion);

        listaJugadoresEquipo();
    }

    public void ordenacionPorDorsal(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorDorsal);

        listaJugadoresEquipo();
    }

    public void ordenacionPorAltura(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorAltura);

        listaJugadoresEquipo();
    }

    public void ordenacionPorPeso(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorPeso);

        listaJugadoresEquipo();
    }

    public void ordenacionPorEdad(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorEdad);

        listaJugadores();
    }

    public void ordenacionPorPartidosJugados(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorPartidosJugados);

        listaJugadoresEquipo();
    }

    public void ordenacionPorTarjetasAmarillas(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorTarjetasAmarillas);

        listaJugadoresEquipo();
    }

    public void ordenacionPorTarjetasRojas(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorTarjetasRojas);

        listaJugadoresEquipo();
    }

    public void ordenacionPorGoles(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorGoles);

        listaJugadoresEquipo();
    }

    public void ordenacionPorGolesEnPropia(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorGolesEnPropia);

        listaJugadoresEquipo();
    }

    public void ordenacionPorGolesRecibidos(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorGolesRecibidos);

        listaJugadoresEquipo();
    }

    public void ordenacionPorAsistencias(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorAsistencias);

        listaJugadoresEquipo();
    }

    public void ordenacionPorPichichiPrimera(){
        Collections.sort(jugadoresPrimera, Jugador.comparadorPorGoles);

        listaJugadoresEquiposPrimera();
    }

    public void ordenacionPorPichichiSegunda(){
        Collections.sort(jugadoresSegunda, Jugador.comparadorPorGoles);

        listaJugadoresEquiposSegunda();
    }

    public void ordenacionPorZamoraPrimera(){
        Collections.sort(porterosPrimera, Jugador.comparadorPorGolesRecibidos);

        listaPorterosPrimera();
    }

    public void ordenacionPorZamoraSegunda(){
        Collections.sort(porterosSegunda, Jugador.comparadorPorGolesRecibidos);

        listaPorterosSegunda();
    }
}
