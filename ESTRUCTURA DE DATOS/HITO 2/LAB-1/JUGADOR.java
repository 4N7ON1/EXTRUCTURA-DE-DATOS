package campeonato;

public class JUGADOR {
    private String apelidos;
    private String  ci;
    private int  edad;
    private String nombre_completo;

    public JUGADOR (String nombre_completo,
                    String apellidos, String ci, int edad)
    {
        this.nombre_completo=nombre_completo;
        this.apelidos= apellidos;
        this.ci =ci;
        this.edad = edad;
    }

    public String getNombre_completo()
    {
        return this.nombre_completo;
    }
    public String getApelidos()
    {
        return this.apelidos;
    }
    public String getCi()
    {
        return this.ci;
    }
    public int getEdad ()
    {
        return this.edad;
    }

    public void setNombre_completo (String  nuevonoame)
    {
        this.nombre_completo =nuevonoame;
    }

    public  void setApelidos( String newapellido)
    {
        this.apelidos = newapellido;
    }
    public  void setCi (String CINEW)
    {
        this.ci =CINEW;
    }

    public void setEdad (int NEWEDAD)
    {
        this.edad= NEWEDAD;
    }

    public void mostrarJugador ()
    {
        System.out.println("\n MOSTRANDO NOMBRE DEL JUGADOR");
        System.out.println("NNOMBRE DEL JUGADOR"+ this.getNombre_completo());
        System.out.println("APELLIDOS DEL JUGADOR"+ this.getApelidos());
        System.out.println("CI DEL JUGADOR "+ this.getCi());
        System.out.println("EDAD DEL JUGADOR"+this.getEdad());


    }
























}
