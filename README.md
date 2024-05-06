![Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/img/banner-logo.svg)

# Java mail sender

_java-mail-sender_ é uma __API REST__ criada com a linguagem de programação Java e com o framework Spring Boot 3.

A API permite que o usuário envie emails de forma simplificada.

[![License](https://img.shields.io/npm/l/react)](https://github.com/leobaraujo/java-mail-sender/blob/main/LICENSE) 

## Tecnologias

- Java 17
- Spring Boot 3
- Maven
- Java Mail Sender

## Funcionalidades

- Envio de email

## Execução

### Git

> Requisitos: Git e Java 17

```shell
# Clonar o repositório git
git clone https://github.com/leobaraujo/java-mail-sender.git

# Entrar na pasta do repositório
cd java-mail-sender

# Instalar dependências
mvn clean install

# ATENÇÂO: A partir desde ponto é preciso que tenha configurado o arquivo application.properties

# Build
mvn clean compile package

# Iniciar a aplicação
mvn mvn exec:java -D"exec.mainClass"="com.example.mailsender.MailsenderApplication"

# Afim de parar a aplicação pressione a tecla CTRL+C no console
```

### Configurando arquivo _application.properties_

> Altere as seguintes propriedades no arquivo _application.properties_ para corresponder com o seu servidor SMTP.

```
spring.mail.host=
spring.mail.port=
spring.mail.username=
spring.mail.password=
# spring.mail.properties.mail.smtp.auth=true
# spring.mail.properties.mail.smtp.starttls.enable=true
```

## Endpoints

| Método | Rota | Funcionalidade | Payload |
|---|---|---|---|
| POST | /api/email | Envia o e-mail contendo o destinatário, assunto e mensagem | {"to": "string", "subject": "string", "body": "string"} |
