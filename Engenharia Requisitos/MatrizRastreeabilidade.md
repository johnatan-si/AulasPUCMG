# Matriz de Rastreabilidade de Requisitos

Uma ferramenta para garantir a cobertura e rastreabilidade de requisitos desde sua origem até a implementação e teste.

## Template

### 1. Requisitos de Alto Nível → Requisitos Detalhados

| ID | Descrição | Fonte | ID Requisito Detalhado(s) | Entrega da EAP | Prioridade | Responsável | Comentários |
|----|-----------|------|---------------------------|----------------|-----------|------------|------------|
| RAL### | - | - | RD### | (Referência à entrega específica da EAP) | (Alta, Média, Baixa) | - | - |

**Entrega da EAP:** Refere-se à entrega específica do projeto na Estrutura Analítica de Projetos (EAP) com a qual o requisito está alinhado. 

**Prioridade:** Indica o nível de importância ou urgência de um requisito. Pode ser classificada em:

- **Alta:** Requisitos críticos que devem ser implementados o mais rápido possível.
- **Média:** Requisitos importantes, mas que podem ser adiados se necessário.
- **Baixa:** Requisitos desejáveis, mas que têm menor impacto se não forem implementados imediatamente.

### 2. Requisitos Detalhados → Testes

| ID | Descrição | ID Teste(s) | Entrega da EAP | Prioridade | Responsável | Status | Comentários |
|----|-----------|------------|----------------|-----------|------------|-------|------------|
| RD### | - | T### | (Referência à entrega específica da EAP) | (Alta, Média, Baixa) | - | - | - |

## Exemplo de Uso

### 1. Requisitos de Alto Nível → Requisitos Detalhados

| ID | Descrição | Fonte | ID Requisito Detalhado(s) | Entrega da EAP | Prioridade | Responsável | Comentários |
|----|-----------|------|---------------------------|----------------|-----------|------------|------------|
| RAL001 | Usuário deve poder fazer login no sistema | Documento | RD001, RD002 | Login | Alta | João Silva | Login com e sem 2FA |
| RAL002 | Usuário deve poder visualizar seu perfil | Entrevista | RD003 | Perfil | Média | Maria Souza | Inclui foto e e-mail |

### 2. Requisitos Detalhados → Testes

| ID | Descrição | ID Teste(s) | Entrega da EAP | Prioridade | Responsável | Status | Comentários |
|----|-----------|------------|----------------|-----------|------------|-------|------------|
| RD001 | Sistema deve aceitar credenciais válidas | T001 | Login | Alta | Pedro Costa | Completo | - |
| RD002 | Sistema deve rejeitar credenciais inválidas | T002 | Login | Alta | Ana Lima | Em Progresso | Falha ocasional |
| RD003 | Usuário deve ver nome, e-mail e data de cadastro | T003 | Perfil | Média | Roberto Alves | Não Iniciado | - |

