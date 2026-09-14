# Guia de revisão de código

Use este checklist ao revisar um pull request de colega.

---

## Checklist de revisão

### Escopo e propósito

- [ ] O PR resolve a issue proposta?
- [ ] A alteração é pequena e focada?
- [ ] O PR possui descrição compreensível?
- [ ] A issue relacionada está referenciada?

### Código

- [ ] O código compila corretamente?
- [ ] O código está legível?
- [ ] Os nomes de classes, métodos e variáveis são claros?
- [ ] Há duplicação desnecessária?
- [ ] A solução poderia ser mais simples?
- [ ] Há alguma regra de negócio quebrada?
- [ ] Existem casos de borda não tratados?

### Testes

- [ ] Há testes cobrindo o comportamento novo?
- [ ] Os testes existentes continuam passando?
- [ ] Os testes testam o comportamento, não a implementação?
- [ ] Os nomes dos testes descrevem o que está sendo testado?

---

## Como dar feedback construtivo

**Prefira:**
- "Este nome de método poderia ser mais descritivo. O que acha de `countAvailableBooks` em vez de `getAvailable`?"
- "Esse bloco `if/else` poderia ser simplificado usando streams. Quer tentar?"
- "Faltou um teste para o caso em que o livro já está emprestado."

**Evite:**
- "Isso está errado."
- "Por que você fez assim?"
- "Isso é horrível."

---

## O que esperar ao receber feedback

- Feedback é sobre o código, não sobre você.
- Perguntas são convites para pensar, não críticas.
- Você pode discordar — mas explique o motivo.
- Altere o código e peça nova revisão.

---

## Critérios de aprovação

Um PR pode ser aprovado quando:

1. Resolve a issue proposta.
2. Os testes passam.
3. Não quebra testes existentes.
4. O código está legível e coerente com o restante do projeto.
5. Recebeu pelo menos uma revisão de colega.
