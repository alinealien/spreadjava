public class Main {

    public static void main(String[] args) {

        // AUla IV - Conversões (casting)

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        long l1;
        int i1 = 10;
        l1 = i1;

        int i2;
        long l2 = 10000000000000000L;
        i2 = (int) l2;

        int i3;
        long l3 = 10000L;
        i3 = (int) l3;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 10000.5888888888888888888888888888888888888888888888888d;
        f3 = (float) d3;

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;

        System.out.println("b1:" + b1);
        System.out.println("l1:" + l1);
        System.out.println("i2:" + i2);
        System.out.println("i3:" + i3);
        System.out.println("d1:" + d1);
        System.out.println("f2:" + f2);
        System.out.println("f3" + f3);
        System.out.println("i4" + i4);

        b1 = (byte) d3;

        System.out.println("b1:" + b1);


    }
}

        /* // AULA III - Operadores Aritmetricos

        System.out.println("Prepos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
    }

    private static void prePos() {

        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("i:" + x);
    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d + b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println("a+b" + r1);
        System.out.println("c-a" + r2);
        System.out.println("d+b" + r3);
        System.out.println("e/a" + r4);
        System.out.println("c%b" + r5);

    }

    private static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d:" + d);

        i += 5; // i = i + 5;
        j -= 3; // j = j - 3
        d /= 2.7d; // d = d / 2.7d
        l *= 3; // l = l * 3
        k %= 2; // k = k % 2;

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("d:" + d);
        System.out.println("l:" + l);
        System.out.println("k:" + k);

        i = k = j;

        System.out.println("k:" + k);
        System.out.println("i:" + i);

    }

    private static void precedencia(){

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580

        System.out.println("i++ + --j * k:" + a);
        System.out.println("i:" + i); //11

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1

        System.out.println("k / --i % 3 + 1:" + b);
        System.out.println("i:" + i);

        int c = 2;

        c *= i += 5; // c = 2 * i; i = i + 5 -> c = 2 * i;  i = 10 + 5; -> c = 2 * 15; -> c = 2 * 15; c = 30

        System.out.println("c *= i += 5: " + c);

    }

}
        //AULA II

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000;

        //int il = -10000000000;
        int i2 = 285000;

        long l1 = 100000000000000000L;
        long l2 = 20400500050005500L;

        //float f1 = 4.5;
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.84d;

        char c1 = 'B';
        //char c2 = 'Tw';
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        //String st3 = "ag dgb se se et t KKBJBJBB &*"6%6 75894389";

        String dt1 = "04/01/1991";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(d1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);

        // FIM AULA II




        /* AULA I - Conceituação e criação

        int i;
        //int i;
        int I;
        //int 1a;
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15;
        int asrn24678md;
        //int asrn246 78md;
        //int asrn24678md = 10;
        //int asrn246%78md = 10;

        asrn24678md = 100;
        //asrn246%78md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5;
        int QUANTIDADE_OPCOES = 25;
        int qtdProd;

        System.out.println(i);
        System.out.println(i);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        //System.out.println(asrn2$4678md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

}
}
//FIM AULA I */