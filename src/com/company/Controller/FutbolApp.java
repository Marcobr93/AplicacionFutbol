package com.company.Controller;

import com.company.Model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class FutbolApp {

    public ArrayList<Equipo> equipos = new ArrayList<>();


     MenuEquipo menuEquipo;
     MenuJugador menuJugador;
     MenuPartido menuPartido;
     MenuClasificacion menuClasificacion;


    public FutbolApp() {
        menuEquipo = new MenuEquipo(equipos);
        menuJugador = new MenuJugador(equipos);
        menuPartido = new MenuPartido(equipos);
        menuClasificacion = new MenuClasificacion(equipos);

        cargarEquipos();
        cargarJugadores();
        cargarPartidos();
        cargarClasificación();

        menuEquipo.añadirPrimeraOSegunda();
        menuPartido.añadirPartidoPrimeraOSegunda();
        menuClasificacion.añadirClasificacionPrimeraOSegunda();
        menuJugador.añadirJugadoresPrimeraSegunda();
        menuJugador.añadirPorteroPrimera();
        menuJugador.añadirPorteroSegunda();

    }

    private void cargarEquipos() {
        menuEquipo.equipos.add(new Equipo("Real Madrid", "Florentino Pérez", "Zinedine Zidane", "Santiago Bernabéu", 1902, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Barcelona", "Bartomeu", "Luis Enrique", "Campo Nuevo", 1899,  Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Cádiz", "Manuel Vizcaíno", "Álvaro Cervera", "Ramón de Carranza", 1910,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Zaragoza", "Pepe el presi", "Paco er entrenadó", "Er campo", 1940,  Competicion.SEGUNDA));
    }

    private void cargarJugadores() {
        menuJugador.jugadores.add(new Jugador("Marco", "Asensio Willemsen", Posicion.MediaPunta, false, 1.80, 75.00, 20, 21, 23, 0, 0, 3, 0, 0, 7, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Cristiano", "Ronaldo", Posicion.MediaPunta, false, 1.80, 75.00, 7, 25, 23, 0, 0, 8, 7, 0, 10, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Sergio", "Ramos", Posicion.MediaPunta, false, 1.80, 75.00, 7, 25, 23, 0, 0, 8, 7, 0, 10, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Sergio", "Busquets Burgos", Posicion.Centrocampista, false, 1.89, 76.00, 5, 28, 32, 8, 0, 2, 0, 0, 4, "Barcelona",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Keylor", "Navas", Posicion.Portero, false, 180, 99.00, 1, 30, 34, 0, 0, 0, 0, 37, 0, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Ter", "Stegen", Posicion.Portero, false, 199, 99.00, 1, 22, 33, 0, 0, 0, 0, 37, 0, "Barcelona",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Paco", "wew erw", Posicion.Centrocampista, false, 1.89, 76.00, 5, 28, 32, 8, 0, 7, 0, 0, 4, "Cádiz",Competicion.SEGUNDA));
        menuJugador.jugadores.add(new Jugador("Pedro", "caca erw", Posicion.Delantero, true, 199, 99.00, 10, 44, 38, 15, 2, 15, 4, 0, 7, "Zaragoza",Competicion.SEGUNDA)); }

    private void cargarPartidos(){
        menuPartido.partidos.add(new Partido("Real Madrid", "Barcelona","Santiago Bernabéu","Pepito", Competicion.PRIMERA, 5, 0,20));
        menuPartido.partidos.add(new Partido("Betis", "Real Sociedad","Benito Villamarín","Pedro", Competicion.PRIMERA, 2, 2,20));
        menuPartido.partidos.add(new Partido("Real Madrid", "Sevilla","Santiago Bernabéu","Paco", Competicion.PRIMERA, 3, 1,10));
        menuPartido.partidos.add(new Partido("Betis", "Real Madrid","Benito Villamarín","Juan", Competicion.PRIMERA, 2, 5,30));
        menuPartido.partidos.add(new Partido("Zaragoza", "Cádiz C.F","Er campo","Luis", Competicion.SEGUNDA, 4, 2,20));
    }
    public void cargarClasificación(){
        menuClasificacion.clasificacion.add(new Clasificacion("Real Madrid", 38, 29,6,3,106,41,93,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Barcelona", 38, 28,6,4,116,37,90,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Atlético de Madrid", 38, 23,9,6,70,27,78,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Sevilla", 38, 21,9,8,69,49,72,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Villarreal", 38, 19,10,9,56,33,67,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Real Sociedad", 38, 19,7,12,59,53,64,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Athletic", 38, 19,6,13,53,43,63,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Espanyol", 38, 15,11,12,49,50,56,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Alavés", 38, 14,13,11,41,43,55,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Eibar", 38, 15,9,14,56,51,54,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Málaga", 38, 12,10,16,49,55,46,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Valencia", 38, 13,7,18,56,65,46,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Celta", 38, 13,6,19,53,69,45,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Las Palmas", 38, 10,9,19,53,74,39,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Betis", 38, 10,9,19,41,64,39,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Deportivo", 38, 8,12,18,43,61,36,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Leganés", 38, 8,11,19,36,55,35,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Sporting", 38, 7,10,21,42,72,31,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Osasuna", 38, 4,10,24,40,94,22,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Granada", 38, 4,8,26,30,82,20,Competicion.PRIMERA));



        menuClasificacion.clasificacion.add(new Clasificacion("Levante", 40, 25,9,6,56,29,84,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Girona", 40, 20,9,11,64,43,69,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Getafe", 40, 17,13,10,48,40,64,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Tenerife", 40, 15,18,7,48,35,63,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Cádiz", 40, 15,16,9,53,38,61,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Valladolid", 40, 17,9,14,51,45,60,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Huesca", 40, 15,14,11,51,42,59,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Real Oviedo", 40, 15,10,15,44,47,55,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Sevilla Atético", 40, 13,14,13,54,53,53,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Reus", 40, 12,16,12,29,28,52,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Lugo", 40, 13,13,14,48,49,52,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Rayo Vallecano", 40, 13,11,16,41,41,50,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Córdoba", 40, 12,13,15,38,50,49,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Numancia", 40, 11,16,13,40,47,49,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Zaragoza", 40, 12,13,15,49,50,49,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("UCAM", 40, 11,15,14,42,49,48,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Almería", 40, 13,9,18,43,45,48,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Gimnástic", 40, 10,16,14,45,51,46,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Alcorcón", 40, 11,11,18,28,43,44,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Mallorca", 40, 9,16,15,37,45,43,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Elche", 40, 11,10,19,48,59,43,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Mirandés", 40, 8,13,19,36,64,37,Competicion.SEGUNDA));

    }

    //Inicializacion


    public void AppInicio() {
        int opcion;

        while ((opcion = menuInicio()) != 0) {
            switch (opcion) {
                case 1:
                    AppCompeticion();
                    break;
            }
        }
    }


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
                case 5:
                    menuPartido.buscarPorJornada();
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
                    AppPartidosPrimera();
                    break;
                case 4:
                    AppTrofeosPrimera();
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
                    AppClasificacionSegunda();
                    break;
                case 3:
                    AppPartidosSegunda();
                    break;
                case 4:
                    AppTrofeosSegunda();
                    break;
            }
        }
    }

    public void AppEleccionEquipoPrimera() {
        int opcion;


        while ((opcion = menuEleccionEquipo()) != 0) {
            switch (opcion) {
                case 1:
                    AppEquiposPrimera();
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

                    AppEquiposSegunda();
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

    public void AppEquiposPrimera() {
        int opcion;

        while ((opcion = menuEquipos()) != 0) {
            switch (opcion) {
                case 1:
                    menuEquipo.mostrarInformacionEquipoPrimera();
                    break;
                case 2:
                    menuEquipo.listaEquiposPrimera();
                    AppPlantilla(menuJugador.elegirEquipo());
                    break;
                case 3:
                    menuJugador.crearJugador();
                    break;
            }
        }
    }

    public void AppEquiposSegunda() {
        int opcion;

        while ((opcion = menuEquipos()) != 0) {
            switch (opcion) {
                case 1:
                    menuEquipo.mostrarInformacionEquipoSegunda();
                    break;
                case 2:
                    menuEquipo.listaEquiposSegunda();
                    AppPlantilla(menuJugador.elegirEquipo());
                    break;
                case 3:
                    menuJugador.crearJugador();
                    break;
            }
        }
    }

    public void AppPlantilla(ArrayList<Jugador> jugadoresEquipo) {
        int opcion;

        while ((opcion = menuPlantilla()) != 0) {
            switch (opcion) {
                case 1:
                    menuJugador.ordenacionPorNombre(jugadoresEquipo);
                    break;
                case 2:
                    menuJugador.ordenacionPorApellidos(jugadoresEquipo);
                    break;
                case 3:
                    menuJugador.ordenacionPorPosicion(jugadoresEquipo);
                    break;
                case 4:
                    menuJugador.ordenacionPorDorsal(jugadoresEquipo);
                    break;
                case 5:
                    menuJugador.ordenacionPorAltura(jugadoresEquipo);
                    break;
                case 6:
                    menuJugador.ordenacionPorPeso(jugadoresEquipo);
                    break;
                case 7:
                    menuJugador.ordenacionPorEdad(jugadoresEquipo);
                    break;
                case 8:
                    menuJugador.ordenacionPorPartidosJugados(jugadoresEquipo);
                    break;
                case 9:
                    menuJugador.ordenacionPorTarjetasAmarillas(jugadoresEquipo);
                    break;
                case 10:
                    menuJugador.ordenacionPorTarjetasRojas(jugadoresEquipo);
                    break;
                case 11:
                    menuJugador.ordenacionPorGoles(jugadoresEquipo);
                    break;
                case 12:
                    menuJugador.ordenacionPorGolesEnPropia(jugadoresEquipo);
                    break;
                case 13:
                    menuJugador.ordenacionPorGolesRecibidos(jugadoresEquipo);
                    break;
                case 14:
                    menuJugador.ordenacionPorAsistencias(jugadoresEquipo);
                    break;
                case 15:
                    menuJugador.eliminarJugador(jugadoresEquipo);
                    break;
            }
        }
    }

  public void AppClasificacionPrimera() {
      int opcion;

   while ((opcion = menuClasificacion()) != 0) {
       switch (opcion) {
           case 1:
               menuClasificacion.ordenacionPorNombreEquipoPrimera();
               break;
           case 2:
               menuClasificacion.ordenacionPorPartidosJugadosEquipoPrimera();
               break;
           case 3:
               menuClasificacion.ordenacionPorPartidosGanadosEquipoPrimera();
               break;
           case 4:
               menuClasificacion.ordenacionPorPartidosEmpatadosEquipoPrimera();
               break;
           case 5:
               menuClasificacion.ordenacionPorPartidosPerdidosEquipoPrimera();
               break;
           case 6:
                menuClasificacion.ordenacionPorGolesAFavorEquipoPrimera();
               break;
           case 7:
                menuClasificacion.ordenacionPorGolesEnContraEquipoPrimera();
               break;
           case 8:
                menuClasificacion.ordenacionPorDiferenciaDeGolesquipoPrimera();
               break;
           case 9:
               menuClasificacion.ordenacionPorPuntosEquipoPrimera();
               break;
       }
   }
 }

 public void AppClasificacionSegunda() {
     int opcion;

     while ((opcion = menuClasificacion()) != 0) {
         switch (opcion) {
             case 1:
                menuClasificacion.ordenacionPorNombreEquipoSegunda();
                 break;
             case 2:
                menuClasificacion.ordenacionPorPartidosJugadosEquipoSegunda();
                 break;
             case 3:
                menuClasificacion.ordenacionPorPartidosGanadosEquipoSegunda();
                 break;
             case 4:
                menuClasificacion.ordenacionPorPartidosEmpatadosEquipoSegunda();
                 break;
             case 5:
                menuClasificacion.ordenacionPorPartidosPerdidosEquipoSegunda();
                 break;
             case 6:
                menuClasificacion.ordenacionPorGolesAFavorEquipoSegunda();
                 break;
             case 7:
                menuClasificacion.ordenacionPorGolesEnContraEquipoSegunda();
                 break;
             case 8:
                menuClasificacion.ordenacionPorDiferenciaDeGolesquipoSegunda();
                 break;
             case 9:
                 menuClasificacion.ordenacionPorPuntosEquipoSegunda();
                 break;
         }
     }
 }

    public void AppPartidosPrimera() {
        int opcion;

        while ((opcion = menuPartidos()) != 0) {
            switch (opcion) {
                case 1:
                    AppCalendarioPrimera();
                    break;
                case 2:
                    menuPartido.crearPartido();
                    break;
                case 3:
                    menuPartido.eliminarPartido();
                    break;
            }
        }
    }

    public void AppPartidosSegunda() {
        int opcion;

        while ((opcion = menuPartidos()) != 0) {
            switch (opcion) {
                case 1:
                    AppCalendarioSegunda();
                    break;
                case 2:
                    menuPartido.crearPartido();
                    break;
                case 3:
                    menuPartido.eliminarPartido();
                    break;
            }
        }
    }



    public void AppCalendarioPrimera(){
        int opcion;

        while ((opcion = menuCalendario()) != 0) {
            switch (opcion) {
                case 1:
                    menuPartido.listaPartidosPrimera();
                    break;
                case 2:
                    menuPartido.buscarPorJornadaPrimera();
                    break;
                case 3:
                    menuPartido.buscarPorEquipoPrimera();
                    break;
                case 4:
                    AppPartidosOrdenacionPrimera();
                    break;
            }
        }
    }

    public void AppCalendarioSegunda(){
        int opcion;

        while ((opcion = menuCalendario()) != 0) {
            switch (opcion) {
                case 1:
                    menuPartido.listaPartidosSegunda();
                    break;
                case 2:
                    menuPartido.buscarPorJornadaSegunda();
                    break;
                case 3:
                    menuPartido.buscarPorEquipoSegunda();
                    break;
                case 4:
                    AppPartidosOrdenacionSegunda();
            }
        }
    }

    public void AppPartidosOrdenacionPrimera(){
        int opcion;

        while ((opcion = menuOrdenacion()) != 0) {
            switch (opcion) {
                case 1:
                    menuPartido.ordenacionPorLocalPrimera();
                    break;
                case 2:
                    menuPartido.ordenacionPorVisitantePrimera();
                    break;
                case 3:
                    menuPartido.ordenacionPorEstadioPrimera();
                    break;
                case 4:
                    menuPartido.ordenacionPorJornadaPrimera();
                    break;
                case 5:
                    menuPartido.ordenacionPorGolesLocalPrimera();
                    break;
                case 6:
                    menuPartido.ordenacionPorGolesVisitantePrimera();
                    break;
            }
        }
    }

    public void AppPartidosOrdenacionSegunda(){
        int opcion;

        while ((opcion = menuOrdenacion()) != 0) {
            switch (opcion) {
                case 1:
                    menuPartido.ordenacionPorLocalSegunda();
                    break;
                case 2:
                    menuPartido.ordenacionPorVisitanteSegunda();
                    break;
                case 3:
                    menuPartido.ordenacionPorEstadioSegunda();
                    break;
                case 4:
                    menuPartido.ordenacionPorJornadaSegunda();
                    break;
                case 5:
                    menuPartido.ordenacionPorGolesLocalSegunda();
                    break;
                case 6:
                    menuPartido.ordenacionPorGolesVisitanteSegunda();
                    break;
            }
        }
    }

    public void AppTrofeosPrimera() {
        int opcion;

        while ((opcion = menuTrofeos()) != 0) {
            switch (opcion) {
                case 1:
                menuJugador.ordenacionPorPichichiPrimera();
                    break;
                case 2:
                menuJugador.ordenacionPorZamoraPrimera();
                    break;
            }
        }
    }

    public void AppTrofeosSegunda() {
        int opcion;

        while ((opcion = menuTrofeos()) != 0) {
            switch (opcion) {
                case 1:
                menuJugador.ordenacionPorPichichiSegunda();
                    break;
                case 2:
                menuJugador.ordenacionPorZamoraSegunda();
                    break;
            }
        }
    }

    private int menuInicio(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("*************************");
        System.out.println("─────────────────────────────────────────────────────────────────────────\n" +
                "─────────────────────────██████████████─██████████████─██████████████────\n" +
                "────────────────────────██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██────\n" +
                "────────────────────────██░░███████░░██─██░░███████░░██─█░░██████░░██────\n" +
                "────────────────────────██░░██──████░░██─██░░██──████░░██─█░░██──███░░██────\n" +
                "────────────────────────██░░███████░░██─██░░███████░░██─█░░██████░░██────\n" +
                "────────────────────────██░░░░░░░░░░░██─█░░░░░░░░░░██─██░░░░░░░░░░██────\n" +
                "────────────────────────██░░███████░░██─██░░██████████─██░░██████████────\n" +
                "────────────────────────██░░██──████░░██─██░░██────────██████░░██────────────\n" +
                "────────────────────────██░░██──████░░██─██░░██────────██████░░██────────────\n" +
                "────────────────────────██░░██──████░░██─██░░██────────██████░░██────────────\n" +
                "─────────────────────────██████──██████─██████─────────██████────────────\n" +
                "─────────────────────────────────────────────────────────────────────────\n" +
                "─────────────────────────────────────────────────────────────────────────────────────────────\n" +
                "─████████████───────█████───────────██────────████████████──────███████─────────────████████████──────█████───────────\n" +
                "─██░░░░░░░░░█─────█░░██──────────█░░██─░░░░░░░░░░░░██─░░░░░░░██─────────█░░░░░░░░░░█─────█░░██─────────\n" +
                "─██░░█████████───█░░██──────────█░░██─████░░██████───────░░████░░██─────██░░██───────────░░██──█░░██─────────\n" +
                "─██░░█████████────░░██──────────█░░███████░░██──────────██░░██──██░░██────██░░██──────███░░██─█░░██─────────\n" +
                "─██░░█████████───░░██──────────█░░██───────█░░██───────────██░░██████░░████─█░░██──────███░░██─█░░██─────────\n" +
                "─██░░░░░░░░░█──█░░██──────────█░░██─────██░░██───────────██░░░░░░░░░░░░█──█░░██─────███░░██──█░░██─────────\n" +
                "─██░░████████───█░░██────────██░░██─────██░░██───────────██░░█████████░░██──░░██─────███░░██──█░░██─────────\n" +
                "─██░░██────────────██░░██─     ─██░░██─────██░░██───────────██░░██────█████░░█─█░░██─────███░░██───█░░██─────────\n" +
                "─██░░██────────────██░░████████░░██─────██░░██───────────██░░█████████░░██───░░███████░░██───█░░█████████─\n" +
                "─██░░██────────────███░░░░░░░░░░██─────██░░██────────────██░░░░░░░░░░░░██───█░░░░░░░░░██─────█░░░░░░░░░█─\n" +
                "─██████──────────────────███████████──────────████───────────────███████████████──────────█████████──────────███████████\n" +
                "─────────────────────────────────────────────────────────────────────────────────────────────");


        System.out.println("Pulse Enter para comenzar el programa. ");
        scanner.nextLine();
        AppCompeticion();
        return  opcion;
    }


    private int menuCompeticion() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 6;

        System.out.println("* 1 - Primera División  *");
        System.out.println("* 2 - Segunda División  *");
        System.out.println("* 3 - Buscar Equipo     *");
        System.out.println("* 4 - Buscar Jugador    *");
        System.out.println("* 5 - Buscar Jornada    *");
        System.out.println("* 0 - Salir             *");
        System.out.println("*************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuPrimeraSegundaDivision() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 5;

        System.out.println("*********************");
        System.out.println("* 1 - Equipos       *");
        System.out.println("* 2 - Clasificación *");
        System.out.println("* 3 - Partidos      *");
        System.out.println("* 4 - Trofeos       *");
        System.out.println("* 0 - Atrás         *");
        System.out.println("*********************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuEleccionEquipo() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 5;

        System.out.println("************************");
        System.out.println("* 1 - Elegir equipo    *");
        System.out.println("* 2 - Añadir equipo    *");
        System.out.println("* 3 - Eliminar equipo  *");
        System.out.println("* 4 - Mostrar equipos  *");
        System.out.println("* 0 - Atrás            *");
        System.out.println("************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuEquipos() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 4;

        System.out.println("******************************");
        System.out.println("* 1 - Información del equipo *");
        System.out.println("* 2 - Plantilla              *");
        System.out.println("* 3 - Añadir jugador         *");
        System.out.println("* 0 - Atrás                  *");
        System.out.println("******************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuPlantilla() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 16;

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
        System.out.println("* 15- Eliminar jugador               *");
        System.out.println("* 0 - Atrás                          *");
        System.out.println("**************************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuClasificacion() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 10;

        System.out.println("****************************************");
        System.out.println("* 1 - Ordenar por nombre               *");
        System.out.println("* 2 - Ordenar por partidos jugados     *");
        System.out.println("* 3 - Ordenar por partidos ganados     *");
        System.out.println("* 4 - Ordenar por partidos empatado    *");
        System.out.println("* 5 - Ordenar por partidos perdidos    *");
        System.out.println("* 6 - Ordenar por goles a favor        *");
        System.out.println("* 7 - Ordenar por goles en contra      *");
        System.out.println("* 8 - Ordenar por diferencia de goles  *");
        System.out.println("* 9 - Ordenar por puntos               *");
        System.out.println("* 0 - Atrás                            *");
        System.out.println("****************************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuPartidos() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 4;

        System.out.println("************************");
        System.out.println("* 1 - Ver jornadas     *");
        System.out.println("* 2 - Añadir jornada   *");
        System.out.println("* 3 - Eliminar jornada *");
        System.out.println("* 0 - Atrás            *");
        System.out.println("************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuCalendario() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 5;

        System.out.println("**************************");
        System.out.println("* 1 - Todos los partidos *");
        System.out.println("* 2 - Buscar jornada     *");
        System.out.println("* 3 - Buscar equipo      *");
        System.out.println("* 4 - Ordenación jornada *");
        System.out.println("* 0 - Atrás              *");
        System.out.println("**************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuOrdenacion() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 7;

        System.out.println("***********************************");
        System.out.println("* 1 - Ordenar por Local           *");
        System.out.println("* 2 - Ordenar por Visitante       *");
        System.out.println("* 3 - Ordenar por Estadio         *");
        System.out.println("* 4 - Ordenar por Jornada         *");
        System.out.println("* 5 - Ordenar por Goles Local     *");
        System.out.println("* 6 - Ordenar por Goles Visitante *");
        System.out.println("* 0 - Atrás                       *");
        System.out.println("***********************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }
        return opcion;
    }

    private int menuTrofeos() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 3;

        System.out.println("****************");
        System.out.println("* 1 - Pichichi *");
        System.out.println("* 2 - Zamora   *");
        System.out.println("* 0 - Atrás    *");
        System.out.println("****************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }
}

