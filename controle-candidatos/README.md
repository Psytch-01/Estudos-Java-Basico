# Projeto de Estudo - Simulador de Processo Seletivo

Neste projeto, explorei a criação e a chamada de métodos, aplicando conceitos como a separação de regras de negócios e da classe principal. O foco é um simulador de processo seletivo, que envolve funcionalidades como:

- **Seleção de candidatos por pretensão salarial aleatória.**
- **Tentativas de contato com candidatos por ligações, com um máximo de 3 tentativas por candidato.**

## Detalhes do Projeto

### Funcionalidade de Seleção por Pretensão Salarial

Os candidatos têm sua pretensão salarial gerada aleatoriamente, e com base nisso, o sistema compara com o salário base da vaga. Se o valor da pretensão for adequado, o candidato é selecionado para a vaga.

### Funcionalidade de Contato com Candidatos

A função de **atendimento telefônico** simula tentativas de contato. O sistema realiza até 3 tentativas de ligação, e se não houver sucesso, o candidato é considerado incontactável. Caso o contato seja bem-sucedido, o número de tentativas realizadas é registrado.

## Como Funciona

1. **Métodos**: A classe `RegrasNegocio` contém as regras de negócio, como calcular o valor pretendido para o salário e definir as condições para contato com os candidatos.
2. **Processo Seletivo**: A classe `ProcessoSeletivo` gerencia o processo seletivo, incluindo a análise de candidatos, as tentativas de contato e a seleção final com base no salário.

## Fluxo do Processo  

    1. O sistema gera uma lista de candidatos.  
    2. Para cada candidato, o sistema tenta realizar o contato telefônico com até 3 tentativas.  
    3. Com base nas respostas dos candidatos, o sistema seleciona aqueles com a pretensão salarial adequada.  
    4. O resultado final exibe os candidatos selecionados e as tentativas realizadas para cada um.  

---


