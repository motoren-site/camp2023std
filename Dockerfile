FROM openjdk:17
COPY ./target/SteinarHelloWorld-0.0.1-SNAPSHOT.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java","SteinarHelloWorldApplication"]