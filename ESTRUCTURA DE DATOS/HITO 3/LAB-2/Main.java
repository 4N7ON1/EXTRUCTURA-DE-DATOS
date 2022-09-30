package Hito3;

public class Main {
    public static void main(String[] args) {
        PilaNumeros pila1 = new PilaNumeros(5);
        pila1.adicionar(4);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar( 7);
        pila1.adicionar( 12);
        pila1.mostrarPilaNumeros();
    }
}