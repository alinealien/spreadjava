package br.com.dio.desafios;
import java.util.Scanner;

public class trigonotabuleiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();
            double graos = (Math.pow(2, x) -1) /12000;
            System.out.printf( "%d kg\n", (long) graos );   //Complete o código aqui.
        }
        sc.close();
    }
}
