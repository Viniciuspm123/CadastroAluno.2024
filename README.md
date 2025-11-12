## Projeto - Sistema de Cadastro de Alunos (Console Java)

Este projeto implementa um **sistema básico de cadastro de alunos** em Java, utilizando interação via **Console (Terminal)**. O aplicativo permite cadastrar novos alunos com nome, idade e nota, e exibir a lista completa de alunos.

### 🚀 Sobre o Projeto

O aplicativo é estruturado em duas classes: **(Aluno)** e **(CadastroAluno)**. A classe `Aluno` modela as informações de cada estudante. A classe `CadastroAluno` contém o *loop* principal do menu, gerencia o cadastro dos alunos utilizando um `ArrayList` e processa as requisições do usuário (cadastrar e listar). O foco é demonstrar a **programação orientada a objetos (POO)** e a manipulação de coleções para gerenciar um registro de dados simples.

---

### 🛠️ Tecnologias e Conceitos Abordados

**Estrutura de Classes (POO):**

* **Classe (Aluno):** Implementa o objeto de dados (POJO) para o aluno. Possui atributos privados (`nome`, `idade`, `nota`) e métodos públicos **(getters e setters)** para **encapsulamento**, permitindo controlar o acesso e modificação dos dados.
* **Método `(toString)`:** Sobrescrito na classe (Aluno) para fornecer uma representação textual clara e formatada de cada objeto quando ele é impresso no console.

**Coleções e Estruturas de Dados:**
Uso de `(ArrayList<Aluno>)` para armazenar dinamicamente e gerenciar a lista de objetos `Aluno` na memória durante a execução do programa.

**Interação via Console:**
Utilização da classe `(Scanner)` para ler a entrada de dados do usuário (opções do menu e informações de cadastro: `sc.next()`, `sc.nextInt()`, `sc.nextDouble()`).

**Controle de Fluxo e Loop:**
Uso de um *loop* `(while (true))` para manter o menu principal do sistema ativo e rodando continuamente até que o usuário escolha a opção **Sair**.

**Lógica de Negócios:**

* **Cadastro:** Solicita nome, idade e nota, cria uma nova instância de (Aluno) com esses dados e adiciona o objeto à `ArrayList`.
* **Listar:** Itera sobre a `ArrayList` e exibe o resultado formatado de cada aluno (chamando o método `toString()`).

---

### 💻 Como Executar

Clone este repositório.

Este projeto deve ser compilado e executado através de um ambiente de desenvolvimento Java (IDE), como Eclipse ou IntelliJ, ou via terminal, sendo totalmente interativo via **console**.
