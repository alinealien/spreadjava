package br.com.dio.exercicios.arrays;

/* Faça um programa que leia 20 numeros inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.

OBS:
FOReach : há limitações, é bom para navegar dentro do vetor e faça algo/imprima algo.
Ele não tem acesso a posição espesifica dentro do array.
 */

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("\nNUmeros Aleatórios: ");
        for (int numero : numerosAleatorios){
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print((numero+1) + " ");

        }

        System.out.print("\nAntecessores dos Numeros Aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print((numero-1) + " ");

        }


    }

}


