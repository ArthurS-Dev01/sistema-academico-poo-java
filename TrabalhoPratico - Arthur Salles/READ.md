# Sistema Acadêmico em Java - POO

Projeto desenvolvido como atividade acadêmica da disciplina de Programação Orientada a Objetos.

O sistema permite realizar o gerenciamento de alunos, cursos e disciplinas através de uma aplicação Java executada pelo terminal.

## Funcionalidades

### Alunos
- Cadastrar aluno
- Consultar aluno
- Atualizar aluno
- Remover alunos
- Vincular aluno a um curso

### Cursos
- Cadastrar curso
- Consultar curso
- Atualizar curso
- Remover curso
- Gerenciar disciplinas pertencentes ao curso

### Disciplinas
- Cadastrar disciplina
- Consultar disciplina
- Atualizar disciplina
- Remover disciplina
- Vincular disciplina a um curso

## Regras de negócio

- Um aluno deve estar vinculado a um curso.
- Um curso pode possuir uma ou mais disciplinas.
- Uma disciplina pertence a um curso.
- O sistema utiliza listas para armazenamento dos objetos durante a execução.
- O programa permanece em execução até que o usuário escolha a opção de sair.

## Arquitetura

O projeto foi organizado em diferentes camadas:

- Model: representação das entidades do sistema.
- View: interação com o usuário.
- Controller: controle do fluxo das funcionalidades.
- DAO: acesso e gerenciamento dos objetos armazenados.
- Menu/Submenu: navegação pelo sistema.

## Tecnologias

- Java
- Programação Orientada a Objetos
- Collections / ArrayList
- MVC
- DAO

## Conceitos de POO utilizados

- Encapsulamento
- Associação entre objetos
- Abstração
- Separação de responsabilidades
- Getters e Setters
- Collections

## Relacionamentos

Aluno -> Curso

Curso -> Disciplinas

Cada aluno pertence a um curso e cada curso possui uma ou mais disciplinas.

## Execução

Execute a classe:

```java
Main.java