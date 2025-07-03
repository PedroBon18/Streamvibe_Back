Streamvibe_Back
API backend para o Streamvibe, permitindo cadastro, listagem e atualização de usuários e filmes, utilizando Spring Boot e JPA.

📦 Tecnologias Utilizadas
Java 17+

Spring Boot

Spring Data JPA

Maven

H2 Database (ou configure outro no application.properties)

🚀 Como rodar localmente

1️⃣ Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/PedroBon18/Streamvibe_Back.git
cd Streamvibe_Back

2️⃣ Compile e rode o projeto usando Maven:

bash
Copiar
Editar
./mvnw spring-boot:run
Ou importe no IntelliJ ou VS Code como projeto Maven e execute ApiApplication.java.

3️⃣ Acesse:

API: http://localhost:8080

H2 Console (caso ativo): http://localhost:8080/h2-console

🗂️ Estrutura
src/main/java/com/streamvibe/api/controllers - Controllers de acesso (FilmesController, OlaMundoController)

src/main/java/com/streamvibe/api/models - Models de Usuario, Filme e Endereco

src/main/resources/application.properties - Configurações do projeto

🛠️ Funcionalidades
Cadastro e listagem de usuários

Cadastro, listagem e atualização de filmes

Organização modular para expansão futura

📄 Configuração de Banco
Configure seu banco em src/main/resources/application.properties caso deseje utilizar MySQL ou PostgreSQL em produção.

✍️ Autor
Pedro Bon - https://www.linkedin.com/in/pedro-bon/

Projeto para aprendizado e evolução do Streamvibe.
