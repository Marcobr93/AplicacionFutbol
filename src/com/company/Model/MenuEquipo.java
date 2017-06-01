package com.company.Model;

import java.util.*;

/**
 * Created by marco on 19/05/2017.
 */
public class MenuEquipo  {

    public ArrayList<Equipo> equipos = new ArrayList<>();
    public ArrayList<Equipo> equiposPrimera = new ArrayList<>();
    public ArrayList<Equipo> equiposSegunda = new ArrayList<>();


    // Constructores

    public MenuEquipo() {
    }

    public MenuEquipo(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }


    // Métodos

    public void añadirPrimeraOSegunda(){
        for (Equipo equipo: equipos) {
            if (equipo.getCompeticion().equals(Competicion.PRIMERA)){
                    equiposPrimera.add(equipo);
            }else if (equipo.getCompeticion().equals(Competicion.SEGUNDA)) {
                    equiposSegunda.add(equipo);
            }
        }
    }

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
    }

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

    public void buscarEquipos() {
        String nombre;
        int indice = 1;
        Scanner input = new Scanner(System.in);

        listaEquipos();

        System.out.println();
        System.out.printf("Introduzca el nombre del equipo: ");
        nombre = input.nextLine().toLowerCase().replace(" ","").replace("-", "");

        for (Equipo equipo: equiposPrimera){
            if (nombre.equals(equipo.getNombreEquipo().toLowerCase().replace(" ","").replace("-", ""))) {
                System.out.println(equipo);
                indice++;
            }
        }
        for (Equipo equipo: equiposSegunda){
            if (nombre.equals(equipo.getNombreEquipo().toLowerCase().replace(" ","").replace("-", ""))) {
                System.out.println(equipo);
                indice++;
            }
        }
        if(indice==0) {
            System.out.println("No existe un equipo con ese nombre.");
        }
    }


    public void listaEquipos(){
        int indice = 1;

        for (Equipo equipo: equipos) {
            System.out.println((indice++) + " - " + equipo.getNombreEquipo());
        }
    }

    public void listaEquiposPrimera(){
        int indice = 1;

        for (Equipo equipo: equiposPrimera) {
            System.out.println((indice++) + " - " + equipo.getNombreEquipo());
        }
    }

    public void listaEquiposSegunda(){
        int indice = 1;

        for (Equipo equipo: equiposSegunda) {
            System.out.println((indice++) + " - " + equipo.getNombreEquipo());
        }
    }
}


