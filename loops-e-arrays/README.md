### SPREAD JAVA DEVELOPER

#### Estruturas de Repetição e Array's em Java

________________________________________________________________________

####  Apresentação Geral - Estruturas de Repetição e Array's em Java

- O real poder dos computadores está na sua habilidade para repetir uma operação  ou uma série de operações várias vezes.
- Cada repetição é chamada de laço (loop) é um dos conceitos básicos da programação estruturada.
- Uma estrutura  de repetição permite que  uma sequência de comandos seja executada repetidamente, caso determinadas condições sejam satisfeitas. 
- Essas condições são representadas por expressões lógicas.
- As estruturas de repetição podem ser classificadas em:
  1. Repetição com teste no início (while)
  2. Repetição com teste no final (do-while)
  3. Repetição contada (for)
- O comando **break** é utilizado para terminar de forma abrupta uma repetição 
- Quando o comando _continue_ é executado, os comandos restantes da repetição são ignorados e programa volta a testar novamente ou não.



![](C:\Workspace\imgs_estudos\aula_estruc_repet.png)



## OPERADORES DE INCREMENTO E DECREMENTO



Pré-Fixados

| PARA:                                     | USE O ATALHO: | FORMA ORIGINAL:                        |
| ----------------------------------------- | ------------- | -------------------------------------- |
| Somar uma unidade ao valor da variável    | ++numero;     | numero = numero + 1; (retorne numero)  |
| Subtrair uma unidade do valor da variável | --numero;     | numero = numero - 1; ( retorne numero) |



Pós-Fixados

| PARA:                                                      | USE O ATALHO: | FORMA ORIGINAL:                        |
| ---------------------------------------------------------- | ------------- | -------------------------------------- |
| Somar um ao valor da variável, retornando o valor original | numero++      | ( retorne numero) numero = numero + 1; |
| Subtrair um valor da variável, retornando o valor original | numero--      | ( retorne numero) numero = numero - 1; |



## Operações Aritméticas 



| PARA:                                    | USE O ATALHO: | FORMA ORIGINAL:      |
| ---------------------------------------- | ------------- | -------------------- |
| Somar k unidades ao valor da variável    | numero += k;  | numero = numero + k; |
| Subtrair k unidades do valor da variável | numero -= k;  | numero = numero - k; |
| Multiplicar o valor da variável por k    | numero *= k;  | numero = numero * k; |
| Dividir o valor da variável por k        | numero /= k;  | numero = numero / k; |





## Array's

- Array é um objeto utilizado para armazenar sequencialmente dados do mesmo tipo.
- Permanecem com o mesmo tamanho  depois de criados.

![](C:\Workspace\imgs_estudos\aula_array.png)



### Conceitos de Laços em Java

_____________________________________

"São estruturas que têm a capacidade de repetir a execução de um fluxo do código"

Tipos:

- For: Conjuntos finitos. (Ele é bom quando sabemos quantas vezes interamos o código)
- While: Condição permite. (Já o while é quando não sabemos as vezes exatas de iteração de código)



#### For

Estrutura básica do for:

for (ínicio, fim; incremente) {

}

Onde:

* início: expressão que indica o ponto de início
* fim: expressão que indica quando parar
* incremento: expressão faz o "for caminhar"



**For Clássico:**

EX 1_

for( int i = 0; i < 10; i++){

System.out.println("O valor de i é " + i);

} //ele vai de 0 até 9, pq é < do que 10.

.... EX_2

for ( int i = 10; i > 0; i--) {

System.out.println("O valor de i é: " + i)

} //ele vai do maior para o menor, do 10 ao 1

.......

**For each**

for (<TipoDeDado> variavel: itens) {

//códigos

} 

**For com loop infinito**

for ( ; ; ){

//Codigos

}



#### While

Estrutura básica do while:

while (expressao){

//códigos

}

Onde:

- expressão: expressão booleana que permite e comanda execução do while.



**While Clássico**

while (tentativas <= limiteTentativas){

//Faz a pergunta do quiz

//Atualiza a quantidade de tentativas

}



**While Infinito**

while (true) {

//códigos 

//ao final pode se verificar se ainda deve continuar executado.

}



#### Do-while

do {

//Faz a pergunta do quiz

//Atualiza a quantidade de tentativas

} while (tentativas <= miniteTentativas);

_______________________________

### Interruptores 

"São comandos que tÊm a capacidade de modificar o fluxo de execução de loops ou métodos"

Opções:

- Break (for e while)

- Continue (for e while)

- Return (pode ser usado com for e while, no entanto, ele gerar um erro inesperado)

  

  **Break**: 

  - Interrompe a execução do for, while e switch.
  - Opções de uso: não marcada(unlabeled)  e marcada(labeled)

  

  EX_1

  while(...){

  ...

  break;

  ...//daqui para baixo nada será executado

  }

  

  .....................................................................

  

  for(...;..; ...){

  ...

  if (...){ //if não é loop

  break; //o break pertence ao for

  }

  ...

  }

  

  .......................................................................

  

  for (... ; ..; ...){

  for(...; ..; ...){ //loop mais interno

  ...

  if(...){ //quando este if for satisfeito, ele executará o break

  break; //O break vai interromper o loop ao qual ele esta ligado(sempre), no caso o mais interno.

  }

  ...

  }

  

  ....................................................................

  

  do {

  ...

  if(...){

  break; //sempre que o break for executado ele vai interomper o while

  }

  ...

  }while(...);

  

  .......................................................................

  out: //label, eles sempre trabalham com break ou continue. a gente n consegue usar ele sozinho, se so criar esse label de cima o compilador vai gerar um erro pela falta do continue ou break.

  for (...; ..; ...) {

  for(...; ..; ...){

  ...

  if(...){ //se esse if for satisfeito ele executará o break.

  break out; //para usar a forma marcada do break, deve-se definir primeiro o label. Dessa forma ele consegue interromper os dois loops (for)

  }

  ...

  }

  }

  //continua daqui




#### Continue

- Interrompe parcialmente a execução do for, while. (Só faz om que o laço corrente do loop ele seja pulado, só pula um loop) Ele não é usado no switch;
- Opção de uso: não marcada(unlabeled) e marcada(labeled).



EX_1

while (...){

...

if(...) {

continue;

}

...

}

.................................

for (... ; ..; ...) {

...

if (...){

cointue;

}

...

}

....................................

for(...; ..; ...){

for(...; ..; ...){

...

if(...){

continue;

}

...

}

}

.........................................

do {

...

if(...){

conitue;

}

...

} while (...);

........................................

out:

for(...; ..; ...){

for(...; ..; ...){

...

if(...){

continue out;

}

...

}

}



#### Arrays

________________________________

"É um tipo de dados especial, onde um conjunto  de valores podem ser armazenados"

 

**Características:**

- Sequêncial
- Finito e fixo
- Homogêneo
- Indexado

**Terminologia:**

- Elemento: É o que esta guardado nas posições do array.
- Tamanho: É a capacidade maxima que o array poderá armazenar. (Fiixo e limitado)
- Índice: Forma que se usa para acessar.

Padrão de definição e inialização:

<tipo>[]nome <?=valorInicial?; //mais comum

OU

<tipo>nome[] <?=valorInicial?;

*Tipo de dado do array(int; floate; double)

*Nome: por onde acessa-la.

................................................................................

int[] idades = new int[10]; //aqui o valor ja foi definido (tamanho do array)

idades [0] = 27;

idades [1] = 31;

...

​                      int[] i = {10,25};

​                      int[] k = new int[] {1,2,3}; //aqui ele não definine tamanho, mas coloca os seus dados, que ja gera o valor do array. MAIS COMUM.

int[] j = new int[2]; //só criou e na hora que precisar poderá colacar depois os dados do array.



.................................................................................................................

int[] idades = new int[] {12,35,45,22,9,37,51,61};

for (int idade: idades){

//códigos

}

for (int i = 0; i < idades.length; i++) {

int idade = idades[i];

//codigos

}

...............................................................................................................

for (int idade: idades){

if(idade >= 18){

//Maior de idade

}

}



for (int i = 0; i < idades, length; i++){

int idade = idades[i];

if(idade >= 18){

//Maior de idade

}

}

.....................................................................................................................

#### Array de Array : Matriz

long[][] m = new long [3] [3];

...............

char[] jogo = new

char[3] [3];

jogo[0] [0] = 'X';

jogo[2] [1] = 'O';

....

int[] [] [] m = new int [3] [3] [3];

m[0] [0] [0] = 10;

m[1] [1] [0] = 15;

......



int [] [] m = new int[] [] {{1,2},{3,4}};

int[] [] I = {{5,6},{7,8}};

....

percorrer a matriz:

int [] [] idades = new int[] [] {{12,35}, {45,22}};



FOReach

for(int[] id1 : idades){

for(int id2 : id1){

System.out.println(id2)

}

}

}

FORclassico

for (int i = 0; i < idades.length; i++){

int[] id = idades[i];

for(int j = 0; j < id.length; j++){

System.out.println(idades[i] [j]);

}

}

...............................................

