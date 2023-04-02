# CRUD em Java com Spring Boot

## Sobre o projeto
  O objetivo deste projeto é construir uma API REST de usuários e departamentos que realize as operações de CRUD.


## Tecnologias utilizadas

- Java
- Spring Boot v3.0.5
- Spring JPA
- Postman
- Maven 3.1.0
- Banco de Dados H2
- Spring Tool Suite (STS)

## Como acessar os endpoints

### 1 - Acessando a lista de usuários
  Na classe UserController temos o método GET findAll, responsável por listar todos os usuários.
  Para isso, basta utilizar o postman e acessar seu endereço local seguido por "/users"
    Ex: http://localhost:suaPorta/users

### 2 - Acessando um usuário pelo id
  Na classe UserController temos o método GET findById, responsável por buscar um usuário por ID.
  Para isso, basta utilizar o postman e acessar seu endereço local e após a barra de users deve ser digitado o id
     Ex: http://localhost:8080/users/5


### 3 - Inserindo um novo usuário
  Na classe UserController temos o método POST insert, responsável por inserir um novo usuário.
  Para isso, basta utilizar o postman e acessar seu endereço local seguido por "/users". Na aba body, você deve configurar no corpo da solicitação postman como raw e o formato do texto como json. 
     Ex: http://localhost:8080/users/
     
 ```
 Ex de como inserir usuário via json:
      {
          "name": "Leonardo",
          "email": "leonardo@gmail.com",
          "department": {
              "id": 2 // Aqui você deve escolher departamento como 1(Gestão) ou 2(Informática)
          }
      }
```

## Como executar o projeto

```
- Baixe o Spring Tool Suite (STS).
- Baixe o repositório da aplicação.
- Importar o repositório para o STS
- Agora basta iniciar o servidor existente no Spring Boot que irá fazer a importação automaticamente do arquivo sql
```


## Autor

Matheus Honorato

https://www.linkedin.com/in/matheushonorato/
