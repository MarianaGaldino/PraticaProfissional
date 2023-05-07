# PraticaProfissional
# Descrição
API REST desenvolvida em Spring Boot para gerenciamento de uma biblioteca. A aplicação oferece endpoints para cadastro, consulta, atualização e exclusão de informações de autores, livros, editoras, administração de usuários, movimentações, devoluções e empréstimos. 

# Tecnologias utilizadas
- Java
- Spring Boot
- Hibernate
- MySQL
- Maven
# Como executar o projeto
Clone o repositório em sua máquina local
Certifique-se de ter o Java 17 e o Maven instalados em sua máquina
Configure as credenciais do banco de dados no arquivo application.properties
Execute o comando mvn clean install na raiz do projeto
Execute o comando mvn spring-boot:run para iniciar a aplicação
Acesse a API através do endereço http://localhost:8080/

# Endpoints disponíveis
## Autor
- GET /autores: retorna o autor correspondente ao id informado
- POST /autores: cria um novo autor com base nos dados informados no corpo da requisição
- PUT /autores: atualiza o autor correspondente ao id informado com base nos dados informados no corpo da requisição
- DELETE /autores: remove o autor correspondente ao id informado
## Livro
- GET /livros: retorna o livro correspondente ao id informado
- POST /livros: cria um novo livro com base nos dados informados no corpo da requisição
- PUT /livros: atualiza o livro correspondente ao id informado com base nos dados informados no corpo da requisição
- DELETE /livros: remove o livro correspondente ao id informado
## Editora
- GET /editoras: retorna a editora correspondente ao id informado
- POST /editoras: cria uma nova editora com base nos dados informados no corpo da requisição
- PUT /editoras: atualiza a editora correspondente ao id informado com base nos dados informados no corpo da requisição
- DELETE /editoras: remove a editora correspondente ao id informado
## Administrador
- GET /admins: retorna o administrador correspondente ao id informado
- POST /admins: cria um novo administrador com base nos dados informados no corpo da requisição
- PUT /admins: atualiza o administrador correspondente ao id informado com base nos dados informados no corpo da requisição
- DELETE /admins: remove o administrador correspondente ao id informado
## Empréstimo
- POST /emprestimos: cria um novo empréstimo com base nos dados informados no corpo da requisição
## Devolução
- POST /devolucao: cria um novo empréstimo com base nos dados informados no corpo da requisição
## Movimentação
- GET /movimentacao: retorna uma lista com todas moviemntações cadastrados





Repositório destinado a atividade de Prática Profissional do Curso ADS Mackenzie
