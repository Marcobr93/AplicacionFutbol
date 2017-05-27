package com.company.Model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by marco on 22/05/2017.
 */
public class MenuEquipoSegunda extends MenuEquipo {

    // Constructor

    public MenuEquipoSegunda() {
    }

    public MenuEquipoSegunda(ArrayList<Equipo> equipos) {
    }

    // Ordenación

    public void ordenacionPorNombre() {
        Collections.sort(equiposSegunda, Equipo.comparadorPorNombre);

        listaEquiposSegunda();
    }

    public void ordenacionPorCompeticion() {
        Collections.sort(equiposSegunda, Equipo.comparadorPorCompeticion);

        listaEquiposSegunda();
    }

    public void ordenacionPorPuntos() {
        Collections.sort(equiposSegunda, Equipo.comparadorPorPuntos);

        listaEquiposSegunda();
    }

    public void ordenacionPorPartidosJugados() {
        Collections.sort(equiposSegunda, Equipo.comparadorPorPartidosJugados);
    }

    public void ordenacionPorGolesAFavor() {
        Collections.sort(equiposSegunda, Equipo.comparadorPorGolesAFavor);

        listaEquiposSegunda();
    }

    public void ordenacionPorGolesEnContra() {
        Collections.sort(equiposSegunda, Equipo.comparadorPorGolesEnContra);

        listaEquiposSegunda();
    }

    public void ordenacionPorDiferenciaDeGoles() {
        Collections.sort(equiposSegunda, Equipo.comparadorPorDiferenciaDeGoles);

        listaEquiposSegunda();
    }

    public void ordenacionPorTarjetasAmarillas() {
        Collections.sort(equiposSegunda, Equipo.comparadorPorTarjetasAmarillas);

        listaEquiposSegunda();
    }

    public void ordenacionPorTarjeasRojas() {
        Collections.sort(equiposSegunda, Equipo.comparadorPorTarjetasRojas);

        listaEquiposSegunda();
    }
}

/*
 public void añadirEquipoSegunda(Equipo equipo) {
        if (equipo.getCompeticion().equals(Competicion.SEGUNDA)) {
            equiposSegunda.add(equipo);
        }
    }

    public void eliminarEquipo() {
        Scanner input = new Scanner(System.in);
        int indice;

        do {
            System.out.println("introduzca el índice del equipo que desea borrar: ");
            indice = input.nextInt();
        } while (!indiceCorrecto(indice, equiposSegunda));

        equiposSegunda.remove(indice);
    }

    public void listaEquiposSegunda(){
        int indice = 0;

        for (Equipo equipo: equiposSegunda) {
            System.out.println((indice++) + " - " + equipo);
        }
    }

    public Equipo elegirEquipoSegunda() {
        Scanner input = new Scanner(System.in);
        int indice;
        Equipo equipoElegido;

        do {
            System.out.println("Elija un equipo");
            indice = input.nextInt();
        } while (!indiceCorrecto(indice, equiposSegunda));


        equipoElegido = equiposSegunda.get(indice);

        System.out.println(equipoElegido);

        return equipoElegido;

    }

    public void mostrarInformacionEquipoSegunda() {
        for (Equipo equipo : equiposSegunda) {
            System.out.println(equipo);
        }
    }
 */