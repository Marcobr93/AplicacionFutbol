package com.company.Model;

import java.security.PublicKey;
import java.util.Comparator;
import java.util.Objects;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class Jugador implements Comparable<Jugador>, Comparator<Jugador>{
   protected String nombreJugador;
   protected Posicion posicion;
   protected Boolean capitan;
   protected double altura;
   protected double peso;
   protected int dorsal;
   protected int edad;
   protected int partidosJugados;
   protected int tarjetasAmarillas;
   protected int tarjetasRoja;
   protected int goles;
   protected int golesEnPropia;
   protected int golesRecibidos;


   // Constructores

   public Jugador() {
   }

   public Jugador(String nombreJugador, Posicion posicion, Boolean capitan, double altura, double peso, int dorsal, int edad, int partidosJugados, int tarjetasAmarillas, int tarjetasRoja, int goles, int golesEnPropia, int golesRecibidos) {
      this.setNombreJugador(nombreJugador);
      this.setPosicion(posicion);
      this.setCapitan(capitan);
      this.setAltura(altura);
      this.setPeso(peso);
      this.setDorsal(dorsal);
      this.setEdad(edad);
      this.setPartidosJugados(partidosJugados);
      this.setTarjetasAmarillas(tarjetasAmarillas);
      this.setTarjetasRoja(tarjetasRoja);
      this.setGoles(goles);
      this.setGolesEnPropia(golesEnPropia);
      this.setGolesRecibidos(golesRecibidos);
   }


// Accesores


   public String getNombreJugador() {
      return nombreJugador;
   }

   public void setNombreJugador(String nombreJugador) {
      this.nombreJugador = nombreJugador;
   }

   public Posicion getPosicion() {
      return posicion;
   }

   public void setPosicion(Posicion posicion) {
      this.posicion = posicion;
   }

   public Boolean getCapitan() {
      return capitan;
   }

   public void setCapitan(Boolean capitan) {
      this.capitan = capitan;
   }

   public double getAltura() {
      return altura;
   }

   public void setAltura(double altura) {
      this.altura = altura;
   }

   public double getPeso() {
      return peso;
   }

   public void setPeso(double peso) {
      this.peso = peso;
   }

   public int getDorsal() {
      return dorsal;
   }

   public void setDorsal(int dorsal) {
      this.dorsal = dorsal;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public int getPartidosJugados() {
      return partidosJugados;
   }

   public void setPartidosJugados(int partidosJugados) {
      this.partidosJugados = partidosJugados;
   }

   public int getTarjetasAmarillas() {
      return tarjetasAmarillas;
   }

   public void setTarjetasAmarillas(int tarjetasAmarillas) {
      this.tarjetasAmarillas = tarjetasAmarillas;
   }

   public int getTarjetasRoja() {
      return tarjetasRoja;
   }

   public void setTarjetasRoja(int tarjetasRoja) {
      this.tarjetasRoja = tarjetasRoja;
   }

   public int getGoles() {
      return goles;
   }

   public void setGoles(int goles) {
      this.goles = goles;
   }

   public int getGolesEnPropia() {
      return golesEnPropia;
   }

   public void setGolesEnPropia(int golesEnPropia) {
      this.golesEnPropia = golesEnPropia;
   }

   public int getGolesRecibidos() {
      return golesRecibidos;
   }

   public void setGolesRecibidos(int golesRecibidos) {
      this.golesRecibidos = golesRecibidos;
   }

   @Override
   public String toString() {
      return "Jugador{" +
              "nombreJugador='" + nombreJugador + '\'' +
              ", posicion=" + posicion +
              ", capitan=" + capitan +
              ", altura=" + altura +
              ", peso=" + peso +
              ", dorsal=" + dorsal +
              ", edad=" + edad +
              ", partidosJugados=" + partidosJugados +
              ", tarjetasAmarillas=" + tarjetasAmarillas +
              ", tarjetasRoja=" + tarjetasRoja +
              ", goles=" + goles +
              ", golesEnPropia=" + golesEnPropia +
              ", golesRecibidos=" + golesRecibidos +
              '}';
   }

   // Comparadores

   @Override
   public int compareTo(Jugador jugador) {
      return Integer.compare(this.getDorsal(), jugador.getDorsal());
   }

   @Override
   public int compare(Jugador j1, Jugador j2) {
      int res;

      res = j1.getNombreJugador().compareToIgnoreCase(j2.getNombreJugador());
      if(res != 0){
         return res;
      }
      return Integer.compare(j1.getDorsal(), j2.getDorsal());
   }


   public static Comparator<Jugador> comparadorPorPosicion = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return 0;
      }
   };

   public static Comparator<Jugador> comparadorPorDorsal = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getDorsal() - j1.getDorsal());
      }
   };

   public static Comparator<Jugador> comparadorPorAltura = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (int)(j2.getAltura() - j1.getAltura());
      }
   };

   public static Comparator<Jugador> comparadorPorPeso = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (int)(j2.getPeso() - j1.getPeso());
      }
   };

   public static Comparator<Jugador> comparadorPorEdad = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (int)(j2.getEdad() - j1.getAltura());
      }
   };

   public static Comparator<Jugador> comparadorPorPartidosJugados = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getPartidosJugados() - j1.getPartidosJugados());
      }
   };

   public static Comparator<Jugador> comparadorPorTarjetasAmarillas = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getTarjetasAmarillas() - j1.getTarjetasAmarillas());
      }
   };

   public static Comparator<Jugador> comparadorPorTarjetasRojas = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getTarjetasRoja() - j1.getTarjetasRoja());
      }
   };

   public static Comparator<Jugador> comparadorPorGoles = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getGoles() - j1.getGoles());
      }
   };

   public static Comparator<Jugador> comparadorPorGolesEnPropia = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getGolesEnPropia() - j1.getGolesEnPropia());
      }
   };

   public static Comparator<Jugador> comparadorPorGolesRecibidos = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getGolesRecibidos() - j1.getGolesRecibidos());
      }
   };

   @Override
   public boolean equals(Object obj) {
      if( this == obj ) { return true; }

      if ( obj == null ) { return false; }

      if ( this.getClass() != obj.getClass() ) { return false; }

      Jugador j = (Jugador) obj;

      // Se consideran dos jugadores iguales si tienen el mismo nombre
      return Objects.equals(this.getNombreJugador(), j.getNombreJugador());
   }

}
