package campeonato;

public class EQUIPO  {
    private String nombreEquipo;
    private String categoria;
    private JUGADOR []  JUGADROES;

    public  EQUIPO (String nombreEquipo,String categoria,JUGADOR [] JUGADORES)
    {
        this.nombreEquipo =nombreEquipo;
        this.categoria=categoria;
        this.JUGADROES=JUGADORES;
    }

    public String getNombreEquipo()
    {
        return this.nombreEquipo;
    }

    public String  getCategoria()
    {
        return this.categoria;
    }

    public JUGADOR[] getJUGADROES() {
        return this.JUGADROES;
    }

    public void setNombreEquipo(String nuevo1)
    {
        this.nombreEquipo =nuevo1;
    }
    public void setCategoria(String nuevo2)
    {
        this.categoria=nuevo2;
    }

    public  void setJUGADROES (JUGADOR[] NEW3)
    {
         this.JUGADROES=NEW3;
    }

    public void mostrarEquipo()
    {
        System.out.println("\n NOMBRES DEL EQUIPO");
        System.out.println("NOMBRE DE EQUIPO ES" + this.getNombreEquipo());
        System.out.println("CATEGORIA ES " + this.getCategoria());
        for (int i=0;i< this.getJUGADROES().length; i++){
            this.JUGADROES[i].mostrarJugador();
        }
    }

}

