FROM openjdk:11
COPY target/dockerdemo-0.0.1-SNAPSHOT.jar docker-demo-0.0.1.jar
ENTRYPOINT ["java","-jar","/docker-demo-0.0.1.jar"]