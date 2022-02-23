FROM adoptopenjdk:11-jre-hotspot

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} backendAsd-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backendAsd-0.0.1-SNAPSHOT.jar"]