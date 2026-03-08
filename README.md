### ImobiControl

Sistema de gerenciamento imobiliário desenvolvido em Java com arquitetura moderna baseada em microserviços, API REST e containers Docker.

O objetivo do ImobiControl é centralizar o controle de imóveis, clientes e contratos em uma plataforma escalável, permitindo integração com outros sistemas através de APIs.

### Arquitetura do Sistema

O sistema utiliza dois princípios arquiteturais importantes:

Arquitetura em Camadas (Layered Architecture)
e
Arquitetura de Microserviços

Cada serviço segue uma organização em camadas para separar responsabilidades.

Controller  →  Service  →  Repository  →  Database

Responsabilidades:

Controller
Recebe requisições HTTP e expõe os endpoints REST.

Service
Contém a lógica de negócio da aplicação.

Repository
Camada de acesso a dados usando JPA.

Database
Persistência utilizando PostgreSQL.

### Arquitetura de Microserviços

O sistema pode ser dividido em serviços independentes, por exemplo:

imobicontrol
 ├── gateway
 ├── myproperty-service
 ├── usersproperty-service
 └── rentals-service
 

#### Cada serviço:

possui sua própria API

possui seu próprio banco ou schema

pode ser executado isoladamente em containers

Essa arquitetura melhora:

escalabilidade

manutenção

independência de deploy

Stack Tecnológica

Backend

Java

Spring Boot

Spring Web

Spring Data JPA

Maven

Banco de dados

PostgreSQL

Infraestrutura

Docker

Docker Compose

Ferramentas

Git

GitHub

Postman / Insomnia

### Estrutura do Projeto

Estrutura típica de um microserviço Java:

src
 └── main
     ├── java
     │   └── com.imobicontrol
     │       ├── controller
     │       ├── service
     │       ├── repository
     │       ├── model
     │       └── config
     └── resources
         └── application.properties

### Descrição das pastas:

controller
Exposição da API REST.

service
Implementação da lógica de negócio.

repository
Interfaces de acesso ao banco de dados.

model
Entidades JPA.

config
Configurações do sistema.

Banco de Dados

O sistema utiliza PostgreSQL como banco relacional.

Relacionamentos conceituais:

Users 
Properties
Rentals
API REST

### Executando o Projeto com Docker

Uma das grandes vantagens aqui: ambiente reproduzível.

Com Docker, qualquer máquina pode rodar o sistema sem instalar Java ou PostgreSQL manualmente.

Build da aplicação
mvn clean package
Dockerfile

Exemplo simplificado:

FROM openjdk:17

WORKDIR /app

COPY target/imobicontrol.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

### Docker Compose

####Executando o Sistema

Subir containers:

docker-compose up --build

API disponível em:

http://localhost:8080
Testando a API

curl http://localhost:8080/clientes
Objetivos do Projeto

Este projeto tem como objetivo:

demonstrar arquitetura moderna com Java

aplicar microserviços

usar containerização com Docker

utilizar PostgreSQL

estruturar APIs REST escaláveis

Autor

Julio Cesar

GitHub

https://github.com/julio-cpsjr
