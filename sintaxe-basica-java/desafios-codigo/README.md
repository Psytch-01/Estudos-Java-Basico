## Desafio de código  
**Explorando a Sintaxe Java**

Esse projeto foi criado para o desenvolvimento e resolução dos desafios de código propostos  
como conclusão dos cursos de Sintaxe Básica Java.

---

### Desafio 1  

Crie um programa que `classifique` os clientes de um banco com base no `saldo` de suas contas. O programa deve receber o saldo e classificá-lo em três categorias:

- **Negativado** - para saldos abaixo de zero.  
- **Baixo** - para saldos entre 0 e 500, inclusive.  
- **Confortável** - para saldos acima de 500.  

**Entrada**  
- Um número decimal representando o saldo de um cliente

**Saída**
- Uma mensagem indicando a classificação do cliente.

**Exemplos**  
- A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.  

| Entrada |   Saída    |
|---------|------------|
|-50.00   | Negativado |
| 0.00    | Baixo      |
| 1000.00 | Confortável|

```A solução está na classe DesafioClassificacao.java do Projeto```

---

### Desafio 2  

Implemente um programa em Java que receba o saldo inicial de uma conta bancária e três transações (positivas para depósitos e negativas para saques). O programa deve calcular e exibir o saldo final da conta.

**Entrada**  
O programa deve receber:

- Um número decimal representando o saldo inicial.
- Três números decimais representando os valores das transações.

**Saída**  
- O saldo final da conta bancária após as três transações.

**Exemplos**   
- A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada                 | Saída  |
|-------------------------|--------|
| 100.00                  | 100.00 |
| 50.00 -20.00 -30.00     | 100.00 |
| 200.50                  | 110.00 |
| -50.50 -70.00 30.00     | 110.00 |
| 0.00                    | 25.00  |
| 100.00 -50.00 -25.00    | 25.00  |

```A solução está na classe DesafioValores.java do Projeto```

---