# Como contribuir

Obrigado por participar do **qa-gym-library**! Este repositório é um laboratório didático de qualidade de software. Siga as orientações abaixo para contribuir de forma organizada.

---

## Pré-requisitos

- Java 21
- Maven 3.9+
- Git
- Conta no GitHub

## Configuração inicial

```bash
# Clone o seu fork
git clone https://github.com/<seu-usuario>/qa-gym-library-include.git
cd qa-gym-library-include

# Configure o upstream
git remote add upstream https://github.com/elieziossn/qa-gym-library-include.git

# Verifique se tudo compila e os testes passam
mvn test
```

## Fluxo de contribuição

1. Escolha uma issue na aba Issues.
2. Crie uma branch a partir da `main`:
   ```bash
   git checkout -b feature/issue-<numero>-<descricao>
   ```
3. Implemente a solução.
4. Execute os testes: `mvn test`
5. Abra um pull request para a branch `main` do repositório original.
6. Preencha o template de PR.
7. Revise PRs de colegas.

## Padrões do projeto

- Pacote base: `br.edu.ifrn.qagym`
- Testes ficam em `src/test`, espelhando a estrutura de `src/main`
- Nomes de testes em português, descritivos do comportamento
- Um PR por issue

## Executar testes

```bash
mvn test
```

## Verificar cobertura

```bash
mvn test jacoco:report
# Relatório em: target/site/jacoco/index.html
```

## Dúvidas

Abra uma issue com o label `dúvida` ou fale com o responsável técnico do time.
