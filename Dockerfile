FROM java:8
FROM maven:latest
MAINTAINER Gladys
ADD pom.xml /tmp/build/
ADD src /tmp/build/src
RUN cd /tmp/build/ && mvn clean package \
        && mv target/*.jar /app.jar \
        && cd / && rm -rf /tmp/build
VOLUME /tmp
EXPOSE 8500
ENTRYPOINT [ "java", "-jar", "/app.jar" ]