package campeonato;

public class jugador {
    private String apellido;
    private String CI;
    private int edad;
    private String nombreCompleto;
    public jugador(String nombreCompleto,String apellido,String CI,int edad)
    {
        this.nombreCompleto=nombreCompleto;
        this.apellido=apellido;
        this.CI=CI;
        this.edad=edad;
    }

    public jugador()
    {
        this.nombreCompleto="";
        this.apellido="";
        this.CI="";
        this.edad=0;
    }
     public String getNombreCompleto()
     {
         return this.nombreCompleto;
     }
     public String getApellido()
     {
        return  this.apellido;
     }
     public  String getCI()
     {
         return  this.CI;

     }

     public  int getEdad()
     {
         return this.edad;
     }
      public void setNombreCompleto(String nuevonombre)
      {
          this.nombreCompleto=nuevonombre;
      }
      public void setApellido(String nuevoApellido)
      {
          this.apellido=nuevoApellido;
      }
      public void setCI(String nuevoCI)
      {
          this.CI=nuevoCI;
      }
      public void setEdad(int nuevaedad)
      {
          this.edad=nuevaedad;
      }
      public void mostrarJugador()
      {
          System.out.println("\nMOSTRAR DATOS DEL JUGADOR");
          System.out.println("nombre Jugador: " + this.getNombreCompleto());
          System.out.println("Apellido Jugador: " + this.getApellido());
          System.out.println(" CI del jugador: " + this.getCI());
          System.out.println(" edad del jugador: " + this.getEdad());
      }

}
