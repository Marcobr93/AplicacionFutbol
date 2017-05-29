package com.company.Controller;

import com.company.Model.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class FutbolApp {

    public ArrayList<Equipo> equipos = new ArrayList<>();

     MenuEquipo menuEquipo;
     MenuEquipoPrimera menuEquipoPrimera;
     MenuEquipoSegunda menuEquipoSegunda;
     MenuJugador menuJugador;
     MenuPartido menuPartido;



    public FutbolApp() {
        menuEquipo = new MenuEquipo(equipos);
        menuEquipoPrimera = new MenuEquipoPrimera(equipos);
        menuEquipoSegunda = new MenuEquipoSegunda(equipos);
        menuJugador = new MenuJugador(equipos);
        menuPartido = new MenuPartido(equipos);


        cargarEquipos();
        cargarJugadores();
        cargarPartidos();
    }

    private void cargarEquipos() {
        menuEquipo.equipos.add(new Equipo("Real Madrid", "Florentino Pérez", "Zinedine Zidane", "Santiago Bernabéu", 1902, 90, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Barcelona", "Bartomeu", "Luis Enrique", "Campo Nuevo", 1899, 87, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Cádiz C.F", "Manuel Vizcaíno", "Álvaro Cervera", "Ramón de Carranza", 1910, 87, Competicion.SEGUNDA));
    }

    private void cargarJugadores() {
        menuJugador.jugadores.add(new Jugador("Marco", "Asensio Willemsen", Posicion.MediaPunta, false, 1.80, 75.00, 20, 21, 23, 0, 0, 3, 0, 0, 7, "Real Madrid"));
        menuJugador.jugadores.add(new Jugador("Cristiano", "Ronaldo", Posicion.MediaPunta, false, 1.80, 75.00, 7, 25, 23, 0, 0, 8, 7, 0, 10, "Real Madrid"));
        menuJugador.jugadores.add(new Jugador("Sergio", "Busquets Burgos", Posicion.Centrocampista, false, 1.89, 76.00, 5, 28, 32, 8, 0, 2, 0, 0, 4, "Barcelona"));
        menuJugador.jugadores.add(new Jugador("Paco", "wew erw", Posicion.Centrocampista, false, 1.89, 76.00, 5, 28, 32, 8, 0, 7, 0, 0, 4, "Cádiz F.C"));
    }

    private void cargarPartidos(){
        menuPartido.partidos.add(new Partido("Real Madrid", "Barcelona","Santiago Bernagéu","Pepito", Competicion.PRIMERA, 5, 0,20));
        menuPartido.partidos.add(new Partido("Real Madrid", "Sevilla","Santiago Bernagéu","Paco", Competicion.PRIMERA, 3, 1,10));
        menuPartido.partidos.add(new Partido("Betis", "Real Madrid","Benito Villamarín","Juan", Competicion.PRIMERA, 2, 5,30));
    }

    //Inicializacion

    public void AppCompeticion() {
        int opcion;



        while ((opcion = menuCompeticion()) != 0) {
            switch (opcion) {
                case 1:
                    AppPrimeraDivision();
                    break;
                case 2:
                    AppSegundaDivision();
                    break;
                case 3:
                    menuEquipo.buscarEquipos();
                    break;
                case 4:
                    menuJugador.buscarJugador();
                    break;
            }
        }
    }

    public void AppPrimeraDivision() {
        int opcion;

        while ((opcion = menuPrimeraSegundaDivision()) != 0) {
            switch (opcion) {
                case 1:
                    AppEleccionEquipoPrimera();
                    break;
                case 2:
                    AppClasificacionPrimera();
                    break;
                case 3:
                    AppPartidos();
                    break;
                case 4:
                    menuJugador.ordenacionPorGoles();
                    break;
            }
        }
    }

    public void AppSegundaDivision() {
        int opcion;

        while ((opcion = menuPrimeraSegundaDivision()) != 0) {
            switch (opcion) {
                case 1:
                    AppEleccionEquipoSegunda();
                    break;
                case 2:
                 //   AppClasificacionSegunda();
                    break;
            }
        }
    }

    public void AppEleccionEquipoPrimera() {
        int opcion;


        while ((opcion = menuEleccionEquipo()) != 0) {
            switch (opcion) {
                case 1:
                    menuJugador.buscarEquipo();
                    break;
                case 2:
                    menuEquipo.crearEquipo();
                    break;
                case 3:
                    menuEquipo.listaEquiposPrimera();
                    menuEquipo.eliminarEquipo();
                    break;
                case 4:
                    menuEquipo.listaEquiposPrimera();
                    break;
            }
        }
    }

    public void AppEleccionEquipoSegunda() {
        int opcion;

        while ((opcion = menuEleccionEquipo()) != 0) {
            switch (opcion) {
                case 1:

                    AppEquipos();
                    break;
                case 2:
                    menuEquipo.crearEquipo();
                    break;
                case 3:
                    menuEquipo.listaEquiposSegunda();
                    menuEquipo.eliminarEquipo();
                    break;
                case 4:
                    menuEquipo.listaEquiposSegunda();
                    break;
            }
        }
    }

    public void AppEquipos() {
        int opcion;

        while ((opcion = menuEquipos()) != 0) {
            switch (opcion) {
                case 1:
                    menuEquipo.mostrarInformacionEquipo();
                    break;
                case 2:
                    menuJugador.elegirEquipo();
                    AppPlantilla();
                    break;
            }
        }
    }

    public void AppPlantilla() {
        int opcion;

        while ((opcion = menuPlantilla()) != 0) {
            switch (opcion) {
                case 1:
                    menuJugador.ordenacionPorNombre();
                    break;
                case 2:
                    menuJugador.ordenacionPorApellidos();
                    break;
                case 3:
                    menuJugador.ordenacionPorPosicion();
                    break;
                case 4:
                    menuJugador.ordenacionPorDorsal();
                    break;
                case 5:
                    menuJugador.ordenacionPorAltura();
                    break;
                case 6:
                    menuJugador.ordenacionPorPeso();
                    break;
                case 7:
                    menuJugador.ordenacionPorEdad();
                    break;
                case 8:
                    menuJugador.ordenacionPorPartidosJugados();
                    break;
                case 9:
                    menuJugador.ordenacionPorTarjetasAmarillas();
                    break;
                case 10:
                    menuJugador.ordenacionPorTarjetasRojas();
                    break;
                case 11:
                    menuJugador.ordenacionPorGoles();
                    break;
                case 12:
                    menuJugador.ordenacionPorGolesEnPropia();
                    break;
                case 13:
                    menuJugador.ordenacionPorGolesRecibidos();
                    break;
                case 14:
                    menuJugador.ordenacionPorAsistencias();
                    break;
                case 15:
                    menuJugador.crearJugador();
                    break;
                case 16:
                    menuJugador.eliminarJugador();
            }
        }
    }

  public void AppClasificacionPrimera() {
      int opcion;

   while ((opcion = menuClasificacion()) != 0) {
       switch (opcion) {
           case 1:
               menuEquipoPrimera.ordenacionPorPuntos();
               break;
           case 2:
               menuEquipoPrimera.ordenacionPorNombre();
               break;
           case 3:
               menuEquipoPrimera.ordenacionPorPartidosJugados();
               break;
           case 4:
               menuEquipoPrimera.ordenacionPorTarjetasAmarillas();
               break;
           case 5:
               menuEquipoPrimera.ordenacionPorTarjeasRojas();
               break;
           case 6:
               menuEquipoPrimera.ordenacionPorDiferenciaDeGoles();
               break;
           case 7:
               menuEquipoPrimera.ordenacionPorGolesAFavor();
               break;
           case 8:
               menuEquipoPrimera.ordenacionPorGolesEnContra();
               break;
       }
   }
 }

// public void AppClasificacionSegunda() {
//     int opcion;

//     while ((opcion = menuClasificacion()) != 0) {
//         switch (opcion) {
//             case 1:
//                 menuEquipoSegunda.ordenacionPorPuntos();
//                 break;
//             case 2:
//                 menuEquipoSegunda.ordenacionPorNombre();
//                 break;
//             case 3:
//                 menuEquipoSegunda.ordenacionPorPartidosJugados();
//                 break;
//             case 4:
//                 menuEquipoSegunda.ordenacionPorTarjetasAmarillas();
//                 break;
//             case 5:
//                 menuEquipoSegunda.ordenacionPorTarjeasRojas();
//                 break;
//             case 6:
//                 menuEquipoSegunda.ordenacionPorDiferenciaDeGoles();
//                 break;
//             case 7:
//                 menuEquipoSegunda.ordenacionPorGolesAFavor();
//                 break;
//             case 8:
//                 menuEquipoSegunda.ordenacionPorGolesEnContra();
//                 break;
//         }
//     }
// }

    public void AppPartidos() {
        int opcion;

        while ((opcion = menuPartidos()) != 0) {
            switch (opcion) {
                case 1:
                    AppCalendario();
                    break;
                case 2:
                    menuPartido.crearPartido();
                    break;
                case 4:
                    menuPartido.eliminarPartido();
            }
        }
    }



    public void AppCalendario(){
        int opcion;

        while ((opcion = menuCalendario()) != 0) {
            switch (opcion) {
                case 1:
                    menuPartido.listaPartidos();
                    break;
                case 2:
                    menuPartido.buscarPorJornada();
                    break;
                case 3:
                    menuPartido.buscarPorEquipo();
            }
        }
    }

    public void AppTrofeos() {
        int opcion;

        while ((opcion = menuTrofeos()) != 0) {
            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
            }
        }
    }


    private int menuCompeticion() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("*************************");
        System.out.println("* 1 - Primera División  *");
        System.out.println("* 2 - Segunda División  *");
        System.out.println("* 3 - Buscar Equipo     *");
        System.out.println("* 4 - Buscar Jugador    *");
        System.out.println("* 0 - Salir             *");
        System.out.println("*************************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    private int menuPrimeraSegundaDivision() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("*********************");
        System.out.println("* 1 - Equipos       *");
        System.out.println("* 2 - Clasificación *");
        System.out.println("* 3 - Partidos    *");
        System.out.println("* 4 - Trofeos       *");
        System.out.println("* 0 - Salir         *");
        System.out.println("*********************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    private int menuEleccionEquipo() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("************************");
        System.out.println("* 1 - Elegir equipo    *");
        System.out.println("* 2 - Añadir equipo    *");
        System.out.println("* 3 - Eliminar equipo  *");
        System.out.println("* 4 - Mostrar equipos  *");
        System.out.println("* 0 - Salir            *");
        System.out.println("************************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    private int menuEquipos() {
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
        System.out.println("* 1 - Ordenar por nombre             *");
        System.out.println("* 2 - Ordenar por apellidos          *");
        System.out.println("* 3 - Ordenar por posición           *");
        System.out.println("* 4 - Ordenar por dorsal             *");
        System.out.println("* 5 - Ordenar por altura             *");
        System.out.println("* 6 - Ordenar por peso               *");
        System.out.println("* 7 - Ordenar por edad               *");
        System.out.println("* 8 - Ordenar por partidos jugados   *");
        System.out.println("* 9 - Ordenar por tarjetas amarillas *");
        System.out.println("* 10- Ordenar por tarjetas rojas     *");
        System.out.println("* 11- Ordenar por goles              *");
        System.out.println("* 12- Ordenar por goles en propia    *");
        System.out.println("* 13- Ordenar por goles recibidos    *");
        System.out.println("* 14- Asistencias                    *");
        System.out.println("* 15- Añadir jugador                 *");
        System.out.println("* 16- Eliminar jugador               *");
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

    private int menuPartidos() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("************************");
        System.out.println("* 1 - Ver jornadas     *");
        System.out.println("* 2 - Añadir jornada   *");
        System.out.println("* 3 - Eliminar jornada *");
        System.out.println("* 0 - Salir            *");
        System.out.println("************************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    private int menuCalendario() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("**************************");
        System.out.println("* 1 - Todos los partidos *");
        System.out.println("* 2 - Buscar jornada     *");
        System.out.println("* 3 - Buscar equipo      *");
        System.out.println("* 0 - Salir              *");
        System.out.println("**************************");
        System.out.println("Opción: ");

        opcion = scanner.nextInt();

        return opcion;
    }

    private int menuTrofeos() {
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

