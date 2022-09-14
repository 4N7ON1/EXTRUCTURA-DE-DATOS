package OPERCAIONES_ALGEBRAICAS;

public class Operaciones {
    private int num1;
    private int num2;

    public Operaciones (int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int suma()
    {
        int respuesta = this.num1 + this.num2;
        return  respuesta;
    }
    public int resta()
    {
        int respuesta = this.num1 - this.num2;
        return  respuesta;

    }
    public int division()
    {
        int respuesta = this.num1 /this.num2;
        return  respuesta;
    }
    public int multiplicacion()
    {
        int respuesta = this.num1 * this.num2;
        return  respuesta;
    }

}
