# 🧩 CRUD Java x CRUD Maven

Este projeto é uma evolução do primeiro **CRUD em Java puro**, agora refeito com o **Apache Maven**, um gerenciador de dependências e build amplamente utilizado no desenvolvimento Java profissional.

---

## 🚀 Objetivo

Demonstrar a diferença entre:
1. Um **CRUD tradicional em Java**, feito manualmente, com bibliotecas adicionadas manualmente;
2. Um **CRUD estruturado com Maven**, que automatiza o gerenciamento de dependências e a organização do projeto.

---

## ⚙️ Tecnologias utilizadas

- **Java 17**
- **MySQL**
- **Maven 3.8+**
- **IntelliJ IDEA**
- **JDBC (Java Database Connectivity)**

---

## 📁 Estrutura do Projeto

### 🧱 Antes (CRUD Java puro)

crud-java/
├── Main.java
├── dao/
│ └── UsuarioDAO.java
├── model/
│ └── Usuario.java
├── util/
│ └── Conexao.java
└── lib/
└── mysql-connector-j-8.x.jar


- Dependências adicionadas manualmente na pasta `lib`
- Compilação e execução manuais via IntelliJ
- Configuração de build e classpath feita manualmente

---

### ⚡ Depois (CRUD com Maven)

crud-maven/
├── pom.xml
└── src/
├── main/java/com/samuca/
│ ├── Main.java
│ ├── dao/UsuarioDAO.java
│ ├── model/Usuario.java
│ └── util/Conexao.java
└── test/java/


- Projeto estruturado automaticamente pelo Maven  
- Dependências gerenciadas via `pom.xml`  
- Build automatizado com comandos Maven  
- Código mais limpo e padronizado, seguindo boas práticas de mercado

---

## 🧰 Comandos principais

### 🔧 Compilar o projeto
```bash
mvn clean compile

▶️ Executar o programa

mvn exec:java -Dexec.mainClass="com.samuca.Main"

📦 Gerar o .jar do projeto

mvn package

O arquivo será gerado em:

target/crud-maven-1.0-SNAPSHOT.jar

🗄️ Banco de Dados MySQL

Crie o banco antes de executar o programa:

CREATE DATABASE crud_java;
USE crud_java;

CREATE TABLE usuarios (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100),
  email VARCHAR(100)
);

🔍 Diferenças principais entre os projetos
Aspecto	CRUD Java Puro	CRUD com Maven
Dependências	Adicionadas manualmente (pasta lib/)	Gerenciadas automaticamente via pom.xml
Build	Manual, dentro da IDE	Automatizado com mvn compile
Execução	Rodava via IntelliJ	Pode rodar por terminal (mvn exec:java)
Estrutura	Livre, sem padrão	Padrão Maven (src/main/java, src/test/java)
Reprodutibilidade	Depende do ambiente	Padronizada — basta clonar e rodar Maven
Escalabilidade	Limitada	Pronta para integração com frameworks (Spring Boot, Hibernate etc.)
🧠 O que aprendi com esta versão

    O que é e como funciona o Apache Maven

    Como organizar um projeto Java profissionalmente

    Como configurar dependências via pom.xml

    Como automatizar compilação e execução com Maven

    Diferença entre gerenciamento manual e automatizado de dependências

💬 Próximos passos

    🔹 Implementar o mesmo CRUD utilizando Spring Boot + JPA

    🔹 Aprender sobre camadas de serviço (Service Layer)

    🔹 Usar API REST para criar endpoints em vez de interação via console

✍️ Autor

Samuel Comerlato Ramos
