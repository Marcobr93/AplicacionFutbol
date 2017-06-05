package com.company.Model;

import java.io.*;
import java.util.*;

/**
 * Created by marco on 19/05/2017.
 */
public class MenuEquipo implements Serializable {

    private static final long serialVersionUID = -4813635185929991798L;
    public ArrayList<Equipo> equipos = new ArrayList<>();                // ArrayList con todos los equipos
    public ArrayList<Equipo> equiposPrimera = new ArrayList<>();         // ArrayList con los equipos de Primera
    public ArrayList<Equipo> equiposSegunda = new ArrayList<>();         // ArrayList con los equipos de Segunda

    // Constructores

    /**
     * Constructor por defecto
     */
    public MenuEquipo() {
    }

    /**
     * Constructor que recibe el ArrayList de Equipo desde Controller/FutbolApp
     * @param equipos
     */
    public MenuEquipo(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }


    // Métodos

    /**
     * Método que sirve para dividir el ArrayList equipos en dos nuevos, los equipos que tengan como competición
     * 'PRIMERA', se añadirán al ArrayList equiposPrimera y los equipos que tengan como competición 'SEGUNDA', se
     * añadirán al ArrayList equiposSegunda
     */
    public void añadirPrimeraOSegunda(){
        for (Equipo equipo: equipos) {
            if (equipo.getCompeticion().equals(Competicion.PRIMERA)){
                    equiposPrimera.add(equipo);
            }else if (equipo.getCompeticion().equals(Competicion.SEGUNDA)) {
                    equiposSegunda.add(equipo);
            }
        }
    }

    /**
     * Método que con un foreach recorre el ArrayList equipos para saber si existe un equipo con el mismo nombre que
     * el introducido
     * @param nombreEquipo parámetro que utilizamos a la hora de crear un equipo
     * @return true si el nombreEquipo existe en el ArrayList equipos y false si no existe
     */
    public boolean existeEnArrayEquipo(String nombreEquipo){
        for (Equipo equipo: equipos) {
           if (equipo.getNombreEquipo().equals(nombreEquipo)){
               return true;
           }
        }
        return false;
    }
/*
    public Competicion  elegirCompeticion(String nombreCompeticion, Competicion competicion){
            if (nombreCompeticion.toLowerCase().replace(" ", "").equals("primera")){
                competicion = Competicion.PRIMERA;
            }else if(nombreCompeticion.toLowerCase().replace(" ", "").equals("segunda")){
                competicion = Competicion.SEGUNDA;
            }else if (!nombreCompeticion.equals("primera")){
                competicion = null;
            }else if (!nombreCompeticion.equals("segunda")){
                competicion = null;
            }
            return competicion;
    }
*/

    /**
     * Método que sirve para crear un Equipo nuevo
     */
    public void crearEquipo(){
        Scanner scanner = new Scanner(System.in);

        String nombreEquipo;
        String presidente;
        String entrenador;
        String estadio;
        int añoFundacion = 1856;
        String nombreCompeticion;
        Competicion competicion = null;
        Equipo equipo;


        do {
            System.out.println("Nombre del equipo: ");
            nombreEquipo = scanner.next().trim().replaceAll("\\s+", " ");
            if (existeEnArrayEquipo(nombreEquipo)){
                System.out.println("El nombre del equipo ya existe");
                scanner.nextLine();
            }
        } while (existeEnArrayEquipo(nombreEquipo));

        do {
            System.out.println("Presidente del equipo: ");
            presidente = scanner.next().trim().replaceAll("\\s+", " ");
        } while (presidente.equals(""));

        do {
            System.out.println("Entrenador del equipo: ");
            entrenador = scanner.next().trim().replaceAll("\\s+", " ");
        } while (entrenador.equals(""));

        do {
            System.out.println("Estadio del equipo: ");
            estadio = scanner.next().trim().replaceAll("\\s+", " ");
        } while (estadio.equals(""));


        do {
            System.out.println("Año de fundación del equipo: ");
            try {
                añoFundacion = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduzca un año válido.");
                scanner.next();
            }
        } while (añoFundacion <= 1856 || añoFundacion > 2017);


       do {
           System.out.println("Introduzca si el equipo juega en primera o en segunda: ");
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
       }while (competicion == null);


        equipo = new Equipo(nombreEquipo, presidente, entrenador, estadio, añoFundacion, competicion);

        if (competicion.equals(Competicion.PRIMERA)) {
            equiposPrimera.add(equipo);
        }else if (competicion.equals(Competicion.SEGUNDA)){
            equiposSegunda.add(equipo);
        }
        equipos.add(equipo);
    }

    /**
     * Método para eliminar un Equipo, utiliza 3 Iterator distintos, uno por cada ArrayList de Equipo que hay (equipos,
     * equiposPrimera y equiposSegunda), de esta forma podemos borrar el equipo cuyo nombre coincida con el introducido
     * por el usuario tanto en el ArrayList equipos como al que perteneza el equipo en cuestión, equiposPrimera o
     * equiposSegunda
     */
    public void eliminarEquipo() {
        String nombre;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf("Introduzca el nombre del equipo: ");
            nombre = scanner.nextLine().replace(" ", "").replace("-", "");

            Iterator<Equipo> iTEquipo = equipos.iterator();
            Iterator<Equipo> iTEquipoP = equiposPrimera.iterator();
            Iterator<Equipo> iTEquipoS = equiposSegunda.iterator();

            while (iTEquipo.hasNext()) {
                Equipo equipo = iTEquipo.next();
                if (equipo.getNombreEquipo().replace(" ", "").replace("-", "").equals(nombre)) {
                    iTEquipo.remove();
                }
            }
            while (iTEquipoP.hasNext()){
                Equipo equipo = iTEquipoP.next();
                if (equipo.getNombreEquipo().replace(" ", "").replace("-", "").equals(nombre)) {
                    iTEquipoP.remove();
                }
            }
            while (iTEquipoS.hasNext()){
                Equipo equipo = iTEquipoS.next();
                if (equipo.getNombreEquipo().replace(" ", "").replace("-", "").equals(nombre)) {
                    iTEquipoS.remove();
                }
            }
        } while (nombre.equals(""));
    }

    /**
     * Método que nos muestra la información del equipo de Primera cuyo nombre hayamos introducido previamente
     */
    public void mostrarInformacionEquipoPrimera() {
        String nombre;
        Scanner scanner = new Scanner(System.in);

        listaEquiposPrimera();

        System.out.printf("Introduzca el nombre del equipo: ");
        nombre = scanner.nextLine().replace(" ", "").replace("-", "");

        for (Equipo equipo : equiposPrimera) {
            if (equipo.getNombreEquipo().replace(" ", "").replace("-", "").equals(nombre)){
                System.out.println(equipo);
            }
        }
    }

    /**
     * Método que nos muestra la información del equipo de Segunda cuyo nombre hayamos introducido previamente
     */
    public void mostrarInformacionEquipoSegunda() {
        String nombre;
        Scanner scanner = new Scanner(System.in);

        listaEquiposSegunda();

        System.out.printf("Introduzca el nombre del equipo: ");
        nombre = scanner.nextLine().replace(" ", "").replace("-", "");

        for (Equipo equipo : equiposSegunda) {
            if (equipo.getNombreEquipo().replace(" ", "").replace("-", "").equals(nombre)){
                System.out.println(equipo);
            }
        }
    }

    /**
     * Método que con un foreach nos permite buscar cualquier equipo registrado o creado en el ArrayList de
     * equipos
     */
    public void buscarEquipos() {
        String nombre;
        int indice = 1;
        Scanner scanner = new Scanner(System.in);

        listaEquipos();

        System.out.println();
        System.out.printf("Introduzca el nombre del equipo: ");
        nombre = scanner.nextLine().toLowerCase().replace(" ","").replace("-", "");
        try {
        for (Equipo equipo: equipos){
            if (nombre.equals(equipo.getNombreEquipo().toLowerCase().replace(" ","").replace("-", ""))) {
                System.out.println(equipo);
                indice++;
                }
            }
        } catch (NullPointerException e) {
            scanner.next();
        }
        if(indice==0) {
            System.out.println("No existe un equipo con ese nombre.");
        }
    }

    /**
     * Método que con un foreach nos muestra todos lo equipos del ArrayList equiposPrimera
     */
    public void listaEquipos(){
        int indice = 1;

        for (Equipo equipo: equipos) {
            System.out.println((indice++) + " - " + equipo.getNombreEquipo());
        }
    }

    /**
     * Método que con un foreach nos muestra los equipos del ArrayList equiposPrimera
     */
    public void listaEquiposPrimera(){
        int indice = 1;

        for (Equipo equipo: equiposPrimera) {
            System.out.println((indice++) + " - " + equipo.getNombreEquipo());
        }
    }

    /**
     * Método que con un foreach nos muestra los equipos del ArrayList equiposSegunda
     */
    public void listaEquiposSegunda(){
        int indice = 1;

        for (Equipo equipo: equiposSegunda) {
            System.out.println((indice++) + " - " + equipo.getNombreEquipo());
        }
    }

    // Guardado y cargado de datos

    /**
     * Método que guarda los equipos en sus respectivos archivos
     */
    public void guardarEquipos() {
        try {
            ObjectOutputStream guardarEquipos = new ObjectOutputStream(new FileOutputStream("datos/equipos.dat"));
            guardarEquipos.writeObject(equipos);
            guardarEquipos.close();

            ObjectOutputStream guardarEquiposPrimera = new ObjectOutputStream(new FileOutputStream("datos/equiposPrimera.dat"));
            guardarEquiposPrimera.writeObject(equiposPrimera);
            guardarEquiposPrimera.close();

            ObjectOutputStream guardarEquiposSegunda = new ObjectOutputStream(new FileOutputStream("datos/equiposSegunda.dat"));
            guardarEquiposSegunda.writeObject(equiposSegunda);
            guardarEquiposSegunda.close();

        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }
    }

    /**
     * Método que carga los equipos de sus respectivos archivos
     */
    public void cargarEquipos() {
        try {
            ObjectInputStream leerEquipos = new ObjectInputStream(new FileInputStream("datos/equipos.dat"));
            equipos = (ArrayList<Equipo>) leerEquipos.readObject();
            leerEquipos.close();

            ObjectInputStream leerEquiposPrimera = new ObjectInputStream(new FileInputStream("datos/equiposPrimera.dat"));
            equiposPrimera = (ArrayList<Equipo>) leerEquiposPrimera.readObject();
            leerEquiposPrimera.close();

            ObjectInputStream leerEquiposSegunda = new ObjectInputStream(new FileInputStream("datos/equiposSegunda.dat"));
            equiposSegunda = (ArrayList<Equipo>) leerEquiposSegunda.readObject();
            leerEquiposSegunda.close();

        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


