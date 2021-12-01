#  SPREAD JAVA DEVELOPER

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

* Tipos de Dados :

* Operadores Aritméticos :

* Conversões(casting) : 





