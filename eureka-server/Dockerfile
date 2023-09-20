FROM openjdk
LABEL maintainer="abc@mail.com"
EXPOSE 8082
WORKDIR /app
COPY target/eurekaserver.jar /app/eurekaserver.jar
ENTRYPOINT [ "java","-jar","eurekaserver.jar" ]