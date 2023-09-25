
# Matriz de Rastreabilidade de Requisitos

Uma ferramenta para garantir a cobertura e rastreabilidade de requisitos desde sua origem até a implementação e teste.

## Template

### 1. Requisitos de Alto Nível → Requisitos Detalhados

| ID Requisito Alto Nível | Descrição | Fonte | ID Requisito Detalhado(s) | Comentários |
|------------------------:|-----------|------|---------------------------|------------|
| RAL###                  | -         |-     | RD###, RD###              | -          |

### 2. Requisitos Detalhados → Testes

| ID Requisito Detalhado | Descrição | ID Teste(s) | Status | Comentários |
|-----------------------:|-----------|------------|-------|------------|
| RD###                  | -         | T###       | -     | -          |

## Exemplo de Uso

### 1. Requisitos de Alto Nível → Requisitos Detalhados

| ID Requisito Alto Nível | Descrição                                | Fonte     | ID Requisito Detalhado(s) | Comentários            |
|------------------------:|------------------------------------------|-----------|---------------------------|------------------------|
| RAL001                  | Usuário deve poder fazer login no sistema | Documento | RD001, RD002              | Login com e sem 2FA   |
| RAL002                  | Usuário deve poder visualizar seu perfil | Entrevista| RD003                      | Inclui foto e e-mail   |

### 2. Requisitos Detalhados → Testes

| ID Requisito Detalhado | Descrição                                | ID Teste(s) | Status        | Comentários      |
|-----------------------:|------------------------------------------|-------------|---------------|------------------|
| RD001                  | Sistema deve aceitar credenciais válidas | T001        | Completo      | -                |
| RD002                  | Sistema deve rejeitar credenciais inválidas | T002     | Em Progresso  | Falha ocasional  |
| RD003                  | Usuário deve ver nome, e-mail e data de cadastro | T003  | Não Iniciado  | -                |
