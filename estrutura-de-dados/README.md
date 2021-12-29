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