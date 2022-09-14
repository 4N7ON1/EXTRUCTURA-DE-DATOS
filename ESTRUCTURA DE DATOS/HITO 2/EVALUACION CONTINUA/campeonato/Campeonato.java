package campeonato;

public class Campeonato {
    private String nombreCampeonato;
    private equipo[] equipos;

    public Campeonato(String nombreCampeonato, equipo[] equipos) {
        this.nombreCampeonato = nombreCampeonato;
        this.equipos = equipos;
    }

    public String getNombreCampeonato() {
        return this.nombreCampeonato;
    }
    public equipo[] getEquipos() {
        return this.equipos;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public void setEquipos(equipo[] equipos) {
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
