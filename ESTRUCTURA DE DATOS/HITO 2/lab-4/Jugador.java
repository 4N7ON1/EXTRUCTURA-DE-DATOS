package Campeonato.Clases;

public class Jugador {
    private String NombreCompleto;
    private String Apellidos;
    private String CI;
    private int Edad;

    public Jugador (String NombreCompleto, String Apellidos, String CI, int Edad) {
        this.NombreCompleto = NombreCompleto;
        this.Apellidos = Apellidos;
        this.CI = CI;
        this.Edad = Edad;
    }
    public Jugador() {
        this.NombreCompleto = "";
        this.Apellidos = "";
        this.CI = "";
        this.Edad = 0;
    }

    public String getNombreCompleto() {
        return this.NombreCompleto;
    }

    public String getApellidos() {
        return this.Apellidos;
    }

    public String getCI() {
        return this.CI;
    }

    public int getEdad() {
        return this.Edad;
   }

    public void setNombreCompleto(String NuevoNombre) {
        NombreCompleto = NuevoNombre;
    }
    public void setApellidos(String NuevoApellido) {
        Apellidos = NuevoApellido;
    }

    public void setCI(String NuevoCI) {
        CI = NuevoCI;
    }
    public void setEdad(int NuevaEdad) {
        Edad = NuevaEdad;
    }

    public void mostrarJugador() {
        System.out.println("\nMostrando datos del jugador");
        System.out.println("Nombre Jugador: " + this.getNombreCompleto());
        System.out.println("Apellidos Jugador: " + this.getApellidos());
        System.out.println("CI Jugador: " + this.getCI());
        System.out.println("Edad Jugador: " + this.getEdad());
        System.out.println("\n");
    }

}
