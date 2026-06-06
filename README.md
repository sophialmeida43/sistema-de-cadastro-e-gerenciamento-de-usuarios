# ☕ Sistema de Cadastro e Gerenciamento de Usuários

Projeto backend desenvolvido com **Java e Spring Boot**, com foco na construção de uma API REST para gerenciamento de usuários com persistência em banco de dados relacional.

A aplicação implementa operações completas de CRUD, com validações de dados, integração com banco de dados e configuração de ambientes distintos de execução.

---

# 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven
- MySQL
- MariaDB
- Postman

---

## 🧠 Arquitetura do Projeto
O projeto segue uma arquitetura em camadas baseada no ecossistema Spring Boot, com separação clara de responsabilidades:

```java
dev.sistemadecadastro
│
├── controllers → Exposição da API e tratamento de requisições HTTP 
│ └── UsuarioController
│
├── services → Regras de negócio da aplicação
│ └── UsuarioService
│
├── repositories → Acesso a dados via Spring Data JPA
│ └── UsuarioRepository
│
├── entities → Mapeamento das entidades do banco de dados 
│ └── Usuario
│
├── exceptions  → Definição de exceções customizadas
│ └── NaoEncontradoException
│
└── handler → Tratamento global de erros e padronização de respostas
└── ExceptionHandlers
```
  ---

  ### 🎯 Objetivo da Arquitetura

- Baixo acoplamento entre camadas  
- Melhor organização e legibilidade do código  
- Facilidade de manutenção e escalabilidade  
- Padronização no tratamento de erros

---

# 🗄️ Banco de Dados e Configuração de Ambientes(Spring Profiles)
O projeto utiliza **Spring Profiles** para alternar entre ambientes sem necessidade de alteração no código-fonte.

### Perfis disponíveis

| Método | Endpoint                     |
|--------|------------------------------|
| Home   | Ambiente local com MariaDB   |
| Curso  | Ambiente de estudo com MySQL |


### Arquivos de configuração

- `application.properties`
- `application-home.properties`
- `application-curso.properties`

### Estratégia adotada

O arquivo `application.properties` define o profile ativo, permitindo alternância entre ambientes.

Credenciais sensíveis são gerenciadas via variáveis de ambiente:

```properties
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}

```

---

# 📌 Funcionalidades da API

- Criação de usuários
- Consulta de usuários (geral e por ID)
- Atualização de dados de usuários
- Remoção de usuários

---

# 📌 Validações e Regras

A aplicação implementa validações para garantir a integridade dos dados, evitando registros com campos nulos ou inconsistentes e segue arquitetura padrão do Spring Boot baseada em separação de responsabilidades.

---

# 🔧 Testes da API

Toda a API foi testada utilizando **Postman**, permitindo validação visual e funcional de todas as operações CRUD.

---

# 🎯 Objetivos do Projeto

- Construir uma API REST com Spring Boot  
- Aplicar arquitetura em camadas
- Praticar persistência com banco de dados relacional
- Utilizar múltiplos ambientes com Spring Profiles
- Praticar boas práticas de desenvolvimento backend  
- Simular um sistema real de gerenciamento de usuários  

---

# 👩🏾‍💻 Desenvolvido por

Sophia Almeida
