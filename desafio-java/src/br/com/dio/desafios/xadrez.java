package br.com.dio.desafios;

import java.util.Scanner;

public class xadrez {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if ((L == 1) || (C == 0)) {
            System.out.println(" 1 ");
        } else {                                              //complete o código nos espaços em branco
            System.out.println(" 0 ");
            sc.close();
        }
    }
}

