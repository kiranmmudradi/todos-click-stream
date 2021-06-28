FROM maven:3.5-jdk-8-alpine
WORKDIR /app
COPY . /app
RUN mvn clean install -DskipTests
EXPOSE 8095
CMD["java","-jar","target/todos-click-stream.jar"]
