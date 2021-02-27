FROM alpine:latest
USER root
RUN apk add zip
COPY ./docker/packageUp.sh /app/entrypoint.sh
WORKDIR /app
ENTRYPOINT /app/entrypoint.sh