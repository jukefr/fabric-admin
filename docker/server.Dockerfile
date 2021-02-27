FROM fabric-admin AS build
FROM openjdk:8-jre
WORKDIR /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app
ENTRYPOINT ["ls"]