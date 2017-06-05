package com.company.Model;

import java.io.*;
import java.util.*;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class MenuJugador implements Serializable {

    private static final long serialVersionUID = -9201269610245151146L;
    public ArrayList<Equipo> equipos = new ArrayList<>();              // ArrayList con todos los equipos
    public ArrayList<Jugador> jugadores = new ArrayList<>();           // ArrayList con todos los jugadores
    public ArrayList<Jugador> jugadoresPrimera = new ArrayList<>();    // ArrayList con los jugadores de Primera
    public ArrayList<Jugador> jugadoresSegunda = new ArrayList<>();    // ArrayList con los jugadores de Segunda
    public ArrayList<Jugador> jugadoresEquipo = new ArrayList<>();     // ArrayList con los jugadores del equipo elegido
    public ArrayList<Jugador> porterosPrimera = new ArrayList<>();     // ArrayList con los porteros de Primera
    public ArrayList<Jugador> porterosSegunda = new ArrayList<>();     // ArrayList con los porteros de Segunda

    // Constructores

    /**
     * Constructor por defecto
     */
    public MenuJugador() {
    }


    /**
     * Constructor que recibe el ArrayList de Equipo desde Controller/FutbolApp
     * @param equipos
     */
    public MenuJugador(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }



    // Métodos

    /**
     * Método que sirve para dividir el ArrayList jugadoresPrimera en uno nuevo, los equipos que tengan como posición
     * 'Portero', se añadirán al ArrayList porterosPrimera.
     */
    public void añadirPorteroPrimera(){

        for (Jugador jugador: jugadoresPrimera) {
            if (jugador.getPosicion().equals(Posicion.Portero) && jugador.getPartidosJugados() >= 28){
                porterosPrimera.add(jugador);
            }
        }
    }

    /**
     * Método que sirve para dividir el ArrayList jugadoresSegunda en uno nuevo, los equipos que tengan como posición
     * 'Portero', se añadirán al ArrayList porterosSegunda.
     */
    public void añadirPorteroSegunda(){

        for (Jugador jugador: jugadoresSegunda) {
            if (jugador.getPosicion().equals(Posicion.Portero) && jugador.getPartidosJugados() >= 28){
                porterosSegunda.add(jugador);
            }
        }
    }

    /**
     * Método que sirve para dividir el ArrayList jugadores en dos nuevos, los jugadores que tengan como competición
     * 'PRIMERA', se añadirán al ArrayList jugadoresPrimera y los jugadores que tengan como competición 'SEGUNDA', se
     * añadirán al ArrayList jugadoresSegunda
     */
    public void añadirJugadoresPrimeraSegunda() {
        for (Jugador jugador : jugadores) {
            if (jugador.getCompeticion().equals(Competicion.PRIMERA)) {
                jugadoresPrimera.add(jugador);
            } else if (jugador.getCompeticion().equals(Competicion.SEGUNDA)) {
                jugadoresSegunda.add(jugador);
            }
        }
    }

    /**
     * Método que nos permite crear un jugador y lo añadirá al ArrayList jugadores
     */
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
        } while (partidosJugados < 0);

        do {
            System.out.println("Tarjetas amarillas del jugador: ");
            try{
                tarjetasAmarillas = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduzca una cantidad válida.");
                scanner.next();
            }
        } while (tarjetasAmarillas < 0);

        do {
            System.out.println("Tarjetas rojas del jugador: ");
            try{
                tarjetasRoja = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca una cantidad válida.");
                scanner.next();
            }
        } while (tarjetasRoja < 0);

        do {
            System.out.println("Goles del jugador: ");
            try {
                goles = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca una cantidad válida.");
                scanner.next();
            }
        } while (goles < 0);

        do {
            System.out.println("Goles en propia del jugador: ");
            try {
                golesEnPropia = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca una cantidad válida.");
                scanner.next();
            }
        } while (golesEnPropia < 0);

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
            } while (golesRecibidos < 0);
        }

        do {
            System.out.println("Asistencias del jugador: ");
            try{
                asistencias = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca una cantidad válida.");
                scanner.next();
            }
        } while (asistencias < 0);

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

    /**
     * Método que nos permite eliminar un jugador introduciendo el dorsal de este
     */
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


    /**
     * Método que nos permite buscar un jugador por su nombre.
     */
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

    /**
     * Método que nos permite elegir un equipo introduciendo el nombre de este y devuelve el ArrayList con los jugadores
     * del equipo que hemos introducido el nombre
     */
    public ArrayList<Jugador> elegirEquipo() {
        jugadoresEquipo.clear(); // Borramos todos los jugadores que formen parte del ArrayList, para que cuando busquemos
                                 // busquemos en otros equipos, los jugadores de anteriores búsquedas no aparezcan de
                                 // nuevo.

        Scanner scanner = new Scanner(System.in);
        String nombreIntroducido;

        System.out.println();
        do {
            System.out.println("Introduzca el nombre del equipo");
            nombreIntroducido = scanner.nextLine();

            for (Equipo equip : equipos) {
                if (equip.getNombreEquipo().toLowerCase().replace(" ", "").equals(nombreIntroducido.toLowerCase().replace(" ", ""))) {
                    nombreIntroducido = equip.getNombreEquipo();
                }
            }
        }while(nombreIntroducido == null);


        for (Jugador jugador: jugadores){
            if (nombreIntroducido.equals(jugador.getEquipo())) {
                System.out.println(jugador);
                jugadoresEquipo.add(jugador);
            }
        }
        return jugadoresEquipo;
    }


    /**
     * Método el cuál con un Foreach nos muestra los jugadores del ArrayList jugadores
     */
    public void listaJugadores(){
        int indice = 1;
        for (Jugador jugador: jugadores){
            System.out.println((indice++) + " - " + jugador);
        }
    }

    /**
     * Método el cuál con un Foreach nos muestra los jugadores del ArrayList jugadoresEquipo
     */
    public void listaJugadoresEquipo(){

        for (Jugador jugador: jugadoresEquipo){
            System.out.println(" - " + jugador);
        }
    }

    /**
     * Método el cuál con un Foreach nos muestra los jugadores del ArrayList jugadoresPrimera
     */
    public void listaJugadoresEquiposPrimera(){
        int indice = 0;
        for (Jugador jugador: jugadoresPrimera){
            System.out.println((indice++) + " - " + jugador);
        }
    }

    /**
     * Método el cuál con un Foreach nos muestra los jugadores del ArrayList jugadoresSegunda
     */
    public void listaJugadoresEquiposSegunda(){
        int indice = 1;
        for (Jugador jugador: jugadoresSegunda){
            System.out.println((indice++) + " - " + jugador);
        }
    }

    /**
     * Método el cuál con un Foreach nos muestra los porteros del ArrayList porterosPrimera
     */
    public void listaPorterosPrimera(){
        int indice = 1;

        for (Jugador jugador: porterosPrimera) {
            System.out.println((indice++) + " - " + jugador.getNombreJugador() + " " + jugador.getApellidosJugador() + ", Partidos jugados: " + jugador.getPartidosJugados() + ", Goles recibidos: " + jugador.getGolesRecibidos() + ", Promedio de goles: " + jugador.getPromedioDeGoles() + " por partido" + ", Equipo: " + jugador.getEquipo() + ".");
        }
    }

    /**
     * Método el cuál con un Foreach nos muestra los porteros del ArrayList porterosSegunda
     */
    public void listaPorterosSegunda(){
        int indice = 1;

        for (Jugador jugador: porterosSegunda) {
            System.out.println((indice++) + " - " + jugador.getNombreJugador() + " " + jugador.getApellidosJugador() + ", Partidos jugados: " + jugador.getPartidosJugados() + ", Goles recibidos: " + jugador.getGolesRecibidos() + ", Promedio de goles: " + jugador.getPromedioDeGoles() + " por partido"  + ", Equipo: " + jugador.getEquipo() + ".");
        }
    }


    /**
     * Método el cuál con un Foreach nos muestra los goles de los jugadores del ArrayList jugadoresPrimera
     */
    public void listaPichichiPrimera(){
        int indice = 1;

        for (Jugador jugador: jugadoresPrimera) {
            if (jugador.getGoles() >= 7)
            System.out.println((indice++) + " - " + jugador.getNombreJugador() + " " + jugador.getApellidosJugador() + ", " + jugador.getGoles() + " goles" + ", Equipo: " + jugador.getEquipo() + ".");
        }
    }

    /**
     * Método el cuál con un Foreach nos muestra los goles de los jugadores del ArrayList jugadoresSegunda
     */
    public void listaPichichiSegunda(){
        int indice = 1;

        for (Jugador jugador: jugadoresSegunda) {
            if (jugador.getGoles() >= 7)
                System.out.println((indice++) + " - " + jugador.getNombreJugador() + " " + jugador.getApellidosJugador() + ", " + jugador.getGoles() + " goles" + ", Equipo: " + jugador.getEquipo() + ".");
        }
    }


    // Ordenación de los jugadores del ArrayList jugadoresEquipo que hemos elegido su equipo con el método elegirEquipo

    /**
     * Método que utiliza el comparadorPorNombre para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorNombre(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorNombre);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorApellidos para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorApellidos(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorApellidos);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorPosicion para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorPosicion(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorPosicion);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorDorsal para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorDorsal(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorDorsal);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorAltura para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorAltura(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorAltura);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorPeso para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorPeso(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorPeso);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorEdad para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorEdad(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorEdad);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorPartidosJugados para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorPartidosJugados(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorPartidosJugados);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorTarjetasAmarillas para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorTarjetasAmarillas(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorTarjetasAmarillas);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorTarjetasRojas para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorTarjetasRojas(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorTarjetasRojas);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorGoles para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorGoles(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorGoles);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorGolesEnPropia para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorGolesEnPropia(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorGolesEnPropia);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorGolesRecibidos para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorGolesRecibidos(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorGolesRecibidos);

        listaJugadoresEquipo();
    }

    /**
     * Método que utiliza el comparadorPorAsistencias para ordenar los jugadores del ArrayList jugadoresEquipo
     */
    public void ordenacionPorAsistencias(ArrayList<Jugador> jugadoresEquipo){
        Collections.sort(jugadoresEquipo, Jugador.comparadorPorAsistencias);

        listaJugadoresEquipo();
    }


    // Ordenación para obtener el Trofeo "pichichi", que se le otorga al jugador con más goles anotados
    // en la competición de Primera/Segunda

    /**
     * Método que utiliza el comparadorPorGoles para ordenar los jugadores del ArrayList jugadoresPrimera
     */
    public void ordenacionPorPichichiPrimera(){
        Collections.sort(jugadoresPrimera, Jugador.comparadorPorGoles);

        listaPichichiPrimera();
    }

    /**
     * Método que utiliza el comparadorPorGoles para ordenar los jugadores del ArrayList jugadoresSegunda
     */
    public void ordenacionPorPichichiSegunda(){
        Collections.sort(jugadoresSegunda, Jugador.comparadorPorGoles);

        listaPichichiSegunda();
    }


    // Ordenación porteros de Primera/Segunda

    /**
     * Método que utiliza el comparadorPorGolesRecibidos para ordenar los porteros del ArrayList porterosPrimera
     */
    public void ordenacionPorZamoraPrimera(){
        Collections.sort(porterosPrimera, Jugador.comparadorPorGolesRecibidos);

        listaPorterosPrimera();
    }

    /**
     * Método que utiliza el comparadorPorGolesRecibidos para ordenar los porteros del ArrayList porterosSegunda
     */
    public void ordenacionPorZamoraSegunda(){
        Collections.sort(porterosSegunda, Jugador.comparadorPorGolesRecibidos);

        listaPorterosSegunda();
    }

    // Guardado y cargado de datos

    /**
     * Método que guarda los jugadores en sus respectivos archivos
     */
    public void guardarJugadores() {
        try {
            ObjectOutputStream guardarJugadores = new ObjectOutputStream(new FileOutputStream("datos/jugadores.dat"));
            guardarJugadores.writeObject(jugadores);
            guardarJugadores.close();

        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }
    }

    /**
     * Método que carga los jugadores de sus respectivos archivos
     */
    public void cargarJugadores() {
        try {
            ObjectInputStream leerEquipos = new ObjectInputStream(new FileInputStream("datos/equipos.dat"));
            equipos = (ArrayList<Equipo>) leerEquipos.readObject();
            leerEquipos.close();

            ObjectInputStream leerJugadores = new ObjectInputStream(new FileInputStream("datos/jugadores.dat"));
            jugadores = (ArrayList<Jugador>) leerJugadores.readObject();
            leerJugadores.close();

        } catch (IOException e) {
            System.out.println("Archivo no encontrado!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
