package com.company.Controller;

import com.company.Model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by MarcoAntonio on 15/05/2017.
 */
public class FutbolApp {

    public ArrayList<Equipo> equipos = new ArrayList<>();


     MenuEquipo menuEquipo;
     MenuJugador menuJugador;
     MenuPartido menuPartido;
     MenuClasificacion menuClasificacion;


    public FutbolApp() {
        menuEquipo = new MenuEquipo(equipos);
        menuJugador = new MenuJugador(equipos);
        menuPartido = new MenuPartido(equipos);
        menuClasificacion = new MenuClasificacion(equipos);

        cargarEquipos();
        cargarJugadores();
        cargarPartidos();
        cargarClasificación();

        menuEquipo.añadirPrimeraOSegunda();
        menuPartido.añadirPartidoPrimeraOSegunda();
        menuClasificacion.añadirClasificacionPrimeraOSegunda();
        menuJugador.añadirJugadoresPrimeraSegunda();
        menuJugador.añadirPorteroPrimera();
        menuJugador.añadirPorteroSegunda();

    }

    private void cargarEquipos() {
        menuEquipo.equipos.add(new Equipo("Real Madrid", "Florentino Pérez", "Zinedine Zidane", "Santiago Bernabéu", 1902, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Barcelona", "Bartomeu", "Luis Enrique", "Campo Nuevo", 1899,  Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Atlético de Madrid", "Enrique Cerezo", "Diego Simeone", "Vicente Calderón", 1903, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Sevilla", "José Castro Carmona", "Sampaoli", "Ramón Sánchez-Pizjuán", 1905,  Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Villarreal", "Fernando Roig", "Fran Escribá", "Estadio de la Cerámica", 1923, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Real Sociedad", "Jokin Aperribay", "Eusebio Sacristán", "Anoeta", 1909,  Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Athletic", "Josu Urrutia", "Ernesto Valverde", "San Mamés", 1898, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Espanyol", "Chen Yansheng", "Quique Sánchez Flores", "RCDE Stadium", 1900,  Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Alavés", "Saski Baskonia", "Alfonso Fernández de Trocóniz", "Mendizorroza", 1921, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Eibar", "Amaia Gorostiza", "José Luis Mendilibar", "Ipurua", 1940,  Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Málaga", "Abdullah Al Thani", "Míchel", "La Rosaleda", 1904, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Valencia", "José Ramón Alesanco", "Marcelino García Toral", "Mestalla", 1919,  Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Celta", "Carlos Mouriño", "Juan Carlos Unzué", "Balaídos", 1923, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Las Palmas", "Miguel Ángel Ramírez", "Quique Setién", "Estadio de Gran Canaria", 1949,  Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Betis", "Ángel Haro", "Víctor Sánchez Del Amo", "Benito Villamarín", 1907, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Deportivo", "Tino Fernández", " Pepe Mel", "Riazor", 1906,  Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Leganés", "María Victoria Pavón", " Asier Garitano", "Municipal de Butarque", 1928, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Sporting", "Javier Fernández Rodríguez", "Rubi", "El Molinón", 1905,  Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Osasuna", "Luis Sabalza", "Petar Vasiljević", "El Sadar", 1920, Competicion.PRIMERA));
        menuEquipo.equipos.add(new Equipo("Granada", "Jiang Lizhang", "Tony Adams", "Nuevo Los Cármenes", 1931,  Competicion.PRIMERA));


        menuEquipo.equipos.add(new Equipo("Levante", "Quico Catalán", "Juan Ramón López Muñiz", "Ciudad de Valencia", 1909,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Girona", "Delfi Geli", " Pablo Machín", "Municipal de Montilivi", 1930,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Getafe", "Ángel Torres", " José Bordalás", "Coliseum Alfonso Pérez", 1946,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Tenerife", "Miguel Concepción", "José Luis Martí", "Heliodoro Rodríguez López", 1922,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Cádiz", "Manuel Vizcaíno", "Álvaro Cervera", "Ramón de Carranza", 1910,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Valladolid", "Carlos Suárez Sureda", "Paco Herrera", "José Zorrilla", 1928,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Huesca", "Agustín Lasaosa", " Emilio Vega", "El Alcoraz", 1960,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Real Oviedo", "Jorge Menéndez Vallina", "Fernando Hierro", "Carlos Tartiere", 1926,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Sevilla Atlético", "José Castro Carmona", "Diego Martínez Penas", "Ramón Sánchez-Pizjuán", 1950,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Reus", "Xavier Llastarri", "Natxo González", "Campo Nuevo Municipal", 1909,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Lugo", "Tino Saqués", "Luis César Sampedro", "Anxo Carro", 1953,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Rayo Vallecano", "Raúl Martín Presa", "Míchel", "Estadio de Vallecas", 1924,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Córdoba", "Alejandro González", " Luis Carrión", "Nuevo Arcángel", 1928,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Numancia", "Francisco Rubio Garcés", "Jagoba Arrasate", "Nuevo Los Pajaritos", 1945,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Zaragoza", "Christian Lapetra", "César Láinez", "La Romareda", 1932,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("UCAM", "José Luis Mendoza", "Francisco Rodríguez Vílchez", "La Condomina", 1999,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Almería", "Alfonso García Gabarrón", "Luis Miguel Ramis", "Estadio de los Juegos Mediterráneos", 1989,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Gimnàstic", "Josep Mª Andreu", "Juan Merino", "Nuevo Estadio", 1886,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Alcorcón", "Ignacio Legido", "Julio Velázquez", "Santo Domingo", 1971,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Mallorca", "Monti Galmés", "Sergi Barjuán", "Iberostar Estadi", 1916,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Elche", "Helike Sport Management", "Vicente Parras Campello", "Martínez Valero", 1922,  Competicion.SEGUNDA));
        menuEquipo.equipos.add(new Equipo("Mirandés", "Alfredo de Miguel", "Pablo Alfaro", "Anduva", 1927,  Competicion.SEGUNDA));
    }

    private void cargarJugadores() {
        menuJugador.jugadores.add(new Jugador("Keylor", "Navas", Posicion.Portero, false, 1.85, 78.00, 1, 30, 27, 2, 0, 0, 0, 31, 0, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Kiko", "Casilla", Posicion.Portero, false, 1.91, 84.00, 13, 30, 11, 0, 0, 0, 0, 10, 0, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Rubén", "Yánez", Posicion.Portero, false, 1.90, 82.00, 25, 23, 0, 0, 0, 0, 0, 0, 0, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Daniel", "Carvajal", Posicion.LateralDerecho, false, 173, 73.00, 2, 25, 23, 9, 0, 0, 0, 0, 4, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Pepe", "Lima", Posicion.Central, false, 1.88, 81.00, 3, 34, 13, 1, 0, 2, 0, 0, 1, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Sergio", "Ramos", Posicion.Central, true, 1.83, 75.00, 4, 31, 28, 6, 1, 7, 0, 0,0 , "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Raphäel", "Varane", Posicion.Central, false, 1.91, 78.00, 5, 24, 23, 1, 0, 1, 0, 0, 1, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Nacho", "Fernández", Posicion.Central, false, 1.79, 75.00, 6, 27, 28, 5, 0, 2, 0, 0, 3, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Marcelo", "Vieira", Posicion.LateralIzquierdo, false, 1.74, 75.00, 12, 29, 30, 2, 0, 2, 0, 0, 9, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Fabio", "Coentrao", Posicion.LateralIzquierdo, false, 1.79, 70.00, 15, 29, 3, 0, 0, 0, 0, 0, 1, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Danilo", "Da Silva", Posicion.LateralDerecho, false, 1.84, 78.00, 23, 26, 17, 2, 0, 1, 0, 0, 2, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Toni", "Kroos", Posicion.Centrocampista, false, 1.82, 78.00, 8, 27, 29, 6, 0, 3, 0, 0, 11, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Carlos Henrique", "Casemiro", Posicion.Centrocampista, false, 1.84, 80.00, 14, 25, 25, 9, 0, 4, 0, 0, 0, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Mateo", "Kovacic", Posicion.Centrocampista, false, 1.78, 77.00, 16, 23, 27, 2, 0, 1, 0, 0, 3, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Luka", "Modric", Posicion.Centrocampista, false, 1.74, 75.00, 14, 32, 25, 2, 0, 1, 0, 0, 2, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("James", "Rodríguez", Posicion.MediaPunta, false, 1.80, 75.00, 10, 26, 22, 1, 0, 8, 0, 0, 6, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Marco", "Asensio", Posicion.MediaPunta, false, 1.80, 75.00, 20, 21, 23, 0, 0, 3, 0, 0, 1, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Isco", "Alarcón", Posicion.MediaPunta, false, 1.76, 74.00, 22, 25, 30, 4, 0, 10, 0, 0, 7, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Cristiano", "Ronaldo", Posicion.Extremo, false, 1.85, 80.00, 7, 32, 29, 4, 0, 25, 0, 0, 5, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Gareth", "Bale", Posicion.Extremo, false, 1.83, 74.00, 11, 28, 19, 3, 1, 7, 0, 0, 2, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Lucas", "Vázquez", Posicion.Extremo, false, 1.73, 70.00, 17, 26, 33, 4, 0, 2, 0, 0, 6, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Karim", "Benzema", Posicion.Delantero, false, 1.87, 79.00, 9, 30, 29, 0, 0, 11, 0, 0, 4, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Mariano", "Díaz", Posicion.Delantero, false, 1.78, 79.00, 18, 24, 8, 0, 0, 1, 0, 0, 0, "Real Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Álvaro", "Morata", Posicion.Delantero, false, 1.89, 85.00, 21, 25, 26, 8, 0, 15, 0, 0, 1, "Real Madrid",Competicion.PRIMERA));


        menuJugador.jugadores.add(new Jugador("Ter", "Stegen", Posicion.Portero, false, 1.87, 85.00, 1, 25, 36, 1, 0, 0, 0, 33, 0, "Barcelona",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Lionel", "Messi", Posicion.Delantero, false, 170, 72.00, 10, 30, 34, 6, 0, 37, 0, 0, 9, "Barcelona",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Jan", "Oblak", Posicion.Portero, false, 1.89, 82.00, 13, 24, 30, 2, 0, 0, 0, 21, 0, "Atlético de Madrid",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Antoine", "Griezmanm", Posicion.Delantero, false, 1.75, 72.00, 7, 26, 36, 3, 0, 16, 0, 0, 4, "Atlético de Madrid",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Sergio", "Rico", Posicion.Portero, false, 1.95, 90.00, 1, 23, 24, 2, 0, 0, 0, 15, 0, "Sevilla",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Samir", "Nasri", Posicion.Delantero, false, 1.75, 75.00, 10, 29, 23, 7, 0, 2, 0, 0, 3, "Sevilla",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Sergio", "Asenjo", Posicion.Portero, false, 1.82, 84.00, 1, 27, 35, 2, 0, 0, 0, 45, 0, "Villarreal",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Cédric", "Bakambu", Posicion.Delantero, false, 1.82, 74.00, 17, 26, 26, 5, 0, 11, 0, 0, 2, "Villarreal",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Gerónimo", "Rulli", Posicion.Portero, false, 1.89, 80.00, 1, 25, 38, 1, 0, 0, 0, 53, 0, "Real Sociedad",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("William José", "Da Silva", Posicion.Delantero, false, 1.86, 81.00, 12, 25, 28, 4, 0, 12, 0, 0, 2, "Real Sociedad",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Gorka", "Iraizoz", Posicion.Portero, true, 1.91, 87.00, 1, 36, 16, 1, 0, 0, 0, 21, 0, "Athletic",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Aritz", "Aduriz", Posicion.Delantero, false, 1.81, 75.00, 20, 36, 32, 9, 1, 16, 0, 0, 1, "Athletic",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Diego", "López", Posicion.Portero, false, 1.96, 88.00, 13, 35, 35, 3, 0, 0, 0, 38, 0, "Espanyol",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Leo", "Baptistao", Posicion.Delantero, false, 1.81, 71.00, 11, 24, 22, 1, 0, 6, 0, 0, 1, "Espanyol",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Fernando", "Pacheco", Posicion.Portero, false, 1.86, 81.00, 1, 25, 36, 1, 0, 0, 0, 42, 0, "Alavés",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Deyverson", "Silva", Posicion.Delantero, false, 1.85, 78.00, 20, 26, 32, 14, 0, 7, 0, 0, 2, "Alavés",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Yoel", "Rodríguez", Posicion.Portero, false, 1.85, 84.00, 1, 28, 25, 1, 1, 0, 0, 32, 0, "Eibar",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Sergi", "Enrich", Posicion.Delantero, false, 1.81, 77.00, 9, 27, 38, 4, 0, 11, 0, 0, 2, "Eibar",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Carlos", "Kameni", Posicion.Portero, false, 1.86, 86.00, 1, 33, 35, 1, 0, 0, 0, 48, 0, "Málaga",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Sandro", "Ramírez", Posicion.Delantero, false, 1.75, 71.00, 19, 21, 30, 3, 0, 14, 0, 0, 4, "Málaga",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Diego", "Alves", Posicion.Portero, false, 1.87, 83.00, 1, 3, 33, 4, 0, 0, 0, 56, 0, "Valencia",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Santi", "Mina", Posicion.Delantero, false, 1.77, 71.00, 22, 21, 29, 2, 0, 6, 0, 0, 2, "Valencia",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Sergio", "Álvarez", Posicion.Portero, false, 1.79, 75.00, 1, 30, 26, 0, 1, 0, 0, 51, 0, "Celta",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Iago", "Aspas", Posicion.Delantero, false, 1.76, 67.00, 10, 29, 32, 10, 1, 19, 0, 0, 6, "Celta",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Javi", "Varas", Posicion.Portero, false, 1.82, 73.00, 13, 34, 25, 0, 0, 0, 0, 45, 0, "Las Palmas",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Jonathan", "Viera", Posicion.Delantero, false, 1.70, 68.00, 21, 29, 31, 4, 0, 7, 0, 0, 1, "Las Palmas",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Antonio", "Adán", Posicion.Portero, false, 1.90, 88.00, 13, 30, 37, 5, 0, 0, 0, 62, 0, "Betis",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Rubén", "Castro", Posicion.Delantero, false, 1.74, 72.00, 24, 35, 35, 3, 0, 13, 0, 0, 2, "Betis",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Germán", "Lux", Posicion.Portero, false, 1.85, 79.00, 1, 34, 25, 5, 0, 0, 0, 38, 0, "Deportivo",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Joselu", "Sanmartín", Posicion.Delantero, false, 1.92, 80.00, 7, 27, 20, 7, 0, 5, 0, 0, 2, "Deportivo",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Iago", "Herrerín", Posicion.Portero, false, 1.87, 89.00, 13, 29, 21, 0, 1, 0, 0, 25, 0, "Leganés",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Luciano", "Rocha", Posicion.Delantero, false, 1.78, 79.00, 20, 24, 25, 3, 0, 4, 0, 0, 2, "Leganés",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Pichu", "Cuéllar", Posicion.Portero, false, 1.87, 82.00, 1, 33, 36, 4, 0, 0, 0, 69, 0, "Sporting",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Duje", "Cop", Posicion.Delantero, false, 1.85, 75.00, 24, 27, 31, 7, 0, 9, 0, 0, 0, "Sporting",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Salvatore", "Sirigu", Posicion.Portero, false, 1.92, 80.00, 25, 30, 20, 1, 1, 0, 0, 54, 0, "Osasuna",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Sergio", "León", Posicion.Delantero, false, 1.78, 73.00, 7, 28, 33, 4, 0, 10, 0, 0, 0, "Osasuna",Competicion.PRIMERA));

        menuJugador.jugadores.add(new Jugador("Francisco Guillermo", "Ochoa", Posicion.Portero, false, 1.85, 78.00, 13, 31, 38, 2, 0, 0, 0, 82, 0, "Granada",Competicion.PRIMERA));
        menuJugador.jugadores.add(new Jugador("Artem", "Kravets", Posicion.Delantero, false, 1.89, 78.00, 24, 27, 26, 2, 0, 5, 0, 0, 1, "Granada",Competicion.PRIMERA));




        menuJugador.jugadores.add(new Jugador("Paco", "wew erw", Posicion.Centrocampista, false, 1.89, 76.00, 5, 28, 32, 8, 0, 7, 0, 0, 4, "Cádiz",Competicion.SEGUNDA));
        menuJugador.jugadores.add(new Jugador("Pedro", "okokik erw", Posicion.Delantero, true, 199, 99.00, 10, 44, 38, 15, 2, 15, 4, 0, 7, "Zaragoza",Competicion.SEGUNDA)); }

    private void cargarPartidos(){
        menuPartido.partidos.add(new Partido("Real Sociedad", "Real Madrid","Anoeta","Martínez Munuera, Juan", Competicion.PRIMERA, 0, 3,1));
        menuPartido.partidos.add(new Partido("Real Madrid", "Celta","Santiago Bernabéu","De Burgos Bengoetxea", Competicion.PRIMERA, 2, 1,2));
        menuPartido.partidos.add(new Partido("Real Madrid", "Osasuna","Santiago Bernabéu","Fernández Borbalán", Competicion.PRIMERA, 5, 2,3));
        menuPartido.partidos.add(new Partido("Espanyol", "Barcelona","RCDE Stadium","Hernández Hernández, Alejandro José", Competicion.PRIMERA, 0, 2,4));
        menuPartido.partidos.add(new Partido("Real Madrid", "Villarreal","Santiago Bernabéu","González González, José Luis", Competicion.PRIMERA, 1, 1,5));
        menuPartido.partidos.add(new Partido("Las Palmas", "Real Madrid","Gran Canaria","Estrada Fernández", Competicion.PRIMERA, 2, 2,6));
        menuPartido.partidos.add(new Partido("Real Madrid", "Eibar","Santiago Bernabéu","Martínez Munuera, Juan", Competicion.PRIMERA, 1, 1,7));
        menuPartido.partidos.add(new Partido("Real Madrid", "Betis","Benito Villamarín","Gil Manzano", Competicion.PRIMERA, 1, 6,8));
        menuPartido.partidos.add(new Partido("Real Madrid", "Athletic","Santiago Bernabéu","Iglesias Villanueva, Ignacio", Competicion.PRIMERA, 2, 1,9));
        menuPartido.partidos.add(new Partido("Alavés", "Real Madrid","Mendizorroza","Sánchez Martínez", Competicion.PRIMERA, 1, 4,10));
        menuPartido.partidos.add(new Partido("Real Madrid", "Leganés","Santiago Bernabéu","Mateu Lahoz", Competicion.PRIMERA, 3, 0,11));
        menuPartido.partidos.add(new Partido("Atlético de Madrid", "Real Madrid","Vicente Calderón","Fernández Borbalán", Competicion.PRIMERA, 0, 3,12));
        menuPartido.partidos.add(new Partido("Real Madrid", "Sporting","Santiago Bernabéu","Hernández Hernández, Alejandro José", Competicion.PRIMERA, 2, 1,13));
        menuPartido.partidos.add(new Partido("Barcelona", "Real Madrid","Campo Nuevo","Clos Gómez", Competicion.PRIMERA, 1, 1,14));
        menuPartido.partidos.add(new Partido("Real Madrid", "Deportivo","Santiago Bernabéu","Jaime Latre", Competicion.PRIMERA, 3, 2,15));
        menuPartido.partidos.add(new Partido("Valencia", "Real Madrid","Mestalla","De Burgos Bengoetxea", Competicion.PRIMERA, 2, 1,16));
        menuPartido.partidos.add(new Partido("Real Madrid", "Granada","Santiago Bernabéu","Vicandi Garrido", Competicion.PRIMERA, 5, 0,17));
        menuPartido.partidos.add(new Partido("Sevilla", "Real Madrid","Ramón Sánchez-Pizjuán","Hernández Hernández, Alejandro José", Competicion.PRIMERA, 2, 1,18));
        menuPartido.partidos.add(new Partido("Real Madrid", "Málaga","Santiago Bernabéu","Gil Manzano", Competicion.PRIMERA, 2, 1,19));
        menuPartido.partidos.add(new Partido("Real Madrid", "Real Sociedad","Santiago Bernabéu","Melero López", Competicion.PRIMERA, 3, 0,20));
        menuPartido.partidos.add(new Partido("Celta", "Real Madrid","Balaídos","Martínez Munuera, Juan", Competicion.PRIMERA, 1, 4,21));
        menuPartido.partidos.add(new Partido("Osasuna", "Real Madrid","El Sadar","Iglesias Villanueva, Ignacio", Competicion.PRIMERA, 1, 3,22));
        menuPartido.partidos.add(new Partido("Real Madrid", "Espanyol","Santiago Bernabéu","Undiano Mallenco", Competicion.PRIMERA, 2, 0,23));
        menuPartido.partidos.add(new Partido("Villarreal", "Real Madrid","Estadio de la Cerámica","Gil Manzano", Competicion.PRIMERA, 2, 3,24));
        menuPartido.partidos.add(new Partido("Real Madrid", "Las Palmas","Santiago Bernabéu","Fernández Borbalán", Competicion.PRIMERA, 3, 3,25));
        menuPartido.partidos.add(new Partido("Eibar", "Real Madrid","Ipurua","González González, José Luis", Competicion.PRIMERA, 1, 4,26));
        menuPartido.partidos.add(new Partido("Real Madrid", "Betis","Santiago Bernabéu","Mateu Lahoz", Competicion.PRIMERA, 2, 1,27));
        menuPartido.partidos.add(new Partido("Athletic", "Real Madrid","San Mamés","Jaime Latre", Competicion.PRIMERA, 1, 2,28));
        menuPartido.partidos.add(new Partido("Real Madrid", "Alavés","Santiago Bernabéu","Sánchez Martínez", Competicion.PRIMERA, 3, 0,29));
        menuPartido.partidos.add(new Partido("Leganés", "Real Madrid","Municipal de Butarque","Álvarez Izquierdo", Competicion.PRIMERA, 2, 4,30));
        menuPartido.partidos.add(new Partido("Real Madrid", "Atlético de Madrid","Santiago Bernabéu","De Burgos Bengoetxea", Competicion.PRIMERA, 1, 1,31));
        menuPartido.partidos.add(new Partido("Sporting", "Real Madrid","El Molinón","Fernández Borbalán", Competicion.PRIMERA, 2, 3,32));
        menuPartido.partidos.add(new Partido("Real Madrid", "Barcelona","Santiago Bernabéu","Hernández Hernández, Alejandro José", Competicion.PRIMERA, 2, 3,33));
        menuPartido.partidos.add(new Partido("Deportivo", "Real Madrid","Riazor","Sánchez Martínez", Competicion.PRIMERA, 2, 6,34));
        menuPartido.partidos.add(new Partido("Real Madrid", "Valencia","Santiago Bernabéu","Gil Manzano", Competicion.PRIMERA, 2, 1,35));
        menuPartido.partidos.add(new Partido("Granada", "Real Madrid","Los Cármenes","Iglesias Villanueva, Ignacio", Competicion.PRIMERA, 0, 4,36));
        menuPartido.partidos.add(new Partido("Real Madrid", "Sevilla","Santiago Bernabéu","Undiano Mallenco", Competicion.PRIMERA, 4, 1,37));
        menuPartido.partidos.add(new Partido("Málaga", "Real Madrid","La Rosaleda","De Burgos Bengoetxea", Competicion.PRIMERA, 0, 2,38));

        menuPartido.partidos.add(new Partido("Barcelona", "Eibar","Campo Nuevo","Hernández Hernández, Alejandro José", Competicion.PRIMERA, 4, 2,38));


        menuPartido.partidos.add(new Partido("Numancia", "Levante","Nuevo Los Pajaritos","González Fuertes", Competicion.SEGUNDA, 0, 1,1));
        menuPartido.partidos.add(new Partido("Levante", "Alcorcón","Ciudad de Valencia","Areces Franco", Competicion.SEGUNDA, 2, 0,2));
        menuPartido.partidos.add(new Partido("Gimnàstic", "Levante","Nuevo Estadio","-", Competicion.SEGUNDA, 1, 1,3));
        menuPartido.partidos.add(new Partido("Levante", "Zaragoza","Ciudad de Valencia","Medié Jiménez", Competicion.SEGUNDA, 4, 2,4));

    }
    public void cargarClasificación(){
        menuClasificacion.clasificacion.add(new Clasificacion("Real Madrid", 38, 29,6,3,106,41,93,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Barcelona", 38, 28,6,4,116,37,90,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Atlético de Madrid", 38, 23,9,6,70,27,78,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Sevilla", 38, 21,9,8,69,49,72,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Villarreal", 38, 19,10,9,56,33,67,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Real Sociedad", 38, 19,7,12,59,53,64,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Athletic", 38, 19,6,13,53,43,63,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Espanyol", 38, 15,11,12,49,50,56,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Alavés", 38, 14,13,11,41,43,55,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Eibar", 38, 15,9,14,56,51,54,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Málaga", 38, 12,10,16,49,55,46,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Valencia", 38, 13,7,18,56,65,46,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Celta", 38, 13,6,19,53,69,45,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Las Palmas", 38, 10,9,19,53,74,39,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Betis", 38, 10,9,19,41,64,39,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Deportivo", 38, 8,12,18,43,61,36,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Leganés", 38, 8,11,19,36,55,35,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Sporting", 38, 7,10,21,42,72,31,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Osasuna", 38, 4,10,24,40,94,22,Competicion.PRIMERA));
        menuClasificacion.clasificacion.add(new Clasificacion("Granada", 38, 4,8,26,30,82,20,Competicion.PRIMERA));



        menuClasificacion.clasificacion.add(new Clasificacion("Levante", 40, 25,9,6,56,29,84,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Girona", 40, 20,9,11,64,43,69,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Getafe", 40, 17,13,10,48,40,64,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Tenerife", 40, 15,18,7,48,35,63,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Cádiz", 40, 15,16,9,53,38,61,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Valladolid", 40, 17,9,14,51,45,60,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Huesca", 40, 15,14,11,51,42,59,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Real Oviedo", 40, 15,10,15,44,47,55,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Sevilla Atético", 40, 13,14,13,54,53,53,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Reus", 40, 12,16,12,29,28,52,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Lugo", 40, 13,13,14,48,49,52,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Rayo Vallecano", 40, 13,11,16,41,41,50,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Córdoba", 40, 12,13,15,38,50,49,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Numancia", 40, 11,16,13,40,47,49,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Zaragoza", 40, 12,13,15,49,50,49,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("UCAM", 40, 11,15,14,42,49,48,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Almería", 40, 13,9,18,43,45,48,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Gimnástic", 40, 10,16,14,45,51,46,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Alcorcón", 40, 11,11,18,28,43,44,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Mallorca", 40, 9,16,15,37,45,43,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Elche", 40, 11,10,19,48,59,43,Competicion.SEGUNDA));
        menuClasificacion.clasificacion.add(new Clasificacion("Mirandés", 40, 8,13,19,36,64,37,Competicion.SEGUNDA));

    }

    //Inicializacion


    public void AppInicio() {
        int opcion;

        while ((opcion = menuInicio()) != 0) {
            switch (opcion) {
                case 1:
                    AppCompeticion();
                    break;
            }
        }
    }


    public void AppCompeticion() {
        int opcion;

        while ((opcion = menuCompeticion()) != 0) {
            switch (opcion) {
                case 1:
                    AppPrimeraDivision();
                    break;
                case 2:
                    AppSegundaDivision();
                    break;
                case 3:
                    menuEquipo.buscarEquipos();
                    break;
                case 4:
                    menuJugador.buscarJugador();
                    break;
                case 5:
                    menuPartido.buscarPorJornada();
            }
        }
    }

    public void AppPrimeraDivision() {
        int opcion;

        while ((opcion = menuPrimeraSegundaDivision()) != 0) {
            switch (opcion) {
                case 1:
                    AppEleccionEquipoPrimera();
                    break;
                case 2:
                    AppClasificacionPrimera();
                    break;
                case 3:
                    AppPartidosPrimera();
                    break;
                case 4:
                    AppTrofeosPrimera();
                    break;
            }
        }
    }

    public void AppSegundaDivision() {
        int opcion;

        while ((opcion = menuPrimeraSegundaDivision()) != 0) {
            switch (opcion) {
                case 1:
                    AppEleccionEquipoSegunda();
                    break;
                case 2:
                    AppClasificacionSegunda();
                    break;
                case 3:
                    AppPartidosSegunda();
                    break;
                case 4:
                    AppTrofeosSegunda();
                    break;
            }
        }
    }

    public void AppEleccionEquipoPrimera() {
        int opcion;


        while ((opcion = menuEleccionEquipo()) != 0) {
            switch (opcion) {
                case 1:
                    AppEquiposPrimera();
                    break;
                case 2:
                    menuEquipo.crearEquipo();
                    break;
                case 3:
                    menuEquipo.listaEquiposPrimera();
                    menuEquipo.eliminarEquipo();
                    break;
                case 4:
                    menuEquipo.listaEquiposPrimera();
                    break;
            }
        }
    }

    public void AppEleccionEquipoSegunda() {
        int opcion;

        while ((opcion = menuEleccionEquipo()) != 0) {
            switch (opcion) {
                case 1:

                    AppEquiposSegunda();
                    break;
                case 2:
                    menuEquipo.crearEquipo();
                    break;
                case 3:
                    menuEquipo.listaEquiposSegunda();
                    menuEquipo.eliminarEquipo();
                    break;
                case 4:
                    menuEquipo.listaEquiposSegunda();
                    break;
            }
        }
    }

    public void AppEquiposPrimera() {
        int opcion;

        while ((opcion = menuEquipos()) != 0) {
            switch (opcion) {
                case 1:
                    menuEquipo.mostrarInformacionEquipoPrimera();
                    break;
                case 2:
                    menuEquipo.listaEquiposPrimera();
                    AppPlantilla(menuJugador.elegirEquipo());
                    break;
                case 3:
                    menuJugador.crearJugador();
                    break;
            }
        }
    }

    public void AppEquiposSegunda() {
        int opcion;

        while ((opcion = menuEquipos()) != 0) {
            switch (opcion) {
                case 1:
                    menuEquipo.mostrarInformacionEquipoSegunda();
                    break;
                case 2:
                    menuEquipo.listaEquiposSegunda();
                    AppPlantilla(menuJugador.elegirEquipo());
                    break;
                case 3:
                    menuJugador.crearJugador();
                    break;
            }
        }
    }

    public void AppPlantilla(ArrayList<Jugador> jugadoresEquipo) {
        int opcion;

        while ((opcion = menuPlantilla()) != 0) {
            switch (opcion) {
                case 1:
                    menuJugador.ordenacionPorNombre(jugadoresEquipo);
                    break;
                case 2:
                    menuJugador.ordenacionPorApellidos(jugadoresEquipo);
                    break;
                case 3:
                    menuJugador.ordenacionPorPosicion(jugadoresEquipo);
                    break;
                case 4:
                    menuJugador.ordenacionPorDorsal(jugadoresEquipo);
                    break;
                case 5:
                    menuJugador.ordenacionPorAltura(jugadoresEquipo);
                    break;
                case 6:
                    menuJugador.ordenacionPorPeso(jugadoresEquipo);
                    break;
                case 7:
                    menuJugador.ordenacionPorEdad(jugadoresEquipo);
                    break;
                case 8:
                    menuJugador.ordenacionPorPartidosJugados(jugadoresEquipo);
                    break;
                case 9:
                    menuJugador.ordenacionPorTarjetasAmarillas(jugadoresEquipo);
                    break;
                case 10:
                    menuJugador.ordenacionPorTarjetasRojas(jugadoresEquipo);
                    break;
                case 11:
                    menuJugador.ordenacionPorGoles(jugadoresEquipo);
                    break;
                case 12:
                    menuJugador.ordenacionPorGolesEnPropia(jugadoresEquipo);
                    break;
                case 13:
                    menuJugador.ordenacionPorGolesRecibidos(jugadoresEquipo);
                    break;
                case 14:
                    menuJugador.ordenacionPorAsistencias(jugadoresEquipo);
                    break;
                case 15:
                    menuJugador.eliminarJugador(jugadoresEquipo);
                    break;
            }
        }
    }

  public void AppClasificacionPrimera() {
      int opcion;

   while ((opcion = menuClasificacion()) != 0) {
       switch (opcion) {
           case 1:
               menuClasificacion.ordenacionPorNombreEquipoPrimera();
               break;
           case 2:
               menuClasificacion.ordenacionPorPartidosJugadosEquipoPrimera();
               break;
           case 3:
               menuClasificacion.ordenacionPorPartidosGanadosEquipoPrimera();
               break;
           case 4:
               menuClasificacion.ordenacionPorPartidosEmpatadosEquipoPrimera();
               break;
           case 5:
               menuClasificacion.ordenacionPorPartidosPerdidosEquipoPrimera();
               break;
           case 6:
                menuClasificacion.ordenacionPorGolesAFavorEquipoPrimera();
               break;
           case 7:
                menuClasificacion.ordenacionPorGolesEnContraEquipoPrimera();
               break;
           case 8:
                menuClasificacion.ordenacionPorDiferenciaDeGolesquipoPrimera();
               break;
           case 9:
               menuClasificacion.ordenacionPorPuntosEquipoPrimera();
               break;
       }
   }
 }

 public void AppClasificacionSegunda() {
     int opcion;

     while ((opcion = menuClasificacion()) != 0) {
         switch (opcion) {
             case 1:
                menuClasificacion.ordenacionPorNombreEquipoSegunda();
                 break;
             case 2:
                menuClasificacion.ordenacionPorPartidosJugadosEquipoSegunda();
                 break;
             case 3:
                menuClasificacion.ordenacionPorPartidosGanadosEquipoSegunda();
                 break;
             case 4:
                menuClasificacion.ordenacionPorPartidosEmpatadosEquipoSegunda();
                 break;
             case 5:
                menuClasificacion.ordenacionPorPartidosPerdidosEquipoSegunda();
                 break;
             case 6:
                menuClasificacion.ordenacionPorGolesAFavorEquipoSegunda();
                 break;
             case 7:
                menuClasificacion.ordenacionPorGolesEnContraEquipoSegunda();
                 break;
             case 8:
                menuClasificacion.ordenacionPorDiferenciaDeGolesquipoSegunda();
                 break;
             case 9:
                 menuClasificacion.ordenacionPorPuntosEquipoSegunda();
                 break;
         }
     }
 }

    public void AppPartidosPrimera() {
        int opcion;

        while ((opcion = menuPartidos()) != 0) {
            switch (opcion) {
                case 1:
                    AppCalendarioPrimera();
                    break;
                case 2:
                    menuPartido.crearPartido();
                    break;
                case 3:
                    menuPartido.eliminarPartido();
                    break;
            }
        }
    }

    public void AppPartidosSegunda() {
        int opcion;

        while ((opcion = menuPartidos()) != 0) {
            switch (opcion) {
                case 1:
                    AppCalendarioSegunda();
                    break;
                case 2:
                    menuPartido.crearPartido();
                    break;
                case 3:
                    menuPartido.eliminarPartido();
                    break;
            }
        }
    }



    public void AppCalendarioPrimera(){
        int opcion;

        while ((opcion = menuCalendario()) != 0) {
            switch (opcion) {
                case 1:
                    menuPartido.listaPartidosPrimera();
                    break;
                case 2:
                    menuPartido.buscarPorJornadaPrimera();
                    break;
                case 3:
                    menuPartido.buscarPorEquipoPrimera();
                    break;
                case 4:
                    AppPartidosOrdenacionPrimera();
                    break;
            }
        }
    }

    public void AppCalendarioSegunda(){
        int opcion;

        while ((opcion = menuCalendario()) != 0) {
            switch (opcion) {
                case 1:
                    menuPartido.listaPartidosSegunda();
                    break;
                case 2:
                    menuPartido.buscarPorJornadaSegunda();
                    break;
                case 3:
                    menuPartido.buscarPorEquipoSegunda();
                    break;
                case 4:
                    AppPartidosOrdenacionSegunda();
            }
        }
    }

    public void AppPartidosOrdenacionPrimera(){
        int opcion;

        while ((opcion = menuOrdenacion()) != 0) {
            switch (opcion) {
                case 1:
                    menuPartido.ordenacionPorLocalPrimera();
                    break;
                case 2:
                    menuPartido.ordenacionPorVisitantePrimera();
                    break;
                case 3:
                    menuPartido.ordenacionPorEstadioPrimera();
                    break;
                case 4:
                   menuPartido.ordenacionPorArbitroPrimera();
                   break;
                case 5:
                    menuPartido.ordenacionPorJornadaPrimera();
                    break;
                case 6:
                    menuPartido.ordenacionPorGolesLocalPrimera();
                    break;
                case 7:
                    menuPartido.ordenacionPorGolesVisitantePrimera();
                    break;
            }
        }
    }

    public void AppPartidosOrdenacionSegunda(){
        int opcion;

        while ((opcion = menuOrdenacion()) != 0) {
            switch (opcion) {
                case 1:
                    menuPartido.ordenacionPorLocalSegunda();
                    break;
                case 2:
                    menuPartido.ordenacionPorVisitanteSegunda();
                    break;
                case 3:
                    menuPartido.ordenacionPorEstadioSegunda();
                    break;
                case 4:
                    menuPartido.ordenacionPorArbitroSegunda();
                    break;
                case 5:
                    menuPartido.ordenacionPorJornadaSegunda();
                    break;
                case 6:
                    menuPartido.ordenacionPorGolesLocalSegunda();
                    break;
                case 7:
                    menuPartido.ordenacionPorGolesVisitanteSegunda();
                    break;
            }
        }
    }

    public void AppTrofeosPrimera() {
        int opcion;

        while ((opcion = menuTrofeos()) != 0) {
            switch (opcion) {
                case 1:
                menuJugador.ordenacionPorPichichiPrimera();
                    break;
                case 2:
                menuJugador.ordenacionPorZamoraPrimera();
                    break;
            }
        }
    }

    public void AppTrofeosSegunda() {
        int opcion;

        while ((opcion = menuTrofeos()) != 0) {
            switch (opcion) {
                case 1:
                menuJugador.ordenacionPorPichichiSegunda();
                    break;
                case 2:
                menuJugador.ordenacionPorZamoraSegunda();
                    break;
            }
        }
    }

    private int menuInicio(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("*************************");
        System.out.println("─────────────────────────────────────────────────────────────────────────\n" +
                "─────────────────────────██████████████─██████████████─██████████████────\n" +
                "────────────────────────██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██────\n" +
                "────────────────────────██░░███████░░██─██░░███████░░██─█░░██████░░██────\n" +
                "────────────────────────██░░██──████░░██─██░░██──████░░██─█░░██──███░░██────\n" +
                "────────────────────────██░░███████░░██─██░░███████░░██─█░░██████░░██────\n" +
                "────────────────────────██░░░░░░░░░░░██─█░░░░░░░░░░██─██░░░░░░░░░░██────\n" +
                "────────────────────────██░░███████░░██─██░░██████████─██░░██████████────\n" +
                "────────────────────────██░░██──████░░██─██░░██────────██████░░██────────────\n" +
                "────────────────────────██░░██──████░░██─██░░██────────██████░░██────────────\n" +
                "────────────────────────██░░██──████░░██─██░░██────────██████░░██────────────\n" +
                "─────────────────────────██████──██████─██████─────────██████────────────\n" +
                "─────────────────────────────────────────────────────────────────────────\n" +
                "─────────────────────────────────────────────────────────────────────────────────────────────\n" +
                "─████████████───────█████───────────██────────████████████──────███████─────────────████████████──────█████───────────\n" +
                "─██░░░░░░░░░█─────█░░██──────────█░░██─░░░░░░░░░░░░██─░░░░░░░██─────────█░░░░░░░░░░█─────█░░██─────────\n" +
                "─██░░█████████───█░░██──────────█░░██─████░░██████───────░░████░░██─────██░░██───────────░░██──█░░██─────────\n" +
                "─██░░█████████────░░██──────────█░░███████░░██──────────██░░██──██░░██────██░░██──────███░░██─█░░██─────────\n" +
                "─██░░█████████───░░██──────────█░░██───────█░░██───────────██░░██████░░████─█░░██──────███░░██─█░░██─────────\n" +
                "─██░░░░░░░░░█──█░░██──────────█░░██─────██░░██───────────██░░░░░░░░░░░░█──█░░██─────███░░██──█░░██─────────\n" +
                "─██░░████████───█░░██────────██░░██─────██░░██───────────██░░█████████░░██──░░██─────███░░██──█░░██─────────\n" +
                "─██░░██────────────██░░██─     ─██░░██─────██░░██───────────██░░██────█████░░█─█░░██─────███░░██───█░░██─────────\n" +
                "─██░░██────────────██░░████████░░██─────██░░██───────────██░░█████████░░██───░░███████░░██───█░░█████████─\n" +
                "─██░░██────────────███░░░░░░░░░░██─────██░░██────────────██░░░░░░░░░░░░██───█░░░░░░░░░██─────█░░░░░░░░░█─\n" +
                "─██████──────────────────███████████──────────████───────────────███████████████──────────█████████──────────███████████\n" +
                "─────────────────────────────────────────────────────────────────────────────────────────────");


        System.out.println("Pulse Enter para comenzar el programa. ");
        scanner.nextLine();
        AppCompeticion();
        return  opcion;
    }


    private int menuCompeticion() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 6;
        System.out.println("*************************");
        System.out.println("* 1 - Primera División  *");
        System.out.println("* 2 - Segunda División  *");
        System.out.println("* 3 - Buscar Equipo     *");
        System.out.println("* 4 - Buscar Jugador    *");
        System.out.println("* 5 - Buscar Partido    *");
        System.out.println("* 0 - Salir             *");
        System.out.println("*************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuPrimeraSegundaDivision() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 5;

        System.out.println("*********************");
        System.out.println("* 1 - Equipos       *");
        System.out.println("* 2 - Clasificación *");
        System.out.println("* 3 - Partidos      *");
        System.out.println("* 4 - Trofeos       *");
        System.out.println("* 0 - Atrás         *");
        System.out.println("*********************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuEleccionEquipo() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 5;

        System.out.println("************************");
        System.out.println("* 1 - Elegir equipo    *");
        System.out.println("* 2 - Añadir equipo    *");
        System.out.println("* 3 - Eliminar equipo  *");
        System.out.println("* 4 - Mostrar equipos  *");
        System.out.println("* 0 - Atrás            *");
        System.out.println("************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuEquipos() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 4;

        System.out.println("******************************");
        System.out.println("* 1 - Información del equipo *");
        System.out.println("* 2 - Plantilla              *");
        System.out.println("* 3 - Añadir jugador         *");
        System.out.println("* 0 - Atrás                  *");
        System.out.println("******************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuPlantilla() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 16;

        System.out.println("**************************************");
        System.out.println("* 1 - Ordenar por nombre             *");
        System.out.println("* 2 - Ordenar por apellidos          *");
        System.out.println("* 3 - Ordenar por posición           *");
        System.out.println("* 4 - Ordenar por dorsal             *");
        System.out.println("* 5 - Ordenar por altura             *");
        System.out.println("* 6 - Ordenar por peso               *");
        System.out.println("* 7 - Ordenar por edad               *");
        System.out.println("* 8 - Ordenar por partidos jugados   *");
        System.out.println("* 9 - Ordenar por tarjetas amarillas *");
        System.out.println("* 10- Ordenar por tarjetas rojas     *");
        System.out.println("* 11- Ordenar por goles              *");
        System.out.println("* 12- Ordenar por goles en propia    *");
        System.out.println("* 13- Ordenar por goles recibidos    *");
        System.out.println("* 14- Asistencias                    *");
        System.out.println("* 15- Eliminar jugador               *");
        System.out.println("* 0 - Atrás                          *");
        System.out.println("**************************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuClasificacion() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 10;

        System.out.println("****************************************");
        System.out.println("* 1 - Ordenar por nombre               *");
        System.out.println("* 2 - Ordenar por partidos jugados     *");
        System.out.println("* 3 - Ordenar por partidos ganados     *");
        System.out.println("* 4 - Ordenar por partidos empatado    *");
        System.out.println("* 5 - Ordenar por partidos perdidos    *");
        System.out.println("* 6 - Ordenar por goles a favor        *");
        System.out.println("* 7 - Ordenar por goles en contra      *");
        System.out.println("* 8 - Ordenar por diferencia de goles  *");
        System.out.println("* 9 - Ordenar por puntos               *");
        System.out.println("* 0 - Atrás                            *");
        System.out.println("****************************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuPartidos() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 4;

        System.out.println("************************");
        System.out.println("* 1 - Ver jornadas     *");
        System.out.println("* 2 - Añadir jornada   *");
        System.out.println("* 3 - Eliminar jornada *");
        System.out.println("* 0 - Atrás            *");
        System.out.println("************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuCalendario() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 5;

        System.out.println("***************************");
        System.out.println("* 1 - Todos los partidos  *");
        System.out.println("* 2 - Buscar jornada      *");
        System.out.println("* 3 - Buscar equipo       *");
        System.out.println("* 4 - Ordenación partidos *");
        System.out.println("* 0 - Atrás               *");
        System.out.println("***************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }

    private int menuOrdenacion() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 8;

        System.out.println("***********************************");
        System.out.println("* 1 - Ordenar por Local           *");
        System.out.println("* 2 - Ordenar por Visitante       *");
        System.out.println("* 3 - Ordenar por Estadio         *");
        System.out.println("* 4 - Ordenar por Árbitro         *");
        System.out.println("* 5 - Ordenar por Jornada         *");
        System.out.println("* 6 - Ordenar por Goles Local     *");
        System.out.println("* 7 - Ordenar por Goles Visitante *");
        System.out.println("* 0 - Atrás                       *");
        System.out.println("***********************************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }
        return opcion;
    }

    private int menuTrofeos() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 3;

        System.out.println("****************");
        System.out.println("* 1 - Pichichi *");
        System.out.println("* 2 - Zamora   *");
        System.out.println("* 0 - Atrás    *");
        System.out.println("****************");
        System.out.println("Opción: ");

        try {
            opcion = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un número.");
            scanner.next();
        }

        return opcion;
    }
}

