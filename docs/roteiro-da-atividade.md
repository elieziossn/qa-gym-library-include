# Roteiro da atividade

Este documento descreve o passo a passo esperado de cada estagiário durante a atividade prática com o repositório **qa-gym-library-include**.

---

## Etapas

### 1. Fork do repositório

Acesse o repositório no GitHub e clique em **Fork**. Isso cria uma cópia do projeto na sua conta.

### 2. Clone local

```bash
git clone https://github.com/<seu-usuario>/qa-gym-library-include.git
cd qa-gym-library-include
```

### 3. Configurar upstream

```bash
git remote add upstream https://github.com/elieziossn/qa-gym-library-include.git
```

### 4. Escolher uma issue

Acesse a aba **Issues** do repositório original. Escolha uma issue disponível e comente que vai trabalhar nela.

### 5. Criar uma branch

```bash
git checkout -b feature/issue-<numero>-<descricao-curta>
```

### 6. Implementar a solução

- Abra o projeto na sua IDE.
- Localize o método ou classe indicado na issue.
- Implemente a solução.

### 7. Executar os testes

```bash
mvn test
```

Verifique se todos os testes passam antes de abrir o PR.

### 8. Verificar cobertura de testes

```bash
mvn test jacoco:report
```

O relatório HTML estará em `target/site/jacoco/index.html`.

### 9. Adicionar ou ajustar testes

Se a sua alteração inclui novo comportamento, adicione testes para cobri-lo.

### 10. Commit e push

```bash
git add .
git commit -m "feat: implementar contagem de livros disponíveis (issue #2)"
git push origin feature/issue-2-contagem-livros-disponiveis
```

### 11. Abrir o pull request

No GitHub, abra um PR do seu fork para o repositório original. Preencha o template de PR.

### 12. Revisar PRs de colegas

Acesse os PRs abertos e realize pelo menos **duas revisões** de colegas usando o checklist do guia de revisão.

### 13. Responder ao feedback

Se receber comentários no seu PR, responda, ajuste o código e faça novo push. O PR é atualizado automaticamente.

### 14. Merge

Após aprovação, o responsável técnico ou um colega autorizado realizará o merge.

---

## Convenção de commits

Use o padrão de **Conventional Commits**:

| Prefixo | Uso |
|---------|-----|
| `feat:` | Nova funcionalidade |
| `fix:` | Correção de bug |
| `test:` | Adição ou correção de testes |
| `refactor:` | Refatoração sem mudança de comportamento |
| `docs:` | Documentação |

Exemplos:
- `feat: implementar ordenação por título`
- `fix: corrigir comparação de disponibilidade`
- `test: adicionar testes para BookValidator`

---

## Comandos Maven úteis

| Comando | O que faz |
|---------|-----------|
| `mvn compile` | Compila o projeto |
| `mvn test` | Executa os testes |
| `mvn test jacoco:report` | Gera relatório de cobertura |
| `mvn checkstyle:check` | Verifica estilo do código |
| `mvn clean test` | Limpa e executa tudo do zero |
