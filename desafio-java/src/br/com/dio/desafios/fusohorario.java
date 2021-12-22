package br.com.dio.desafios;
import java.util.Scanner;

public class fusohorario {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int horasaida = sc.nextInt();
    int tempoviagem = sc.nextInt();
    int fuso = sc.nextInt();

    //Escreva a sua lógica aqui

    if (horasaida + tempoviagem + fuso == 24) {

        System.out.println("0");

    }

        if (horasaida == 0){
        horasaida = 24;
        System.out.println(horasaida + tempoviagem + fuso);
    }

        if (horasaida + tempoviagem + fuso > 24 ){
        System.out.println("2");

    }

        if (horasaida + tempoviagem + fuso < 24 ){
        System.out.println(horasaida + tempoviagem + fuso);

    }

        sc.close();
}
}

