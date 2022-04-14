FROM openjdk:11
COPY ./target/pokemon-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","pokemon-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080