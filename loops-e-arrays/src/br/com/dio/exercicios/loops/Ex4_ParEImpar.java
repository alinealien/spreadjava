package br.com.dio.exercicios.loops;

import java.util.Scanner;

/* Programa que peça N números inteiros,
calcule e mostre  a quantidade de números pares
e a quantidade de números impares.
 */

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros; //somar a quantidade de vezes que o laço se repete
        int numero; //var que vai salvar o numero

        int quantPares = 0; // para salvar a quantidade de pares
        int quantImpares = 0; // para salvar a quantidade de impares

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++; // quantPares = quantPares + 1;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);

    }


}
