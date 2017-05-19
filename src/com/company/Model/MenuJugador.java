package com.company.Model;

import com.company.Controller.FutbolApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class MenuJugador {
    public ArrayList<Jugador> jugadores = new ArrayList<>();

    // Métodos

    public void añadirJugador(Jugador jugador){
        if(jugador != null){
            jugadores.add(jugador);
        }
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

    public void listaJugadores(){
        int indice = 0;
        for (Jugador jugador: jugadores){
            System.out.println((indice++) + " - " + jugador);
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

}
