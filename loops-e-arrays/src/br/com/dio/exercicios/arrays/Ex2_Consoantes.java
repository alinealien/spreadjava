package br.com.dio.exercicios.arrays;
/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letras: ");
            String letra = scan.next();

           //metodo do equalsIgnoreCase irá pegar a string e comprar com a outra e retorna true ou false;
            // ! (Quando não for...)

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;
        } while(count < consoantes.length);

        System.out.println("Consoantes: ");
        for ( String consoante : consoantes){
            if ( consoante != null)
                System.out.println(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);


    }
}
