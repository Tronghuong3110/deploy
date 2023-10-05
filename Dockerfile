FROM openjdk:21
ADD ./api-test.jar api-test.jar

ENTRYPOINT ["java", "-jar", "api-test.jar"]