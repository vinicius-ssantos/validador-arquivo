# Projeto Validador de Arquivos

Este projeto é uma aplicação Java que utiliza o AWS SDK para interagir com o AWS S3 e o AWS Lambda. O projeto é construído usando Maven.

## Requisitos

- Java 11
- Maven

## Dependências

O projeto depende das seguintes bibliotecas:

- `aws-java-sdk-s3`: SDK da AWS para interagir com o S3.
- `aws-lambda-java-core`: Biblioteca para criar funções Lambda em Java.
- `aws-lambda-java-events`: Biblioteca para lidar com eventos de funções Lambda.
- `gson`: Biblioteca para manipulação de JSON.

## Estrutura do Projeto

O projeto tem a seguinte estrutura de diretórios:

- `src/main/java`: Contém o código fonte do projeto.
- `pom.xml`: Arquivo de configuração do Maven.

## Classes Principais

- `Handler`: Esta é a classe principal que implementa a interface `RequestHandler`. Ela define o método `handleRequest` que é chamado quando a função Lambda é invocada.

## Como Construir e Executar o Projeto

Para construir o projeto, navegue até o diretório raiz do projeto e execute o seguinte comando:

```bash
mvn clean install
```

Isso irá compilar o código, executar os testes e gerar um arquivo JAR no diretório `target`.

Para executar a função Lambda localmente, você precisará do AWS SAM CLI. Depois de instalado, você pode invocar a função localmente com o seguinte comando:

```bash
sam local invoke "NomeDaSuaFuncao" -e event.json
```

Substitua `"NomeDaSuaFuncao"` pelo nome da sua função Lambda e `event.json` por um arquivo JSON que contém um evento de exemplo para a sua função.

## Contribuindo

Contribuições são bem-vindas! Por favor, leia as diretrizes de contribuição antes de enviar um pull request.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.