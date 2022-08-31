package campeonato;

public class equipo {
        private String nombreEquipo;
        private String categoria;
        private jugador [] jugadores;
        public equipo (String nombreEquipo, String categoria, jugador [] jugadores){
                this.nombreEquipo=nombreEquipo;
                this.categoria=categoria;
                this.jugadores=jugadores;
        }
        public  String getNombreEquipo(){
                return this.nombreEquipo;
        }
        public  String getCategoria(){
                return this.categoria;
        }

        public jugador[] getJugadores() {
                return this.jugadores;
        }

        public void setNombreEquipo(String nuevoEquipo){
                this.nombreEquipo=nuevoEquipo;
        }
        public void setCategoria(String nuevaCategoria){
                this.categoria=nuevaCategoria;
        }
        public void setJugadores(jugador [] jugadores){
                this.jugadores=jugadores;
        }
        public void mostrarEquipo()
        {
                System.out.println("\nMOSTRAR DATOS DEL EQUIPO");
                System.out.println("nombre Equipo: " + this.getNombreEquipo());
                System.out.println("Categoria: " + this.getCategoria());
                for(int i=0; i < this.getJugadores().length;i++){
                        this.getJugadores()[i].mostrarJugador();
        }

        }
}
