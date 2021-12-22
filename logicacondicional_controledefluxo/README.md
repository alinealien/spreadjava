### SPREAD JAVA DEVELOPER

### Logica Condicional e Controle de Fluxo em Java

_______________________________________________



#### Apresentação Geral - Logica Condicional e Controle de Fluxo em Java

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

