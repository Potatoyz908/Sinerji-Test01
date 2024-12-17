# 🎬 **Filmes Application**

Esta é uma aplicação RESTful construída com **Spring Boot** para gerenciar um catálogo de filmes. A API permite criar e listar filmes, armazenando os dados em um banco de dados relacional.

---

## **📋 Pré-requisitos**

Antes de rodar o projeto localmente, é necessário ter as seguintes ferramentas instaladas:

1. **Java JDK 21** ou superior - [Download JDK](https://adoptopenjdk.net/)
2. **Gradle** (opcional, pois o wrapper `./gradlew` é fornecido)
3. **Banco de Dados MySQL** - [Download MySQL](https://www.mysql.com/)
4. **Postman** ou **curl** (para testar as requisições REST)

---

## **⚙️ Configuração do Banco de Dados**

1. Crie um banco de dados no MySQL:
   ```sql
   CREATE DATABASE filmes_db;
   ```

2. Configure o arquivo `application.properties` (ou `application.yml`) em `src/main/resources`:

   **Exemplo usando `application.properties`:**
   ```properties
    spring.application.name=filmesapplication
    spring.r2dbc.url=r2dbc:mysql://localhost:3306/filmes_db
    spring.r2dbc.username=root
    spring.r2dbc.password=admin
    spring.sql.init.platform=mysql
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
   ```

   - Substitua **`username`** e **`password`** pelos valores do seu MySQL.

---

## **🚀 Rodando o Projeto Localmente**

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   ```

2. Compile e execute o projeto usando Gradle Wrapper:
   ```bash
   ./gradlew bootRun
   ```

   - No **Windows**, use:
     ```bash
     gradlew.bat bootRun
     ```

3. A aplicação estará disponível em:
   ```
   http://localhost:
   ```

---

## **📄 Endpoints REST**

### 1. **Criar um Filme**

- **Método:** `POST`
- **URL:** `/filmes`
- **Request Body (JSON):**
   ```json
   {
     "title": "The Godfather",
     "genre": "Crime",
     "release_year": 1972
   }
   ```
- **Resposta de Sucesso (201 Created):**
   ```json
   {
     "id": 1,
     "title": "The Godfather",
     "genre": "Crime",
     "release_year": 1972
   }
   ```

---

### 2. **Listar Todos os Filmes**

- **Método:** `GET`
- **URL:** `/filmes`
- **Resposta de Sucesso (200 OK):**
   ```json
   [
     {
       "id": 1,
       "title": "The Godfather",
       "genre": "Crime",
       "release_year": 1972
     },
     {
       "id": 2,
       "title": "Inception",
       "genre": "Science Fiction",
       "release_year": 2010
     }
   ]
   ```

---

### 3. **Buscar Filme por ID (Melhoria)**

- **Método:** `GET`
- **URL:** `/filmes/{id}`
- **Exemplo:**
   ```
   /filmes/1
   ```
- **Resposta de Sucesso (200 OK):**
   ```json
   {
     "id": 1,
     "title": "The Godfather",
     "genre": "Crime",
     "release_year": 1972
   }
   ```

---

## **🛠️ Tecnologias Utilizadas**

- **Java 21**
- **Spring Boot 3.4.0**
- **Spring Data JPA**
- **MySQL**
- **Gradle**

---

## **🔍 Testando a API**

1. Utilize o **Postman** para testar os endpoints.
2. Certifique-se de que o banco de dados está ativo antes de executar as requisições.
---
