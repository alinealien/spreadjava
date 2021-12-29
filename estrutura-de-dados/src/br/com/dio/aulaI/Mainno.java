package br.com.dio.aulaI;

public class Mainno {

    public static void main(String[] args){

        noencadeamento no1 = new noencadeamento("Conteúdo no1");

        noencadeamento no2 = new noencadeamento("Conteúdo no2" );
        no1.setProximoNo(no2);

        noencadeamento no3 = new noencadeamento("Conteúdo no3");
        no2.setProximoNo(no3);

        noencadeamento no4 = new noencadeamento("Conteúdo no4");
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
