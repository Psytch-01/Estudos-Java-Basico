# Projeto de Conceitos de Programação Orientada a Objetos (POO) - Java

Este projeto tem como objetivo a implementação e estudo dos principais conceitos de Programação Orientada a Objetos (POO) em Java, abordando as práticas essenciais para o desenvolvimento de sistemas robustos e de fácil manutenção.


## 📂 Separação de Classes e Responsabilidades no Projeto
A separação de responsabilidades é um dos princípios fundamentais da Programação Orientada a Objetos (POO), que visa dividir um sistema em partes menores, cada uma responsável por uma tarefa específica. Isso facilita o desenvolvimento, manutenção e escalabilidade do código.

### 📌 Tipos de Classes e Suas Responsabilidades

#### 1. **Classe de Regras de Negócio**
As **classes de regras de negócio** são responsáveis pela implementação da lógica central do sistema. Elas lidam com as operações essenciais que definem o comportamento do sistema, como cálculos, validações e outras operações importantes para o funcionamento do sistema.
- **Responsabilidade**: Implementar regras essenciais e lógicas de cálculo, validações, e outras operações fundamentais.
- **Objetivo**: Garantir que a lógica de negócio seja independente da interface com o usuário e da persistência de dados.

#### 2. **Classe de Dados ou Modelos (Entidades)**
As **classes de dados**, ou **modelos**, representam entidades do sistema, como objetos do mundo real, armazenando suas propriedades. Elas contêm os dados fundamentais do sistema, sem envolver lógicas complexas de processamento.
- **Responsabilidade**: Representar o estado de objetos do mundo real, armazenando dados simples.
- **Objetivo**: Servir como estrutura para representar e transferir dados entre diferentes partes do sistema.

#### 3. **Classe de Persistência ou Acesso a Dados**
As **classes de persistência** são responsáveis pela interação com sistemas de armazenamento de dados, como bancos de dados ou sistemas de arquivos. Elas garantem que os dados sejam salvos, recuperados e manipulados corretamente.
- **Responsabilidade**: Realizar operações de leitura, escrita, atualização e exclusão de dados.
- **Objetivo**: Gerenciar a persistência de dados, garantindo que o sistema tenha acesso e possa modificar dados de forma eficiente.

#### 4. **Classe de Interface ou Controladores**
As **classes de interface** ou **controladores** atuam como intermediárias entre o usuário e o sistema. Elas capturam as interações do usuário e orquestram a execução de operações, utilizando as classes de regras de negócio e de dados para processar as informações.
- **Responsabilidade**: Capturar entradas do usuário, processar ações e apresentar saídas ao usuário.
- **Objetivo**: Gerenciar a interação entre o sistema e o usuário, bem como realizar as operações necessárias em resposta a essas interações.

## ✂️ Princípios de Separação de Responsabilidade

A separação de responsabilidades proporciona diversos benefícios para o desenvolvimento de software:

- **Facilidade de Manutenção**: O código se torna modular, permitindo que mudanças em uma parte do sistema não impactem outras partes, facilitando a manutenção e atualizações futuras.
- **Reusabilidade**: Classes com responsabilidades bem definidas podem ser reutilizadas em outros contextos, reduzindo a duplicação de código e facilitando a adaptação do sistema.
- **Testabilidade**: Ao isolar as responsabilidades em diferentes classes, torna-se mais fácil testar unidades específicas do sistema, o que aumenta a confiabilidade e facilita o processo de depuração.
- **Clareza e Compreensão**: Organizar o código em classes com responsabilidades bem delimitadas torna o sistema mais claro e fácil de entender, tanto para novos desenvolvedores quanto para os atuais.

Com a separação de responsabilidades, o sistema se torna mais robusto, modular e de fácil manutenção, o que é essencial para o desenvolvimento de softwares de alta qualidade.

## 📦 Pacotes

Pacotes em Java são utilizados para organizar classes de maneira hierárquica e facilitar o gerenciamento de grandes projetos. Eles ajudam na estruturação do código e permitem a reutilização de classes.
  
#### Vantagens
- **Organização**: Agrupamento lógico de classes e interfaces.
- **Visibilidade**: Pacotes oferecem controle sobre o acesso a classes e métodos.
- **Facilidade de manutenção**: Melhor estrutura, que facilita a localização de componentes.

#### Convenção de Nomeação
- O nome de pacotes deve ser em minúsculas.
- A convenção usual é utilizar o domínio reverso, como `com.exemplo.projeto`.

## Visibilidade de Recursos
Java oferece modificadores de visibilidade (acesso) para controlar quem pode acessar os membros de uma classe. Os principais modificadores são:
- **public**: Acesso irrestrito.
- **protected**: Acesso apenas a classes do mesmo pacote ou subclasses.
- **default**: Acesso apenas dentro do pacote.
- **private**: Acesso restrito à própria classe.

## O Que São Getters e Setters?

### 1. **Getters**
Os **getters** são métodos utilizados para recuperar o valor de um atributo privado de uma classe. Eles permitem que outras classes acessem o valor de um atributo sem modificar diretamente a sua variável.

- **Papel**: Recuperar o valor de um atributo.
- **Convenção**: O nome do getter começa com "get", seguido do nome do atributo com a primeira letra maiúscula. Exemplo: `getNome()`.
- **Retorno**: O tipo do getter é o mesmo tipo do atributo.

### 2. **Setters**
Os **setters** são métodos utilizados para modificar o valor de um atributo privado. Eles permitem que o valor de um atributo seja alterado de maneira controlada, geralmente aplicando validações ou transformações antes de atualizar o valor.

- **Papel**: Modificar o valor de um atributo.
- **Convenção**: O nome do setter começa com "set", seguido do nome do atributo com a primeira letra maiúscula. Exemplo: `setNome(String nome)`.
- **Parâmetro**: O setter recebe o novo valor para o atributo como parâmetro.

## Benefícios dos Getters e Setters

### 1. **Encapsulamento**
Os **getters** e **setters** são essenciais para o conceito de **encapsulamento** na POO. O encapsulamento é a prática de ocultar os detalhes internos de implementação de uma classe, expondo apenas os métodos necessários para interagir com o objeto. Isso ajuda a proteger os dados internos da classe, permitindo acessos controlados a esses dados.

- **Controle de acesso**: Através dos setters, você pode aplicar regras ou validações antes de modificar os dados de um objeto, evitando que valores inconsistentes ou inválidos sejam atribuídos aos atributos.
- **Imutabilidade**: Em algumas situações, você pode querer tornar um atributo **imutável** (não modificável após a criação do objeto). Para isso, basta não fornecer um setter, permitindo apenas o acesso ao valor através de um getter.

### 2. **Validações**
Com **setters**, é possível inserir **validações** antes de alterar o valor de um atributo. Isso garante que os dados armazenados no objeto estejam sempre consistentes e válidos.

Por exemplo, se tivermos uma classe que representa um **usuário**, e o atributo **idade** deve ser um valor positivo, o setter pode validar se a idade fornecida é válida antes de atribuí-la ao atributo.

### 3. **Flexibilidade**
O uso de getters e setters permite maior **flexibilidade** em mudanças futuras no código. Se você precisar modificar a maneira como o valor de um atributo é calculado ou validado, você pode alterar o comportamento do getter ou setter sem afetar as outras partes do código que utilizam esse atributo. Isso ajuda a reduzir o acoplamento entre as classes.

### 📌 Exemplos de Uso

### Getter
Um getter é utilizado para acessar o valor de um atributo privado. Por exemplo, se uma classe `Pessoa` tem um atributo privado `nome`, o getter permitirá que o valor de `nome` seja acessado.

```java
public String getNome() {
    return this.nome;
}

```

### Setter
O setter é utilizado para modificar o valor de um atributo privado. Continuando com a classe Pessoa, um setter para o atributo `nome` pode ser escrito assim:
```java
public void setNome(String nome) {
    if (nome != null && !nome.isEmpty()) {
        this.nome = nome;
    } else {
        throw new IllegalArgumentException("Nome não pode ser vazio");
    }
}

```
## Quando Usar e Evitar Getters e Setters

### ✔️ Quando Usar Getters e Setters? 

#### 1. **Atributos Privados**
Os **getters** e **setters** são usados principalmente para acessar e modificar atributos privados de uma classe. Isso é importante porque os atributos privados não podem ser acessados diretamente de fora da classe, protegendo o **encapsulamento** e permitindo o controle sobre o acesso a esses dados. Ao usar getters e setters, você garante que o acesso a esses atributos seja feito de maneira controlada, sem expor diretamente o estado da classe.

#### 2. **Quando Precisar de Controle**
Se você precisa de **controle** sobre como os dados são acessados ou modificados, como por exemplo, validações ou transformações, os getters e setters são a maneira ideal de implementar isso. Com os setters, você pode garantir que os valores atribuídos aos atributos sejam válidos ou que sigam uma regra de negócio específica, como impedir que valores negativos sejam atribuídos a um campo de idade. Já com os getters, você pode modificar o comportamento do acesso, se necessário, sem comprometer a estrutura interna da classe.

#### 3. **Quando a Imutabilidade for Necessária**
Se você deseja que um atributo seja **imutável** após a criação do objeto, basta não implementar um setter para esse atributo, garantindo que seu valor não será alterado. Essa abordagem é muito útil quando você quer garantir que um valor, uma vez atribuído, não possa ser modificado, como é o caso de constantes ou propriedades críticas que não devem ser alteradas durante a execução do programa.

### ✖️ Quando Evitar Getters e Setters?

Embora getters e setters sejam amplamente usados, há situações em que pode não ser necessário implementá-los para todos os atributos. Aqui estão alguns cenários em que você pode evitar seu uso:

#### 1. **Atributos Imutáveis ou Finais**
Se o atributo é **final** ou **imutável** e não precisa ser alterado após a criação do objeto, não há necessidade de um setter. Nesse caso, o valor do atributo não mudará, e o uso de um getter pode ser suficiente para acessar o valor do atributo.

#### 2. **Quando o Valor do Atributo é Calculado ou Modificado Internamente**
Se o valor do atributo é **calculado** ou **modificado internamente** e não precisa ser exposto diretamente, pode ser desnecessário criar um getter ou setter para ele. Em vez disso, você pode usar métodos ou comportamentos dentro da classe para manipular esses dados, sem expor sua implementação para o exterior.

### Conclusão
Os getters e setters são fundamentais para o **encapsulamento**, controle de acesso e modificações em objetos. No entanto, sua implementação deve ser considerada com base na necessidade de controle sobre o atributo, na imutabilidade dos dados e na privacidade dos atributos. Evite usá-los desnecessariamente para atributos que não precisam de modificações ou acesso direto, mantendo o design do código limpo e seguro.

---


## 🔨 Construtores

Construtores são métodos especiais em uma classe que são utilizados para inicializar os objetos dessa classe. Eles são chamados automaticamente quando um novo objeto é criado e são responsáveis por garantir que os atributos do objeto sejam configurados corretamente desde o início.

### Tipos de Construtores

Existem dois tipos principais de construtores em Java: o **construtor padrão** e o **construtor parametrizado**.

### Construtor Padrão

O **construtor padrão** é aquele que não recebe argumentos e é automaticamente fornecido pelo compilador quando nenhum construtor é explicitamente definido. Ele pode ser usado quando não há necessidade de fornecer valores específicos na criação do objeto.

#### Construtor Parametrizado

O **construtor parametrizado** permite passar valores para inicializar os atributos do objeto de forma específica no momento da criação. Isso é útil quando você precisa que o objeto comece com valores personalizados.

### Sobrecarga de Construtores

Construtores podem ser sobrecarregados, ou seja, você pode ter múltiplos construtores com diferentes números ou tipos de parâmetros. Isso permite que você crie objetos de maneiras variadas, dependendo das necessidades do momento.

#### Exemplo de Sobrecarga de Construtores

```java
public class Carro {
    String modelo;
    int ano;

    // Construtor padrão
    public Carro() {
        this.modelo = "Desconhecido";
        this.ano = 2020;
    }

    // Construtor parametrizado
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
}

```


## 🔢 Enums
Os **Enums** são usados para definir um conjunto fixo de constantes. Eles são úteis para representar valores que não mudam, como os dias da semana, os estados de um pedido, entre outros.

### Definindo um Enum

Um enum é definido de forma semelhante a uma classe, mas com valores constantes separados por vírgulas. Por exemplo, você pode criar um enum para representar os dias da semana:

```java
public enum DiaDaSemana {
    SEGUNDA,
    TERÇA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO;
}

```

Neste exemplo, o enum `DiaDaSemana` define sete constantes que representam os dias da semana.
