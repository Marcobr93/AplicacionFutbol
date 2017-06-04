package com.company.Model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by marco on 29/05/2017.
 */
public class MenuClasificacion {

    public ArrayList<Equipo> equipos = new ArrayList<>();                        // ArrayList con todos los equipos
    public ArrayList<Clasificacion> clasificacion = new ArrayList<>();           // ArrayList con todos los equipos de la clasificación
    public ArrayList<Clasificacion> clasificacionPrimera = new ArrayList<>();    // ArrayList con todos los equipos de la clasificación de Primera
    public ArrayList<Clasificacion> clasificacionSegunda = new ArrayList<>();    // ArrayList con todos los equipos de la clasificación de Segunda

    // Constructores

    /**
     * Constructor por defecto
     */
    public MenuClasificacion() {
    }

    /**
     * Constructor que recibe el ArrayList de Equipo desde Controller/FutbolApp
     * @param equipos
     */
    public MenuClasificacion(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }


    // Métodos

    /**
     * Método que sirve para dividir el ArrayList clasificacion en dos nuevos, los equipos que tengan como competición
     * 'PRIMERA', se añadirán al ArrayList clasificacionPrimera y los equipos que tengan como competición 'SEGUNDA', se
     * añadirán al ArrayList clasificacionSegunda
     */
    public void añadirClasificacionPrimeraOSegunda(){
        for (Clasificacion clasificacion: clasificacion) {
            if (clasificacion.getCompeticion().equals(Competicion.PRIMERA)){
                clasificacionPrimera.add(clasificacion);
            }else if (clasificacion.getCompeticion().equals(Competicion.SEGUNDA)){
                clasificacionSegunda.add(clasificacion);
            }
        }
    }

    /**
     * Método el cuál con un Foreach nos muestra los equipos del ArrayList clasificacionPrimera
     */
    public void listaClasificacionPrimera(){
        int indice = 1;

        for (Clasificacion clasificacion: clasificacionPrimera) {
            System.out.println((indice++) + " - " + clasificacion);
        }
    }

    /**
     * Método el cuál con un Foreach nos muestra los equipos del ArrayList clasificacionSegunda
     */
    public void listaClasificacionSegunda(){
        int indice = 1;

        for (Clasificacion clasificacion: clasificacionSegunda) {
            System.out.println((indice++) + " - " + clasificacion);
        }
    }



    // Ordenación Primera

    /**
     * Método que utiliza el comparadorPorNombreEquipo para ordenar la clasificación del ArrayList clasificacionPrimera
     */
    public void ordenacionPorNombreEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorNombreEquipo);

        listaClasificacionPrimera();
    }

    /**
     * Método que utiliza el comparadorPorPartidosJugados para ordenar la clasificación del ArrayList clasificacionPrimera
     */
    public void ordenacionPorPartidosJugadosEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorPartidosJugados);

        listaClasificacionPrimera();
    }

    /**
     * Método que utiliza el comparadorPorPartidosGanados para ordenar la clasificación del ArrayList clasificacionPrimera
     */
    public void ordenacionPorPartidosGanadosEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorPartidosGanados);

        listaClasificacionPrimera();
    }

    /**
     * Método que utiliza el comparadorPorPartidosEmpatados para ordenar la clasificación del ArrayList clasificacionPrimera
     */
    public void ordenacionPorPartidosEmpatadosEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorPartidosEmpatados);

        listaClasificacionPrimera();
    }

    /**
     * Método que utiliza el comparadorPorPartidosPerdidos para ordenar la clasificación del ArrayList clasificacionPrimera
     */
    public void ordenacionPorPartidosPerdidosEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorPartidosPerdidos);

        listaClasificacionPrimera();
    }

    /**
     * Método que utiliza el comparadorPorGolesAFavor para ordenar la clasificación del ArrayList clasificacionPrimera
     */
    public void ordenacionPorGolesAFavorEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorGolesAFavor);

        listaClasificacionPrimera();
    }

    /**
     * Método que utiliza el comparadorPorGolesEnContra para ordenar la clasificación del ArrayList clasificacionPrimera
     */
    public void ordenacionPorGolesEnContraEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorGolesEnContra);

        listaClasificacionPrimera();
    }

    /**
     * Método que utiliza el comparadorPorDiferenciaDeGoles para ordenar la clasificación del ArrayList clasificacionPrimera
     */
    public void ordenacionPorDiferenciaDeGolesquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorDiferenciaDeGoles);

        listaClasificacionPrimera();
    }

    /**
     * Método que utiliza el comparadorPorPuntos para ordenar la clasificación del ArrayList clasificacionPrimera
     */
    public void ordenacionPorPuntosEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorPuntos);

        listaClasificacionPrimera();
    }




    // Ordenación Segunda

    /**
     * Método que utiliza el comparadorPorNombreEquipo para ordenar la clasificación del ArrayList clasificacionSegunda
     */
    public void ordenacionPorNombreEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorNombreEquipo);

        listaClasificacionSegunda();
    }

    /**
     * Método que utiliza el comparadorPorPartidosJugados para ordenar la clasificación del ArrayList clasificacionSegunda
     */
    public void ordenacionPorPartidosJugadosEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorPartidosJugados);

        listaClasificacionSegunda();
    }

    /**
     * Método que utiliza el comparadorPorPartidosGanados para ordenar la clasificación del ArrayList clasificacionSegunda
     */
    public void ordenacionPorPartidosGanadosEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorPartidosGanados);

        listaClasificacionSegunda();
    }

    /**
     * Método que utiliza el comparadorPorPartidosEmpatados para ordenar la clasificación del ArrayList clasificacionSegunda
     */
    public void ordenacionPorPartidosEmpatadosEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorPartidosEmpatados);

        listaClasificacionSegunda();
    }

    /**
     * Método que utiliza el comparadorPorPartidosPerdidos para ordenar la clasificación del ArrayList clasificacionSegunda
     */
    public void ordenacionPorPartidosPerdidosEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorPartidosPerdidos);

        listaClasificacionSegunda();
    }

    /**
     * Método que utiliza el comparadorPorGolesAFavor para ordenar la clasificación del ArrayList clasificacionSegunda
     */
    public void ordenacionPorGolesAFavorEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorGolesAFavor);

        listaClasificacionSegunda();
    }

    /**
     * Método que utiliza el comparadorPorGolesEnContra para ordenar la clasificación del ArrayList clasificacionSegunda
     */
    public void ordenacionPorGolesEnContraEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorGolesEnContra);

        listaClasificacionSegunda();
    }

    /**
     * Método que utiliza el comparadorPorDiferenciaDeGoles para ordenar la clasificación del ArrayList clasificacionSegunda
     */
    public void ordenacionPorDiferenciaDeGolesquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorDiferenciaDeGoles);

        listaClasificacionSegunda();
    }

    /**
     * Método que utiliza el comparadorPorPuntos para ordenar la clasificación del ArrayList clasificacionSegunda
     */
    public void ordenacionPorPuntosEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorPuntos);

        listaClasificacionSegunda();
    }
}
