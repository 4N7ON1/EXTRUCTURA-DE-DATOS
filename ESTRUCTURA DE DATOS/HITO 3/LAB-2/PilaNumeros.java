package Hito3;

public class PilaNumeros {
    private int max;
    private int[] pilaNums;
    private int tope;

    public PilaNumeros(int max){
        this.tope = 0;
        this.max = max;
        pilaNums = new int[this.max + 1];
    }

    public boolean esVacio(){
        if (tope == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlenar(){
        if (tope == max){
            return true;
        } else {
            return false;
        }
    }

    public int nroElem(){
        return this.tope;
    }

    public void adicionar(int nuevoItem){
        if (this.esLlenar() == false){
            this.tope = this.tope + 1;
            this.pilaNums[this.tope] = nuevoItem;
        } else {
            System.out.println("La Pila de numeros esta llena.");
        }
    }

    public int eliminar(){
        int elementoEliminado = 0;
        if (this.esVacio() == false){
             elementoEliminado = this.pilaNums[this.tope];
            this.tope = this.tope - 1;
        } else {
            System.out.println("La Pila de Numeros esta vacia.");
        }
        return elementoEliminado;
    }

    public void llenar(){}

    public void mostrarPilaNumeros(){
        int elem;
        if (esVacio()){
            System.out.println("Pila Vacia, no hay Item que mostrar");
        }
        else
        {
            System.out.println("\n Datos de la Pila ");
            PilaNumeros aux = new PilaNumeros(10);
            while (!esVacio())
            {
                elem = this.eliminar();
                aux.adicionar(elem);
                System.out.println("Elem: " + elem);
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaNumeros aux){
        while (!aux.esVacio())
            adicionar(aux.eliminar());
    }
}