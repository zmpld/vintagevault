FROM maven:3.9.14-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin-17-alpine
COPY --from=build /target/*.jar vv.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "vv.jar"]

