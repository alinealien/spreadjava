package br.com.dio.aulaI;

public class estruturas {
    //Exemplo da aula: Atribuição por Referência
    //No java ele copia exatamente(nos tipos primitivos) o valor(na memoria) e não a referencia,
    //classe Main do professor.

    public static void main(String[] args){

        int intA = 1;
        int intB = intA;

        System.out.println("intA=" + intA + " intB=" + intB);
        intA = 2;
        System.out.println("intA=" + intA + " intB=" + intB);
        //Aqui ele funciona como esperado(saida intA=2), mas com os objetos não funcionam assim.


        MeuObj objA = new MeuObj(  1 );
        MeuObj objB = objA; //copiando a referencia de memoria do objA e atribuindo a var de objB a referencia de memoria do objA. Elas apontam pro mesmo end de memoria.
        System.out.println("objA=" + intA + " intB=" + intB);
        objA.setNum(2); // vai no local da memoria. onde objA e objB estão no mesmo local.
        System.out.println("objA=" + intA + " intB=" + intB);

    }
}
