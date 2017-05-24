package com.company.Model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by marco on 19/05/2017.
 */
public class MenuEquipo {

    public ArrayList<Equipo> equipos = new ArrayList<>();

    // Métodos

/*
    public void listaEquipos() {
        int indice = 0;

        for (Equipo equipo : equipos) {
            System.out.println((indice++) + " - " + equipo);
        }
    }


    public void eliminarEquipo() {
        Scanner input = new Scanner(System.in);
        int indice;

        do {
            System.out.println("introduzca el índice del equipo que desea borrar: ");
            indice = input.nextInt();
        } while (!indiceCorrecto(indice, equipos));

        equipos.remove(indice);
    }


    public void mostrarInformacionEquipo() {
        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }
    }

    public Equipo elegirEquipo() {
        Scanner input = new Scanner(System.in);
        int indice;

        do {
            System.out.println("Elija un equipo");
            indice = input.nextInt();
        } while (!indiceCorrecto(indice, equipos));

        equipos.contains(indice);
        return null;
    }
*/
    public static boolean indiceCorrecto(int indice, ArrayList<Equipo> equipos) {
        if (indice >= 0 && indice < equipos.size()) {
            return true;
        } else {
            return false;
        }
    }


    // Ordenación
/*
    public void ordenacionPorNombre() {
        Collections.sort(equipos, Equipo.comparadorPorNombre);

        listaEquipos();
    }

    public void ordenacionPorCompeticion() {
        Collections.sort(equipos, Equipo.comparadorPorCompeticion);

        listaEquipos();
    }

    public void ordenacionPorPuntos() {
        Collections.sort(equipos, Equipo.comparadorPorPuntos);

        listaEquipos();
    }

    public void ordenacionPorPartidosJugados() {
        Collections.sort(equipos, Equipo.comparadorPorPartidosJugados);
    }

    public void ordenacionPorGolesAFavor() {
        Collections.sort(equipos, Equipo.comparadorPorGolesAFavor);

        listaEquipos();
    }

    public void ordenacionPorGolesEnContra() {
        Collections.sort(equipos, Equipo.comparadorPorGolesEnContra);

        listaEquipos();
    }

    public void ordenacionPorDiferenciaDeGoles() {
        Collections.sort(equipos, Equipo.comparadorPorDiferenciaDeGoles);

        listaEquipos();
    }

    public void ordenacionPorTarjetasAmarillas() {
        Collections.sort(equipos, Equipo.comparadorPorTarjetasAmarillas);

        listaEquipos();
    }

    public void ordenacionPorTarjeasRojas() {
        Collections.sort(equipos, Equipo.comparadorPorTarjetasRojas);

        listaEquipos();
    }
*/
}

/*
 public void elegirEquipo(ArrayList<Equipo> equipos) {
        listaEquipos();
        Scanner input = new Scanner(System.in);
        int indice;

        do {
            System.out.println("Elija un equipo");
            indice = input.nextInt();
        } while (!indiceCorrecto(indice, equipos));

        equipos.contains(indice);
    }
 */

/*
public void eliminarEquipo(ArrayList<Equipo> equipos) {
        Scanner input = new Scanner(System.in);
        int indice;

        do {
            System.out.println("introduzca el índice del equipo que desea borrar: ");
            indice = input.nextInt();
        } while (!indiceCorrecto(indice, equipos));

        equipos.remove(indice);
    }

 */

/*
    public void añadirEquiposPrimeraDivision(Equipo equipo){
        PRIMERA.añadirEquipos(equipo);
    }


    public void añadirEquiposSegundaDivision(Equipo equipo){
        SEGUNDA.añadirEquipos(equipo);
    }


    public void primeraDivision(){
        int indice = 0;

        for (Competicion competicion: PRIMERA.competiciones){
            System.out.println((indice++) + " - " + competicion);
        }
    }


    public void segundaDivision(){
        int indice = 0;

        for (Competicion competicion: SEGUNDA.competiciones){
            System.out.println((indice++) + " - " + competicion);
        }
    }
    */


/*
    public void eliminarEquipo(){
        Scanner scanner = new Scanner(System.in);
        String nombre;

        Iterator<Equipo> itEquipo = equipos.iterator();

        listaEquipos();

        System.out.println();

        System.out.println("Introduzca el nombre del equipo que desea borrar");
        nombre = scanner.next();

        while (itEquipo.hasNext()){
            Equipo equipo = itEquipo.next();

            if (nombre.equals(equipo.getNombreEquipo())){
                itEquipo.remove();
            }
        }
    }
*/