FROM openjdk:17
EXPOSE 8083
ADD target/calc.jar calc.jar
ENTRYPOINT ["java", "-jar", "/calc.jar"]