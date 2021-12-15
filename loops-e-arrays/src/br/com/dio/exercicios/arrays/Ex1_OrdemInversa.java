package br.com.dio.exercicios.arrays;

/* Crie um vetor de 6 numeros inteiros
e mostre-os na ordem inversa.

Sobre ARRAY: Array é um vetor (pode ser Unidimensionais / Multidimensional / Bidimensional).
length é uma propriedade do vetor que se refere ao tamanho.

 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-3, -5, 55, 8, 90, 4};

        //System.out.println(vetor.length);

        //Laço I -
        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        //Laço II -
        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");

        }
    }
}
