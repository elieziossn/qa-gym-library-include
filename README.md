# qa-gym-library-include

Repositório de exemplo para a atividade prática de **Git, Pull Requests e Code Review** do programa de estágio.

O projeto simula um pequeno sistema de biblioteca acadêmica, com funcionalidades básicas já implementadas e várias lacunas intencionais para melhoria. O objetivo é praticar desenvolvimento colaborativo, testes automatizados, revisão de código e integração contínua.

---

## Tecnologias

- Java 21
- Maven
- JUnit 5
- AssertJ
- JaCoCo
- GitHub Actions

---

## Como executar

### Pré-requisitos

- Java 21+
- Maven 3.9+

### Clonar o repositório

```bash
git clone https://github.com/<seu-usuario>/qa-gym-library-include.git
cd qa-gym-library-include
```

### Compilar

```bash
mvn compile
```

### Executar os testes

```bash
mvn test
```

### Verificar cobertura de testes

```bash
mvn test jacoco:report
```

O relatório HTML será gerado em `target/site/jacoco/index.html`.

---

## Estrutura do projeto

```
qa-gym-library-include/
├── src/
│   ├── main/java/br/edu/ifrn/qagym/
│   │   ├── model/       → Book, User, Loan
│   │   ├── service/     → LibraryService, LoanService, ReportService
│   │   ├── exception/   → Exceções de domínio
│   │   └── util/        → BookValidator, TextNormalizer
│   └── test/java/br/edu/ifrn/qagym/
│       └── ...          → Testes espelhando src/main
├── docs/
│   ├── issues-sugeridas.md
│   ├── guia-revisao-codigo.md
│   └── roteiro-da-atividade.md
├── .github/
│   ├── workflows/ci.yml
│   ├── ISSUE_TEMPLATE/
│   └── pull_request_template.md
├── CONTRIBUTING.md
├── CODE_OF_CONDUCT.md
└── pom.xml
```

---

## O que já está funcionando

- Cadastro de livros em memória
- Cadastro de usuários em memória
- Listagem de livros
- Busca por ISBN
- Busca por título (exata)
- Empréstimo de livro
- Devolução de livro
- Testes iniciais passando

---

## O que está incompleto (de propósito)

Estas lacunas são as **issues disponíveis** para implementação pelos estagiários:

- Validação de campos obrigatórios (título, autor, ISBN, matrícula)
- Impedimento de ISBN duplicado
- Busca por título ignorando maiúsculas e minúsculas
- Busca parcial por título
- Busca por autor
- Ordenação de livros por título, autor e ano
- Contagem de livros disponíveis e indisponíveis
- Relatório de livros por autor
- Impedimento de empréstimo de livro indisponível
- Impedimento de empréstimo para usuário inativo
- Cálculo de atraso e multa

Consulte [docs/issues-sugeridas.md](docs/issues-sugeridas.md) para a lista completa.

---

## Como contribuir

Leia o [CONTRIBUTING.md](CONTRIBUTING.md) e o [roteiro da atividade](docs/roteiro-da-atividade.md).

---

## Exemplo de uso

```java
LibraryService library = new LibraryService();
LoanService loanService = new LoanService();

Book book = new Book("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008);
User user = new User("20241001", "Maria Silva");

library.addBook(book);
library.addUser(user);

Loan loan = loanService.borrowBook(book, user, LocalDate.now());
System.out.println(book.isAvailable()); // false

loanService.returnBook(loan, LocalDate.now());
System.out.println(book.isAvailable()); // true
```
