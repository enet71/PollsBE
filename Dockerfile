FROM openjdk:18

COPY target/polls-0.0.1.jar polls-0.0.1.jar

ENTRYPOINT ["java", "-jar", "polls-0.0.1.jar"]

