FROM openjdk:8-jre
COPY ./docker/runServer.sh /app/entrypoint.sh
WORKDIR /app
RUN wget -O fabric-installer-0.7.1.jar https://maven.fabricmc.net/net/fabricmc/fabric-installer/0.7.1/fabric-installer-0.7.1.jar
RUN java -jar fabric-installer-0.7.1.jar server -downloadMinecraft
RUN echo "eula=true" > eula.txt
ENTRYPOINT /app/entrypoint.sh