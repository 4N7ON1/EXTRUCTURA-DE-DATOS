package HITO3_EVALUACION_2022;

public class Cliente {
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private String Direccion;
    private String Genero;

    public Cliente(String Nombres, String
            Apellidos, int Edad, String Direccion, String Genero) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.Genero = Genero;

    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void mostrarCliente() {
        System.out.println("\nMostrando datos del jugador");
        System.out.println("Nombre: " + this.getNombres());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Genero: " + this.getGenero());

        System.out.println("\n");
    }

}

