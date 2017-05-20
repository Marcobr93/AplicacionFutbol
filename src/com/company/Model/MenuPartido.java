package com.company.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by marco on 19/05/2017.
 */
public class MenuPartido {

    public ArrayList<Partido> partidos = new ArrayList<>();

    // Métodos

    public void añadirPartido(Partido partido){
        if(partido != null){
            partidos.add(partido);
        }
    }

    public void listaPartidos(){
        for (Partido partido: partidos){
            System.out.println(partido);
        }
    }

    public void eliminarPartido(){
        Scanner scanner = new Scanner(System.in);
        int numero;

        Iterator<Partido> itPartido = partidos.iterator();

        listaPartidos();

        System.out.println();

        System.out.println("Introduzca el número del partido que desea borrar");
        numero = scanner.nextInt();

        while (itPartido.hasNext()){
            Partido partido = itPartido.next();

            if (numero == partido.getNumeroPartido()){
                itPartido.remove();
            }
        }
    }

    // Ordenación

    public void ordenacionPorLocal(){
        Collections.sort(partidos, Partido.comparadorPorLocal);

        listaPartidos();
    }

    public void ordenacionPorVisitante(){
        Collections.sort(partidos, Partido.comparadorPorVisitante);

        listaPartidos();
    }

    public void ordenacionPorEstadio(){
        Collections.sort(partidos, Partido.comparadorPorEstadio);

        listaPartidos();
    }

    public void ordenacionPorJornada(){
        Collections.sort(partidos, Partido.comparadorPorJornada);

        listaPartidos();
    }
}
