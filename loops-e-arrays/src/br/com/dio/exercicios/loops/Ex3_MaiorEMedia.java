package br.com.dio.exercicios.loops;

import java.util.Scanner;

/* Programa que leia 5 números.
Informa o maior numero. E a média dos números
 */

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;


        int count = 0; //Contador
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5); //Enquanto o contador for menor do que 5 ele se repetirá

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
