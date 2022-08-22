package campeonato;

import com.sun.source.tree.NewArrayTree;

import java.security.PublicKey;

public class Main {
    public static void main (String [] args)
    {
        JUGADOR J1 = new JUGADOR ("MARCO","calle","23123FA",12);
        J1.mostrarJugador();


        JUGADOR J2 = new JUGADOR ("MARCO123","c421alle","23513123FA",112);

        JUGADOR [] JUGADORES =new JUGADOR[2];

        JUGADORES[0]= J1;
        JUGADORES[1]= J2;

         EQUIPO EQ1= new EQUIPO("CLUN PAPITAS","PANSEXUAL",JUGADORES);
         EQ1.mostrarEquipo();

        EQUIPO EQ2= new EQUIPO("CLUN PAPITAS2","VARONES",JUGADORES);
        EQ2.mostrarEquipo();

        EQUIPO EQ3= new EQUIPO("CLUN PAPITAS3","MUJERES",JUGADORES);
        EQ3.mostrarEquipo();


        CAMP C1=    new CAMP("unifranz",EQUIPO);
        C1.mostrarCAMP();

    }

}