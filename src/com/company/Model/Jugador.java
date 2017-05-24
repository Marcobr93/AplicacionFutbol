package com.company.Model;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class Jugador implements Comparable<Jugador>, Comparator<Jugador>{
   private String nombreJugador;
   private String apellidosJugador;
   private Posicion posicion;
   private boolean capitan;
   private double altura;
   private double peso;
   private int dorsal;
   private int edad;
   private int partidosJugados;
   private int tarjetasAmarillas;
   private int tarjetasRoja;
   private int goles;
   private int golesEnPropia;
   private int golesRecibidos;
   private int asistencias;
   private String equipo;


   // Constructores

   /**
    * Constructor por defecto
    */
   public Jugador() {
   }

   /**
    * Constructor sin el atributo capitán y posición que son los que no puede introducir el usuario por pantalla
    * @param nombreJugador
    * @param apellidosJugador
    * @param altura
    * @param peso
    * @param dorsal
    * @param edad
    * @param partidosJugados
    * @param tarjetasAmarillas
    * @param tarjetasRoja
    * @param goles
    * @param golesEnPropia
    * @param golesRecibidos
    * @param asistencias
    */
   public Jugador(String nombreJugador, String apellidosJugador, double altura, double peso, int dorsal, int edad, int partidosJugados, int tarjetasAmarillas, int tarjetasRoja, int goles, int golesEnPropia, int golesRecibidos, int asistencias) {
      this.setNombreJugador(nombreJugador);
      this.setApellidosJugador(apellidosJugador);
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
      this.setAsistencias(asistencias);
   }

   /**
    * Constructor con todos los atributos
    * @param nombreJugador
    * @param apellidosJugador
    * @param posicion
    * @param capitan
    * @param altura
    * @param peso
    * @param dorsal
    * @param edad
    * @param partidosJugados
    * @param tarjetasAmarillas
    * @param tarjetasRoja
    * @param goles
    * @param golesEnPropia
    * @param golesRecibidos
    * @param asistencias
    */
   public Jugador(String nombreJugador, String apellidosJugador, Posicion posicion, boolean capitan, double altura, double peso, int dorsal, int edad, int partidosJugados, int tarjetasAmarillas, int tarjetasRoja, int goles, int golesEnPropia, int golesRecibidos, int asistencias, String equipo) {
      this.setNombreJugador(nombreJugador);
      this.setApellidosJugador(apellidosJugador);
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
      this.setAsistencias(asistencias);
      this.setEquipo(equipo);
   }


   // Accesores


   public String getNombreJugador() {
      return nombreJugador;
   }

   public void setNombreJugador(String nombreJugador) {
      if (nombreJugador.equals("")) {
         this.nombreJugador = "Desconocido";
      }else {
         this.nombreJugador = nombreJugador;
      }
   }

   public String getApellidosJugador() {
      return apellidosJugador;
   }

   public void setApellidosJugador(String apellidoJugador) {
      if (apellidoJugador.equals("")) {
         this.apellidosJugador = "Desconocido";
      }else {
         this.apellidosJugador = apellidoJugador;
      }
   }

   public Posicion getPosicion() {
      return posicion;
   }

   public void setPosicion(Posicion posicion) {
      this.posicion = posicion;
   }

   public boolean isCapitan() {
      return capitan;
   }

   public void setCapitan(boolean capitan) {
      this.capitan = capitan;
   }

   public double getAltura() {
      return altura;
   }

   public void setAltura(double altura) {
      if (altura <= 0) {
         this.altura = 1.70;
      }else {
         this.altura = altura;
      }
   }

   public double getPeso() {
      return peso;
   }

   public void setPeso(double peso) {
      if (peso <= 0){
         this.peso = 50.00;
      }else{
         this.peso = peso;
      }
   }

   public int getDorsal() {
      return dorsal;
   }

   public void setDorsal(int dorsal) {
      if ( dorsal < 0 || dorsal > 99){
         this.dorsal = 50;
      }else{
         this.dorsal = dorsal;
      }
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      if (edad <= 16 || edad > 50){
         this.edad = 20;
      }else{
         this.edad = edad;
      }
   }

   public int getPartidosJugados() {
      return partidosJugados;
   }

   public void setPartidosJugados(int partidosJugados) {
      if (partidosJugados < 0){
         this.partidosJugados = 0;
      }else{
         this.partidosJugados = partidosJugados;
      }
   }

   public int getTarjetasAmarillas() {
      return tarjetasAmarillas;
   }

   public void setTarjetasAmarillas(int tarjetasAmarillas) {
      if (tarjetasAmarillas < 0){
         this.tarjetasAmarillas = 0;
      }else{
         this.tarjetasAmarillas = tarjetasAmarillas;
      }
   }

   public int getTarjetasRoja() {
      return tarjetasRoja;
   }

   public void setTarjetasRoja(int tarjetasRoja) {
      if (tarjetasRoja < 0){
         this.tarjetasRoja = 0;
      }else{
         this.tarjetasRoja = tarjetasRoja;
      }
   }

   public int getGoles() {
      return goles;
   }

   public void setGoles(int goles) {
      if (goles < 0){
         this.goles = 0;
      }else{
         this.goles = goles;
      }
   }

   public int getGolesEnPropia() {
      return golesEnPropia;
   }

   public void setGolesEnPropia(int golesEnPropia) {
      if (golesEnPropia < 0){
         this.golesEnPropia = 0;
      }else {
         this.golesEnPropia = golesEnPropia;
      }
   }

   public int getGolesRecibidos() {
      return golesRecibidos;
   }

   public void setGolesRecibidos(int golesRecibidos) {
      if (golesRecibidos < 0){
         this.golesRecibidos = 0;
      }else {
         this.golesRecibidos = golesRecibidos;
      }
   }

   public int getAsistencias() {
      return asistencias;
   }

   public void setAsistencias(int asistencias) {
      if (asistencias < 0){
         this.asistencias = 0;
      }else {
         this.asistencias = asistencias;
      }
   }

   public String getEquipo() {
      return equipo;
   }

   public void setEquipo(String equipo) {
      this.equipo = equipo;
   }

   @Override
   public String toString() {
      return "Jugador{" +
              "nombreJugador='" + nombreJugador + '\'' +
              ", posicion=" + posicion +
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

   /**
    * Compara para saber si dos jugadores son iguales, utiliza primero el nombre y en caso de que sean iguales,
    * utiliza el dorsal
    * @param j1
    * @param j2
    * @return
    */
   @Override
   public int compare(Jugador j1, Jugador j2) {
      int res;

      res = j1.getNombreJugador().compareToIgnoreCase(j2.getNombreJugador());
      if(res != 0){
         return res;
      }
      return Integer.compare(j1.getDorsal(), j2.getDorsal());
   }


   /**
    * Compara a los jugadores por su nombre
    */
   public static Comparator<Jugador> comparadorPorNombre = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador jugador1, Jugador jugador2) {
         int res = jugador1.getNombreJugador().compareToIgnoreCase(jugador2.getNombreJugador());
         return res;
      }
   };

   /**
    * Compara a los jugadores por sus apellidos
    */
   public static Comparator<Jugador> comparadorPorApellidos = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador jugador1, Jugador jugador2) {
         int res = jugador1.getApellidosJugador().compareToIgnoreCase(jugador2.getApellidosJugador());
         return res;
      }
   };

   /**
    * Compara a los jugadores por su posición
    */
   public static Comparator<Jugador> comparadorPorPosicion = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador jugador1, Jugador jugador2) {
         int res = jugador1.getPosicion().compareTo(jugador2.getPosicion());
         return res;
      }
   };

   /**
    * Compara a los jugadores por su dorsal
    */
   public static Comparator<Jugador> comparadorPorDorsal = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getDorsal() - j1.getDorsal());
      }
   };

   /**
    * Compara a los jugadores por su altura
    */
   public static Comparator<Jugador> comparadorPorAltura = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (int)(j2.getAltura() - j1.getAltura());
      }
   };

   /**
    * Compara a los jugadores por su peso
    */
   public static Comparator<Jugador> comparadorPorPeso = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (int)(j2.getPeso() - j1.getPeso());
      }
   };

   /**
    * Compara a los jugadores por su edad
    */
   public static Comparator<Jugador> comparadorPorEdad = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (int)(j2.getEdad() - j1.getAltura());
      }
   };

   /**
    * Compara a los jugadores por los partidos jugados
    */
   public static Comparator<Jugador> comparadorPorPartidosJugados = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getPartidosJugados() - j1.getPartidosJugados());
      }
   };

   /**
    * Compara a los jugadores por las tarjetas amarillas que tienen
    */
   public static Comparator<Jugador> comparadorPorTarjetasAmarillas = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getTarjetasAmarillas() - j1.getTarjetasAmarillas());
      }
   };

   /**
    * Compara a los jugadores por las tarjetas rojas que tienen
    */
   public static Comparator<Jugador> comparadorPorTarjetasRojas = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getTarjetasRoja() - j1.getTarjetasRoja());
      }
   };

   /**
    * Compara a los jugadores por los goles que han marcado
    */
   public static Comparator<Jugador> comparadorPorGoles = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getGoles() - j1.getGoles());
      }
   };

   /**
    * Compara a los jugadores por los goles en propia que han hecho
    */
   public static Comparator<Jugador> comparadorPorGolesEnPropia = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getGolesEnPropia() - j1.getGolesEnPropia());
      }
   };

   /**
    * Compara a los jugadores(porteros) por los goles recibidos
    */
   public static Comparator<Jugador> comparadorPorGolesRecibidos = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getGolesRecibidos() - j1.getGolesRecibidos());
      }
   };
   /**
    * Compara las asistencias de los jugadores
    */
   public static Comparator<Jugador> comparadorPorAsistencias = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador j1, Jugador j2) {
         return (j2.getAsistencias() - j1.getAsistencias());
      }
   };

   /**
    * Comparalos equipos de los jugadores
    */
   public static Comparator<Jugador> comparadorPorEquipo = new Comparator<Jugador>() {
      @Override
      public int compare(Jugador jugador1, Jugador jugador2) {
         int res = jugador1.getEquipo().compareToIgnoreCase(jugador2.getEquipo());
         return res;
      }
   };


   /**
    *
    * @param obj
    * @return Se consideran dos jugadores iguales si tienen el mismo dorsal
    */
   @Override
   public boolean equals(Object obj) {
      if( this == obj ) { return true; }

      if ( obj == null ) { return false; }

      if ( this.getClass() != obj.getClass() ) { return false; }

      Jugador jugador = (Jugador) obj;

      return Objects.equals(this.getDorsal(), jugador.getDorsal());
   }

}
