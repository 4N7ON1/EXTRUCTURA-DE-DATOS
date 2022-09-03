package Campeonato.Clases;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Jugador j1 = new Jugador("Jose", "Mamani", "12345677LP", 22);
        Jugador j2 = new Jugador("Rodolfo", "Quispe", "12345678LP", 26);

        Jugador[] jugadores = new Jugador[2];
        jugadores[0] = j1;
        jugadores[1] = j2;

        Jugador g1 = new Jugador("Abraham", "Lincoln", "12345677LP", 22);
        Jugador g2 = new Jugador("Adolf", "Hitler", "12345678LP", 26);

        Jugador[] jugadores2 = new Jugador[2];
        jugadores2[0] = g1;
        jugadores2[1] = g2;

        Equipo eq1 = new Equipo("Club Saltena", "Varones", jugadores);
        eq1.mostrarEquipo();

        Equipo eq2 = new Equipo("Club Tucumana", "Varones", jugadores2);


        Equipo[] equipos = new Equipo[2];
        equipos[0] = eq1;
        equipos[1] = eq2;

        Campeonato camp = new Campeonato("Liga empanada", equipos);
        camp.mostrarCampeonato();

        Scanner leer = new Scanner(System.in);

    }

}
