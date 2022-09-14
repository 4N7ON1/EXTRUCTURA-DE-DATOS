package HITO2;

public class DEPARTAMENTO {
    private String Nombre;
    private int noProvincias;
    private PROVINCIA[] provencias;

    public DEPARTAMENTO(String Nombre,PROVINCIA[] provencias,int noProvincias)
    {
        this.Nombre=Nombre;
        this.provencias=provencias;
        this.noProvincias=noProvincias;
    }
    public DEPARTAMENTO () {}

    public String getNombre() {
        return this.Nombre;
    }

    public PROVINCIA[] getProvencias() {
        return provencias;
    }
    public int getNoProvincias() {
        return noProvincias;
    }
    public void setNoProvincias(int noProvincias) {
        this.noProvincias = noProvincias;
    }

    public void setProvencias(PROVINCIA[] provencias) {
        this.provencias = provencias;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void muestraDepartamento (){
        System.out.println("\nMOSTRANDO NOMBRE DE LOS DEPARTAMENTOS");
        System.out.println("Nombre De Departamento: " + this.getNombre());
        System.out.println("No Provincias: " + this.noProvincias);
        for (int i = 0; i < getProvencias().length; i++) {
            this.getProvencias()[i].muestraProvencia();
        }

    }
}
