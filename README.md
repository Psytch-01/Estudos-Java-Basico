# Java Básico ☕

Códigos desenvolvidos e materiais estudados durante o curso de **Java Básico** na [Digital Innovation One](https://www.dio.me/).  

## ✍️ Autor  

<table>
  <tr>
    <td><center><img src="https://github.com/Psytch-01/DIO-Java-Basico/blob/main/Assets/Psytch-.png" width="85" style="border-radius: 50%;"></center></td>
    <td>
      <strong><a href="https://github.com/Psytch-01">Julio Cesar Agusso</a><br></strong>
      <strong>Estudante de Tecnologia | Back-end </strong>
    </td>
  </tr>
</table>

## 📚 Documentação

[<img src="https://raw.githubusercontent.com/Psytch-01/DIO-Java-Basico/main/Assets/1.png" alt="Imagem 1" width="100" style="margin-right: 20px;"/>](https://git-scm.com/doc)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; [<img src="https://raw.githubusercontent.com/Psytch-01/DIO-Java-Basico/main/Assets/2.png" alt="Imagem 2" width="100"/>](https://docs.github.com/pt)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[<img src="https://raw.githubusercontent.com/Psytch-01/DIO-Java-Basico/main/Assets/JavaLogo.png" alt="Imagem 1" width="100" style="margin-right: 20px;"/>](https://docs.oracle.com/en/java/)

## 📖 Sobre o Repositório

Este repositório foi criado para apoiar minha jornada de estudos e desenvolvimento, com foco na minha especialização em Java. Aqui, compartilho:

- Códigos desenvolvidos durante o aprendizado.
- Materiais e anotações sobre os conceitos essenciais da linguagem.

O objetivo é registrar meu progresso e criar um espaço para aprendizado contínuo, onde cada avanço reflete meu empenho em dominar a linguagem e aplicar seus fundamentos em projetos reais.

---

## Projetos 🛠️

### 📌 Sintaxe Básica Java

| Projeto | Descrição |
|---------|-----------|
| **[Tipos de Variáveis](https://github.com/Psytch-01/DIO-Java-Basico/tree/main/sintaxe-basica-java/tipos-variaveis)** | Exploração dos diferentes tipos de variáveis em Java e suas aplicações. |
| **[Controle de Fluxo](https://github.com/Psytch-01/DIO-Java-Basico/tree/main/sintaxe-basica-java/controle-fluxo)** | Estudo sobre estruturas de controle de fluxo, incluindo condições e laços em Java. |
| **[Java Terminal](https://github.com/Psytch-01/DIO-Java-Basico/tree/main/sintaxe-basica-java/java-terminal)** | Desenvolvimento de uma aplicação Java com execução diretamente pelo terminal, explorando conceitos básicos de input e output. |
| **[Palavras Reservadas Java](https://github.com/Psytch-01/DIO-Java-Basico/tree/main/sintaxe-basica-java/palavras-reservadas-java)** | Análise detalhada das palavras reservadas da linguagem Java, explicando suas funções e usos dentro do código. |
| **[Sistema Smart TV](https://github.com/Psytch-01/DIO-Java-Basico/tree/main/sintaxe-basica-java/sistema-smart-tv)** | Implementação de um sistema simples de controle de uma smart TV, onde comandos de uma classe controlam o comportamento de outra classe. |
| **Projetos Complementares e Desafios** ↓↓ | |
| **[Desafio Controle de Fluxo](https://github.com/Psytch-01/DIO-Java-Basico/tree/main/sintaxe-basica-java/DesafioControleFluxo)** | Implementação de um desafio focado em controle de fluxo, aplicando condições e laços em Java. |
| **[Controle de Candidatos](https://github.com/Psytch-01/DIO-Java-Basico/tree/main/sintaxe-basica-java/controle-candidatos)** | Sistema para gerenciar candidatos, analisando dados e aplicando filtros com estruturas condicionais. |
| **[Desafios de Código](https://github.com/Psytch-01/DIO-Java-Basico/tree/main/sintaxe-basica-java/desafios-codigo)** | Conjunto de desafios de lógica e programação para reforçar conceitos básicos e avançados de Java. |

---

### 📌 Futuro: Hierarquia entre Classes e Outros Tópicos

*(Em breve, serão adicionados novos projetos sobre temas como hierarquia entre classes, herança entre objetos no Java, etc.)*


## 🚀 Inicialização do Git & GitHub

Para configurar e iniciar seu repositório Git localmente:

```sh
git init
git add .
git commit -m "Primeiro commit"
git branch -M main
git remote add origin <URL_DO_REPOSITORIO>
git push -u origin main

```

# Guia Rápido: Nomenclatura e Tipos Primitivos em Java ⚙️

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

## Variáveis e Constantes 📊

- **Variável** é uma área de memória, associada a um nome, que pode armazenar valores d eum determinado tipo. Um tipo de dado define um conjunto de valores e um conjunto de operações. 

- **Java** é uma linguagem com rigidez de tipos, diferente de linguagens como o JavaScript, onde declarar o tipo da variável não é obrigatório.  

- **Constantes** são valores armazenados em memória que não podem ser modificados após sua declaração. Em Java, esses valores são representados pela palavra `final`. E por convenção,  
  Constantes são sempre escritas em CAIXA ALTA.

## Operadores 🔧

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

## Métodos 🧰 

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


## 📌 Projeto de Exemplo  
Considere analisar o projeto **[sistema-smart-tv](https://github.com/Psytch-01/DIO-Java-Basico/tree/main/sintaxe-basica-java/sistema-smart-tv)**, que demonstra a implementação de métodos simples para manipular os estados de uma TV de forma interativa.
 

---

## Escopo de Variáveis  

O **escopo** determina onde uma variável pode ser acessada dentro do código. Em Java, o escopo de uma variável **depende do bloco onde ela foi declarada**.  

Se uma variável for declarada dentro de um bloco específico, ela só poderá ser acessada dentro desse mesmo bloco. Caso contrário, tentativas de leitura ou modificação resultarão em erro.  

Um bom entendimento sobre **escopo** é essencial para evitar falhas estruturais e garantir a integridade da aplicação.  

###  Tipos de Escopo  

- **Escopo de Classe** → Variáveis declaradas dentro da classe podem ser acessadas por diferentes métodos dessa classe, dependendo do modificador de acesso.  
- **Escopo de Método** → Variáveis declaradas dentro de um método são acessíveis apenas dentro desse método e deixam de existir após sua execução.  
- **Escopo de Bloco** → Variáveis declaradas dentro de blocos de controle (como `if`, `for` e `while`) existem apenas dentro desses blocos.  
  
## Palavras Reservadas da Linguagem Java ☕
No Java, existem 52 palavras reservadas que têm um significado especial para a linguagem e **não podem ser usadas como identificadores** (nomes de variáveis, métodos, classes, etc.).  

Essas palavras fazem parte da sintaxe do Java e são utilizadas para definir a estrutura e o comportamento dos programas.  

📌 Para acessar o Arquivo com um resumo de todas elas, considere ler o README do projeto [palavras-reservadas-java](https://github.com/Psytch-01/DIO-Java-Basico/blob/main/sintaxe-basica-java/palavras-reservadas-java/README.md).

## 📖 Javadoc

O **Javadoc** é uma ferramenta oficial do Java usada para gerar **documentação de API** a partir do código-fonte. Ele permite que você documente seu código de maneira estruturada e acessível, criando um guia completo para outros desenvolvedores que irão interagir com suas classes e métodos.

### Como usar o Javadoc?

Após adicionar os comentários Javadoc ao seu código, você pode gerar a documentação HTML executando o seguinte comando no terminal (dentro da pasta do projeto):  

```javadoc -d docs *.java```  

Isso irá gerar arquivos HTML que podem ser acessados no navegador, oferecendo uma visualização clara e organizada da documentação do seu código.  

## 📟 >_ Terminal e Argumentos

É muito importante obter o conhecimento de como funciona a execução de uma aplicação. Imagine ter que passar para o cliente que ele  
precisará instalar uma IDE para executar o sistema.  
  
Com a JVM devidamente configurada, podemos criar um executável da nossa aplicação, e disponibilizar o instalador para qualquer sistema.

📌 Para mais informações sobre **entrada de dados, argumentos e execução de programas**, confira o [**README do projeto java-terminal**](https://github.com/Psytch-01/DIO-Java-Basico/blob/main/sintaxe-basica-java/java-terminal/README.md).

### Comandos Básicos MS-DOS

#### 📁 Comandos de Navegação e Arquivos  
- `dir` → Lista arquivos e pastas do diretório atual.  
- `cd [pasta]` → Entra em uma pasta específica.  
- `cd ..` → Volta para o diretório anterior.  
- `cls` → Limpa a tela do terminal.  
- `mkdir [nome]` → Cria uma nova pasta.

## Estruturas Condicionais em Java

Estruturas Condicionais são elementos importantíssimos na criação de programas. Elas permitem a tomada de decisão com base em condições específicas.   
Assim, essas estruturas permitem a execução ou não de blocos de códigos dependendo de um teste lógico, como uma comparação entre valores, por exemplo.  
Elas ajudam a controlar o fluxo de execução de acordo com as condições implementadas pelo dev, o ajudando a criar programas mais dinâmicos e capazes   
de reagir diferente as entradas do usuário ou outras variáveis.  

Aqui você encontrará explicações e exemplos sobre:
- **Condicional Simples** (`if`) - Executa um bloco de código se a condição for verdadeira.
- **Condicional Composta** (`if-else`) - Define um caminho alternativo caso a condição não seja atendida.
- **Condicional Encadeada** (`if-else-if`) - Permite múltiplas verificações em sequência.
- **Condição Ternária** (`? :`) - Uma forma reduzida de `if-else` para expressões simples.
- **Switch Case** - Alternativa para múltiplas verificações baseadas no valor de uma variável, geralmente usada para tipos como `int`, `char`, `String` e `enum`.

📌 **Para um estudo mais aprofundado, considere ler o README do [projeto controle-fluxo](https://github.com/Psytch-01/DIO-Java-Basico/blob/main/sintaxe-basica-java/controle-fluxo/README.md)**

## Laços de Repetição 🔄

As **Estruturas de Repetição** permitem executar blocos de código várias vezes, com base em condições definidas pelo programador. Elas são fundamentais para automatizar tarefas repetitivas.

### Tipos de Laços

- **for** → Ideal quando o número de repetições é conhecido.
  ```java
  for (inicialização; condição; incremento) {
    // Código a ser repetido
  }

  --------------------------------------------

  for (int i = 0; i < 10; i++) {
      System.out.println(i);
  }
  ```

- **while** → Utilizado quando o número de repetições é desconhecido e depende de uma condição.
  ```java
  int i = 0;
  while (i < 10) {
      System.out.println(i);
      i++;
  }
  ```

- **do-while** → Semelhante ao `while`, mas garante que o bloco de código será executado pelo menos uma vez.
  ```java
  int i = 0;
  do {
      System.out.println(i);
      i++;
  } while (i < 10);
  ```

Essas estruturas oferecem controle sobre o fluxo de execução, tornando o código mais eficiente e flexível.  

📌 **Para uma explicação mais detalhada sobre laços de repetição, confira o README do [projeto estruturas-repeticao](https://github.com/Psytch-01/DIO-Java-Basico/tree/main/sintaxe-basica-java/controle-fluxo).**

## Tratamento de Exceções ⚠️

Em Java, exceções são eventos que ocorrem durante a execução do programa e podem interromper seu fluxo normal. Para lidar com essas situações de forma controlada, utilizamos a estrutura `try-catch` e, opcionalmente, o bloco `finally`.

- **`try`**: Envolve o código que pode gerar uma exceção.
- **`catch`**: Captura e trata a exceção específica, evitando que o programa pare abruptamente.
- **`finally`**: Executado sempre, independentemente de ocorrer uma exceção ou não. Normalmente usado para liberar recursos, como conexões de banco de dados ou arquivos.



O tratamento adequado de exceções torna o código mais seguro, prevenindo falhas inesperadas e garantindo um melhor controle do fluxo do programa.

📌 **Para uma explicação mais aprofundada sobre o tratamento de exceções, confira o README do [projeto controle-fluxo](https://github.com/Psytch-01/DIO-Java-Basico/tree/main/sintaxe-basica-java/controle-fluxo).**


---

# Fundamentos da Programação Orientada a Objetos com Java ☕

A Programação Orientada a Objetos (POO) é um dos pilares fundamentais do desenvolvimento em Java. Nesta seção, abordaremos conceitos essenciais, como **Classes**, **Pacotes**, **Visibilidade dos Recursos**, **Getters e Setters**, **Construtores** e **Enums**.

## Classes

Organização das Classes
Em um projeto bem estruturado, a separação das responsabilidades dentro do código é essencial. Em Java, geralmente organizamos nossas classes em diferentes categorias:

- Classes de modelo (Model)
- Classes de serviço (Service)
- Classes de repositório (Repository)
- Classes de controle (Controller)

Essa separação melhora a manutenibilidade e a escalabilidade do código.


## Pacotes

Pacotes são usados para organizar classes e evitar conflitos de nomes. No Java, um pacote é declarado no topo do arquivo:

```java
package com.meuprojeto.veiculos;

public class Carro {
    // Código da classe
}
```

Para utilizar uma classe de um pacote em outro arquivo, usamos o comando `import`:
```java
import com.meuprojeto.veiculos.Carro;
```
Dessa forma, podemos utilizar a classe `Carro` dentro de outro código sem problemas.

## Visibilidade dos Recursos

A visibilidade determina onde uma classe, atributo ou método pode ser acessado. Java possui quatro modificadores de acesso:

- **`public`** → Acessível de qualquer lugar do código.
- **`private`** → Acessível apenas dentro da própria classe.
- **`protected`** → Acessível dentro do mesmo pacote e por subclasses.
- **(Sem modificador - default)** → Acessível apenas dentro do mesmo pacote.

## Getters e Setters

Os métodos **getter** e **setter** são usados para controlar o acesso a atributos privados de uma classe, garantindo o encapsulamento.

Exemplo:
```java
public class Carro {
    private String marca;
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
```
Aqui, o método `getMarca()` retorna o valor do atributo `marca`, enquanto `setMarca(String marca)` permite modificar esse valor de forma controlada.

## Construtores

Construtores são métodos especiais que são chamados automaticamente quando um objeto é instanciado. Eles inicializam os atributos de um objeto.

### Exemplo de Construtor Padrão:
```java
public class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro() {
        System.out.println("Um carro foi criado!");
    }
}
```



Ao criar um novo carro, podemos inicializar os valores diretamente:
```java
Carro meuCarro = new Carro("Toyota", "Corolla", 2022);
```

## Enums

Os **enums** são usados para definir um conjunto fixo de constantes nomeadas. Eles ajudam a tornar o código mais legível e seguro.

Exemplo de Enum:
```java
public enum DiaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
}
```


📌 **Para um estudo mais aprofundado sobre `Categorias de Classes`, `Visibilidade de Recursos`, ` Getters & Setters`, `Construtores` e `Enums`, confira o README do [projeto getters-setters](https://github.com/Psytch-01/DIO-Java-Basico/tree/main/Orienta%C3%A7%C3%A3o-Objetos/getters-setters).**

---