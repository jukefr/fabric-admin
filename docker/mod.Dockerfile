FROM gradle:jdk8
COPY --chown=gradle:gradle ../java /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew build --stacktrace
VOLUME /home/gradle/src/build/libs