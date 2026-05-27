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
- Git/GitHub

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

Funcionalidades:

- Cadastro de projetos
- Status de desenvolvimento
- Link do GitHub
- Datas de início e conclusão
- Relacionamento com tecnologias

Endpoints:

```http
POST    /projetos
GET     /projetos
GET     /projetos/{id}
PUT     /projetos/{id}
DELETE  /projetos/{id}
```

---

## Metas de Estudo

CRUD completo de metas de estudo.

Funcionalidades:

- Cadastro de metas
- Controle de prazo
- Status de progresso
- Organização de objetivos de aprendizado

Endpoints:

```http
POST    /metas
GET     /metas
GET     /metas/{id}
PUT     /metas/{id}
DELETE  /metas/{id}
```

---

## Sessões de Estudo

CRUD completo de sessões de estudo realizadas.

Funcionalidades:

- Registro de sessões de estudo
- Controle de duração dos estudos
- Observações sobre aprendizado
- Organização do progresso diário

Endpoints:

```http
POST    /sessoes
GET     /sessoes
GET     /sessoes/{id}
PUT     /sessoes/{id}
DELETE  /sessoes/{id}
```

---

# 🔄 Próximas implementações

- DTOs
- Validações com Bean Validation
- Tratamento global de exceções
- Swagger/OpenAPI
- Spring Security + JWT
- Paginação
- Relatórios de progresso
- Dashboard de evolução
- Docker
- Deploy da aplicação

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
- Organização em camadas
- Controle de versionamento com Git/GitHub
- Boas práticas REST

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