package com.company.Model;

import java.util.*;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class Equipo {
   private String nombreEquipo;
   private String presidente;
   private String entrenador;
   private String estadio;
   private int añoFundacion;
   private Competicion competicion;
   private ArrayList<Jugador> jugadores;
   private String nombreCompeticion;


   // Constructores

   public Equipo() {
   }


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


   public ArrayList<Jugador> getJugadores() {
      return jugadores;
   }

   public void setJugadores(ArrayList<Jugador> jugadores) {
      this.jugadores = jugadores;
   }

   public String getNombreCompeticion() {
      return nombreCompeticion;
   }

   public void setNombreCompeticion(String nombreCompeticion) {
      this.nombreCompeticion = nombreCompeticion;
   }

   @Override
   public String toString() {
      return "Equipo{" +
              "nombreEquipo='" + nombreEquipo + '\'' +
              ", presidente='" + presidente + '\'' +
              ", entrenador='" + entrenador + '\'' +
              ", estadio='" + estadio + '\'' +
              ", añoFundacion=" + añoFundacion +
              ", competicion=" + competicion +
              '}';
   }



   // Comparadores

   /**
    * Ordena y muestra todos los equipos por su nombre
    */
   public static Comparator<Equipo> comparadorPorNombre = new Comparator<Equipo>() {
      @Override
      public int compare(Equipo equipo1, Equipo equipo2) {
         int res;

         res = equipo1.getNombreEquipo().compareToIgnoreCase(equipo2.getNombreEquipo());
         return res;
      }
   };

   public static Comparator<Equipo> comparadorPorEstadio = new Comparator<Equipo>() {
      @Override
      public int compare(Equipo equipo1, Equipo equipo2) {
         int res;

         res = equipo1.getEstadio().compareToIgnoreCase(equipo2.getEstadio());
         return res;
      }
   };

   public static Comparator<Equipo> comparadorPorCompeticion = new Comparator<Equipo>() {
      @Override
      public int compare(Equipo equipo1, Equipo equipo2) {
         int res;

         res = equipo1.getCompeticion().compareTo(equipo2.getCompeticion());
         return res;
      }
   };



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