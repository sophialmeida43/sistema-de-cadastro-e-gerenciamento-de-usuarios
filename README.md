# Sistema de Cadastro e Gerenciamento de Usuários

Projeto back-end desenvolvido com Java e Spring Boot para gerenciamento de usuários, utilizando arquitetura em camadas, persistência de dados com JPA/Hibernate e integração com MariaDB.

## Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* MariaDB
* Maven
* Postman

## Funcionalidades

* Cadastro de usuários
* Consulta de usuários
* Busca por ID
* Atualização de dados
* Exclusão de usuários
* Tratamento de exceções personalizadas

## Estrutura do Projeto

* Controller
* Service
* Repository
* Entity
* Exception
* Handler

## Endpoints

### Listar usuários

GET /usuario

### Buscar usuário por ID

GET /usuario/{id}

### Cadastrar usuário

POST /usuario

### Atualizar usuário

PUT /usuario/{id}

### Excluir usuário

DELETE /usuario/{id}

## Autor

Sophia Almeida
