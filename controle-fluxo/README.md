# Estruturas Condicionais e controle de fluxo em Java

Esse projeto envolve as estruturas condicionais, que são fundamentais para o controle de fluxo em Java.  
O objetivo é fornecer uma explicação breve, com exemplos práticos para cada tipo de estrutura condicional.  
As estruturas condicionais permitem que um programa tome decisões com base em determinadas condições. Em Java, temos quatro principais tipos de estruturas condicionais:

## 1. Condicional Simples
A condicional simples utiliza apenas o `if`, executando um bloco de código caso a condição seja verdadeira.

```java
int numero = 10;
if (numero > 0) {
    System.out.println("Número positivo");
}
```

## 2. Condicional Composta
A condicional composta adiciona a cláusula `else`, permitindo executar um bloco alternativo caso a condição seja falsa.

```java
int numero = -5;
if (numero > 0) {
    System.out.println("Número positivo");
} else {
    System.out.println("Número negativo ou zero");
}
```

## 3. Condicional Encadeada
Quando há múltiplas condições a serem verificadas, utilizamos o encadeamento de `if-else`.

```java
int numero = 0;
if (numero > 0) {
    System.out.println("Número positivo");
} else if (numero < 0) {
    System.out.println("Número negativo");
} else {
    System.out.println("Número é zero");
}
```

## 4. Condição Ternária
A condição ternária é uma forma reduzida de escrever um `if-else` simples, utilizando `? :`.

```java
int numero = 5;
String resultado = (numero > 0) ? "Número positivo" : "Número não positivo";
System.out.println(resultado);
```

## 5. Switch Case
O `switch` é útil quando há múltiplos casos baseados no valor de uma variável.

```java
int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    default:
        System.out.println("Outro dia");
}
```

Essas estruturas são ótimas para o controle de fluxo nos programas Java. Usá-las em diferentes cenários ajuda a entender melhor o funcionamento de cada uma!

# 📌 Estruturas de Repetição em Java

As estruturas de repetição permitem executar um bloco de código várias vezes, com base em uma condição. Elas são essenciais para a automação de tarefas repetitivas e para o processamento de coleções de dados. Em Java, temos três principais tipos de laços de repetição:

## 🔄 1. `for` – Quando o número de repetições é conhecido

O laço `for` é ideal quando sabemos **quantas vezes** queremos que o código seja executado. Ele segue a estrutura:

```java
for (inicialização; condição; incremento) {
    // Código a ser executado em cada iteração
}
```

### 🛠 Componentes do `for`:
- **Inicialização** → Executada apenas uma vez antes do loop começar. Normalmente, inicializa uma variável de controle.
- **Condição** → Avaliada antes de cada iteração. Enquanto for `true`, o loop continua.
- **Incremento** → Atualiza a variável de controle ao final de cada iteração.

### 📌 Exemplo:
Imprimindo os números de 1 a 5:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}

```

### 🔄 Variações do `for`
#### 1. Laço `for` decrementando

```java
for (int i = 5; i > 0; i--) {
    System.out.println("Contagem regressiva: " + i);
}
```

#### 2. `for` aninhado (loop dentro de outro loop)

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println("i: " + i + ", j: " + j);
    }
}
```

---

## 🔄 2. `while` – Quando o número de repetições é incerto

O `while` é usado quando **não sabemos quantas vezes** o código será executado de antemão. Ele continua rodando **enquanto** a condição for verdadeira.

### 📌 Exemplo:
Lendo números do usuário até que ele digite `0`:

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int numero;

System.out.println("Digite um número (0 para sair):");
numero = scanner.nextInt();

while (numero != 0) {
    System.out.println("Você digitou: " + numero);
    System.out.println("Digite outro número (0 para sair):");
    numero = scanner.nextInt();
}

System.out.println("Encerrando...");
scanner.close();
```

### 🔄 Variações do `while`
#### 1. Contador com `while`

```java
int contador = 1;
while (contador <= 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

---

## 🔄 3. `do-while` – Garante pelo menos uma execução

A estrutura `do-while` é semelhante ao `while`, mas com uma diferença crucial: **o bloco será executado pelo menos uma vez, mesmo que a condição seja falsa logo na primeira verificação**.

### 📌 Exemplo:
Solicitando ao usuário que digite um número positivo:

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int numero;

do {
    System.out.println("Digite um número positivo:");
    numero = scanner.nextInt();
} while (numero < 0);

System.out.println("Número válido: " + numero);
scanner.close();
```

Mesmo que o usuário digite um número negativo na primeira tentativa, a mensagem ainda será exibida pelo menos uma vez.

---

## 📌 Diferença entre `while` e `do-while`
| Critério | `while` | `do-while` |
|----------|--------|------------|
| Execução mínima | 0 vezes (se a condição for falsa no início) | Pelo menos 1 vez |
| Avaliação da condição | Antes de entrar no loop | Após executar o bloco |
| Uso recomendado | Quando não sabemos se o bloco precisa ser executado | Quando queremos garantir pelo menos uma execução |

---

## 🔄 4. Interrompendo e controlando loops

### `break` – Interrompe o loop imediatamente
Se for necessário sair do loop antes que a condição seja falsa, usamos `break`.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        System.out.println("Interrompendo o loop no 5");
        break;
    }
    System.out.println("Número: " + i);
}
```

### `continue` – Pula a iteração atual e continua o loop
Se quisermos pular uma iteração específica, usamos `continue`.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        System.out.println("Pulando o número 3");
        continue;
    }
    System.out.println("Número: " + i);
}
```

---

## 📌 Conclusão

As estruturas de repetição são fundamentais para a programação, permitindo a automação de tarefas repetitivas. Escolher a estrutura correta depende do contexto:

- **`for`** → Quando sabemos quantas vezes o loop deve rodar.
- **`while`** → Quando o número de repetições depende de uma condição externa.
- **`do-while`** → Quando queremos garantir pelo menos uma execução.

---

# Tratamento de Exceções: Try-Catch e Finally

No Java, exceções são eventos que podem interromper o fluxo normal de um programa. Para lidar com esses erros de forma controlada, utilizamos `try-catch` e `finally`.

## `try-catch`
O bloco `try` contém o código que pode gerar uma exceção, enquanto o bloco `catch` trata a exceção caso ela ocorra. Exemplo:

```java
try {
    int resultado = 10 / 0; // Isso causará uma  exceção ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Erro: divisão por zero não permitida.");
}
```

## `finally`
O bloco `finally` é opcional e contém código que sempre será executado, independentemente de uma exceção ter ocorrido ou não. Ele é útil para liberar recursos, como fechar arquivos ou conexões de banco de dados.

```java
try {
    System.out.println("Executando código...");
} catch (Exception e) {
    System.out.println("Ocorreu um erro: " + e.getMessage());
} finally {
    System.out.println("Bloco finally sempre será executado.");
}
```

Esse mecanismo ajuda a tornar os programas mais robustos e a evitar falhas inesperadas durante a execução.

## Hierarquia de Exceções 🏛️

As exceções em Java são organizadas em uma hierarquia de classes dentro do pacote `java.lang`. Todas as exceções são derivadas da classe `Throwable`, que se divide em duas principais categorias:

- **Exception**: Representa exceções verificadas (*checked exceptions*), que devem ser tratadas obrigatoriamente pelo programador. Exemplo: `IOException`, `SQLException`.
- **RuntimeException**: Exceções não verificadas (*unchecked exceptions*), que ocorrem durante a execução do programa e não precisam ser obrigatoriamente tratadas. Exemplo: `NullPointerException`, `ArithmeticException`.

<br>

<img src="https://raw.githubusercontent.com/Psytch-01/DIO-Java-Basico/main/Assets/ExceptionHierarchy.png" alt="Imagem ExceptionHierarchy"/>
