# 📦 Projeto CRUD de Produtos

Aplicação desenvolvida em Java para gerenciamento de produtos, utilizando JDBC para conexão com banco de dados PostgreSQL.

O projeto implementa as principais operações de um CRUD: cadastro, consulta, atualização e exclusão de produtos.

## 🚀 Tecnologias Utilizadas

* Java
* JDBC
* PostgreSQL
* SQL
* Programação Orientada a Objetos

## ✨ Funcionalidades

* Cadastro de produtos
* Atualização de produtos
* Exclusão de produtos
* Consulta de produtos cadastrados
* Integração com banco de dados PostgreSQL
* Execução de comandos SQL via JDBC

## 🏗️ Estrutura do Projeto

```text
src/
├── controllers
├── entities
├── factories
└── repositories
```

## 🧠 Conceitos Aplicados

* Programação Orientada a Objetos
* Encapsulamento
* Separação de responsabilidades
* Conexão com banco de dados
* CRUD com SQL
* PreparedStatement
* Tratamento de exceções

## 🗄️ Banco de Dados

O projeto utiliza PostgreSQL.

Crie o banco de dados:

```sql
CREATE DATABASE bdaula03;
```

Crie a tabela:

```sql
CREATE TABLE produtos(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco NUMERIC(10, 2) NOT NULL,
    quantidade INTEGER NOT NULL,
    data_criacao TIMESTAMP NOT NULL DEFAULT NOW()
);
```

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/beatrizlima-tech/projetoCrud.git
```

2. Abra o projeto em uma IDE Java.

3. Configure o banco de dados PostgreSQL na classe `ConnectionFactory`:

```java
var host = "jdbc:postgresql://localhost:5432/bdaula03";
var user = "postgres";
var pass = "sua_senha";
```

4. Execute a classe principal do projeto.

5. Escolha uma das opções no menu:

```text
1 - Cadastrar produto
2 - Atualizar produto
3 - Excluir produto
4 - Consultar produtos
```

## 📚 Objetivo

Este projeto foi desenvolvido para praticar fundamentos de desenvolvimento backend com Java, integração com banco de dados PostgreSQL e execução de operações CRUD utilizando JDBC.

## 👩‍💻 Autora

**Beatriz Lima de Oliveira**

GitHub:
https://github.com/beatrizlima-tech
