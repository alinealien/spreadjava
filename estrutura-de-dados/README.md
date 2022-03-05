### SPREAD JAVA DEVELOPER

_______________________________________________________

#### Estrutura de dados em Java - Introdução e Conceitos

**Tipos de Memória:**

* Memória Primária: (RAM) nela os dados são apagados na ausencia de energia (VOLÁTIL)
* Memória Secundaria: (ROM E OUTRAS MEMÓRIAS) Ela mantem os dados mesmo na ausencia de energia.(NÃO VOLÁTIL).

 **Sobre a memória RAM :** Composta por diversos chips, eles posuem endereços de memoria(regiões da memoria RAM que o SO gerencia). Cada chip é capaz de manter por determinado tempo milhões de bits. 

- Sobre o chip: Com energia (energizado) guarda (1)

- Sem energia: (não energizado) guarda (0);

**Tipos de dados**

| Tipo    | Memória Consumida | Valor Minimo               | Valor Máximo              | Precisão    |
| ------- | ----------------- | -------------------------- | ------------------------- | ----------- |
| boolean | 1 bit             | false                      | true                      | --          |
| byte    | 1 byte            | -128                       | 127                       | --          |
| char    | 2 byte            | '\u0000'                   | '\uffff'                  | --          |
| short   | 2 byte            | -32.768                    | 32.767                    | --          |
| int     | 4 bytes           | -2.147.483.648             | 2.147.483.647             | --          |
| long    | 8 bytes           | -9.223.372.036.854.770.000 | 9.223.372.036.854.770.000 | --          |
| float   | 4 bytes           | -3,4028E + 38              | 3,4028E + 38              | 6-7 dígitos |
| double  | 8 bytes           | -1,7976E + 308             | 1,7976E + 308             |             |



**Atribuição e Referência**

- As atribuições em Java são por cópia de valor sempre;
- Com tipo primitivo(int, float, double, string), copiamos o valor em memória;
- Com objetos copiamos o valor da referência em memória, sem duplicar o objeto;



**Conceito de nó e encadeamento de nó**

- Para trabalhar com estruturas de dados dinamicas, a gente não grava os dados na memoria. Utiliza-se o **NÓ**. 
- Um **Nó** é um espaço na memoria que armazena tanto o dado que queremos, como uma referecia a um nó.
- Encadeamento de nó:

**Generics**

- Lista<String> minhaLista = new Lista<>();

  public class Lista<T>{

  private T t;

  .

  .

  }

  - Contexto:
    - Evitar casting excessivo 
    - Evitar códigos redundantes 
    - Encontrar erros em tempo de compilação 
    - Introduzido desde o Java SE 5.0

--Wildcards--

- Unkknow Wildcards (Unbounded)
- Bounded Wildcards (Upper Bounded/ Lower Bounded)

--Unknown Wildcard-- 

public void imprimeLista(`List<?>lista`){

for(`Object obj: lista`){

System.out.println( obj)

}

}

List<Aluno> minhaLista = new List<Aluno>(); //funcao generica que imprime qualquer coisa. desde que tenha o string implementado. Genericos. 

imprimeLista(minhaLista);



--UpperBounded Wildcard--

public void imprimeLista(List<? extends Pessoa> listaPessoas){

for(Pessoa p: listaPessoas)

System.out.println(p);

}

}

List<Aluno> minhaLista = new List<Aluno>();

imprime(minhaLista);

//SO podemos ter na estrutura de generics (passar) listas de pessoas e descendentes de pessoas (herdeiros). 



--LowerBounded Wildcard--

//Qualquer herdeiro de **Pessoa**, neste metodo ele não irá aceitar (lista de qualquer herdeiro da classePessoa) Só irá aceitar da classe Pessoa para cima. 

public void imprimeLista(List<? super Pessoas> listaPessoa){

for(Pessoa p : listaPessoas){

System.out.println(p);

​    }

}

List<Aluno> minhaLista = new List<Aluno>();

imprimeLista(minhaLista);



**Convenção**

- **K** para "Key", exemplo : Map<K,V>
- **V** para "Value", exemplo : Map<K,V>
- **E** para "Element", exemplo : List<E>
- **T** para "Type", exemplo : Collections#addAll
- ? para quando genérico



**Refatoração da Classe No**

EX_1 :

public class No{

private String conteudo;

private No proximoNo = null

.

.

.

}

EX_1_Como vai ficar:

public class No<T>{

private T conteudo;

private No proximoNo = null

.

.

.

} //vai aceitar o conteudo de qualquer tipo. Vai criar um tipo T generico.



**Pilhas [LIFO: Last In, Frist Out]** 

- LIFO

  - Last in Frist Out
  - O ultimo elemento que entra é o primeiro a sair 

- Método Top (Aqui ele pega só a informação)

  - No meuNo = pilha.top();

    No meuNo = int -> Ref.Nó; (Aqui ele vai receber a referencia do primeiro Nó)
    
    int numero = meuNo.getInt();
  
- Método Pop (Aqui ele tira o primeiro "dado" da pilha, a referencia aqui vai mudar)

  - No meuNo = pilha.pop();

    No meuNo = int -> Ref. Nó; (Referencia do todo da fila que será tirado)

    int numero = meuNo.getInt(); (Aqui ela exclui o de cima, pega o primeiro Nó, no entanto, na pilha ele será apagado. ele exclui repassando a referencia de top no Nó logo abaixo )

    int numero = int; ()

- Método Push (Contrario do metodo pop )

  - No meuNo = new No();

    meuNo.setInt(1);

    meuNo -> int | null (Ele vai criar um novo nó e colocará ele no topo da pilha)

    (Fazer a referencia o proximo nó desse novo no apontar pro topo da pilha e gerar uma nova referencia que aponta pro topo da pilha, assim teremos o novo nó incluido na pilha)

- Método isEmpty (Diz se a pilha esta vazia ou não)

  - public boolean isEmpty(){

    if(refNo == null){

    return true;

    }

    return false; 

    }

    (Retorna a pilha ou estrutura de dados - verifica a referencia de entrada esta nula. Caso a referencia de no for null ela retornará true)

