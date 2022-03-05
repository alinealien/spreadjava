package br.com.dio.aulaIII;

public class Main {

    public static void main(String[] args){

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue()); //tira o primeiro da fila e retorna ele

        System.out.println(minhaFila);

        minhaFila.enqueue(new No("ultimo")); //retorna o ultimo

        System.out.println(minhaFila);

        System.out.println(minhaFila.first()); //retorna o primeiro da fila. Deve continuar na fila.

        System.out.println(minhaFila);
    }

}
