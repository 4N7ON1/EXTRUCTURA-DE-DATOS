package campeonato;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        System.out.println("main3");

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese Datos del Jugador");

        String nombreCompleto, apellido, ci;
        int edad;
       jugador [] jugadores= new jugador[1];
        for (int i = 0; i < 1; i++) {

            System.out.print("Ingrese nombre del jugador: " + i);
            nombreCompleto = leer.next();
            System.out.print("Ingrese apellido del jugador: " + i);
            apellido = leer.next();
            System.out.print("Ingrese CI del jugador: " +i);
            ci = leer.next();
            System.out.print("Ingrese la edad del jugador: " +i);
            edad = leer.nextInt();

            jugador jug = new jugador();
            jug.setnombre(nombreCompleto);
            jug.setApellido(apellido);
            jug.setCI(ci);
            jug.setedad(edad);
            //jug.mostrarJugador();

            jugadores[i]=jug;

        }

        equipo eq1=new equipo("real","varones",jugadores);
        eq1.mostrarEquipo();
        
    }

    }

