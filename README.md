# 📊 projetoEmpresa

Projeto desenvolvido com o objetivo de aprofundar os estudos sobre **banco de dados**, demonstrando como realizar a integração entre as camadas `Controller`, `DAO` (Data Access Object), `Model` e o banco de dados relacional.

## 🧠 Objetivos

- Estudar e praticar conceitos de persistência de dados.
- Criar uma estrutura MVC (Model-View-Controller) simples e funcional.
- Implementar operações CRUD utilizando JDBC (ou JPA, se aplicável).
- Compreender a separação de responsabilidades entre as camadas do sistema.

## ⚙️ Tecnologias Utilizadas

- Java 17+
- JDBC (ou JPA/Hibernate)
- MySQL (ou outro banco relacional)
- Maven
- Spring Boot 
- IDE: IntelliJ IDEA

## 🧩 Descrição das Camadas

- **Model**: representa as entidades do banco, por exemplo, a classe `Empresa.java`.
- **DAO (Data Access Object)**: responsável pela comunicação com o banco (CRUD), usando JDBC ou JPA.
- **Controller**: camada intermediária que orquestra a lógica de negócio e chama os métodos da DAO.
- **Main**: ponto de entrada da aplicação, utilizado para testes locais.
  
🧑‍💻 Autor
Guilherme
Engenheiro de Software | Desenvolvedor Java
