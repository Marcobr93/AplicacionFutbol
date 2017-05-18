package com.company.Controller;

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




    private int menuCompeticion(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("*************************");
        System.out.println("* 1 - Primera División  *");
        System.out.println("* 2 - Segunda División  *");
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