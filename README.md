# 📦 Projeto CRUD de Produtos

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge\&logo=openjdk)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge\&logo=postgresql)
![JDBC](https://img.shields.io/badge/JDBC-Database%20Connectivity-orange?style=for-the-badge)
![Build](https://img.shields.io/badge/build-passing-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-lightgrey?style=for-the-badge)

---

# 📌 Sobre o projeto

O **Projeto CRUD de Produtos** é uma aplicação desenvolvida em **Java** para gerenciamento de produtos, utilizando **JDBC** para comunicação com banco de dados **PostgreSQL**.

O projeto foi desenvolvido com foco na prática de operações CRUD (Create, Read, Update e Delete), integração com banco de dados relacionais e organização em camadas, aplicando conceitos fundamentais do desenvolvimento backend.

---

# 🚀 Funcionalidades

* Cadastro de produtos
* Consulta de produtos cadastrados
* Atualização de produtos
* Exclusão de produtos
* Persistência em banco PostgreSQL
* Execução de comandos SQL com JDBC

---

# 🧱 Tecnologias Utilizadas

* Java
* JDBC
* PostgreSQL
* SQL
* Programação Orientada a Objetos (POO)

---

# 🏗️ Estrutura do Projeto

```text
src/

├── controllers
├── entities
├── factories
└── repositories
```

---

# 📊 Arquitetura

```text
Usuário
      │
      ▼
Controller
      │
      ▼
Repository
      │
      ▼
JDBC
      │
      ▼
PostgreSQL
```

---

# 🧠 Conceitos Aplicados

* Programação Orientada a Objetos
* Encapsulamento
* Arquitetura em Camadas
* CRUD
* JDBC
* SQL
* PreparedStatement
* Tratamento de exceções
* Separação de responsabilidades

---

# 🗄️ Banco de Dados

Crie o banco de dados:

```sql
CREATE DATABASE bdaula03;
```

Em seguida, execute o script da tabela:

```sql
CREATE TABLE produtos(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco NUMERIC(10,2) NOT NULL,
    quantidade INTEGER NOT NULL,
    data_criacao TIMESTAMP NOT NULL DEFAULT NOW()
);
```

---

# ⚙️ Como Executar

## 1. Clonar o repositório

```bash
git clone https://github.com/beatrizlima-tech/projetoCrud.git
```

---

## 2. Abrir o projeto

Abra o projeto em uma IDE Java, como:

* IntelliJ IDEA
* Eclipse
* Visual Studio Code

---

## 3. Configurar o banco

Edite a classe **ConnectionFactory** com suas credenciais:

```java
var host = "jdbc:postgresql://localhost:5432/bdaula03";
var user = "postgres";
var pass = "sua_senha";
```

---

## 4. Executar a aplicação

Execute a classe principal e escolha uma das opções disponíveis:

```text
1 - Cadastrar produto
2 - Atualizar produto
3 - Excluir produto
4 - Consultar produtos
```

---

# 📚 Objetivo

Este projeto foi desenvolvido para consolidar conhecimentos em desenvolvimento backend utilizando Java, JDBC e PostgreSQL, praticando operações CRUD, integração com banco de dados relacionais e organização em camadas.

---

# 📌 Melhorias Futuras

* Implementar validações de entrada
* Adicionar exclusão lógica dos produtos
* Criar interface gráfica
* Implementar testes automatizados
* Migrar JDBC para Spring Data JPA
* Desenvolver API REST utilizando Spring Boot

---

# 👩‍💻 Autora

**Beatriz Lima de Oliveira**

🔗 GitHub

https://github.com/beatrizlima-tech

💼 LinkedIn

https://www.linkedin.com/in/beatrizlima-tech
