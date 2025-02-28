# Estruturas Condicionais em Java

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
