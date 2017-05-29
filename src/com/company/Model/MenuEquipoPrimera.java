package com.company.Model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by marco on 22/05/2017.
 */
public class MenuEquipoPrimera extends MenuEquipo{

    // Constructor

    public MenuEquipoPrimera() {
    }

    public MenuEquipoPrimera(ArrayList<Equipo> equipos) {
        this.equiposPrimera = equipos;
    }


    // Ordenación

    public void ordenacionPorNombre() {
        Collections.sort(equiposPrimera, Equipo.comparadorPorNombre);

        listaEquiposPrimera();
    }

    public void ordenacionPorCompeticion() {
        Collections.sort(equiposPrimera, Equipo.comparadorPorCompeticion);

        listaEquiposPrimera();
    }

    public void ordenacionPorPuntos() {
        Collections.sort(equiposPrimera, Equipo.comparadorPorPuntos);

        listaEquiposPrimera();
    }

    public void ordenacionPorPartidosJugados() {
        Collections.sort(equiposPrimera, Equipo.comparadorPorPartidosJugados);
    }

    public void ordenacionPorGolesAFavor() {
        Collections.sort(equiposPrimera, Equipo.comparadorPorGolesAFavor);

        listaEquiposPrimera();
    }

    public void ordenacionPorGolesEnContra() {
        Collections.sort(equiposPrimera, Equipo.comparadorPorGolesEnContra);

        listaEquiposPrimera();
    }

    public void ordenacionPorDiferenciaDeGoles() {
        Collections.sort(equiposPrimera, Equipo.comparadorPorDiferenciaDeGoles);

        listaEquiposPrimera();
    }

    public void ordenacionPorTarjetasAmarillas() {
        Collections.sort(equiposPrimera, Equipo.comparadorPorTarjetasAmarillas);

        listaEquiposPrimera();
    }

    public void ordenacionPorTarjeasRojas() {
        Collections.sort(equiposPrimera, Equipo.comparadorPorTarjetasRojas);

        listaEquiposPrimera();
    }

}

/*
public void elegirEquipo() {
        Scanner input = new Scanner(System.in);
        int indice;

        do {
            System.out.println("Elija un equipo");
            indice = input.nextInt();
        } while (!indiceCorrecto(indice, equiposPrimera));

        equiposPrimera.contains(indice);
    }
 */
/*
 public void añadirEquipoPrimera(Equipo equipo) {
        if (equipo.getCompeticion().equals(Competicion.PRIMERA)) {
            equiposPrimera.add(equipo);
        }
    }


    public void eliminarEquipo() {
        Scanner input = new Scanner(System.in);
        int indice;

        do {
            System.out.println("introduzca el índice del equipo que desea borrar: ");
            indice = input.nextInt();
        } while (!indiceCorrecto(indice, equiposPrimera));

        equiposPrimera.remove(indice);
    }



    public Equipo elegirEquipoPrimera() {
        Scanner input = new Scanner(System.in);
        int indice;
        Equipo equipoElegido;

        do {
            System.out.println("Elija un equipo");
            indice = input.nextInt();
        } while (!indiceCorrecto(indice, equiposPrimera));


        equipoElegido = equiposPrimera.get(indice);

        System.out.println(equipoElegido);

        return equipoElegido;

    }


    public void mostrarInformacionEquipoPrimera() {
        for (Equipo equipo : equiposPrimera) {
            System.out.println(equipo);
        }
    }
 */