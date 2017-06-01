package com.company.Model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by marco on 29/05/2017.
 */
public class MenuClasificacion {

    public ArrayList<Equipo> equipos = new ArrayList<>();
    public ArrayList<Clasificacion> clasificacion = new ArrayList<>();
    public ArrayList<Clasificacion> clasificacionPrimera = new ArrayList<>();
    public ArrayList<Clasificacion> clasificacionSegunda = new ArrayList<>();

    // Constructores


    public MenuClasificacion() {
    }

    public MenuClasificacion(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }


    // Métodos

    public void añadirClasificacionPrimeraOSegunda(){
        for (Clasificacion clasificacion: clasificacion) {
            if (clasificacion.getCompeticion().equals(Competicion.PRIMERA)){
                clasificacionPrimera.add(clasificacion);
            }else if (clasificacion.getCompeticion().equals(Competicion.SEGUNDA)){
                clasificacionSegunda.add(clasificacion);
            }
        }
    }


    public void listaClasificacionPrimera(){
        int indice = 1;

        for (Clasificacion clasificacion: clasificacionPrimera) {
            System.out.println((indice++) + " - " + clasificacion);
        }
    }

    public void listaClasificacionSegunda(){
        int indice = 1;

        for (Clasificacion clasificacion: clasificacionSegunda) {
            System.out.println((indice++) + " - " + clasificacion);
        }
    }

    // Ordenación Primera

    public void ordenacionPorNombreEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorNombreEquipo);

        listaClasificacionPrimera();
    }

    public void ordenacionPorPartidosJugadosEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorPartidosJugados);

        listaClasificacionPrimera();
    }

    public void ordenacionPorPartidosGanadosEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorPartidosGanados);

        listaClasificacionPrimera();
    }

    public void ordenacionPorPartidosEmpatadosEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorPartidosEmpatados);

        listaClasificacionPrimera();
    }

    public void ordenacionPorPartidosPerdidosEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorPartidosPerdidos);

        listaClasificacionPrimera();
    }

    public void ordenacionPorGolesAFavorEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorGolesAFavor);

        listaClasificacionPrimera();
    }

    public void ordenacionPorGolesEnContraEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorGolesEnContra);

        listaClasificacionPrimera();
    }

    public void ordenacionPorDiferenciaDeGolesquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorDiferenciaDeGoles);

        listaClasificacionPrimera();
    }

    public void ordenacionPorPuntosEquipoPrimera(){
        Collections.sort(clasificacionPrimera, Clasificacion.comparadorPorPuntos);

        listaClasificacionPrimera();
    }




    // Ordenación Segunda

    public void ordenacionPorNombreEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorNombreEquipo);

        listaClasificacionSegunda();
    }

    public void ordenacionPorPartidosJugadosEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorPartidosJugados);

        listaClasificacionSegunda();
    }

    public void ordenacionPorPartidosGanadosEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorPartidosGanados);

        listaClasificacionSegunda();
    }

    public void ordenacionPorPartidosEmpatadosEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorPartidosEmpatados);

        listaClasificacionSegunda();
    }

    public void ordenacionPorPartidosPerdidosEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorPartidosPerdidos);

        listaClasificacionSegunda();
    }

    public void ordenacionPorGolesAFavorEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorGolesAFavor);

        listaClasificacionSegunda();
    }

    public void ordenacionPorGolesEnContraEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorGolesEnContra);

        listaClasificacionSegunda();
    }

    public void ordenacionPorDiferenciaDeGolesquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorDiferenciaDeGoles);

        listaClasificacionSegunda();
    }

    public void ordenacionPorPuntosEquipoSegunda(){
        Collections.sort(clasificacionSegunda, Clasificacion.comparadorPorPuntos);

        listaClasificacionSegunda();
    }

}
