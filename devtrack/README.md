# DevTrack API 🚀

API REST desenvolvida com Java e Spring Boot para acompanhar minha evolução nos estudos de programação e no desenvolvimento de projetos.

---

# 📚 Objetivo do projeto

O DevTrack API foi criado com o objetivo de praticar desenvolvimento back-end com Java e Spring Boot através da construção de uma aplicação real.

A ideia do sistema é permitir o controle da evolução nos estudos de tecnologia, projetos desenvolvidos e progresso de aprendizado.

---

# ⚙️ Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Hibernate
- Lombok
- Maven
- Postman

---

# 🏗️ Arquitetura do projeto

O projeto está estruturado em camadas:

```text
Controller
Service
Repository
Model
```

Fluxo da aplicação:

```text
Controller → Service → Repository → Banco de Dados
```

---

# ✅ Funcionalidades atuais

## Tecnologias

CRUD completo de tecnologias estudadas.

Exemplos:

- Java
- Spring Boot
- PostgreSQL
- Python
- AWS

Endpoints:

```http
POST    /tecnologias
GET     /tecnologias
GET     /tecnologias/{id}
PUT     /tecnologias/{id}
DELETE  /tecnologias/{id}
```

---

## Projetos do Portfólio

CRUD completo de projetos desenvolvidos.

Endpoints:

```http
POST    /projetos
GET     /projetos
GET     /projetos/{id}
PUT     /projetos/{id}
DELETE  /projetos/{id}
```

---

# 🔄 Próximas implementações

- Relacionamento entre ProjetoPortfolio e Tecnologia
- Cadastro de metas de estudo
- Registro de sessões de estudo
- Progresso por tecnologia
- Relatórios simples:
    - horas estudadas
    - metas concluídas
    - tecnologias mais praticadas

---

# 🧠 Conceitos praticados

Durante o desenvolvimento deste projeto estou praticando:

- API REST
- CRUD
- Spring Boot
- JPA/Hibernate
- PostgreSQL
- Persistência de dados
- Arquitetura em camadas
- Relacionamentos entre entidades
- Integração com banco de dados
- Requisições HTTP
- JSON
- Postman

---

# 🚀 Como executar o projeto

## Pré-requisitos

- Java 21
- PostgreSQL
- Maven

---

## Configuração do banco

Criar um banco PostgreSQL chamado:

```text
devtrack_db
```

---

## Configurar application.properties

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/devtrack_db
spring.datasource.username=postgres
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Executar aplicação

Rodar a classe:

```text
DevtrackApplication
```

A API será iniciada em:

```text
http://localhost:8080
```

---

# 👨‍💻 Autor

Marcos Eduardo Francisco dos Santos

- LinkedIn:
  https://www.linkedin.com/in/marcos-santooss/

- GitHub:
  https://github.com/Marcos123-cell