package com.company.Model;

import java.util.*;

/**
 * Created by marco on 19/05/2017.
 */
public class MenuPartido {
    public ArrayList<Partido> partidos = new ArrayList<>();             // ArrayList con todos los partidos
    public ArrayList<Equipo> equipos = new ArrayList<>();               // ArrayList con todos los equipos
    public ArrayList<Partido> partidosPrimera= new ArrayList<>();       // ArrayList con los partidos de Primera
    public ArrayList<Partido> partidosSegunda= new ArrayList<>();       // ArrayList con los partidos de Segunda


    // Constructores

    /**
     * Constructor por defecto
     */
    public MenuPartido() {
    }


    /**
     * Constructor que recibe el ArrayList de equipos desde FutbolApp
     * @param equipos
     */
    public MenuPartido(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }


    // Métodos

    /**
     * Método con un foreach que recorre el ArrayList de partidos para después añadir un partido, dependiendo
     * de su competición, en el ArrayList de partidosPrimera o en el de partidosSegunda
     */
    public void añadirPartidoPrimeraOSegunda(){
        for (Partido partido: partidos) {
            if (partido.getCompeticion().equals(Competicion.PRIMERA)){
                partidosPrimera.add(partido);
            }else if (partido.getCompeticion().equals(Competicion.SEGUNDA)) {
                partidosSegunda.add(partido);
            }
        }
    }

    /**
     * Método que nos permite crear un partido y lo añadirá al ArrayList partidos y si tiene como competición 'Primera',
     * lo añadirá al ArrayList equiposPrimera y si tiene como competición 'Segunda', lo añadirá al ArrayList equiposSegunda
     */
    public void crearPartido() {
        Scanner scanner = new Scanner(System.in);

        boolean noCreado=true;
        boolean mismoEquipo = false;
        int jornada = 0;
        Equipo equipoLocal=null;
        String nombreEquipoLocal;
        Equipo equipoVisitante=null;
        String nombreEquipoVisitante;
        String estadio;
        String arbitro;
        int golesLocal = 0;
        int golesVisitante = 0;
        Competicion competicion = null;
        String nombreCompeticion;
        Partido partido;


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
                mismoEquipo = true;
            }else {
                mismoEquipo = false;
            }
        } while (mismoEquipo || equipoVisitante == null);

        do {
            System.out.println("Introduzca el estadio: ");
            estadio = scanner.nextLine();
        }while (estadio.equals(""));


        do {
            System.out.println("Introduzca el arbitro: ");
            arbitro = scanner.nextLine();
        }while (arbitro.equals(""));

          do {
              System.out.println("Competición del equipo: ");
              nombreCompeticion = scanner.next();
              if (nombreCompeticion.toLowerCase().replace(" ", "").equals("primera")) {
                  competicion = Competicion.PRIMERA;
              } else if (nombreCompeticion.toLowerCase().replace(" ", "").equals("segunda")) {
                  competicion = Competicion.SEGUNDA;
              }else if (!nombreCompeticion.equals("primera")){
                  competicion = null;
              }else if (!nombreCompeticion.equals("segunda")){
                  competicion = null;
              }
             }while (competicion == null);


            do {
                System.out.println("Introduzca los goles del equipo local: ");
                try {
                    golesLocal = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduzca un número válido de goles");
                    scanner.next();
                }
            }while (golesLocal < 0);


            do {
                System.out.println("Introduzca los goles del equipo visitante: ");
                try {
                    golesVisitante = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduzca un número válido de goles");
                    scanner.next();
                }
            }while (golesVisitante < 0);


            do {
                System.out.println("Introduzca la jornada del partido: ");
                try {
                    jornada = scanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Por favor, introduzca una jornada válida.");
                    scanner.next();
                }
            }while (jornada <= 0);


            partido = new Partido(equipoLocal,nombreEquipoLocal, equipoVisitante,nombreEquipoVisitante, estadio, arbitro, competicion, golesLocal, golesVisitante, jornada);

            if (partido != null) {
                for (Partido partid : partidos) {
                    if ((jornada == (partid.getJornada())) && nombreEquipoLocal.equals(partid.getNombreEquipoLocal())) {
                        noCreado = false;
                    }else if ((jornada == (partid.getJornada())) && nombreEquipoVisitante.equals(partid.getNombreEquipoVisitante())) {
                        noCreado = false;
                    }else if ((jornada == (partid.getJornada())) && nombreEquipoLocal.equals(partid.getNombreEquipoVisitante())) {
                        noCreado = false;
                    }else if ((jornada == (partid.getJornada())) && nombreEquipoVisitante.equals(partid.getNombreEquipoLocal())){
                        noCreado = false;
                    }else if(!equipoLocal.getCompeticion().equals(equipoVisitante.getCompeticion())){
                        noCreado = false;
                    }
                }

                if (noCreado == false){
                    System.out.println("El partido no ha podido ser creado debido a que el nombre de un equipo o bien la jornada del partido, coincide con un registro ya creado.");
                }

                if (noCreado == true) {
                    if (competicion.equals(Competicion.PRIMERA)){
                        partidosPrimera.add(partido);
                    }else if (competicion.equals(Competicion.SEGUNDA)){
                        partidosSegunda.add(partido);
                    }
                    partidos.add(partido);
                    System.out.println("Partido creado correctamente");
                }
            }
    }


    /**
     * Método que nos permite eliminar un partido introduciendo la jornada de este
     */
    public void eliminarPartido() {
        Scanner scanner = new Scanner(System.in);
        int jornada = 0;
        String equipoLocal;

            System.out.println("Introduzca el nombre del equipo local");
                equipoLocal = scanner.nextLine();
        do {
            System.out.printf("Introduzca la jornada del partido: ");
            try {
                jornada = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca una jornada válida.");
                scanner.next();
            }
            Iterator<Partido> ITPartido = partidos.iterator();
            Iterator<Partido> ITPartidoP = partidosPrimera.iterator();
            Iterator<Partido> ITPartidoS = partidosSegunda.iterator();

            while (ITPartido.hasNext()) {
                Partido partido = ITPartido.next();
                if (partido.getJornada() == (jornada) && (equipoLocal.equals(partido.getNombreEquipoLocal()))) {
                    ITPartido.remove();
                }
            }

            while (ITPartidoP.hasNext()) {
                Partido partido = ITPartidoP.next();
                if (partido.getJornada() == (jornada) && (equipoLocal.equals(partido.getNombreEquipoLocal()))) {
                    ITPartidoP.remove();
                }
            }
            while (ITPartidoS.hasNext()) {
                Partido partido = ITPartidoS.next();
                if (partido.getJornada() == (jornada) && (equipoLocal.equals(partido.getNombreEquipoLocal()))) {
                    ITPartidoS.remove();
                }
            }
        } while (jornada <= 0);
    }


    /**
     * Método que nos permite buscar un partido por su jornada.
     */
    public void buscarPorJornada() {
        int jornada = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf("Introduzca la jornada del partido: ");
            try {
                jornada = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduzca una jornada válida.");
                scanner.next();
                System.out.println();
            }
            for (Partido partido: partidos){
                if (jornada == partido.getJornada()) {
                    System.out.println(partido);
                }
            }
        }while (jornada <= 0);
    }


    /**
     * Método que nos permite buscar un partido de primera por su jornada.
     */
    public void buscarPorJornadaPrimera() {
        int jornada = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf("Introduzca la jornada del partido: ");
            try {
                jornada = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduzca una jornada válida.");
                scanner.next();
            }
            for (Partido partido: partidosPrimera){
                if (jornada == partido.getJornada()) {
                    System.out.println(partido);
                }
            }
        }while (jornada <= 0);
    }


    /**
     * Método que nos permite buscar un partido de seguunda por su jornada.
     */
    public void buscarPorJornadaSegunda() {
        int jornada = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf("Introduzca la jornada del partido: ");
            try {
                jornada = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Por favor, introduzca una jornada válida.");
                scanner.next();
            }
            for (Partido partido: partidosSegunda){
                if (jornada == partido.getJornada()) {
                    System.out.println(partido);
                    System.out.println();
                }
            }
        }while (jornada <= 0);

    }


    /**
     * Método que nos permite buscar un partido que haya jugado el equipo de primera introducido
     */
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


    /**
     * Método que nos permite buscar un partido que haya jugado el equipo de segunda introducido
     */
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


    /**
     * Método con un foreach que recorre el ArrayList de partidos y nos muestra cada uno de ellos.
     */
    public void listaPartidos(){
        for (Partido partido: partidos){
            System.out.println(partido);
        }
    }


    /**
     * Método con un foreach que recorre el ArrayList de partidosPrimera y nos muestra cada uno de ellos.
     */
    public void listaPartidosPrimera(){
        for (Partido partido: partidosPrimera){
            System.out.println(partido);
        }
    }


    /**
     * Método con un foreach que recorre el ArrayList de partidosSegunda y nos muestra cada uno de ellos.
     */
    public void listaPartidosSegunda(){
        for (Partido partido: partidosSegunda){
            System.out.println(partido);
        }
    }


    // Ordenación partidos Primera

    /**
     * Método que utiliza el comparadorPorLocal para ordenar la lista de partidos del ArrayList listaPartidosPrimera
     */
    public void ordenacionPorLocalPrimera(){
        Collections.sort(partidosPrimera, Partido.comparadorPorLocal);

        listaPartidosPrimera();
    }

    /**
     * Método que utiliza el comparadorPorVisitante para ordenar la lista de partidos del ArrayList listaPartidosPrimera
     */
    public void ordenacionPorVisitantePrimera(){
        Collections.sort(partidosPrimera, Partido.comparadorPorVisitante);

        listaPartidosPrimera();
    }

    /**
     * Método que utiliza el comparadorPorEstadio para ordenar la lista de partidos del ArrayList listaPartidosPrimera
     */
    public void ordenacionPorEstadioPrimera(){
        Collections.sort(partidosPrimera, Partido.comparadorPorEstadio);

        listaPartidosPrimera();
    }

    /**
     * Método que utiliza el comparadorPorArbitro para ordenar la lista de partidos del ArrayList listaPartidosPrimera
     */
    public void ordenacionPorArbitroPrimera(){
        Collections.sort(partidosPrimera, Partido.comparadorPorArbitro);

        listaPartidosPrimera();
    }

    /**
     * Método que utiliza el comparadorPorJornada para ordenar la lista de partidos del ArrayList listaPartidosPrimera
     */
    public void ordenacionPorJornadaPrimera(){
        Collections.sort(partidosPrimera, Partido.comparadorPorJornada);

        listaPartidosPrimera();
    }

    /**
     * Método que utiliza el comparadorPorGolesLocal para ordenar la lista de partidos del ArrayList listaPartidosPrimera
     */
    public void ordenacionPorGolesLocalPrimera(){
        Collections.sort(partidosPrimera, Partido.comparadorPorGolesLocal);

        listaPartidosPrimera();
    }

    /**
     * Método que utiliza el comparadorPorGolesVisitante para ordenar la lista de partidos del ArrayList listaPartidosPrimera
     */
    public void ordenacionPorGolesVisitantePrimera(){
        Collections.sort(partidosPrimera, Partido.comparadorPorGolesVisitante);

        listaPartidosPrimera();
    }



    // Ordenación por partidos Segunda

    /**
     * Método que utiliza el comparadorPorLocal para ordenar la lista de partidos del ArrayList listaPartidosSegunda
     */
    public void ordenacionPorLocalSegunda(){
        Collections.sort(partidosSegunda, Partido.comparadorPorLocal);

        listaPartidosSegunda();
    }

    /**
     * Método que utiliza el comparadorPorVisitante para ordenar la lista de partidos del ArrayList listaPartidosSegunda
     */
    public void ordenacionPorVisitanteSegunda(){
        Collections.sort(partidosSegunda, Partido.comparadorPorVisitante);

        listaPartidosSegunda();
    }

    /**
     * Método que utiliza el comparadorPorEstadio para ordenar la lista de partidos del ArrayList listaPartidosSegunda
     */
    public void ordenacionPorEstadioSegunda(){
        Collections.sort(partidosSegunda, Partido.comparadorPorEstadio);

        listaPartidosSegunda();
    }

    /**
     * Método que utiliza el comparadorPorArbitro para ordenar la lista de partidos del ArrayList listaPartidosPrimera
     */
    public void ordenacionPorArbitroSegunda(){
        Collections.sort(partidosSegunda, Partido.comparadorPorArbitro);

        listaPartidosSegunda();
    }

    /**
     * Método que utiliza el comparadorPorJornada para ordenar la lista de partidos del ArrayList listaPartidosSegunda
     */
    public void ordenacionPorJornadaSegunda(){
        Collections.sort(partidosSegunda, Partido.comparadorPorJornada);

        listaPartidosSegunda();
    }

    /**
     * Método que utiliza el comparadorPorGolesLocal para ordenar la lista de partidos del ArrayList listaPartidosSegunda
     */
    public void ordenacionPorGolesLocalSegunda(){
        Collections.sort(partidosSegunda, Partido.comparadorPorGolesLocal);

        listaPartidosSegunda();
    }

    /**
     * Método que utiliza el comparadorPorGolesVisitante para ordenar la lista de partidos del ArrayList listaPartidosSegunda
     */
    public void ordenacionPorGolesVisitanteSegunda(){
        Collections.sort(partidosSegunda, Partido.comparadorPorGolesVisitante);

        listaPartidosSegunda();
    }
}
