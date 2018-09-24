FROM openjdk:8
ADD Dockerdemo.war Dockerdemo.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Dockerdemo.war"]
