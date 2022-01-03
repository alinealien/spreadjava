package br.com.dio.aulaI;
//Classe Main criada para classe NO, aula: Refatoração de Nó

public class Main {

    public static void main(String[] args){

        No<String> no1 = new No("Conteúdo no1");

        No no2 = new No("Conteúdo no2" );
        no1.setProximoNo(no2);

        No no3 = new No("Conteúdo no3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteúdo no4");
        no3.setProximoNo(no4);

        //Acima vemos o no1 (apontando) -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("------------------------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());


    }

}
