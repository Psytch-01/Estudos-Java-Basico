# Tipos Primitivos em Java

Este projeto explora os tipos primitivos da linguagem Java, abordando suas definições, características e usos fundamentais para o desenvolvimento de aplicações. O objetivo é entender os diferentes tipos de dados que Java oferece e como eles são utilizados para armazenar valores de diferentes naturezas.

## 🛠️ Objetivo

O principal objetivo deste projeto é:

- **Compreender os tipos primitivos** que Java oferece.
- **Demonstrar exemplos práticos** de como cada tipo primitivo é utilizado no código.
- **Mostrar as diferenças entre os tipos de dados**, como inteiros, flutuantes, booleanos e caracteres.

## Estrutura do Projeto 📂
Este repositório contém o seguinte:

Código-fonte: Exemplos e demonstrações de cada tipo primitivo em Java.
README.md: Documento explicativo sobre o projeto, conceitos e exemplos.

## 📝 Tipos Primitivos em Java

Java possui 8 tipos primitivos, que são os blocos fundamentais para a construção de variáveis e manipulação de dados na linguagem:

1. **byte**  
   Tipo de dado inteiro de 8 bits, com valor entre -128 e 127.
   
2. **short**  
   Tipo de dado inteiro de 16 bits, com valor entre -32.768 e 32.767.

3. **int**  
   Tipo de dado inteiro de 32 bits, com valor entre -2^31 e 2^31 - 1.

4. **long**  
   Tipo de dado inteiro de 64 bits, com valor entre -2^63 e 2^63 - 1.

5. **float**  
   Tipo de dado flutuante de 32 bits, usado para representar números decimais com precisão simples.

6. **double**  
   Tipo de dado flutuante de 64 bits, utilizado para representar números decimais com precisão dupla.

7. **boolean**  
   Tipo de dado lógico, representando verdadeiro (`true`) ou falso (`false`).

8. **char**  
   Tipo de dado de 16 bits, utilizado para representar um único caractere Unicode.

## 🔎 Exemplos Práticos

Aqui estão alguns exemplos básicos de como cada tipo primitivo é utilizado em Java:

### ExemploS com cada tipo

```java
byte idade = 25;
System.out.println("Idade: " + idade);

short ano = 2025;
System.out.println("Ano: " + ano);

int numero = 1000;
System.out.println("Número: " + numero);

long distancia = 15000000000L; // O 'L' no final é necessário para indicar que o número é um long
System.out.println("Distância: " + distancia);

float preco = 19.99f; // O 'f' no final indica que é um tipo float
System.out.println("Preço: " + preco);

double altura = 1.75;
System.out.println("Altura: " + altura);

boolean estaEstudando = true;
System.out.println("Está estudando? " + estaEstudando);

char letra = 'A';
System.out.println("Letra: " + letra);

```

## Conceitos Importantes 📚
Valor Padrão: Cada tipo primitivo tem um valor padrão quando não inicializado explicitamente. Por exemplo, o valor padrão de um int é 0, e o valor padrão de um boolean é false.

Autoboxing: O processo de conversão automática de tipos primitivos para suas respectivas classes wrapper, como int para Integer.

Uso de Tipos Primitivos: Tipos primitivos são mais eficientes em termos de memória e velocidade de execução, sendo amplamente utilizados em Java, especialmente para valores numéricos e lógicos.

