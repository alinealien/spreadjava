package br.com.dio.exercicios.loops;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuario.
Ex.: 5!= 120 (5 x 4 x 3 x 2 x 1)

DICA:
Para saber quando usar For ou do/while.
O laço FOR precisa ter uma autovariavel (contador) se holver necessidade de utilizar o contador
é .

 */

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = ");
        for(int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
