package HITO2;

public class PROVINCIA {
    private String Nombre;

    public PROVINCIA(String Nombre)
    {
        this.Nombre=Nombre;
    }
    public PROVINCIA () {}

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public void muestraProvencia(){
System.out.println("\nEL NOMBRE DE LAS PROVINCIAS ES:");
System.out.println("NOMBRE DE PROVINCIA:"+this.getNombre());
    }
}
