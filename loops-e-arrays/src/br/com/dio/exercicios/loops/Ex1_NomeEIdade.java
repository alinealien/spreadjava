package br.com.dio.exercicios.loops;

import java.util.Scanner;

/* Programa que ler dois conjuntos de valores. Onde o primeiro representa o
nome do aluno e o segundo representando a sua idade. Quando chegar 0 o programa deve parar.
 */

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner = ler atraves do teclado.

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome:");
            nome = scan.next();
            if (nome.equals("0")) break; // Aqui ele vai parar o programa quando receber 0 como resultado.

            System.out.println("Idade:");
            idade = scan.nextInt();

        }

        System.out.println("Continua aqui...");

        /*System.out.println("Nome:"); //ctrl+d (copiou a linha para baixo)
        System.out.println("Idade:");*/
    }

}
