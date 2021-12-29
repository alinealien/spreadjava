## SPREAD JAVA DEVELOPER



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