# Guia Rápido: Nomenclatura e Tipos Primitivos em Java

## Nomenclatura

Seguir boas práticas de nomenclatura melhora a legibilidade e manutenção do código. Aqui estão algumas diretrizes:

### 1. **Projetos e Pacotes**

- **Nome de projeto**: Deve ser descritivo e em inglês.  
  Exemplo: `java-cloud-course`

- **Nome de pacotes**: Sempre em minúsculas e no formato reverso do domínio.  
  Exemplo: `com.meuprojeto.utils`

### 2. **Classes e Interfaces**

- **Classes**: Nomeia-se com **PascalCase** (Primeira letra de cada palavra maiúscula).  
  Exemplo: `ClienteService`

- **Interfaces**: Mesmo padrão de classes, mas com nomes que indicam comportamento.  
  Exemplo: `Autenticavel`

### 3. **Métodos**

- Devem ser verbos em **camelCase**.  
  Exemplo: `calcularTotal()`, `obterUsuario()`

### 4. **Variáveis**

- **Variáveis comuns**: **camelCase**.  
  Exemplo: `quantidadeProdutos`

- **Constantes**: Sempre em **UPPER_SNAKE_CASE**.  
  Exemplo: `TAXA_JUROS`

  Essas práticas ajudam a manter um código mais organizado e compreensível. 🚀

---

## Tipos Primitivos em Java

Java possui oito tipos primitivos fundamentais:

| Tipo    | Tamanho  | Valor Padrão | Faixa de Valores                        |
|---------|----------|--------------|-----------------------------------------|
| `byte`  | 8 bits   | 0            | -128 a 127                              |
| `short` | 16 bits  | 0            | -32.768 a 32.767                        |
| `int`   | 32 bits  | 0            | -2^31 a 2^31 - 1                        |
| `long`  | 64 bits  | 0L           | -2^63 a 2^63 - 1                        |
| `float` | 32 bits  | 0.0f         | Precisão de 6-7 dígitos decimais        |
| `double`| 64 bits  | 0.0d         | Precisão de 15 dígitos decimais         |
| `char`  | 16 bits  | '�'          | Caracteres Unicode                     |
| `boolean`| 1 bit   | false        | true ou false                           |

---

## Variáveis e Constantes 

- **Variável** é uma área de memória, associada a um nome, que pode armazenar valores d eum determinado tipo. Um tipo de dado define um conjunto de valores e um conjunto de operações. 

- **Java** é uma linguagem com rigidez de tipos, diferente de linguagens como o JavaScript, onde declarar o tipo da variável não é obrigatório.  

- **Constantes** são valores armazenados em memória que não podem ser modificados após sua declaração. Em Java, esses valores são representados pela palavra `final`. E por convenção,  
  Constantes são sempre escritas em CAIXA ALTA.

## Operadores

Simbolos especiais com significado próprio para a linguagem e associados a determinadas operações  

- **Operadores Aritméticos** são utilizados para realizar operações matemáticas entre valores numéricos, podendo gerar expressões simples e complexas.  
  São eles: ```+``` (adição), ```-``` (subtração), ```*``` (multiplicação), e ```/``` (divisão).    
  
- **Operadores Unários** são operadores que atuam sobre um único operando, como ```+``` (positivo), ```-``` (negativo), ```++``` (incremento), ```--``` (decremento) e ```!``` (negação lógica).  

- **Operadores Relacionais** são usados para comparar valores, retornando um resultado booleano (`true` ou `false`). São eles: ```==``` (igual a), ```!=``` (diferente de), ```>``` (maior que), ```<``` (menor que), ```>=``` (maior ou igual a) e ```<=``` (menor ou igual a).  

- **Operadores Lógicos** permitem combinar expressões booleanas, avaliando múltiplas condições. Os principais são: ```&&``` (E lógico), ```||``` (OU lógico) e ```!``` (NÃO lógico, que inverte o valor booleano).  

- **Operador Ternário** é uma forma reduzida de escrever condicionais, no formato ```condição ? valor_se_verdadeiro : valor_se_falso```. Exemplo:  

  ```java
  int idade = 18;
  String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";

## Métodos  

Afinal, o que são **Métodos** ?  
  
- Todas as ações das aplicações são consideradas métodos.  
  
- Os Métodos correspondem a **funções** ou **sub-rotinas** disponíveis dentro de nossas classes.  
  
Assim como outros elementos, **Métodos** também possui critérios de nomeação que seguem convenções.  
São eles:  
  
- Deve ser nomeado como verbo.  
  
- Seguir o padrão camelCase, tendo como maiúscula a primeira letra da segunda palvra.  
  
Caso um **Método** não retorne nenhum valor, este, será representado pela palavra-chave **void**.  
  
Também, devemos sempre refletir que **exceções** são comuns na execução de métodos, as vezes é necessário prever e tratar adequadamente possíveis falhas ou comportamentos inadequados.  
  
Durante a implementação de métodos, sua **visibilidade** é muito importante, devendo sempre especificar a que nível esse método será visivél dentro da aplicação.  
  .
- **public** → Permite o acesso de qualquer classe, dentro ou fora do pacote.
- **private** → Restringe o acesso apenas à própria classe onde foi declarado.  
- **protected** → Permite o acesso dentro do mesmo pacote e por subclasses (mesmo que estejam em pacotes diferentes).
- **default** → Torna o método acessível apenas dentro do mesmo pacote.

```
Considere olhar o Projeto de exemplo projeto sistema-smart-tv. Nele, conseguimos observar  
implementações de métodos simples, para manipulação dos estados de uma Televisão simples  
por um usuário 
