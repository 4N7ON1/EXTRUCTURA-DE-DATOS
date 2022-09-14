package HITO2;

public class PAIS {
    private String nombrePais;
    private int noDepartamentos;
    private DEPARTAMENTO[] departamentos;

    public PAIS(String nombrePais,int noDepartamentos, DEPARTAMENTO[] departamentos) {
        this.nombrePais = nombrePais;
        this.noDepartamentos = noDepartamentos;
        this.departamentos=departamentos;
    }
    public PAIS () {}
    public String getNombrePais() {
        return this.nombrePais;
    }
    public DEPARTAMENTO[] getDepartamentos() {
        return this.departamentos;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public void setDepartamentos(DEPARTAMENTO[] departamentos) {
        this.departamentos = departamentos;
    }
    public void mostrarPais() {
        System.out.println("\nMOSTRANDO DATOS DEL PAIS");
        System.out.println("Nombre Pais: " + this.getNombrePais());
        for (int i = 0; i < this.noDepartamentos; i++) {
            this.getDepartamentos()[i].muestraDepartamento();
        }
    }
}
