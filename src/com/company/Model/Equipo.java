package com.company.Model;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class Equipo extends Jugador{
   private String nombreEquipo;
   private String presidente;
   private String entrenador;
   private String estadio;
   private int añoFundacion;
   private int puntos;
   private Competicion competicion;


   // Constructores

   public Equipo() {
   }

   public Equipo(String nombreEquipo, String presidente, String entrenador, String estadio, int añoFundacion, int puntos, Competicion competicion) {
      this.setNombreEquipo(nombreEquipo);
      this.setPresidente(presidente);
      this.setEntrenador(entrenador);
      this.setEstadio(estadio);
      this.setAñoFundacion(añoFundacion);
      this.setPuntos(puntos);
      this.setCompeticion(competicion);
   }

   // Accesores


   public String getNombreEquipo() {
      return nombreEquipo;
   }

   public void setNombreEquipo(String nombreEquipo) {
      this.nombreEquipo = nombreEquipo;
   }

   public String getPresidente() {
      return presidente;
   }

   public void setPresidente(String presidente) {
      this.presidente = presidente;
   }

   public String getEntrenador() {
      return entrenador;
   }

   public void setEntrenador(String entrenador) {
      this.entrenador = entrenador;
   }

   public String getEstadio() {
      return estadio;
   }

   public void setEstadio(String estadio) {
      this.estadio = estadio;
   }

   public int getAñoFundacion() {
      return añoFundacion;
   }

   public void setAñoFundacion(int añoFundacion) {
      this.añoFundacion = añoFundacion;
   }

   public int getPuntos() {
      return puntos;
   }

   public void setPuntos(int puntos) {
      this.puntos = puntos;
   }

   public Competicion getCompeticion() {
      return competicion;
   }

   public void setCompeticion(Competicion competicion) {
      this.competicion = competicion;
   }

   public int getDiferenciaDeGoles() {
      return getGoles() - getGolesRecibidos();
   }


   @Override
   public String toString() {
      return "Equipo{" +
              "nombreEquipo='" + nombreEquipo + '\'' +
              ", presidente='" + presidente + '\'' +
              ", entrenador='" + entrenador + '\'' +
              ", estadio='" + estadio + '\'' +
              ", añoFundacion=" + añoFundacion +
              ", puntos=" + puntos +
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

   public static Comparator<Equipo> comparadorPorCompeticion = new Comparator<Equipo>() {
      @Override
      public int compare(Equipo equipo1, Equipo equipo2) {
         int res;

         res = equipo1.getCompeticion().compareTo(equipo2.getCompeticion());
         return res;
      }
   };

   public static Comparator<Equipo> comparadorPorPuntos = new Comparator<Equipo>() {
      @Override
      public int compare(Equipo equipo1, Equipo equipo2) {
         return (equipo2.getPuntos() - equipo1.getPuntos());
      }
   };

   public static Comparator<Equipo> comparadorPorGolesAFavor = new Comparator<Equipo>() {
      @Override
      public int compare(Equipo equipo1, Equipo equipo2) {
         return (equipo2.getGoles() - equipo1.getGoles());
      }
   };

   public static Comparator<Equipo> comparadorPorGolesEnContra = new Comparator<Equipo>() {
      @Override
      public int compare(Equipo equipo1, Equipo equipo2) {
         return (equipo2.getGolesRecibidos() - equipo1.getGolesRecibidos());
      }
   };

   public static Comparator<Equipo> comparadorPorDiferenciaDeGoles = new Comparator<Equipo>() {
      @Override
      public int compare(Equipo equipo1, Equipo equipo2) {
         return (equipo2.getDiferenciaDeGoles() - equipo1.getDiferenciaDeGoles());
      }
   };

   public static Comparator<Equipo> comparadorPorTarjetasAmarillas = new Comparator<Equipo>() {
      @Override
      public int compare(Equipo equipo1, Equipo equipo2) {
         return (equipo2.getTarjetasAmarillas() - equipo1.getTarjetasAmarillas());
      }
   };

   public static Comparator<Equipo> comparadorPorTarjetasRojas = new Comparator<Equipo>() {
      @Override
      public int compare(Equipo equipo1, Equipo equipo2) {
         return (equipo2.getTarjetasRoja() - equipo1.getTarjetasRoja());
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
