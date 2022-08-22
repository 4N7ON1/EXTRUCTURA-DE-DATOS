package campeonato;

public class CAMP {
    private String nombreCampeonato;
    private EQUIPO[]  EQUIPOS;

    public CAMP(String nombreCampeonato, EQUIPO[] EQUIPOS)
    {
        this.nombreCampeonato=nombreCampeonato;
        this.EQUIPOS=EQUIPOS;
    }
    public String getNombreCampeonato()
    {
        return this.nombreCampeonato;
    }
    public EQUIPO[]   getEQUIPOS()
    {
        return this.EQUIPOS;
    }

    public void  setNombreCampeonato (String NEWC){this.nombreCampeonato=NEWC;}
    public void setEQUIPOS (EQUIPO[] NEWEQ){this.EQUIPOS=NEWEQ;}


    public void mostrarCAMP()
    {
        System.out.println("\n NOMBRE DEL CAMPEONATO");
        for (int A=0;A< this.getEQUIPOS().length;A++)
        {
            this.EQUIPOS[A].mostrarEquipo();
        }

    }




}
