# Desafio Proposto ControleFluxo - Curso de Java Básico (DIO) 🏆

## Enunciado 📝

O sistema deve receber dois números inteiros como parâmetros via terminal. Com esses dois números, o programa deve realizar um loop (utilizando um `for`) que irá imprimir no console a quantidade de números entre o primeiro e o segundo parâmetro, incluindo-os.

Por exemplo, se os números fornecidos forem 12 e 30, o programa deverá imprimir:

- "Imprimindo o número 12"
- "Imprimindo o número 13"
- "Imprimindo o número 14"
- ...
- "Imprimindo o número 30"

Ou seja, a interação será repetida 18 vezes, já que 30 - 12 = 18.

Caso o primeiro parâmetro seja maior que o segundo, o programa deve lançar uma exceção personalizada chamada `ParametrosInvalidosException`, com a mensagem: "O segundo parâmetro deve ser maior que o primeiro".

---

## Etapa 1️⃣

### Classe `ParametrosInvalidosException` 

Na classe de exceção, foi criado o método `contar(int parametroUm, int parametroDois)`, que realiza a seguinte lógica:
- Se `parametroUm` for **menor ou igual** a `parametroDois`, a função retorna a diferença entre eles.
- Se `parametroUm` for **maior** que `parametroDois`, uma exceção `RuntimeException` é lançada, indicando que o segundo número precisa ser maior que o primeiro.
- Há também um tratamento para números não inteiros, mas essa validação nunca será atingida porque o compilador impede a passagem de valores inválidos antes da execução.

### Classe `Contador` 

Na classe principal, `Contador`, o programa:  

    1. Lê dois números inteiros fornecidos pelo usuário via `Scanner`.  
    2. Chama o método `contar` da classe `ParametrosInvalidosException`, passando os números como argumentos.  
    3. Se a execução ocorrer sem problemas, imprime a diferença entre os números.  
    4. Caso ocorra uma `RuntimeException`, a mensagem de erro é exibida no console.  