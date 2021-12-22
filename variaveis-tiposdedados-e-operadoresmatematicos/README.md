### SPREAD JAVA DEVELOPER

#### Variáveis, Tipos de Dados, Operadores Matemáticos em Java

____________________________________

### Apresentação Geral - Variáveis, Tipos de Dados, Operadores Matemáticos em Java

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
    2.  Numeral
        - **byte: -128 até 127 ->** byte b = 15;
        - **short: -32.768 até 32.767 ->** short s = - 15785;
        - **int: -2.147.648 até 2.147.483.647 ->** int i = 8515785;
        - **long: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 ->** long l = 5938515785L;
        - **float: +-33.40282347E+38F ->** float f = 3.14...(f)
        - **double: +-1.79769313486231570E+308 ->** double d = 3.14...(d)
    3.  Lógico
        - **boolean: true e false ->** boolean s = false;
    4.  Objeto

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

