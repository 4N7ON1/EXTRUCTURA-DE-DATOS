package OPERCAIONES_ALGEBRAICAS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       Operaciones OP1= new Operaciones(2,5);
       System.out.println(OP1.suma());

        Scanner leer = new Scanner(System.in);
        int N1;
        int N2;
        int SUMA;

        System.out.println("INGRESE EL VALOR DEL NUMEOR 1:");
        N1 = leer.nextInt();

        System.out.println("INGRESE EL VALOR DEL NUMEOR 2:");
        N2 = leer.nextInt();

        Operaciones OP2= new Operaciones(N1,N2);
        System.out.println(OP2.suma());




    }

}
