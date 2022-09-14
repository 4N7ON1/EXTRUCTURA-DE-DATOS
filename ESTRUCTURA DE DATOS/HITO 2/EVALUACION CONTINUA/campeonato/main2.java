package campeonato;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE DATOS DEL JUGADOR");

        String nombreCompleto1,apellido1,ci1;
        int edad1;

        System.out.println("INGRESE NOMBRE DEL JUGADOR");
        nombreCompleto1=leer.next();
        System.out.println("INGRESE APELLIDO DEL JUGADOR");
        apellido1=leer.next();
        System.out.println("INGRESE CI DEL JUGADOR");
        ci1=leer.next();
        System.out.println("INGRESE LA EDAD DEL JUGADOR");
        edad1=leer.nextInt();

        //jugador jug1= new jugador(nombreCompleto1,apellido1,ci1,edad1);
        //jug1.mostrarJugador();

        jugador jug1=new jugador();
        jug1.setNombreCompleto(nombreCompleto1);
        jug1.setApellido(apellido1);
        jug1.setCI(ci1);
        jug1.setEdad(edad1);

        jug1.mostrarJugador();

        //System.out.println("main 2");
        String nombreCompleto2, apellido2 , ci2;
        int edad2;
        System.out.print("Ingrese nombre del jugador");
        nombreCompleto2= leer.next();
        System.out.print("Ingrese apellido del jugador");
        apellido2= leer.next();
        System.out.print("Ingrese CI del jugador");
        ci2= leer.next();
        System.out.print("Ingrese la edad del jugador");
        edad2= leer.nextInt();

        jugador jug2=new jugador ();
        jug2.setNombreCompleto(nombreCompleto2);
        jug2.setApellido(apellido2);
        jug2.setCI(ci2);
        jug2.setEdad(edad2);
        jug2.mostrarJugador();
    }

}
