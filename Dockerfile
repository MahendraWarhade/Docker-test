FROM openjdk:21

COPY target/newapk.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "newapk.jar"]