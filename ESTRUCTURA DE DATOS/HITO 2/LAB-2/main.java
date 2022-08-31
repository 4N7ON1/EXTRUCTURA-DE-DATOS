package campeonato;

public class main {
    public static void main(String [] args){
        jugador v1= new jugador("willian","mamani","123456",32);
        v1.mostrarJugador();
        jugador v2= new jugador("pepe","mamani","123456",22);
        jugador[]jugadores=new jugador[2];
        jugadores[0]=v1;
        jugadores[1]=v2;
        equipo eq1=new equipo("club real el alto", "varones",jugadores);
        eq1.mostrarEquipo();
        //equipo[]equipos=new equipo[1];
        //equipos[0]=eq1 ;
        //campeonato camp1 = new campeonato("bolivar",equipos);
        //camp1.mostrarCampeonato();
    }

}
