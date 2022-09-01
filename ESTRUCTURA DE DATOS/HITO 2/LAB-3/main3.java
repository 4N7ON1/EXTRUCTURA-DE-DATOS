package campeonato;

import java.util.Scanner;

public class main3 {
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE DATOS DE JUGADORES");
        String nombreCompleto, apellidos, ci;
        int edad, i, nJugadores = 1;

        System.out.println("INGRESE DATOS DE EQUIPOS");
        String nombreEquipo, categoria;
        int j, nEquipos = 2;

        equipo [] equipos = new equipo[nEquipos];

        for (j = 0; j < nEquipos; j = j + 1) {
            System.out.println("Ingrese el nombre del equipo " + (j + 1) + ": ");
            nombreEquipo = leer.next();
            System.out.println("Ingrese la categoria del equipo " + (j + 1) + ": ");
            categoria = leer.next();
            jugador[] jugadores = new jugador[nJugadores];
            for (i = 0; i < nJugadores; i = i + 1) {
                System.out.println("Ingrese el nombre del jugador " + (i + 1) + ": ");
                nombreCompleto = leer.next();
                System.out.println("Ingrese el apellidos del jugador " + (i + 1) + ": ");
                apellidos = leer.next();
                System.out.println("Ingrese el CI del jugador " + (i + 1) + ": ");
                ci = leer.next();
                System.out.println("Ingrese edad del jugador " + (i + 1) + ": ");
                edad = leer.nextInt();

                jugador jug = new jugador();
                jug.setNombreCompleto(nombreCompleto);
                jug.setApellido(apellidos);
                jug.setCI(ci);
                jug.setEdad(edad);
                //  jug.mostrarJugador();

                jugadores[i] = jug;
            }

            equipo Eq = new equipo();
            Eq.setNombreEquipo(nombreEquipo);
            Eq.setCategoria(categoria);
            Eq.setJugadores(jugadores);
            //  Eq.mostrarEquipo();

            equipos[j] = Eq;
        }
        Campeonato Camp1 = new Campeonato("UNIFRANZITOS", equipos);

        Camp1.mostrarCampeonato();

        }
}
