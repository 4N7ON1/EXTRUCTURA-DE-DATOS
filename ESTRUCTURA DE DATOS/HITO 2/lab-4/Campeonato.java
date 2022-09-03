package Campeonato.Clases;

public class Campeonato {
    private String nombreCampeonato;
    private Equipo[] equipos;

    public Campeonato(String nombreCampeonato, Equipo[] equipos) {
        this.nombreCampeonato = nombreCampeonato;
        this.equipos = equipos;
    }

    public Campeonato () {}

    public String getNombreCampeonato() {
        return this.nombreCampeonato;
    }
    public Equipo[] getEquipos() {
        return this.equipos;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }
    public void mostrarCampeonato() {
        System.out.println("\nMOSTRANDO DATOS DEL Campeonato");
        System.out.println("Nombre Campeonato: " + this.getNombreCampeonato());
        for (int i = 0; i < getEquipos().length; i++) {
            this.getEquipos()[i].mostrarEquipo();
        }
    }
}
