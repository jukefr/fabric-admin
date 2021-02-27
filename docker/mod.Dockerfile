FROM gradle:jdk8
USER root
COPY ./java /home/gradle/src
COPY ./docker/gradleBuild.sh /home/gradle/src/entrypoint.sh
WORKDIR /home/gradle/src
ENTRYPOINT /home/gradle/src/entrypoint.sh
