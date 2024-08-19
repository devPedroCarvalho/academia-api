## 🎯 Objetivo do Projeto
Esse projeto foi feito com o objetivo de estudo e através da plataforma de cursos online Digital Innovation One. O curso Conhecendo o Projeto Spring Data JPA na Prática 
tem como objetivo ensinar os principais conceitos de mapeamento objeto-relacional (ORM) usando o Spring Data JPA. Desenvolvendo API RESTful com ênfase na modelagem de suas entidades, no domínio de uma academia de ginástica.

## 🛠 Tecnologias Utilizadas

- IDE IntelliJ
- Java 17
- Gradle
- Spring Web
- Spring Data JPA 
- PostgreSQL Driver
- Hibernate Validator
- Postman
- Beekeper Studio

## 🚦 Hard Skills Aprendidas

- **Configuração do banco de dados (SGBD PostgreSQL)**
- **Execução do fluxo back-end: Controller - Service - Repository**
- **Validação - Hibernate Validator**
- **Consultas Avançadas - Derived Query - Native Query**


## Arquitetura
![image](https://github.com/user-attachments/assets/05320218-5c23-4319-b522-5918c6d342ef)

## Documentação da API


1. **Retorna Todos os Alunos**: 
   - **Método HTTP**: `GET`
   - **Endpoint**: `/v1/alunos`
   - **Descrição**: Obtém uma lista de todos os alunos.

2. **Adiciona um Novo Aluno**:
   - **Método HTTP**: `POST`
   - **Endpoint**: `/v1/alunos`
   - **Descrição**: Adiciona um novo aluno com as informações fornecidas.
   - **Corpo da Requisição**: O JSON deve conter o nome, CPF, bairro e data de nascimento do aluno.

  ```json
{
  "nome": "João da Silva",
  "cpf": "123.456.789-00",
  "bairro": "Centro",
  "dataDeNascimento": "2000-01-01"
}
```


3. **Retorna Todas as Avaliações Feitas**:
   - **Método HTTP**: `GET`
   - **Endpoint**: `/v1/avaliacoes`
   - **Descrição**: Obtém uma lista de todas as avaliações feitas.

4. **Cria uma Avaliação para um Determinado Aluno**:
   - **Método HTTP**: `POST`
   - **Endpoint**: `/v1/avaliacoes`
   - **Descrição**: Cria uma nova avaliação para um aluno específico.
   - **Corpo da Requisição**: O JSON deve incluir o ID do aluno, o peso e a altura.
     
```json
{
  "alunoId": 1,
  "peso": 80.5,
  "altura": 190.0
}
```

5. **Vincula uma Matricula para um Determinado Aluno**:
   - **Método HTTP**: `POST`
   - **Endpoint**: `/v1/matriculas`
   - **Descrição**: Vincula uma Matricula a um determinado aluno.
   - **Corpo da Requisição**: O JSON deve incluir o ID do aluno, o peso e a altura.
 ```json
{
  "alunoId": 5
}
```

6. **Retorna Todas as Matriculas Feitas**:
   - **Método HTTP**: `GET`
   - **Endpoint**: `/v1/matriculas`
   - **Descrição**: Obtém uma lista de todas as matriculas feitas.

  6. **Retorna Todas as Matriculas Feitas**:
   - **Método HTTP**: `GET`
   - **Endpoint**: `/v1/matriculas?bairro=`
   - **Descrição**: Obtém uma lista de todas as matriculas feitas por determinado bairro.
   - **Parâmetro da Requisição**: O Endpoint deve incluir o bairro.

## Observação 
Código está na branch Master

