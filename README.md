# ☕ Sistema de Cadastro e Gerenciamento de Usuários

Projeto backend desenvolvido com **Java e Spring Boot**, com foco na construção de uma API REST para gerenciamento de usuários com persistência em banco de dados relacional.

A aplicação implementa operações completas de CRUD, com validações de dados, integração com banco de dados e configuração de ambientes distintos de execução.

---

# 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Maven
- MariaDB
- MySQL
- Postman

---

# 🗄️ Banco de Dados e Configuração de Ambientes

O projeto foi estruturado utilizando o sistema de **profiles do Spring Boot**, permitindo a execução da aplicação em diferentes ambientes sem necessidade de alterações no código-fonte.

Foram utilizados três arquivos de configuração:

- `application.properties`
- `application-home.properties`
- `application-curso.properties`

A seleção do ambiente é feita automaticamente através do profile ativo, permitindo alternar entre os bancos de dados configurados.

- Ambiente Home → MariaDB  
- Ambiente Curso → MySQL  

As credenciais de acesso ao banco não são expostas no repositório, sendo configuradas localmente em cada ambiente.

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

- Desenvolver uma API REST funcional com Spring Boot  
- Aplicar conceitos de persistência de dados  
- Trabalhar com configuração de ambientes via profiles  
- Praticar boas práticas de desenvolvimento backend  
- Simular um sistema real de gerenciamento de usuários  

---

# 👩🏾‍💻 Desenvolvido por

Sophia Almeida
