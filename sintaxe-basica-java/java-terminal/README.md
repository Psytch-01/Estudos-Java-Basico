## Terminal e Agrumentos

🎓 Objetivo do Projeto
Este projeto tem como objetivo ensinar conceitos fundamentais sobre execução de programas Java via terminal, incluindo uso de argumentos e entrada de dados com Scanner.

### Passos Executados - Como executar uma aplicação simples pelo terminal (Exemplo)

  * Crie e faça a compilação de uma classe **```MinhaClasse.java```** com um **```System.out.println("Oi, fui executado pelo Terminal");```** através de sua IDE.
  * Abra o terminal seguindo até o diretório do projeto através do comando **```cd (diretório do projeto)```**.
  * Dentro do diretório **```bin```** do nosso projeto, execute o comando **```dir```** para verificar se a classe criada foi compilada corretamente
  * Após a verificação, execute-a, digitando **```java MinhaClasse```**
  * Se o processo correu bem, nossos **```println```** deverá imprimir a mensagem escrita no Terminal.

Note que os parâmetros deverão ser colocados com atenção, se houverem.

### 📌 Scanner  

A classe `Scanner` pertence ao pacote `java.util` e é usada para capturar a entrada de dados do usuário através do terminal.  
Ela permite a leitura de diferentes tipos de dados, como números inteiros, decimais e strings, tornando a interação com o usuário mais flexível.  

### 🛠 Métodos Principais da Classe Scanner  

| Método        | Descrição                                      |
|--------------|----------------------------------------------|
| `nextLine()`  | Lê uma linha completa de texto.            |
| `next()`      | Lê apenas a próxima palavra.               |
| `nextInt()`   | Lê um número inteiro.                      |
| `nextDouble()`| Lê um número decimal.                      |
| `nextBoolean()` | Lê um valor booleano (`true` ou `false`). |
| `close()`     | Fecha o Scanner para evitar vazamentos.    |

### Comandos Básicos MS-DOS

#### 📁 Comandos de Navegação e Arquivos  
- `dir` → Lista arquivos e pastas do diretório atual.  
- `cd [pasta]` → Entra em uma pasta específica.  
- `cd ..` → Volta para o diretório anterior.  
- `cls` → Limpa a tela do terminal.  
- `mkdir [nome]` → Cria uma nova pasta.  
- `rmdir [nome]` → Remove uma pasta vazia.  
- `del [arquivo]` → Apaga um arquivo.  
- `copy [origem] [destino]` → Copia arquivos.  
- `move [origem] [destino]` → Move arquivos ou renomeia.  

#### ⚙️ Comandos do Sistema  
- `ver` → Exibe a versão do sistema operacional.  
- `echo [texto]` → Exibe um texto na tela.  
- `exit` → Fecha o prompt de comando.  
- `tasklist` → Lista processos em execução.  
- `taskkill /IM [nome].exe /F` → Encerra um processo pelo nome.  

#### 🌐 Rede e Conexões  
- `ipconfig` → Mostra informações da rede.  
- `ping [endereço]` → Testa a conexão com um servidor.  
- `netstat -an` → Exibe conexões ativas e portas abertas. 
