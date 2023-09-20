FROM openjdk
LABEL maintainer="abc@mail.com"
EXPOSE 8083
WORKDIR /app
COPY target/courseservice.jar /app/courseservice.jar
ENTRYPOINT [ "java","-jar","courseservice.jar" ]