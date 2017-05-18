package com.company.Model;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class Equipo extends Jugador{
   protected String nombreEquipo;
   protected String presidente;
   protected String entrenador;
   protected String estadio;
   protected int añoFundacion;

   // Constructores

   public Equipo() {
   }

   public Equipo(String nombreEquipo, String presidente, String entrenador, String estadio, int añoFundacion) {
      this.setNombreEquipo(nombreEquipo);
      this.setPresidente(presidente);
      this.setEntrenador(entrenador);
      this.setEstadio(estadio);
      this.setAñoFundacion(añoFundacion);
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
}
