FROM java:8
MAINTAINER Gladys
ADD pom.xml /tmp/build/
ADD src /tmp/build/src
RUN cd /tmp/bild/ && mvn clean package \
        && mv target/*.jar /app.jar \
        && cd / && rm -rf /tmp/build
VOLUME /tmp
EXPOSE 8500
ENTRYPOINT [ "java", "-jar", "/app.jar" ]