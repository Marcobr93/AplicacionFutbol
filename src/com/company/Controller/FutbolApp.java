package com.company.Controller;

import com.company.Model.Equipo;
import com.company.Model.Jugador;
import com.company.Model.Posicion;

import java.util.Scanner;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class FutbolApp {

    //Inicializacion

    public void AppCompeticion(){
        int opcion;

        while ((opcion = menuCompeticion() ) !=0){
            switch (opcion){
                case 1:

                    break;
                case 2:

                    break;
            }
        }
    }

    public void AppPrimeraSegundaDivision(){
        int opcion;

        while ((opcion = menuPrimeraSegundaDivision() ) !=0){
            switch (opcion){
                case 1:

                    break;
                case 2:

                    break;
            }
        }
    }

    public void AppEleccionEquipo(){
        int opcion;

        while ((opcion = menuEleccionEquipo() ) !=0){
            switch (opcion){
                case 1:

                    break;
                case 2:

                    break;
            }
        }
    }

    public void AppEquipos(){
        int opcion;

        while ((opcion = menuEquipos() ) !=0){
            switch (opcion){
                case 1:

                    break;
                case 2:

                    break;
            }
        }
    }

    public void AppPlantilla(){
        int opcion;

        while ((opcion = menuPlantilla() ) !=0){
            switch (opcion){
                case 1:

                    break;
                case 2:

                    break;
            }
        }
    }

    public void AppClasificacion(){
        int opcion;

        while ((opcion = menuClasificacion() ) !=0){
            switch (opcion){
                case 1:

                    break;
                case 2:

                    break;
            }
        }
    }

    public void AppCalendario(){
        int opcion;

        while ((opcion = menuCalendario() ) !=0){
            switch (opcion){
                case 1:

                    break;
                case 2:

                    break;
            }
        }
    }

    public void AppTrofeos(){
        int opcion;

        while ((opcion = menuTrofeos() ) !=0){
            switch (opcion){
                case 1:

                    break;
                case 2:

                    break;
            }
        }
    }

/*
    private Jugador preguntarInformacionJugador(){
        Scanner scanner = new Scanner(System.in);
        String nombreJugador;
        String apellidosJugador;
        Posicion posicion;
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

        do {
            System.out.println("Nombre del jugador: ");
            nombreJugador = scanner.next().trim().replaceAll("\\s+", " ");
        } while (nombreJugador.equals(""));

        do {
            System.out.println("Apellido del jugador: ");
            apellidosJugador = scanner.next().trim().replaceAll("\\s+", " ");
        } while (apellidosJugador.equals(""));

        do {
            System.out.println("Posición del jugador: ");
            String posicion = scanner.next();
            Posicion.valueOf(posicion);
        }while (posicion.equals(""));

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

        return new Jugador(nombreJugador,apellidosJugador,posicion,altura,peso,dorsal,edad,partidosJugados,tarjetasAmarillas,tarjetasRoja,goles,golesEnPropia,golesRecibidos);
    }
*/

    private Equipo preguntarInformacionEquipo(){


        return new Equipo();
    }


    private int menuCompeticion(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("*************************");
        System.out.println("* 1 - Primera División  *");
        System.out.println("* 2 - Segunda División  *");
        System.out.println("* 3 - Buscar Equipo     *");
        System.out.println("* 4 - Buscar Jugador  *");
        System.out.println("* 0 - Salir             *");
        System.out.println("*************************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    private int menuPrimeraSegundaDivision(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("*********************");
        System.out.println("* 1 - Equipos       *");
        System.out.println("* 2 - Clasificación *");
        System.out.println("* 3 - Calendario    *");
        System.out.println("* 4 - Trofeos       *");
        System.out.println("* 0 - Salir         *");
        System.out.println("*********************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    private int menuEleccionEquipo(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("************************");
        System.out.println("* 1 - Elegir equipo    *");
        System.out.println("* 2 - Añadir equipo    *");
        System.out.println("* 3 - Eliminar equipo  *");
        System.out.println("* 0 - Salir            *");
        System.out.println("************************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    private int menuEquipos(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("******************************");
        System.out.println("* 1 - Información del equipo *");
        System.out.println("* 2 - Plantilla              *");
        System.out.println("* 0 - Salir                  *");
        System.out.println("******************************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    private int menuPlantilla() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("**************************************");
        System.out.println("* 1 - Ordenar por posición           *");
        System.out.println("* 2 - Ordenar por nombre             *");
        System.out.println("* 3 - Ordenar por dorsal             *");
        System.out.println("* 4 - Ordenar por altura             *");
        System.out.println("* 5 - Ordenar por peso               *");
        System.out.println("* 6 - Ordenar por edad               *");
        System.out.println("* 7 - Ordenar por partidos jugados   *");
        System.out.println("* 8 - Ordenar por tarjetas amarillas *");
        System.out.println("* 9 - Ordenar por tarjetas rojas     *");
        System.out.println("* 10- Ordenar por goles              *");
        System.out.println("* 11- Ordenar por goles en propia    *");
        System.out.println("* 12- Ordenar por goles recibidos    *");
        System.out.println("* 13- Añadir jugador                 *");
        System.out.println("* 14- Borrar jugador                 *");
        System.out.println("* 0 - Salir                          *");
        System.out.println("**************************************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    private int menuClasificacion() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("****************************************");
        System.out.println("* 1 - Ordenar por puntos               *");
        System.out.println("* 2 - Ordenar por nombre               *");
        System.out.println("* 3 - Ordenar por partidos jugados     *");
        System.out.println("* 4 - Ordenar por tarjetas amarillas   *");
        System.out.println("* 5 - Ordenar por tarjetas rojas       *");
        System.out.println("* 6 - Ordenar por goles a favor        *");
        System.out.println("* 7 - Ordenar por goles en contra      *");
        System.out.println("* 8 - Ordenar por diferencia de goles  *");
        System.out.println("* 0 - Salir                            *");
        System.out.println("****************************************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    private int menuCalendario(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("************************");
        System.out.println("* 1 - Ver jornada      *");
        System.out.println("* 2 - Añadir jornada   *");
        System.out.println("* 3 - Eliminar jornada *");
        System.out.println("* 0 - Salir            *");
        System.out.println("************************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    private int menuTrofeos(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("****************");
        System.out.println("* 1 - Pichichi *");
        System.out.println("* 2 - Zamora   *");
        System.out.println("* 0 - Salir    *");
        System.out.println("****************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }
}





/*

   public void AppCopaDelRey(){
        int opcion;

        while ((opcion = menuCopaDelRey() ) !=0){
            switch (opcion){
                case 1:

                    break;
                case 2:

                    break;
            }
        }
    }



    private int menuCopaDelRey(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("*********************");
        System.out.println("* 1 - Equipos       *");
        System.out.println("* 2 - Eliminatorias *");
        System.out.println("* 3 - Trofeos       *");
        System.out.println("* 0 - Salir         *");
        System.out.println("********************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }
    */