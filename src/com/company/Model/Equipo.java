package com.company.Model;

import java.io.Serializable;
import java.util.*;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class Equipo implements Serializable{

   private static final long serialVersionUID = -6178202918471031872L;
   private String nombreEquipo;                 // nombre del equipo
   private String presidente;                   // nombre del presidente del equipo
   private String entrenador;                   // nombre del entrenador del equipo
   private String estadio;                      // nombre del estadio del equipo
   private int añoFundacion;                    // año de fundación del equipo
   private Competicion competicion;             // competición que disputa el equipo
   private String nombreCompeticion;            // nombre de la competición que disputa el equipo


   // Constructores

   /**
    * Constructor por defecto
    */
   public Equipo() {
   }

   /**
    * Constructor con todos los atributos
    * @param nombreEquipo
    * @param presidente
    * @param entrenador
    * @param estadio
    * @param añoFundacion
    * @param competicion
    */
   public Equipo(String nombreEquipo, String presidente, String entrenador, String estadio, int añoFundacion, Competicion competicion) {
      this.setNombreEquipo(nombreEquipo);
      this.setPresidente(presidente);
      this.setEntrenador(entrenador);
      this.setEstadio(estadio);
      this.setAñoFundacion(añoFundacion);
      this.setCompeticion(competicion);
   }


   // Accesores


   public String getNombreEquipo() {
      return nombreEquipo;
   }

   public void setNombreEquipo(String nombreEquipo) {
      if (nombreEquipo.equals("")) {
         this.nombreEquipo = "Desconocido";
      }else {
         this.nombreEquipo = nombreEquipo;
      }
   }

   public String getPresidente() {
      return presidente;
   }

   public void setPresidente(String presidente) {
      if (presidente.equals("")) {
         this.presidente = "Desconocido";
      }else {
         this.presidente = presidente;
      }
   }

   public String getEntrenador() {
      return entrenador;
   }

   public void setEntrenador(String entrenador) {
      if (entrenador.equals("")) {
         this.entrenador = "Desconocido";
      }else {
         this.entrenador = entrenador;
      }
   }

   public String getEstadio() {
      return estadio;
   }

   public void setEstadio(String estadio) {
      if (estadio.equals("")) {
         this.estadio = "Desconocido";
      }else {
         this.estadio = estadio;
      }
   }

   public int getAñoFundacion() {
      return añoFundacion;
   }

   public void setAñoFundacion(int añoFundacion) {
      if ( añoFundacion < 1880 || añoFundacion > 2017){
         this.añoFundacion = 1950;
      }else{
         this.añoFundacion = añoFundacion;
      }
   }


   public Competicion getCompeticion() {
      return competicion;
   }

   public void setCompeticion(Competicion competicion) {
      this.competicion = competicion;
   }

   public String getNombreCompeticion() {
      return nombreCompeticion;
   }

   public void setNombreCompeticion(String nombreCompeticion) {
      this.nombreCompeticion = nombreCompeticion;
   }

   @Override
   public String toString() {
      return   "Nombre del equipo: "
              + nombreEquipo + '\'' +
              ",  Presidente: '" + presidente + '\'' +
              ",  Entrenador: '" + entrenador + '\'' +
              ",  Estadio: '" + estadio + '\'' +
              ",  Año de fundacion: " + añoFundacion +
              ",  Competición: '" + competicion + '\'' +
              '.';
   }

   /**
    *
    * @param obj
    * @return Se consideran dos equipos iguales si tienen el mismo nombre
    */
   @Override
   public boolean equals(Object obj) {
      if( this == obj ) { return true; }

      if ( obj == null ) { return false; }

      if ( this.getClass() != obj.getClass() ) { return false; }

      Equipo equipo = (Equipo) obj;

      // Se consideran dos equipos iguales si tienen el mismo nombre
      return Objects.equals(this.getNombreEquipo(), equipo.getNombreEquipo());
   }

}