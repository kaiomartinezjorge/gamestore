##eságio de compilação
## Uma imagem de linux para compilar o projeto
FROM ubuntu:latest AS build

##Instalar o java 21
RUN apt-get update
RUN apt-get install -y openjdk-21-jdk maven

##Intalar o maven
RUN apt-get install -y maven

##Copy do projeto para dentro do container
COPY . .

##Compilar o projeto com maven
RUN mvn clean install

##Execução do projeto
FROM eclipse-temurin:21-jdk-slim

#Exportar a porta 8080
EXPOSE 8080

#Copiar o arquivo JAR do estágio de compilação para o estágio de execução
COPY --from=build /target/gamestore-0.0.1-SNAPSHOT.jar app.jar

##definindo o comando de inicialização do container
ENTRYPOINT ["java", "-jar", "app.jar"]