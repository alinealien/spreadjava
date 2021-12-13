#  SPREAD JAVA DEVELOPER

###### (Página em Edição, desconsiderar os erros. Aos poucos vou corrigindo-os . Estou dando prioridade ao conteúdo e a execução do código, uso a página inicial (README) como um **diário de bordo** dos assuntos estudados.)

______



### Apresentação Geral - Aula Dominando IDEs

* **Java** é uma linguagem de progração orientada a objetos desenvolvida na década de 90, na empresa Sun Microsystems e posteriormente adquirida pela Oracle em 2008.
* Desde seu lançamento, em maio de 1995, a plataforma Java foi adotada mais rapidamente do que qualquer outra linguagem de programação na história da computação.
* Tornou-se popular pelo seu uso na internet e está presente em navegadores, programas e jogos de computadore, celular, calculadoras, etc...



<p style='text-align: center;'> Programa Java -> Compilador -> programa.class -> JVM -> Linguagem de máquina </p>

* Diferente das linguagens de programação compiladas, (a compilação do código se dá ainda em tempo de desenvolvimento) a linguagem Java é compilada para um bytecode que é interpretado por uma máquina virtual (JVM).

<p style='text-align: center;'> Plataforma x Linguagen </p>

* Linguagem de programação Java é a linguagem convencional da Plataforma Java, mas não é a sua única linguagem.

* Uma grande vantagem da plataforma é a de não estar presa a um único sistema operacional ou hardware, pois seus programas rodam através de uma máquina virtual que pode ser emulada.
* Java SE (Java Platform, Standard Edition) : É a base da plataforma que trás com ela algumas classes.
* Java EE (Java Platform, Enterprise Edition) : Responsavel pelo desenvolvimento Web
* Java ME (Java Plataform, Micro Edition) : Responsavel pelo desenvolvimento de dispositivos móveis e embarcado.



<p style='text-align: center;'> Fases da Execução Java </p>

1. Escrevemos o seu código-fonte (arquivo com a extensão .java)

2. Utilizamos o **JDK** para compilar o seu código-fonte e gerar o arquivo bytecode (arquivo com a extensão .class)

3. Para executar o seu programa, a **JVM** lê o arquivo compilado (.class) e as bibliotecas padrões do Java que estão no JRE.

   - JVM : Java Virtual Machine

   Java Source File -> Java Compiler -> Java Class File -> Java Virtual Machine -> Operating System 

   - JDK : Kit de desenvolvimento Java. Para desenvolver o código.

   - JRE: Ele que tem as classes padrões (apenas para rodar o código)

   - JVM: Quem vai executar o código.

     

<p style='text-align: center;'> JDK X JRE (Diferenças) </p>

* **JDK (Java Developent Kit)** - é o Kit de Desenvolvimento Java responsável por compilar código-fonte (.java) em bytecode (.class).

* **JVM (Java Virtual Machine)** - é a Máquina Virtual do Java responsável por executar o bytecode (.class).

* **JRE (Java Runtime Environmet)** - Ambiente de execução do Java que fornece as bibliotecas do Java para o JDK compilar o seu código e para a JVM executar seu programa.

  

<p style='text-align: center;'> Versões Java </p>

* Principal diferença entre OpenJDK e JDK Oracle: O **OpenJDK** é um Java totalmente open source com uma GNU General Public License e já o **JDK Oracle** requer uma licença comercial sob o Contrato de Licença de Código Binário Oracle.
* Os lançamentos das versões **OpenJDK LTS** (suporte de longo prazo) acontecem pelo menos a cada quatro anos.



<p style='text-align: center;'> O que é IDE </p>



* **IDE**, ou ambiente de desenvolvimento integrado, é um software que combina ferramentas comuns de desenvolvimento em uma única interface gráfica do usuário (GUI), facilitando o desenvolvimento de aplicações.
* O Java possui um conjunto de ferramentas para se desenvolver programas baseados nele, que são conhecidos como **Java Development Kit ou JDK**, sendo este o ambiente voltado para os desenvolvedores.
* A **JDK** faz parte do funcionamento das IDE's - programas de desenvolvimento como IntelliJ, Eclipse, NetBeans, etc.

______________________________________



### Variáveis, Tipos de Dados, Operadores Matemáticos em Java



* Conceituação e criação : "Variáveis são um espaço na memória do computador, onde se pode guardar valores" 

  1. Instância : objeto
  2. Classe: classe
  3. Local: dentro de métodos
  4. Parâmetro: Na assinatura do método

  - Padrão de definição:

    <?visibilidade?><?modificador?>tipo nome <?=valorInicial?>;

    V: "public", "protected" e "private" -> visibilidade

    M: "static" e "final"

    T: tipo de dado

    N: nome do que é fornecido a variável

    VI: um valor inicial, caso deseje

  - Convenções e regras:

    1. Não devem começar com números;

    2. Embora permitido, "$" e "_" devem ser evitados;

    3. São case-sensitive;

    4. Sem espaços;

    5. Não pode ser as palavras reservadas do Java;

       (abstract;  continue; for; new; switch; assert; default; goto; package; synchronize; boolean; do; if; private; this; break; double; case; Implements; throw; protected; byte; else; import; public; throws; enum; instanceof; return; transient; catch; extends; int; short; try; char; final; interface; static; void;class; finally; long; strictfp; volatile; const; float; super;while)

  - Boas Práticas:

    1. Sempre começar com letras minusculas;
    2. Nomes expressivos;
    3. Notação camelo;
    4. Quando constante(final) minuscula e separada por "_";
    
    EXS:
    
    - int quatidadeProduto;
    - **int QuantidadeProduto; **erro/n é boa prática
    - int final NUMEROS_TENTATIVAS = 5;
    - **int final numeroTentativas = 5;** erro/n é boa prática
    - **int NUMERO_TENTATIVAS = 5;** erro/n é boa prática
    - **int qtdProd;** erro/n é boa prática
    - int i; 

* Tipos de Dado : São os valores e consequentemente operações que as variaveis podem assumir, sofrer, respectivamente.

  - Tipicação:
    1. Estática(forte) vs Dinâmica(fraco)
    2. Primitivo vs Composto
  - Opções de tipos:
    1.  Textual
       - **char:caracteres de 16-bit unicode ->** char c = '\u0084'; ou char c = 'T';
       - **String: um tipo "especial" ->** String s = "T";
    2. Numeral
       - **byte: -128 até 127 ->** byte b = 15;
       - **short: -32.768 até 32.767 ->** short s = - 15785;
       - **int: -2.147.648 até 2.147.483.647 ->** int i = 8515785;
       - **long: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 ->** long l = 5938515785L;
       - **float: +-33.40282347E+38F ->** float f = 3.14...(f)
       - **double: +-1.79769313486231570E+308 ->** double d = 3.14...(d)
    3. Lógico
       - **boolean: true e false ->** boolean s = false;
    4. Objeto

* Operadores Aritméticos : São simbolos especiais quais são capazes de realizar ações específicas em , um ou mais operandos e, em seguida retornar um resultado.

  - Tipos:
    - pós-fixado: exp++ ou exp--
    - prefixado: ++exp ou --exp
    - aritmetico: +.=.*./ e %
    - atribuição: =, +=, -=, *=, /= e %=
  - Exemplos: 
    - int i = ++k; -> i = k + 1;
    - int j = k--; -> j = k; k = k - 1;
    - float f = 1.5f + 4.5f;
    - long l = 10398L * 5L;
    - double d = 45d / 4d;
    - int k = 15 % 4;
    - double d = f;
    - i +=5; -> i = i + 5;
    - j -= 3; -> j = j - 3;
    - d /= 2.7d; -> d = d/2.7d;
    - I *=3; -> I = I * 3;
    - k %= 2; -> k = k % 2;
  - Precedências:
    - Operador e Precedência:
      1. Pós-fixado: exp++, exp--
      2. Prefixado: ++exp, --exp
      3. Multiplicativo: *, /, %
      4. Aditivo: +, -
      5. Atribuição: =, +=, -=, *=, /=, %=

* Conversões(casting) : 

  - "É a transformação de determinada variável de tipo menos específico para um tipo mais específico"
    - Tipos:
      1. Upcast(Implícito):  Promoção de um tipo menor de dado para um tipo maior de dado (representação e armazenamento).
      2. Downcast(Explicíto): Promoção de um tipo maior para um tipo menor de dado (representação e armazenamento).





## Logica Condicional e Controle de Fluxo em Java

- ​	**Operadores Relacionais:** São simbolos especiais que são capazes de realizar comparação entre determinados operandos e, em seguida, retornar um resultado.
  * Tipos:
    1. Similaridade: igual, diferença
       - Igualdade: Determina se um operando é igual ao outro.
       - Diferença: Determina se um operando não é igual ao outro.
    
    - Símbologia:
    
      - Igualdade: ==
    
      - Diferença: !=
    
        
    
    2. Tamanho: maior, maior igual, menor, menor igual.
       - Tamanho
         - Maior: Determina se um operando é maior do que o outro
         - Maior Igual: Determina se um operando é igual a outro
       - Símbologia:
         - Maior: >
         - Maior Igual: >= 
    
    ​                                       
    
    Exemplos:
    
    ​       - int i1 = 10; int i 2 = 20; float f1 = 4.5f; float f2= 3.5f; char c1 = 'x'; char c2 = 'y'; String s1 = "Fulano"; String s2 = "Fulano"; boolean b1 = true; boolean b2 = false;
    
    
    
    ​      1.  i1 == i2, i1 != i2, i1 > i2, i1 <= i2
    
    ​      2.   f1 == f2, f1 != f2, f1 >= f2, f1 < f2
    
    ​      3. c1 == c2,  c1 != c2, c1 > c2, c1 <= c2
    
    ​      4. s1 == s2, s1 != s2, **s1 >= s2, s1 < s2**
    
          5. b1 == b2, b1 != b2, **b1 > b2, b1 <= i1** 
          5. I2 > f1
  
  
  
  
  
  * **Operadores Lógicos**: São simbolos especiais quais são capazes de realizar comparações lógicas entre operandos lógicos ou expressões e, em seguida, retorna um resultado.
  
- Tipos:

  1. Conjunção: Operação lógica que só é verdadeira quando ambos os operandos ou expressões envolvidas são verdade.

     - Simbologia: **&&**

     - Terminologia: **and(e)**

       

       | O-E  | O-E  | R    |
        | ---- | ---- | ---- |
       | V    | V    | V    |
        | V    | F    | F    |
       | F    | V    | F    |
        | F    | F    | F    |
       
  
   (O - Operando E - Expressão R - Resultado)
       
  
  2. Disjunção: Oepração que só é falsa quando ambos os operando ou expressões envolvidas são falsos.
  
     - Simbologia: **||**
  
     - Terminologia: **or(ou)**
  
       
  
       | O-E  | O-E  | R    |
        | ---- | ---- | ---- |
       | V    | V    | V    |
        | V    | F    | V    |
       | F    | V    | V    |
        | F    | F    | F    |
       
  
   (O - Operando E - Expressão R - Resultado)
       

  3. Disjunção exclusiva: Operação que só é verdade quando ambos os operandos ou expressões são opostos;
  
     - Simbologia: **^**
   - Terminologia: **xor**
  
   ​       
  
   | O-E  | O-E  | R    |
     | ---- | ---- | ---- |
   | V    | V    | F    |
     | V    | F    | V    |
     | F    | V    | V    |

     

     (O - Operando E - Expressão R - Resultado)

     

  4. Negação: Operação que inverte o valor lógico de um operando ou expressão.

     - Simbologia: **!**

     - Terminologia: **inverção**

       

       | O-E  | R    |
       | ---- | ---- |
       | V    | F    |
       | F    | V    |
       
       
       

(O - Operando E - Expressão R - Resultado)
     


### **Exemplos - Boas Práticas:**


​     
- Operadores bitwise: **& e |**
  
- Operadores shift:  **~, >>, >>>, <<**
  
  
  

boolean b1 = true; boolean b2 = false;

boolean b3 = true; boolean b4 = false;



​       b1 && b2, b1 && b3

​       b2 || b3, b2 || b4

​       b1 ^ b3, b4 ^ b1

​       !b1, !b2

​       (i1 > i2) || (f2 < f1)

​       ((i1 + i2) < (f2 - f1)) && true 



### **Boas Práticas**

- Crie variáveis auxiliares para guardar resultados intermediarios

  (salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)

  pode ser

  (salarioBaixo) && (muitosDependentes)

  boolean receberAuxilio = (salarioBaixo) && (muitosDependentes);





### Controle de Fluxo

- São estruturas que tem capacidade de direcionar o fluxo de execução do código.

  - Tipos:

    1. Decisão: É a estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de execução. 

       - **if, if-else, if-else-if, switch e operador ternário**

         **EX: if, if-else, if-else-if**

         if (condicao){

         }

         .............................

         if (condicao){

         }else{

         }

         .............................

         if (condicao){

         }else if (condicao){

         }else{

         }

         .................................

         if (idade > 18){

         }

         ..................................

         if (aprovado){

         }else {

         }

         ..................................

         if (casado && temFilhos){

         }else if (casado && semFilhos){

         }else {

         }

         ...........................................

         **Decisão: Operador Ternário:**

         condicao ? true : false;      condicao ? true : null;

         ligado? desligado : ligar;   emMovimento ? freia : null;

         .....................................................................................

         **Decisão: switch:**

    ​             Variável:              

    ​            byte

    ​           short

    ​           char

    ​           **int**

    ​          **enum**

    ​          **String**

    

    ​      swich (variavel){

    ​      case1:

    ​      break;

    ​      case ...

    ​      break;

    ​      default:

    ​      break;

    }

    2. Repetição: for, while, do while

    3. Interrupção:  break, continue e return



### Boas Práticas

- Switch é para valores exatos e if para expressões booleanas
- Evitar usar o default do switch para "cases genéricos"
- Evitar o efeito "flecha" dos if's
- Evitar muitos if's aninhados
- Usar a boa prática da aula 2 para diminuir o tamanho do if





### Blocos

É um grupo de 0 ou mais códigos quais trabalham em conjunto para executar uma operação.

Tipos:

* Locais: dentro de métodos

  {

  ...

  }

  ____

  if (autorizado){

  **Carregarperfil**

  **DirecionarPáginaPrincipal**

  }

  ____

  if (menorIdade){

  **DirecionarPáginaProibido**

  }

  _____

  

* Estáticos: dentro de classes

* Instância: dentro de classes







### Estruturas de Repetição e Array's em Java

________________________________________________________________________



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
